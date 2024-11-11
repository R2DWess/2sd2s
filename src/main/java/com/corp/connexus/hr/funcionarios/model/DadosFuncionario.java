package com.corp.connexus.hr.funcionarios.model;

import com.corp.connexus.hr.funcionarios.identifier.CustomFuncionalId;
import com.corp.connexus.hr.funcionarios.model.serielizer.TelefoneFuncionarioSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "funcionario")
@Table(name = "dados_funcionario")
public class  DadosFuncionario {


    @Id
    @GeneratedValue(generator = "custom-funcional")
    @CustomFuncionalId
    @JsonProperty("funcional")
    private int idFuncional;

    @NotBlank(message = "Campo nome é obrigatório")
    private String nomeFuncionario;

    @NotBlank(message = "Campo email é obrigatório ")
    @Email(message = "Formato de e-mail inválido")
    private String emailFuncionario;

    @Pattern(regexp = "^\\d{11}$", message = "O número de telefone deve ter exatamente 11 dígitos.")
    @JsonSerialize(using = TelefoneFuncionarioSerializer.class)
    private String telefoneFuncionario;

    @Embedded
    @JsonProperty("enderecoFuncionarioModel")
    private EnderecoFuncionarioModel enderecofuncionario;

    public DadosFuncionario(int idFuncional,
                            String nomeFuncionario,
                            String emailFuncionario,
                            String telefoneFuncionario,
                            EnderecoFuncionarioModel enderecofuncionario) {
        this.idFuncional = idFuncional;
        this.nomeFuncionario = nomeFuncionario;
        this.emailFuncionario = emailFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.enderecofuncionario = enderecofuncionario;
    }

    public int getIdFuncional() {
        return idFuncional;
    }

    public void setIdFuncional(int idFuncional) {
        this.idFuncional = idFuncional;
    }

    public @NotBlank(message = "Campo nome é obrigatório") String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(@NotBlank(message = "Campo nome é obrigatório") String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public @NotBlank(message = "Campo email é obrigatório ") @Email(message = "Formato de e-mail inválido") String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(@NotBlank(message = "Campo email é obrigatório ") @Email(message = "Formato de e-mail inválido") String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public @Pattern(regexp = "^\\d{11}$", message = "O número de telefone deve ter exatamente 11 dígitos.") String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(@Pattern(regexp = "^\\d{11}$", message = "O número de telefone deve ter exatamente 11 dígitos.") String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public EnderecoFuncionarioModel getEnderecofuncionario() {
        return enderecofuncionario;
    }

    public void setEnderecofuncionario(EnderecoFuncionarioModel enderecofuncionario) {
        this.enderecofuncionario = enderecofuncionario;
    }
}

