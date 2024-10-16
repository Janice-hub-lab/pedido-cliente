package dev.wakandaacademy.pedido_cliente.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import dev.wakandaacademy.pedido_cliente.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesID(UUID idCliente);
}
