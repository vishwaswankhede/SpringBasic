package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Speaker;

@Repository
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

	
	@Override
	public List<Speaker> finaAll(){
		
		
		List<Speaker> speakers = new ArrayList();
	
		Speaker speaker = new Speaker();
		speaker.setFirstName("Mike");
		speaker.setLasttName("Jagger");
		
		speakers.add(speaker);
		
		return speakers;
	
	}
	
}
