package dev.wakandaacademy.pedido_cliente.cliente.application.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteRequest;
import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente  ");
		log.info("[finaliza] ClienteApplicationService - criaCliente  ");
		return null;
	}

}
