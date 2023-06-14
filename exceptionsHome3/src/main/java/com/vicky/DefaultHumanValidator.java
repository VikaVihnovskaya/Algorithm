package com.vicky;

import com.vicky.exception.DateFormatException;
import com.vicky.exception.IncorrectPersonDataLengthException;
import com.vicky.exception.IncorrectSexException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DefaultHumanValidator implements HumanValidator {
    public static final int SIZE = 6;

    @Override
    public void validate(String[] personData) {
        if (personData.length < SIZE) {
            throw new IncorrectPersonDataLengthException("Введено недостаточно данных.");
        } else if (personData.length > SIZE) {
            throw new IncorrectPersonDataLengthException("Введено много данных.");
        }
        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        try {
            format.parse(personData[3]);
        } catch (ParseException e) {
            throw new DateFormatException("Неверный формат даты рождения");
        }
        try {
            Long.parseLong(personData[4]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат телефона");
        }
        if (!personData[5].equalsIgnoreCase("m") && !personData[5].equalsIgnoreCase("f")) {
            throw new IncorrectSexException("Неверно введен пол");
        }
    }
}
