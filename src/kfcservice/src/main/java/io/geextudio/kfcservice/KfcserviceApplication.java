package io.geextudio.kfcservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KfcserviceApplication implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");
	}

	// @Bean
	// public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	// 	return args -> {
	// 		System.out.println("Let's inspect the beans provided by Spring Boot:");
	// 		String[] beanNames = ctx.getBeanDefinitionNames();{

	public static void main(String[] args) {
		SpringApplication.run(KfcserviceApplication.class, args);
	}

}
