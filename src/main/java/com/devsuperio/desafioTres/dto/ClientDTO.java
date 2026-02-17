package com.devsuperio.desafioTres.dto;

import com.devsuperio.desafioTres.entity.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @NotBlank(message = "Name field cannot be empty")
    private String name;
    @NotBlank(message = "Just Numbers")
    private String cpf;
    @Positive(message = "Must be Positive")
    private Double income;
    @PastOrPresent(message = "It cannot be a future date.")
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
