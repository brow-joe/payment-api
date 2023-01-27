package br.com.jonathan.domain.port;

import br.com.jonathan.domain.Payment;

public interface Debit {
	void pay(Payment payment);
}
