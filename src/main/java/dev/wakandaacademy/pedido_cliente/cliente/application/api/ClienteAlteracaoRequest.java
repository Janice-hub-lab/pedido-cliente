package dev.wakandaacademy.pedido_cliente.cliente.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteAlteracaoRequest {
	@NotBlank
    private String nomeCompleto;
	@NotBlank
    private String celular;


}
