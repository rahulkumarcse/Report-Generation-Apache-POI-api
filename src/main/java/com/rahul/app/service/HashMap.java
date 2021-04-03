package com.rahul.app.service;

import java.util.Arrays;
import java.util.List;

public class HashMap {
    public static void main(String[] args) {
        List<String> empDept = Arrays.asList("EQD", "MTR", "FRM", "GTS", "SGS");
        java.util.HashMap<String,String> shname = new java.util.HashMap<>();
        shname.put("EQD","ED");

        shname.put("MTR","MR");

        shname.put("FRM","FR");
        shname.put("GTS","GTS");
        shname.put("sgs","SGSS");
        for(String str : empDept)
        {
        for(String str1 : shname.keySet())
        {
            if(str == str1 ){
                System.out.println("Deptname :"+ str+ " deptshortcut :" +shname.get(str1));
            }
        }
        }
    }
}
