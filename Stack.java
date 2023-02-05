package ru.libedinskiy;
// точный тип
public interface Stack<TYPE> {

    void push(TYPE value);


    TYPE pop();


    TYPE peek();


    int count();

}
