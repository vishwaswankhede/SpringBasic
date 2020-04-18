package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	SpeakerRepository repository =  new HibernateSpeakerRepositoryImpl();
	
	@Override
	public List<Speaker> findAll(){
		return repository.finaAll();
		
	}

}
