package dev.wakandaacademy.pedido_cliente.cliente.application.service;

import java.util.List;

import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteListResponse;
import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteRequest;
import dev.wakandaacademy.pedido_cliente.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
}
