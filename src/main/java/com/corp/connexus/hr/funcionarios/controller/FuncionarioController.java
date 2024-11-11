package com.corp.connexus.hr.funcionarios.controller;

import com.corp.connexus.hr.funcionarios.model.DadosFuncionario;
import com.corp.connexus.hr.funcionarios.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/funcionario/")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("/novo-funcionario")
    public ResponseEntity<?> cadastrarFuncionario(@Valid @RequestBody DadosFuncionario dadosFuncionario){
        return funcionarioService.cadastrar(dadosFuncionario);
    }

}
