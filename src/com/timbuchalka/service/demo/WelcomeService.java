package com.timbuchalka.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService {
	
	public List<String> getWelcomeMessages(String name) {
		List<String> myWelcomeMessages = new ArrayList<>();
		
		// Add data to the list
		myWelcomeMessages.add("Hello");
		myWelcomeMessages.add(name);
		myWelcomeMessages.add(", welcome to the Spring course");
		
		return myWelcomeMessages;
	}
	
}
