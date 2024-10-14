package dev.wakandaacademy.pedido_cliente.cliente.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	private UUID idCliente;
	@NotBlank
    private String nomeCompleto;
	@NotBlank
	@Email
    private String email;
	@NotBlank
    private String celular;
	@CPF
	private String cpf;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	private Cliente(@NotBlank String nomeCompleto, @NotBlank @Email String email, @NotBlank String celular,
			@CPF String cpf) {
		super();
		this.idCliente = UUID.randomUUID();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.celular = celular;
		this.cpf = cpf;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}


