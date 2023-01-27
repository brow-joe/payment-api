package br.com.jonathan.application.usecase;

import br.com.jonathan.application.dto.BilletDTO;
import br.com.jonathan.domain.port.Billet;
import br.com.jonathan.domain.port.Retrieve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmitBilletUseCase {
	@Autowired
	private Retrieve retrieve;
	@Autowired
	private Billet service;
	
	public BilletDTO execute(String paymentId) {
		var billetId = service.emit(retrieve.findById(paymentId));
		return new BilletDTO(billetId, paymentId);
	}
}
