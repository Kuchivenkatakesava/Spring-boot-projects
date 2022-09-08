package com.zensar.messageapi.security.jwt.util;

import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class JWTUtil {
	
	//This method is used to generated token for a username
	//To generate token we will be using library java-jwt
	
	
	public String generateToken(String username)
	
	{
		String jwtToken = JWT.create()
				          .withClaim("name",username)
				          .withExpiresAt(new Date(System.currentTimeMillis()+16000))
				          .sign(Algorithm.HMAC512("zensarsecret"));
		System.out.println(jwtToken);
		return jwtToken;

}
	public void validateToken(String token)
    {
        JWT.require(Algorithm.HMAC512("zensarsecret")).build().verify(token);
    }
}
