package com.product.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.product.service.MailService;

//@Component
public class MailTestRunner implements CommandLineRunner {
	
	@Autowired
	private MailService mailService;

	@Override
	public void run(String... args) throws Exception {
//		mailService.sentEmail("heyyrashmiranjan02@gmail.com","springboot project activated");
	}

}
