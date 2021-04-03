package com.rahul.app.entity;

import com.rahul.app.dto.EmpDeptDetailsDto;
import lombok.Data;

import javax.persistence.*;

@SqlResultSetMappings({
        @SqlResultSetMapping(name="getEmpDeptDetailsResultMapping",
                classes={
                        @ConstructorResult(
                                targetClass= EmpDeptDetailsDto.class,
                                columns={
                                        @ColumnResult(name="EMP_ID", type=Long.class),
                                        @ColumnResult(name="BLOOD_GRP", type=String.class),
                                        @ColumnResult(name="DEPT_NAME", type=Long.class),
                                        @ColumnResult(name="DEPT_LINE", type=Long.class)

                                })})
})
@NamedNativeQueries({
        @NamedNativeQuery(name="getEmpDeptDetails",query = "select a.emp_id as empId, a.blood_grp as bldGrp, b.dept_name as deptName, b.dept_line as businessLine from employee a left join department b on b.dept_name=a.emp_dept where b.dept_name= ?1 AND a.blood_grp= ?2",resultSetMapping = "getEmpDeptDetailsResultMapping")
})
@Data
@Entity
@Table(name="DEPARTMENT")
public class Department {
    @Id
    @Column(name ="DEPT_ID")
    private Long deptId;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "DEPT_LINE")
    private  String deptLine;

    public Department(Long deptId, String deptName, String deptLine) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptLine = deptLine;
    }

    public Department() {
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptLine() {
        return deptLine;
    }

    public void setDeptLine(String deptLine) {
        this.deptLine = deptLine;
    }
}
