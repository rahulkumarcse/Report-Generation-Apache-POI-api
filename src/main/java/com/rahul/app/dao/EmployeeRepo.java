package com.rahul.app.dao;

import com.rahul.app.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeRepo{
    @PersistenceContext
    EntityManager em;
    public List<Employee> test(){
        Query query = em.createNamedQuery("getEmpIdEmpDept" );
        List<Employee> test1= query.getResultList();
        return test1;
    }
    public List<Employee> scalarMapping(){
        Query query = em.createNamedQuery("getEmpIdEmpDept" );
        List<Employee> test1= query.getResultList();
        return test1;
    }
    public List<Employee> constructorMapping(){
        Query query = em.createNamedQuery("testtwoquery" );
        List<Employee> test1= query.getResultList();
        return test1;
    }
    public List<Employee> variableConstructorMapping(String param1){
        Query query = em.createNamedQuery("variablebasedquery" );
        query.setParameter(1,param1);
        List<Employee> test1= query.getResultList();
        return test1;
    }
    public List<Employee> entityrMapping(){
        Query query = em.createNamedQuery("entityBasedQuery" );
        List<Employee> test1= query.getResultList();
        return test1;
    }


}
