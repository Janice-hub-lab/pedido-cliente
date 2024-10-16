package dev.wakandaacademy.pedido_cliente.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteDetalhadoResponse;
import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteListResponse;
import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteRequest;
import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteResponse;
import dev.wakandaacademy.pedido_cliente.cliente.application.repository.ClienteRepository;
import dev.wakandaacademy.pedido_cliente.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}
	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}
	@Override
	public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaClienteAtravesID(idCliente);
		log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesId");
		return new ClienteDetalhadoResponse(cliente);
	}
	@Override
	public void deletaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - deletaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaClienteAtravesID(idCliente);
		//clienteRepository.deletaCliente(cliente);
		log.info("[finaliza] ClienteApplicationService - deletaClienteAtravesId");		
	}

}
