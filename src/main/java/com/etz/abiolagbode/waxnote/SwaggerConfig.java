package com.etz.abiolagbode.waxnote;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
		//security
//		.securityScheme(Arrays.asList(securityScheme()))
//		.securityContexts(Arrays.asList(SecurityContext()));
		
	}

	
//	private SecurityScheme securityScheme() {
//		// TODO Auto-generated method stub
//		GrantType grantType = new AuthorizationCodeGrantBuilder()
//				.tokenEndpoint(new TokenEndpoint(AUTH_SERVER + "/token", "oauthtoken"))
//				.tokenRequestEndpoint(
//						new TokenRequestEndpoint(AUTH_SERVER + "/autorize", CLIENT_ID, CLIENT_SERVER)
//						)
//				
//		return null;
//	}
//
//
//	@Bean
//	private SecurityConfiguration security() {
//		return SecurityConfigurationBuilder.builder()
//				.clientId(CLIENT_ID)
//				.clientSecret(CLIENT_SECRET)
//				.scopeSeparator("")
//				.useBasicAuthenticationWithAccessCodeGrant(true)
//				.build();
//	}
	
	
}
