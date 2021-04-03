package com.rahul.app.entity;

import lombok.Data;

import javax.persistence.*;

@SqlResultSetMappings({
        @SqlResultSetMapping(name = "employeeMapping",columns ={@ColumnResult(name="EMP_ID"),
        @ColumnResult(name="EMP_NAME")}
        ),
        @SqlResultSetMapping(
                name="testWithTwoFieled",
                classes={
                        @ConstructorResult(
                                targetClass=Employee.class,
                                columns={
                                        @ColumnResult(name="EMP_ID", type=Long.class),
                                        @ColumnResult(name="EMP_NAME", type=String.class)
                                })}),
@SqlResultSetMapping(name="variablebasedmapping",
        classes={
                @ConstructorResult(
                        targetClass=Employee.class,
                        columns={
                                @ColumnResult(name="EMP_ID", type=Long.class),
                                @ColumnResult(name="EMP_NAME", type=String.class)
                        })}),
        @SqlResultSetMapping(
                name="entityBasedMapping",
                entities={
                        @EntityResult(
                                entityClass = Employee.class,
                                fields={
                                        @FieldResult(name="empId",column="TEST"),
                                        @FieldResult(name="empName", column="emp_Name")})})})
@NamedNativeQuery(name="getEmpIdEmpDept",query = "select EMP_ID , EMP_NAME from employee",resultSetMapping = "employeeMapping")
@NamedNativeQuery(name="testtwoquery", query = "select EMP_ID , emp_name from employee ", resultSetMapping = "testWithTwoFieled")
@NamedNativeQuery(name="variablebasedquery", query=" select emp_id, emp_name from employee where emp_id = ?1",resultSetMapping ="variablebasedmapping")
@NamedNativeQuery(name="entityBasedQuery", query="select EMP_ID as employee_id, emp_name  as employee_name from employee ",resultSetMapping = "entityBasedMapping")
@Data
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name = "EMP_ID")
    private Long empId;

    @Column(name = "EMP_NAME")
    private String empName;

    @Column(name = "BLOOD_GRP")
    private String bloodGrp;

    @Column(name = "EMP_DEPT")
    private String empDept;

    @Column(name = "EMP_DESIGNATION")
    private  String empDesignation;

    public Employee(Long empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Employee() {
    }

    public Employee(Long empId, String empName, String bloodGrp, String empDept, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.bloodGrp = bloodGrp;
        this.empDept = empDept;
        this.empDesignation = empDesignation;
    }
}
