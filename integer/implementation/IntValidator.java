package com.goit.generics.integer.implementation;

import com.goit.generics.interfaces.Task;
import com.goit.generics.interfaces.Validator;

/**
 * Created by Mykhailenko Svitlana on 05.06.2016.
 */
public class IntValidator implements Validator<Integer> {

    @Override
    public boolean isValid(Integer result) {
        boolean returned = false;
        if (result % 10 == 0){
            return returned = true;
        }
        return returned;
    }
}
