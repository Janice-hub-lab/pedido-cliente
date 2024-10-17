package dev.wakandaacademy.pedido_cliente.cliente.application.service;

import java.util.List;
import java.util.UUID;

import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteAlteracaoRequest;
import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteDetalhadoResponse;
import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteListResponse;
import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteRequest;
import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
	void patchAlteraClienteClienteAtravesId(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
}
