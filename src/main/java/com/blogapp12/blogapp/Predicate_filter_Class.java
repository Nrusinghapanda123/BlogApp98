package com.blogapp12.blogapp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_filter_Class {

    public static void main(String[] args) {

//        Predicate<String> result = str-> str.startsWith("L") ;
//        boolean test = result.test("LIKU");
//        System.out.println(test);

        int[] x={0,5,10,15,30,50,77};
        Predicate<Integer> isEven=n->n%2==0;
        Predicate<Integer> isGreaterThen10=n->n>10;
        for(int n:x)
        {
            System.out.println(n+" is even: "+ isEven.test(n)+ " - greaterThen10: " + isGreaterThen10.test(n));
        }

//        List<Integer> data=Arrays.asList(10,20,30,40,50);
//        List<Integer> newdata=data.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(newdata);

 //      List<String> list= Arrays.asList("Liku","Alok","Gudu","Sarat","Lion","Liku");
//     List<String> newlist=  list.stream().filter(str->str.startsWith("L")).collect(Collectors.toList());
//        System.out.println(newlist);

        //  List<String> list= Arrays.asList("Liku","Alok","Gudu","Sarat","Lion","Liku");
//        List<String> newlist=list.stream().filter(str->str.equalsIgnoreCase("liku")).collect(Collectors.toList());
//        System.out.println(newlist.size());

//        List<String> list= Arrays.asList("Liku","Alok","Gudu","Sarat","Lion","Liku");
//        List<String> newlist=list.stream().distinct().collect(Collectors.toList());
//        System.out.println(newlist);


//        List<Integer> list=Arrays.asList(1000,5000,60000,1000000,5000000,1900000);
//        List<Integer> newlist=list.stream().filter(n->n>=100000).collect(Collectors.toList());
//        System.out.println(newlist);
//
//
//
//        //get emp who's salary >=20000 and address is delhi.
//       List<Employee> data= Arrays.asList(
//                new Employee(1,"liku",34000,"Berhampur"),
//                new Employee(2,"alok",60000,"Banglore"),
//                new Employee(3,"gudu",7777,"Delhi"),
//                new Employee(4,"sneha",888777,"Banglore")
//
//
//
//               );
//       List<Employee> newdata=data.stream().filter(employee->employee.getSalary()>=20000 && employee.getAddress().equalsIgnoreCase("banglore")).collect(Collectors.toList());
//
//       for (Employee e:newdata) {
//           System.out.println(e.getId());
//           System.out.println(e.getName());
//           System.out.println(e.getSalary());
//           System.out.println(e.getAddress());
//       }
    }
}



