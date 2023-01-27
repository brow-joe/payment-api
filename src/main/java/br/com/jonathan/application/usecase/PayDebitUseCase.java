package br.com.jonathan.application.usecase;

import br.com.jonathan.domain.port.Debit;
import br.com.jonathan.domain.port.Retrieve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayDebitUseCase {
	@Autowired
	private Retrieve retrieve;
	@Autowired
	private Debit service;
	
	public void execute(String paymentId) {
		service.pay(retrieve.findById(paymentId));
	}
}
