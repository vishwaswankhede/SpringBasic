package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

@Component
public class SpeakerServiceImpl implements SpeakerService {
	
	@Autowired
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

	@Autowired
	public void setRepository(SpeakerRepository repository) {
		this.repository = repository;
	}
	
	

}
