package com.goit.generics.integer.implementation;

import com.goit.generics.interfaces.Executor;
import com.goit.generics.interfaces.Task;
import com.goit.generics.interfaces.Validator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mykhailenko Svitlana on 05.06.2016.
 */
public class IntExecutor implements Executor<Integer> {
    private boolean isExecuted = false;
    private List<Integer> validResults = new LinkedList<>();
    private List<Integer> invalidResults = new LinkedList<>();
    private List<Task<? extends Integer>> executedTask = new LinkedList<>();

    @Override
    public void addTask(Task<? extends Integer> task) {
        this.executedTask.add(task);
    }

    @Override
    public void addTask(Task<? extends Integer> task, Validator<? super Integer> validator) {
        if (validator.isValid(task.getResult()))
            validResults.add(task.getResult());
        else invalidResults.add(task.getResult());
    }

    @Override
    public void execute() {
        isExecuted = true;
        IntValidator intValidator = new IntValidator();
        for (Task task: executedTask){
            if (intValidator.isValid((Integer) task.getResult()))
                validResults.add((Integer) task.getResult());
        }

    }

    @Override
    public List<Integer> getValidResults() throws IllegalStateException {
        if (!isExecuted) {
            System.out.println("ERROR: \"EXECUTE\" is not called.");
            throw new IllegalStateException();
        } else {
            return validResults;
        }
    }

    @Override
    public List<Integer> getInvalidResults() throws IllegalStateException {
        if (!isExecuted) {
            System.out.println("ERROR: \"EXECUTE\" is not called.");
            throw new IllegalStateException();
        } else {
            return invalidResults;
        }
    }
}
