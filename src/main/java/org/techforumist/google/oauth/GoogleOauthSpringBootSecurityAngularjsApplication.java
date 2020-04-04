package org.techforumist.google.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class GoogleOauthSpringBootSecurityAngularjsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleOauthSpringBootSecurityAngularjsApplication.class, args);
	}
}
