package com.training.student.service;

import com.training.student.entity.StudentEntity;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    public boolean save(StudentEntity dto) throws SQLException;

    public List<StudentEntity> read() throws SQLException;

    public StudentEntity findByname(String name) throws SQLException;

    public StudentEntity findBynameAndId(String name, int id) throws SQLException;

    public boolean updatePlaceByName(String place, String name) throws SQLException;

    public boolean deleteByBranch(String branch) throws SQLException;
}
