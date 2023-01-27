package br.com.jonathan.domain.port;

import br.com.jonathan.domain.Payment;

public interface Retrieve {
	Payment findById(String id);
}
