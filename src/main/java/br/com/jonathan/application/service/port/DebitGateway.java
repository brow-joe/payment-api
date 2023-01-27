package br.com.jonathan.application.service.port;

import br.com.jonathan.domain.Payment;

public interface DebitGateway {
	void pay(Payment payment);
}
