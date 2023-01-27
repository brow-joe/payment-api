package br.com.jonathan.application.service;

import br.com.jonathan.application.service.port.BilletGateway;
import br.com.jonathan.domain.Payment;
import br.com.jonathan.domain.port.Billet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BilletService implements Billet {
	@Autowired
	private BilletGateway gateway;
	@Override 
	public String emit(Payment payment) {
		return gateway.emit(payment);
	}

	@Override 
	public void pay(String billetId, Payment payment) {
		gateway.pay(billetId, payment);
	}
}
