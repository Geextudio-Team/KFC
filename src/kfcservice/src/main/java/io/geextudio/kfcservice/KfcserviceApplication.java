package io.geextudio.kfcservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.geextudio.kfcservice.domain.Word;
import io.geextudio.kfcservice.domain.WordRepository;

@SpringBootApplication
public class KfcserviceApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(KfcserviceApplication.class);

	private final WordRepository wordRepository;

	public KfcserviceApplication(WordRepository wordRepository) {
	    this.wordRepository = wordRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Word!");
		wordRepository.save(new Word("Hello", "你好", "int", "Hello Word!"));

		logger.info("Word: {} saved", "Hello");
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
