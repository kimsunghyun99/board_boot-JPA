package com.board.controller;

import org.springframework.security.access.event.PublicInvocationEvent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MasterController {
	
	@GetMapping("/master/sysManage") 
		public void getSysMange() {
			
		}
		
	

}
