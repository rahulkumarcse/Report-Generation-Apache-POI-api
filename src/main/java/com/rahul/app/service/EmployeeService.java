package com.rahul.app.service;

import com.rahul.app.dao.*;
import com.rahul.app.entity.Department;
import com.rahul.app.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    DeptEmplRepository deptEmplRepository;

    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    CourseRepository courseRepository;

    public List<Employee> getAllDetails(){
        return employeeRepository.getAllData();
    }

    public List<Department> getAllDepa(){
        return departmentRepository.getAllDepartment();
    }
    public  List<Employee> getAllEmployeeByIdAndDep(String param1,String param2){

        return employeeRepository.getEmployeeByempidandEmpDep(param1,param2);
    }

    public List<Object[]> getAllDep(String param1,String param2){
        return deptEmplRepository.getAllDept(param1,param2);
    }
public  List<Employee> test(){
        return employeeRepo.test();
}
    public  List<Employee> test2(){
        return employeeRepo.constructorMapping();
    }
    public  List<Employee> variableConstructorBased(String param1){
        return employeeRepo.variableConstructorMapping(param1);
    }
    public  List<Employee> entityBasedMapping(){
        return employeeRepo.entityrMapping();
    }

    public List getEmpDept(){
        return courseRepository.getEmpDept();
    }
}
