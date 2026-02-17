package com.devsuperio.desafioTres.dto;

import com.devsuperio.desafioTres.entity.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String cpf;
    @Positive
    private Double income;
    @PastOrPresent
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO(){}

    public ClientDTO(Integer children, LocalDate birthDate, Double income, String cpf, String name, Long id) {
        this.children = children;
        this.birthDate = birthDate;
        this.income = income;
        this.cpf = cpf;
        this.name = name;
        this.id = id;
    }
    public ClientDTO(Client client) {
        children = client.getChildren();
        birthDate = client.getBirthDate();
        income = client.getIncome();
        cpf = client.getCpf();
        name = client.getName();
        id = client.getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
