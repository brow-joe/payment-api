package br.com.jonathan.application.service;

import br.com.jonathan.application.service.port.DebitGateway;
import br.com.jonathan.domain.Payment;
import br.com.jonathan.domain.port.Debit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DebitService implements Debit {
	@Autowired
	private DebitGateway gateway;
	
	@Override 
	public void pay(Payment payment) {
		gateway.pay(payment);
	}
}
