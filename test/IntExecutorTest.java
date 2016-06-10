package com.goit.generics.test;

import com.goit.generics.implementation.IntExecutor;
import com.goit.generics.implementation.IntTask;
import com.goit.generics.implementation.IntValidator;
import com.goit.generics.interfaces.Executor;
import com.goit.generics.interfaces.Task;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Сергей on 10.06.2016.
 */
public class IntExecutorTest {


    @Test
    public void testGetValidResults() throws Exception {
        Executor<Integer> intExecutor = new IntExecutor();
        intExecutor.addTask(new IntTask(10), new IntValidator());
        intExecutor.addTask(new IntTask(5), new IntValidator());
        intExecutor.addTask(new IntTask(100), new IntValidator());
        intExecutor.addTask(new IntTask(-2), new IntValidator());
    }

    @Test
    public void testName2() throws Exception {
        List<Task<Integer>> taskList = new LinkedList();
        taskList.add(new IntTask(10));
        taskList.add(new IntTask(20));
        taskList.add(new IntTask(4));
    }

}