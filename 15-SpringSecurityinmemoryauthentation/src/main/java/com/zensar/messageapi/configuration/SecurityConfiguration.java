package com.zensar.messageapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.web.servlet.AuthorizeRequestsDsl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	@Bean
	public BCryptPasswordEncoder getBCryptPasswordEncoder()
	{
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder;
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth
		    .inMemoryAuthentication()
		    .withUser("zensar")
		    .password("$2a$10$YHn3kL50DglSDZGWnVsNyuXwpnY1FGzmg53m.h9rSpJGCilWU6P/C")
		    .roles("USER")
		    .and()
		    .withUser("admin")
		    .password("$2a$10$bUlZQKhPvqhSAsN/dq2gYON8I3PweY60lM1UEy9te146fJKy4VW9i")
		    .roles("ADMIN");
	}
@Override
protected void configure(HttpSecurity http) throws Exception {
	
	http.csrf().disable()
	.authorizeRequests()
	.antMatchers(HttpMethod.POST, "/api/message").hasRole("ADMIN")
	.anyRequest()
	.authenticated()
	.and()
	.httpBasic()
	.and()
	.sessionManagement()
	.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
}	

	
} 
