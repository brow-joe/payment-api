package br.com.jonathan.application.port;

import br.com.jonathan.application.dto.BilletDTO;

public interface BilletInput {
	BilletDTO emit(String paymentId);
	
	void pay(String paymentId, BilletDTO billet);
}
