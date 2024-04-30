package com.blogapp12.blogapp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_class {
    public static void main(String args[])
    {
//        Consumer<Integer> val=n-> System.out.println(n);
//        val.accept(10);

//        Consumer<String> val1=str-> System.out.println(str);
//        val1.accept("Liku");

//        Consumer<Integer> print=item-> System.out.println(item);
//
//        List<Integer> numbers=new ArrayList<>();
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(8);
//        numbers.add(19);
//
//        numbers.forEach(print);

        Consumer<String> val=n-> System.out.println(n);
        val.accept("liku");

        Consumer<Integer> val1=e-> System.out.println(e);
        val1.accept(450);


















    }
}
