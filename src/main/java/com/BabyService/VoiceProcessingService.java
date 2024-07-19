package com.BabyService;

import org.springframework.beans.factory.annotation.Autowired;

import com.BabyRepository.CommandRepository;

public class VoiceProcessingService {

	 @Autowired
	    private CommandRepository commandRepository;

	    public String processCommand(String voiceCommand) {
	       
	        return "Processed command: " + voiceCommand;
	    }
}
