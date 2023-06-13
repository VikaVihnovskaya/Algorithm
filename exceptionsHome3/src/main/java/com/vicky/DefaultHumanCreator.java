package com.vicky;

import java.util.Scanner;

public class DefaultHumanCreator implements HumanCreator{

    private final HumanValidator humanValidator;

    public DefaultHumanCreator() {
        this.humanValidator = new DefaultHumanValidator();
    }

    @Override
    public Human create() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите фамилию, имя, отчество, дату рождения (в формате dd.mm.yyyy), " +
                "номер телефона (число без разделителей) и пол(символ латиницей f или m), разделенные пробелом");
        String[] personData = userInput.nextLine().split(" ");
        humanValidator.validate(personData);
        return new Human(personData[0], personData[1], personData[2], personData[3], personData[4], personData[5]);
    }
}
