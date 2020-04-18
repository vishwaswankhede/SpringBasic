package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	SpeakerRepository repository ;
	
	
		
	public SpeakerServiceImpl(SpeakerRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Speaker> findAll(){
		return repository.finaAll();
		
	}

	public SpeakerRepository getRepository() {
		return repository;
	}

	public void setRepository(SpeakerRepository repository) {
		this.repository = repository;
	}
	
	

}
