package dev.wakandaacademy.pedido_cliente.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private String celular;
	private String cpf;
	
	private LocalDateTime dataHoraDoCadastro;

}
