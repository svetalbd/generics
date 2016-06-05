package com.goit.generics.interfaces;

/**
 * Created by Mykhailenko Svitlana on 05.06.2016.
 */
public interface Task <T> {

    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    T getResult();

}
