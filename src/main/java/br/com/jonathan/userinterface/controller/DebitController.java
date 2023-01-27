package br.com.jonathan.userinterface.controller;

import br.com.jonathan.application.port.DebitInput;
import br.com.jonathan.application.usecase.PayDebitUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/debit")
public class DebitController implements DebitInput {
	@Autowired
	private PayDebitUseCase payDebitUseCase;

	@Override
	@PostMapping("/{paymentId}")
	public void pay(@PathVariable String paymentId) {
		payDebitUseCase.execute(paymentId);
	}
}
