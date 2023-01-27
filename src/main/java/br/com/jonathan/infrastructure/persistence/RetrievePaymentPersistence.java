package br.com.jonathan.infrastructure.persistence;

import br.com.jonathan.domain.Payment;
import br.com.jonathan.domain.port.Retrieve;
import org.springframework.stereotype.Repository;

@Repository
public class RetrievePaymentPersistence implements Retrieve {
	@Override 
	public Payment findById(String id) {
		return new Payment(id);
	}
}
