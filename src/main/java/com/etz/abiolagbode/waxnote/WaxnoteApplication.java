package com.etz.abiolagbode.waxnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties
// @EnableWebMvc
// @ComponentScan(value = "org.foo.path.baseFolder")
// @EntityScan("com.delivery.domain")
// @EnableJpaRepositories("com.delivery.repository")

public class WaxnoteApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(WaxnoteApplication.class, args);
	}
// @Bean 
// public BCryptPasswordEncoder bCryptPasswordEncoder(){
// 	return new BCryptPasswordEncoder();
// }

@Configuration
class AppConfig {

	// @Bean
	// public WebMvcConfigurer corsConfigurer() {
	// 	return new WebMvcConfigurer() {
	// 		@Override
	// 		public void addCorsMappings(CorsRegistry registry) {
	// 			registry.addMapping("/**")
	// 			.allowedOrigins("*")
	// 			.allowedHeaders("*")
	// 			.allowedMethods("*");
	// 		}
	// 	};
	// }

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

		// Allow anyone and anything access. Probably ok for Swagger spec
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");

		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}
}

}
