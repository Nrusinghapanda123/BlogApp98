package com.blogapp12.blogapp;

import java.util.function.Supplier;

public class Supplier_class {


    public static void main(String args[])
    {
//        Supplier<Double> val=()->Math.random();
//        Double result=val.get();
//        System.out.println(result);

        Supplier<Double> val=()->Math.max(78.8,9.8);
       Double result=val.get();
        System.out.println(result);






        Supplier<Integer> val1=()->Math.max(45,89);
        Integer out=val1.get();
        System.out.println(out);
















    }
}
