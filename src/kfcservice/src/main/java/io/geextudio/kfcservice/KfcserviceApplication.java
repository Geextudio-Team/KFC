package io.geextudio.kfcservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.geextudio.kfcservice.domain.Word;
import io.geextudio.kfcservice.domain.WordRepository;

@SpringBootApplication
public class KfcserviceApplication implements CommandLineRunner {

	private final WordRepository wordRepository;

	public KfcserviceApplication(WordRepository wordRepository) {
	    this.wordRepository = wordRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Word!");
		wordRepository.save(new Word("Hello", "你好", "int", "Hello Word!"));
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
