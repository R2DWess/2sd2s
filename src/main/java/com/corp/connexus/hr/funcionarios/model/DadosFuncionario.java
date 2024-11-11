package com.corp.connexus.hr.funcionarios.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity(name = "funcionario")
@Table(name = "dados_funcionario")
public class DadosFuncionario {

    @Id
    @JsonProperty("funcional")
    private String idFuncional;

    @NotBlank(message = "Campo nome é obrigatório")
    private String nomeFuncionario;

    @NotBlank(message = "Campo email é obrigatório ")
    @Email(message = "Formato de e-mail inválido")
    private String emailFuncionario;

    @Pattern(regexp = "^\\d{11}$", message = "O número de telefone deve ter exatamente 11 dígitos.")
    private String telefoneFuncionario;

    private EnderecoFuncionarioModel enderecoFuncionario;

    // Getters and Setters
    public String getIdFuncional() {
        return idFuncional;
    }

    public void setIdFuncional(String idFuncional) {
        this.idFuncional = idFuncional;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public EnderecoFuncionarioModel getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(EnderecoFuncionarioModel enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }
}