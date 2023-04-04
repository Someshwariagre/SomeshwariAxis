package com.training.student.main;

import com.training.student.entity.StudentEntity;
import com.training.student.service.StudentService;
import com.training.student.service.StudentServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) throws SQLException {
        StudentService service = new StudentServiceImpl();
        StudentEntity s = new StudentEntity(1,"Somu","IPE","Belgaum");
        StudentEntity s1 = new StudentEntity(2,"Smita","Mechanical","Baglakot");
        StudentEntity s2 = new StudentEntity(3,"Sampatti","ISE","Kalburagi");
        StudentEntity s3 = new StudentEntity(4,"Aishwarya","CSE","pune");
        StudentEntity s4 = new StudentEntity(5,"Preeti","EEE","Yadagiri");
        StudentEntity s5 = new StudentEntity(6,"Shanti","ECE","Bidar");

        service.save(s);
        service.save(s1);
        service.save(s2);
        service.save(s3);
        service.save(s4);
        service.save(s5);

        List<StudentEntity> list = service.read();
        for (StudentEntity se: list) {
            System.out.println(se);

        }
        System.out.println(service.findByname("Preeti"));
        System.out.println(service.findBynameAndId("Shanti",6));

        System.out.println(service.updatePlaceByName("mudhol","smita"));

        service.deleteByBranch("IPE");
    }
}
