package dev.wakandaacademy.pedido_cliente.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.wakandaacademy.pedido_cliente.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {

}
