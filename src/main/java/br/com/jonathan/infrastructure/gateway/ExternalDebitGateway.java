package br.com.jonathan.infrastructure.gateway;

import br.com.jonathan.application.service.port.DebitGateway;
import br.com.jonathan.domain.Payment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ExternalDebitGateway implements DebitGateway {
	private final Logger log = Logger.getLogger(ExternalDebitGateway.class.getName());

	@Override 
	public void pay(Payment payment) {
		log.info("pay=" + payment.getId());
	}
}
