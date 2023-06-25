package repository;

import Service.IStudentService;
import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentRepository implements IStudentService {
    private IStudentService iStudentService = new StudentRepository();
    List<Student> studentList = new ArrayList<>();
    @Override
    public void add(Student student) {
        iStudentService.add(student);
    }

    @Override
    public List findAll() {
        return studentList;
    }

    @Override
    public double avgMark(Student student) {
        return (student.getMark1() + student.getMark2()) / 2;
    }

    @Override
    public List sortByGrade() {
        return null;
    }
}
