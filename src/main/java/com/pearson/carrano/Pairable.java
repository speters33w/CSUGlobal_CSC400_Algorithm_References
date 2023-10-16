package com.pearson.carrano;

/**
    An interface for pairs of objects.
    @author Frank M. Carrano
    @varsion 4.0
*/
public interface Pairable<T>
{
   public T getFirst();
   public T getSecond();
   public void changeOrder();
} // end Pairable