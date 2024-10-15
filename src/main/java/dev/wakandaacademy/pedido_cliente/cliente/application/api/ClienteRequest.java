package dev.wakandaacademy.pedido_cliente.cliente.application.api;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteRequest {
	@NotBlank
    private String nomeCompleto;
	@NotBlank
	@Email
    private String email;
	@NotBlank
    private String celular;
	@CPF
	private String cpf;

}
