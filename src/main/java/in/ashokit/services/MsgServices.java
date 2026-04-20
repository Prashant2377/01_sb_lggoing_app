package in.ashokit.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MsgServices {

	Logger logger = LoggerFactory.getLogger(MsgServices.class);
	
	public String getWelcomeMsg() {
		
		logger.info("Get welcome msg Satrted-----");
		
		String msg="Welcome to Ashokit";
		
		logger.info("Get welcome msg ended-----");
		
		return msg;
		
		
		
	}
}
