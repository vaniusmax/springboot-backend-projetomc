package br.com.vanius.projetomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.vanius.projetomc.services.DBService;
import br.com.vanius.projetomc.services.EmailService;
import br.com.vanius.projetomc.services.SmtpEmailService;

@Configuration
@Profile("devpostgres")
public class TesteConfig {

	@Autowired
	private DBService dbService;
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		dbService.instantiateTestDatabase();
		
		return true;
	}
	
	//@Bean
	//public EmailService emailService() {
	//	return new MockEmailService();
	//}
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}
