package br.com.jonathan.domain.port;

import br.com.jonathan.domain.Payment;

public interface Billet {
	String emit(Payment payment);
	
	void pay(String billetId, Payment payment);
}
