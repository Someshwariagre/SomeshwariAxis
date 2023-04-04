package com.training.student.repository;

import com.training.student.DBUtil;
import com.training.student.entity.StudentEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepoImpl implements StudentRepo {
    Connection connect = DBUtil.getConnection();

    public boolean save(StudentEntity dto) throws SQLException {


        String query = "insert into student_detail value(?,?,?,?)";

        PreparedStatement statement = connect.prepareStatement(query);
        statement.setInt(1, dto.getId());
        statement.setString(2, dto.getName());
        statement.setString(3, dto.getBranch());
        statement.setString(4, dto.getPlace());

        statement.executeUpdate();
        statement.close();

        return true;
    }

    @Override
    public List<StudentEntity> read() throws SQLException {
        List<StudentEntity> list = new ArrayList<StudentEntity>();

            String query = "select * from student_detail";

            PreparedStatement statement = connect.prepareStatement(query);

            ResultSet rs = statement.executeQuery();
            while(rs.next()) {

                int value = rs.getInt("id");
                String name = rs.getString("name");
                String branch = rs.getString("branch");
                String place = rs.getString("place");

                StudentEntity se = new StudentEntity(value, name, branch, place);
                list.add(se);

            }
            statement.close();

            return list;

        }




    @Override
    public StudentEntity findByname(String name) throws SQLException {

            String query = "select * from student_detail where name=?";

            PreparedStatement statement = connect.prepareStatement(query);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                int value = rs.getInt("id");
                String name1 = rs.getString("name");
                String branch1 = rs.getString("branch");
                String place1 = rs.getString("place");


                StudentEntity dto = new StudentEntity(value, name1, branch1, place1);
                return dto;
            }


            statement.close();



        return null;
    }

    @Override
    public StudentEntity findBynameAndId(String name, int id) throws SQLException {

            String query = "select * from student_detail where name=? and id=?";

            PreparedStatement statement = connect.prepareStatement(query);
            statement.setString(1, name);
            statement.setInt(2, id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                int value = rs.getInt("id");
                String sname = rs.getString("name");
                String sbranch = rs.getString("branch");
                String splace = rs.getString("place");


                StudentEntity dto = new StudentEntity(value, sname, sbranch, splace);
                return dto;
            }

            statement.close();



        return null;
    }

    @Override
    public boolean updatePlaceByName(String place, String name) throws SQLException {

            String query = "update student_detail set place=? where name=?";

            PreparedStatement statement = connect.prepareStatement(query);
            statement.setString(1, place);
            statement.setString(2, name);

            statement.executeUpdate();
            statement.close();

        return true;
    }



    @Override
    public boolean deleteByBranch(String branch) throws SQLException {

            String query = "delete from student_detail where branch = ?";

            PreparedStatement statement = connect.prepareStatement(query);
            statement.setString(1, branch);

            statement.executeUpdate();
            System.out.println("deleted");
            statement.close();
            connect.close();

            return true;
        }
}
