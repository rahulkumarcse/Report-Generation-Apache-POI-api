package com.rahul.app.controller;

import com.rahul.app.entity.Department;
import com.rahul.app.entity.Employee;
import com.rahul.app.service.ApachePoiService;
import com.rahul.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class MysqlController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    ApachePoiService apachePoiService;



    @RequestMapping("/getall/department")
    List<Department> getAllDept(){
        return employeeService.getAllDepa();
    }

    @RequestMapping("/twotablequery/{param1}/{param2}")
    List<Object[]> getAllDepttwice(@PathVariable("param1") String param1,@PathVariable("param2") String param2){
        List<Object[]> resultAllEdept=employeeService.getAllDep(param1, param2);
        return resultAllEdept;
    }
    @RequestMapping("/scalarmapping")
    List<Employee> scalarmapping(){
        return employeeService.test();
    }
    @RequestMapping("/constructormapping")
    List<Employee> constructormapping(){
        return employeeService.test2();
    }
    @RequestMapping("/variableconstructormapping/{param1}")
    List<Employee> constructormapping(@PathVariable("param1") String param1){
        return employeeService.variableConstructorBased(param1);
    }

    @RequestMapping("/entitymapping")
    List<Employee> entityBasedMappingmapping(){
        return employeeService.entityBasedMapping();
    }

    @RequestMapping("/report")
    void createReport() throws IOException {

         apachePoiService.getEmpDept();
    }
    @RequestMapping("/detail/{details}")
    public List<Object[] > getDetails(@PathVariable("details") String details){
        return apachePoiService.getAlltheDetails(details);
    }
}
