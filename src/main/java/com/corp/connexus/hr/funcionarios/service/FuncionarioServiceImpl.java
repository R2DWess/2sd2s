package com.corp.connexus.hr.funcionarios.service;

import com.corp.connexus.hr.funcionarios.identifier.GeradorFuncional;
import com.corp.connexus.hr.funcionarios.model.DadosFuncionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private com.corp.connexus.hr.funcionarios.service.FuncionarioRepository funcionarioRepository;

    @Autowired
    private GeradorFuncional geradorFuncional;

    @Override
    public DadosFuncionario cadastrar(DadosFuncionario dadosFuncionario) {
        // Gera o ID funcional único antes de salvar
        dadosFuncionario.setIdFuncional(geradorFuncional.gerarIdUnico());
        return funcionarioRepository.save(dadosFuncionario);
    }
}