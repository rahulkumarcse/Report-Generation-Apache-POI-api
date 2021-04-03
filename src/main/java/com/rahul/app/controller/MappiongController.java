package com.rahul.app.controller;

import com.rahul.app.dto.EmpDeptDetailsDto;
import com.rahul.app.service.MapingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "/map")
public class MappiongController {
    @Autowired
    MapingService mapingService;
    @RequestMapping("/getempdept/{param1}/{param2}")
    public List<EmpDeptDetailsDto> getEmpDept(@PathVariable("param1") String param1,@PathVariable("param2") String param2){
        List<EmpDeptDetailsDto> test= mapingService.getEmpDeptDetails(param1, param2);
        return  test;
    }

}
