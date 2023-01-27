package br.com.jonathan.infrastructure.gateway;

import br.com.jonathan.application.service.port.BilletGateway;
import br.com.jonathan.domain.Payment;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.logging.Logger;

@Service
public class ExternalBiletGateway implements BilletGateway {
	private final Logger log = Logger.getLogger(ExternalBiletGateway.class.getName());

	@Override 
	public String emit(Payment payment) {
		log.info("emit=" + payment.getId());
		return UUID.randomUUID().toString();
	}

	@Override 
	public void pay(String billetId, Payment payment) {
		log.info("pay=" + billetId);
	}
}
