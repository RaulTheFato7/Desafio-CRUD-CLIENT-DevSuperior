package com.devsuperio.desafioTres.repositories;

import com.devsuperio.desafioTres.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
