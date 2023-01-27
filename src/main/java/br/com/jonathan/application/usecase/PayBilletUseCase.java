package br.com.jonathan.application.usecase;

import br.com.jonathan.domain.port.Billet;
import br.com.jonathan.domain.port.Retrieve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayBilletUseCase {
	@Autowired
	private Retrieve retrieve;
	@Autowired
	private Billet service;
	
	public void execute(String billetId, String paymentId) {
		service.pay(billetId, retrieve.findById(paymentId));
	}
}
