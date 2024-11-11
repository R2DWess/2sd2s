package com.corp.connexus.hr.funcionarios.model;

import jakarta.persistence.Embeddable;

import java.time.LocalDate;

@Embeddable
public record ContratoFuncionarioModel(

        String formato,
        String nomeArquivo,
        LocalDate dataAnexo,
        String tamanhoArquivo
) {}
