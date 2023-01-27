package br.com.jonathan.userinterface.controller;

import br.com.jonathan.application.dto.BilletDTO;
import br.com.jonathan.application.port.BilletInput;
import br.com.jonathan.application.usecase.EmitBilletUseCase;
import br.com.jonathan.application.usecase.PayBilletUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/billet")
public class BilletController implements BilletInput {
	@Autowired
	private EmitBilletUseCase emitBilletUseCase;
	@Autowired
	private PayBilletUseCase payBilletUseCase;

	@Override
	@GetMapping("/{paymentId}")
	public BilletDTO emit(@PathVariable String paymentId) {
		return emitBilletUseCase.execute(paymentId);
	}

	@Override
	@PostMapping("/{paymentId}")
	public void pay(@PathVariable String paymentId, @RequestBody BilletDTO billet) {
		payBilletUseCase.execute(paymentId, billet.getBilletId());
	}
}
