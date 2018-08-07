package br.com.vanius.projetomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import br.com.vanius.projetomc.domain.Cliente;
import br.com.vanius.projetomc.domain.Pedido;

public interface EmailService {

	void senderOrderConfirmationEmail(Pedido obj);
	void senderEmail(SimpleMailMessage msg);
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	void sendHtmlEmail(MimeMessage msg);
	void sendNewPasswordEmail(Cliente cliente,	String newPass);
}
