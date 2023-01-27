package br.com.jonathan.application.service.port;

import br.com.jonathan.domain.Payment;

public interface BilletGateway {
	String emit(Payment payment);
	
	void pay(String billetId, Payment payment);
}
