package com.blog.sang.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.sang.sequence.service.SequenceService;

@Controller
@RequestMapping(value="/manager")
public class ManagerController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManagerController.class);
	
	@Autowired
	SequenceService sequenceService;
	
	@GetMapping("/")
	public String frontMain() {
		
		logger.info("test:: " + (Long) sequenceService.getCount("test"));
		
		return "/manager/main";
	}
	
	
	
	
	
}
