package dev.wakandaacademy.pedido_cliente.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import dev.wakandaacademy.pedido_cliente.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String cpf;

	private LocalDateTime dataHoraDoCadastro;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.cpf = cliente.getCpf();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();

	}
}
