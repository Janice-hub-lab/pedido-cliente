package dev.wakandaacademy.pedido_cliente.pedido.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import dev.wakandaacademy.pedido_cliente.cliente.domain.Cliente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idPedido;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private Cliente idcliente;
	private String descricao;
	private Double valor;

}
