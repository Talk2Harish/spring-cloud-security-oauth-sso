package com.hfj.cloud.security;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author HFJ
 *
 */
@EnableOAuth2Sso
@RestController
public class SecurityController extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private OAuth2ClientContext ClientContext;
	
	/**
	 * @return the current access token if any (may be null or empty)
	 */
	@RequestMapping(value = "/token")
	public OAuth2AccessToken token() {
		return ClientContext.getAccessToken();
	}

	/**
	 * The getPrincipal() method normally returns UserDetails object in Spring
	 * Security, which contains all the details of currently logged in user.
	 */
	@RequestMapping(value = "/user")
	public Principal user(Principal principal) {
		return principal;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/", "/viewAll")
		.permitAll()
		.anyRequest()
		.authenticated();
	}
}
