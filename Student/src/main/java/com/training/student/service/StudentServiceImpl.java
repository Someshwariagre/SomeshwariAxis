package com.training.student.service;

import com.training.student.entity.StudentEntity;
import com.training.student.repository.StudentRepo;
import com.training.student.repository.StudentRepoImpl;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService{
     StudentRepo repo = new StudentRepoImpl();
    @Override
    public boolean save(StudentEntity dto) throws SQLException {
        if(dto!=null&&dto.getName().length()>=3){
            System.out.println("Data is saved successfully");
            repo.save(dto);
        }
        return true;
    }

    @Override
    public List<StudentEntity> read() throws SQLException {
        return repo.read();

    }

    @Override
    public StudentEntity findByname(String name) throws SQLException {
        if(name.length()>=2){
            System.out.println("Found the data");
            return repo.findByname(name);
        }
        return null;
    }

    @Override
    public StudentEntity findBynameAndId(String name, int id) throws SQLException {
        if(name!=null&&id>0){
            System.out.println("Data has found ");
            return repo.findBynameAndId(name,id);
        }
        return null;
    }

    @Override
    public boolean updatePlaceByName(String place, String name) throws SQLException {
        if(place.equals(place)&&name.equals(name)){
            System.out.println("updated Successfully");
            return repo.updatePlaceByName(place,name);
        }
        return false;
    }

    @Override
    public boolean deleteByBranch(String branch) throws SQLException {
        if(branch.equals(branch)){
            System.out.println("data deleted Successfully");
            return repo.deleteByBranch(branch);
        }
        return false;
    }
}
