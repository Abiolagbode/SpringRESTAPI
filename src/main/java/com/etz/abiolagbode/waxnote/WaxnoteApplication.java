package com.etz.abiolagbode.waxnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WaxnoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaxnoteApplication.class, args);
	}

}
