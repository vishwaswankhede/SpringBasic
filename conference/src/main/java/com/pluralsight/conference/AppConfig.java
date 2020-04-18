package com.pluralsight.conference;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

@Configuration
@ComponentScan("com.pluralsight")
public class AppConfig {

	/*
	 * @Bean(name = "speakerService") public SpeakerService getSpeakerService() {
	 * SpeakerServiceImpl speaker = new SpeakerServiceImpl(getSpeakerRepository());
	 * // speaker.setRepository(getSpeakerRepository()); return speaker;
	 * 
	 * }
	 * 
	 * @Bean(name="speakerRepository") public SpeakerRepository
	 * getSpeakerRepository() {
	 * 
	 * return new HibernateSpeakerRepositoryImpl(); }
	 */
	
	
}
