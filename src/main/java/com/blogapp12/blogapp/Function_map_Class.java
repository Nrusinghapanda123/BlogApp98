package com.blogapp12.blogapp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Function_map_Class {
 public static void main(String args[])
 {
//     Function<Integer ,Integer> val= n->n+10;
//     Integer result=val.apply(100);
//     System.out.println(result);

//     Function<Integer,String> res=n->"The output is:"+n;
//     String result= res.apply(100);
//     System.out.println(result);

//     List<Integer> list=Arrays.asList(10,20,30,40,50);
//     sList<Integer> newlist= list.stream().map(n->n*n).collect(Collectors.toList());
//     System.out.println(newlist);

//       List<String> list=Arrays.asList("liku","alok","gudu","john");
//       List<String> newlist=list.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
//       System.out.println(newlist);


     List<Employee> data=Arrays.asList(
             new Employee(1,"liku",34000,"Berhampur"),
             new Employee(2,"alok",60000,"Banglore"),
             new Employee(3,"gudu",7777,"Delhi"),
             new Employee(4,"sneha",60000,"Banglore")


     );


     //Reduction 500 salary
//     List<Integer> newdata=data.stream().map(e->e.getSalary()-500).collect(Collectors.toList());
//
//         System.out.println(newdata);

     //Uppercase Name
//     List<String> newdata=data.stream().map(emp->emp.getName().toUpperCase()).collect(Collectors.toList());
//     System.out.println(newdata);


         //GroupBy Salary
//       Map<Integer,List<Employee>> newdata =data.stream().collect(Collectors.groupingBy(e->e.getSalary()));
//
//       for (Map.Entry<Integer,List<Employee>> entry:newdata.entrySet())
//       {
//          List<Employee> emp= entry.getValue();
//          for (Employee e:emp)
//          {
//              System.out.println(entry.getKey()+"----->");
//              System.out.println(e.getName());
//          }
//
//
//       }


     Map<String,List<Employee>> newdata=data.stream().collect(Collectors.groupingBy(e->e.getAddress()));

     for(Map.Entry<String,List<Employee>> entry:newdata.entrySet())
     {
         List<Employee> emp=entry.getValue();
         for(Employee e:emp){

             System.out.println(entry.getKey()+"------>");
             System.out.println(e.getName());
         }
     }

//     Map<String,List<Employee>> newdata=data.stream().collect(Collectors.groupingBy(e->e.getAddress()));
//     System.out.println(newdata);
 }
}
