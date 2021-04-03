package com.rahul.app.service;

import com.rahul.app.dao.MappingRepository;
import com.rahul.app.dto.EmpDeptDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapingService {
    @Autowired
    MappingRepository mappingRepository;
    public List<EmpDeptDetailsDto> getEmpDeptDetails(String param1, String param2){
        return mappingRepository.getEmpDeptDetails(param1,param2);
    }
}
