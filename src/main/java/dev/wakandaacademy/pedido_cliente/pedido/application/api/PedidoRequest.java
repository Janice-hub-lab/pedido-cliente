package dev.wakandaacademy.pedido_cliente.pedido.application.api;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PedidoRequest {
	@NotBlank
	private String nomeCompletoCliente;
	@NotNull
	private String descricaoPedido;
	private Double valor;
	
	private LocalDateTime dataHoraCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

}
