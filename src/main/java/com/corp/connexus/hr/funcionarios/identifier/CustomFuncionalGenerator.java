package com.corp.connexus.hr.funcionarios.identifier;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

public class CustomFuncionalGenerator implements IdentifierGenerator {

    private static final int FUNCIONAL_LENGTH = 9;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        return generateRandomId(FUNCIONAL_LENGTH);
    }

    private String generateRandomId(int length) {
        StringBuilder id = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(10);  // Generates a number from 0 to 9
            id.append(digit);
        }

        return id.toString();
    }
}