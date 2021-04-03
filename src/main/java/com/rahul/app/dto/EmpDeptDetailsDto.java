package com.rahul.app.dto;

public class EmpDeptDetailsDto {
    private Long empId;
    private String bloodGrp;
    private String deptName;
    private String businessLine;

    public EmpDeptDetailsDto() {
    }

    public EmpDeptDetailsDto(Long empId, String bloodGrp, String deptName, String businessLine) {
        this.empId = empId;
        this.bloodGrp = bloodGrp;
        this.deptName = deptName;
        this.businessLine = businessLine;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getBusinessLine() {
        return businessLine;
    }

    public void setBusinessLine(String businessLine) {
        this.businessLine = businessLine;
    }
}
