package com.goit.generics.integer.implementation;


import com.goit.generics.interfaces.Task;

import java.util.Random;

/**
 * Created by Mykhailenko Svitlana on 05.06.2016.
 */
public class IntTask implements Task<Integer> {
    private Integer result;

    public IntTask(int i) {
        this.result = i;
    }


    @Override
    public void execute() {
        result = result * 2;
    }

    @Override
    public Integer getResult() {
        return result;
    }
}
