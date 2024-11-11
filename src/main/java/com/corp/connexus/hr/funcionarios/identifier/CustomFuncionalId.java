package com.corp.connexus.hr.funcionarios.identifier;

import org.hibernate.annotations.GenericGenerator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@GenericGenerator(name = "custom-funcional", strategy = "com.corp.connexus.hr.funcionarios.identifier.CustomFuncionalGenerator")
public @interface CustomFuncionalId {
}