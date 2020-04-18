package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Speaker;

public class HiebernateSpeakerRepositoryImpl implements SpeakerRepository {

	
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
