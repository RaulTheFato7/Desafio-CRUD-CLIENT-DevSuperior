package com.devsuperio.desafioTres.service;

import com.devsuperio.desafioTres.dto.ClientDTO;
import com.devsuperio.desafioTres.entity.Client;
import com.devsuperio.desafioTres.repositories.ClientRepository;
import com.devsuperio.desafioTres.service.exceptionals.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    private void copyDtoToEntity(ClientDTO dto, Client entity) {
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
    }

    public ClientDTO update(Long id, ClientDTO dto) {
        try {
            Client entity = repository.getReferenceById(id);
            copyDtoToEntity(dto, entity);
            entity = repository.save(entity);
            return new ClientDTO(entity);
        }catch (EntityNotFoundException e) {
            throw  new ResourceNotFoundException("Resource not found!");
        }
    }
}
