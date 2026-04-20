package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.services.MsgServices;

@RestController
public class MsgRestController {

	
	@Autowired
	private MsgServices msgServices;
	
	@GetMapping("/welcome")
	public String getMsg() {
		
		return msgServices.getWelcomeMsg();
	}
}
