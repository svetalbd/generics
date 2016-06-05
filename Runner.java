package com.goit.generics;

import com.goit.generics.integer.implementation.IntExecutor;
import com.goit.generics.integer.implementation.IntTask;
import com.goit.generics.integer.implementation.IntValidator;
import com.goit.generics.interfaces.Executor;
import com.goit.generics.interfaces.Task;
import com.goit.generics.interfaces.Validator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mykhailenko Svitlana on 05.06.2016.
 */
public class Runner {
    public static void test(List<Task<Integer>> intTasks) {
        Executor testExecutor = new IntExecutor();

        Validator intValidator = new IntValidator();

        for (Task<Integer> intTask : intTasks) {
            testExecutor.addTask(intTask);
        }

        testExecutor.addTask(new IntTask(23), intValidator);
        testExecutor.addTask(new IntTask(10), intValidator);
        testExecutor.addTask(new IntTask(17), intValidator);
        testExecutor.addTask(new IntTask(16), intValidator);

        //testExecutor.execute();

        System.out.println("Valid results:");
        for (Object o : testExecutor.getValidResults()) {
            System.out.println(o);
        }
        System.out.println("Invalid results:");
        for (Object o : testExecutor.getInvalidResults()) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Task<Integer>> intTasks = new ArrayList<>();
        intTasks.add(new IntTask(100));
        test(intTasks);
    }
}
