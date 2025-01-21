package com.example.forohub.seguridad;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.forohub.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    @Value("${api.security.secret}")
    private String apiSecret;

    public String generarToken(Usuario usuario) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(apiSecret);
            return JWT.create()
                    .withIssuer("example")
                    .withSubject(usuario.getLogin())
                    .withClaim("id", usuario.getId())
                    .withExpiresAt(generarFechaExpiracion())
                    .sign(algorithm);

        } catch (JWTCreationException exception) {
            throw new RuntimeException(exception);
        }
    }

    public String obtenerSubject(String jwt) {
        try {
            var algorithm = Algorithm.HMAC256(apiSecret);
            var jwtVerificado = JWT.require(algorithm)
                    .withIssuer("example")
                    .build()
                    .verify(jwt);

            if (!jwtVerificado.getSubject().isBlank()) {
                return jwtVerificado.getSubject();
            } else {
                throw new RuntimeException();
            }

        } catch (JWTVerificationException exception) {
            throw new RuntimeException(exception);
        }
    }

    private Instant generarFechaExpiracion() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-07:00"));
    }

}
