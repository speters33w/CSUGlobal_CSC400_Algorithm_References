package com.pearson.carrano;

/**
    An interface for pairs of objects.
    @author Frank M. Carrano
    @version 4.0
*/
public interface Pairable<T>
{
   T getFirst();
   T getSecond();
   void changeOrder();
} // end Pairable