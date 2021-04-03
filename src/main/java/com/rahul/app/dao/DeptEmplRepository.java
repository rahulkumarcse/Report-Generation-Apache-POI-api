package com.rahul.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class DeptEmplRepository {
    @Autowired
    EntityManager em;

    public List<Object[]> getAllDept(String param1,String param2) {
        Query query = em.createNativeQuery("select a.emp_id, a.blood_grp , b.dept_name, b.dept_line from employee a left join department b on b.dept_name=a.emp_dept where b.dept_name= ?1 AND a.blood_grp= ?2");
        query.setParameter(1,param1);
        query.setParameter(2,param2);
        List<Object[]> resultList= query.getResultList();
        return resultList;
    }


}

