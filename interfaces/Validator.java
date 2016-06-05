package com.goit.generics.interfaces;

/**
 * Created by Mykhailenko Svitlana on 05.06.2016.
 */
public interface Validator<T> {

    // Валидирует переданое значение
    boolean isValid(T result);

}
