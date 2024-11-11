package com.corp.connexus.hr.funcionarios.service;

import com.corp.connexus.hr.funcionarios.model.DadosFuncionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public ResponseEntity<?> cadastrar(DadosFuncionario dadosFuncionario) {
        DadosFuncionario cadastrarFuncionario = funcionarioRepository.save(dadosFuncionario);
        return new ResponseEntity<>(dadosFuncionario, HttpStatus.CREATED);
    }
}
