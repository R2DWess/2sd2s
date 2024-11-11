package com.corp.connexus.hr.funcionarios.service;

import com.corp.connexus.hr.funcionarios.model.DadosFuncionario;
import org.springframework.http.ResponseEntity;

public interface FuncionarioService {

    ResponseEntity<?> cadastrar(DadosFuncionario dadosFuncionario);
}
