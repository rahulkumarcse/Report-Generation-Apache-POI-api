package com.rahul.app.controller;

import com.rahul.app.entity.Department;
import com.rahul.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/getall/department")
    List<Department> getAllDept(){
        return employeeService.getAllDepa();
    }
    @RequestMapping("/getempdept")

    public  List getEmpDept(){
        return employeeService.getEmpDept();
    }

}
