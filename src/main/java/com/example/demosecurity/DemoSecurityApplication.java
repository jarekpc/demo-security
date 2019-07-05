package com.example.demosecurity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoSecurityApplication implements CommandLineRunner {

	private final UserRepository userRepository;

	public DemoSecurityApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Lists users ");
		userRepository.findAll().stream().map(x -> x.getUsername() + " " + x.getPassword()).forEach(System.out::println);
	}
}
