package com.rahul.app.service;

import com.rahul.app.dao.CourseRepository;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

@Service
public class ApachePoiService  {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    EntityManager em;



    public void getEmpDept()  throws IOException {
        List<String> empDept = courseRepository.getEmpDept();


        XSSFWorkbook wb = new XSSFWorkbook();
        String[] header = new String[]{"Employee ID","Employee Name","Employee Dept" };
        for (String str : empDept) {
            XSSFSheet sheet = wb.createSheet(str);
            List<Object[]> details = courseRepository.getEmpDetails(str);
             int rowCount = 0;
               Row row = sheet.createRow(rowCount++);
                    int rw=0;
                    for (String headval : header){
                        Cell cell = row.createCell(rw++);
                        cell.setCellValue((String) headval);
                    }



                    for (Object[] detail : details) {
                        row = sheet.createRow(rowCount++);

                        int columnCount = 0;

                        for (Object field : detail) {
                            Cell cell = row.createCell(columnCount++);
                            if (field instanceof String) {
                                cell.setCellValue((String) field);
                            } else if (field instanceof Integer) {
                                cell.setCellValue((Integer) field);
                            }
                        }

                    }



                }
        XSSFSheet sheet = wb.createSheet("Result Query");
        Row row = sheet.createRow(0);
        int cellQuery =0;
        Cell cell1 = row.createCell(cellQuery++);
        cell1.setCellValue("Result query");
        cell1 = row.createCell(cellQuery);
        cell1.setCellValue("select * from it");
                try (OutputStream fileOut = new FileOutputStream("EmployeeFile.xlsx")) {
                    wb.write(fileOut);
                }
                catch(Exception e){
                    System.out.println("Exception found");
                }





    }

    public List<Object[]> getAlltheDetails(String str){
        List<Object[]> test = courseRepository.getEmpDetails(str);
       System.out.println("testing only by rahul");


                for (int i=0; i<test.size(); i++){
                    Object[] row = (Object[]) test.get(i);
                   /* for(int j =0; j< row.length;j++){
                        System.out.println((String.valueOf(row[j])));
                    }*/
                   // System.out.println(Arrays.toString(row));
                    List temp =Arrays.asList(row);
                    System.out.println(temp);
                }



        return test;


}
}
