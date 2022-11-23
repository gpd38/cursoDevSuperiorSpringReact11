package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

/**
 * Classe responsavel por acessar e realizar operações no banco de dados
 */
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
