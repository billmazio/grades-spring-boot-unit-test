package com.grades.repository;

import com.grades.pojo.Grade;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
@Repository
public class GradeRepository {
    
    private List<Grade> studentGrades = new ArrayList<>();

    public Grade getGrade(int index) {
        return studentGrades.get(index);
    }

    public void addGrade(Grade grade) {
        studentGrades.add(grade);
    }

    public void updateGrade(Grade grade, int index) {
        studentGrades.set(index, grade);
    }
    
    public List<Grade> getGrades() {
        return studentGrades;
    }

}
