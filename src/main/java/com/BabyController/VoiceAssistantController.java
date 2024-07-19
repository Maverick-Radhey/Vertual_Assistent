package com.BabyController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.BabyService.VoiceProcessingService;

public class VoiceAssistantController {
	
	 @Autowired
	    private VoiceProcessingService voiceProcessingService;

	    @PostMapping("/process-command")
	    public ResponseEntity<String> processVoiceCommand(@RequestBody String voiceCommand) {
	        String response = voiceProcessingService.processCommand(voiceCommand);
	        return ResponseEntity.ok(response);
	    }

}
