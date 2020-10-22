package com.gleyvepascoa.contato.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gleyvepascoa.contato.entity.Contato;

public interface ContatoDAO extends JpaRepository<Contato, Long> {
	// Implementação da interface fica a cargo do Spring  Data JPA
}
