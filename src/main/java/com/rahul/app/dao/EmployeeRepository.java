package com.rahul.app.dao;

import com.rahul.app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(value = "select * from employee", nativeQuery = true)
    public List<Employee> getAllData();

    @Query(name ="getEmpIdEmpDept",nativeQuery = true )
    List<Employee> getEmployeeByempidandEmpDep(@Param("param1") String param, @Param("param2") String param2);

    @Query(value="getEmpIdEmpDept",nativeQuery = true)
    List<Employee> test();
}
