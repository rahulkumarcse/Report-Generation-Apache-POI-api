package com.rahul.app.dao;

import com.rahul.app.dto.EmpDeptDetailsDto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MappingRepository {
    @PersistenceContext
    EntityManager em;
public List<EmpDeptDetailsDto> getEmpDeptDetails(String param1,String param2){
    Query query = em.createNamedQuery("getEmpDeptDetails");
    query.setParameter(1,param1);
    query.setParameter(1,param2);
    return query.getResultList();
}
}
