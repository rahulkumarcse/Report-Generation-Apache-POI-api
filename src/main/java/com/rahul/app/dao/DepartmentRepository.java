package com.rahul.app.dao;

import com.rahul.app.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    @Query(value = "select * from DEPARTMENT",nativeQuery = true)
    public List<Department> getAllDepartment();

    /*@Query(value = "select department.dept_name , employee.emp_name , department.dept_id from department left JOIN employee on department.dept_id= employee.emp_id;",nativeQuery = true)
    public List<Department> getTheDat();
*/
}
