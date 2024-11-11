package com.corp.connexus.hr.funcionarios.service;

import com.corp.connexus.hr.funcionarios.model.DadosFuncionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<DadosFuncionario, Integer> {
}