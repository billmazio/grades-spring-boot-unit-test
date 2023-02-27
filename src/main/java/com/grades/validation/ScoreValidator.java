package com.grades.validation;

import com.grades.validation.Score;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class ScoreValidator implements ConstraintValidator<Score,String> {

    List<String>scores = Arrays.asList(
            "1","2","3","4","5","6",
            "7","8","9","10"
    );


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        for (String s:scores) {
            if(value.equals(s)) return true;
        }
        return false;
    }
}
