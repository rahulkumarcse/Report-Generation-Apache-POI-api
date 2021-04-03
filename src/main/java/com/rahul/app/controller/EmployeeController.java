package com.rahul.app.controller;

import com.rahul.app.entity.Employee;
import com.rahul.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;



    @RequestMapping("/getall/employee")
    List<Employee> getAll(){
        return employeeService.getAllDetails();
    }

    @RequestMapping("/getall/employee/{param1}/{param2}")
    List<Employee> getAllEmployeeByEmpAnDep(@PathVariable("param1") String param1, @PathVariable("param2") String param2){
        return employeeService.getAllEmployeeByIdAndDep(param1,param2);
    }
    @RequestMapping("/dept")
    List getAll1(){
        return employeeService.getEmpDept();
    }
}
