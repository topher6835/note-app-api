package com.demo.takenote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TakeNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TakeNoteApplication.class, args);
	}

}
