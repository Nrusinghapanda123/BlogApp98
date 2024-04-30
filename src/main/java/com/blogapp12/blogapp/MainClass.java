package com.blogapp12.blogapp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

    public static  void main(String args[]) {
        Employee1 emp = new Employee1();
        emp.setId(1);
        emp.setName("Liku");

        Employee1 emp1 = new Employee1();
        emp1.setId(3);
        emp1.setName("Sneha");


        List<Employee1> data=Arrays.asList(emp,emp1);
         List<EmployeeDto> newdata= data.stream().map(x->mapToDto(x)).collect(Collectors.toList());
    }
       static EmployeeDto mapToDto(Employee1 e6 )
        {
            EmployeeDto dto=new EmployeeDto();
            dto.setId(e6.getId());
            dto.setName(e6.getName());

            return  dto;
        }

}
