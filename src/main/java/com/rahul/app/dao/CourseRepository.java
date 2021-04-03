package com.rahul.app.dao;

import com.rahul.app.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CourseRepository {
    @Autowired
    EntityManager em;

    public Course findById(Long id){
        return em.find(Course.class, id);
    }

    public List getEmpDept(){
        Query query = em.createNativeQuery("select distinct emp_dept from employee;");
        return query.getResultList();
    }
    public List<Object[]> getEmpDetails(String dept){
        Query query = em.createNativeQuery(" select emp_id,emp_name,emp_dept from employee where emp_Dept = ?1");
        query.setParameter(1,dept);
        return query.getResultList();
    }
}
