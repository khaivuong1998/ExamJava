package repository;

import Service.ITeacherService;
import model.Teacher;

import java.util.*;

public class TeacherRepository implements ITeacherService {
    private ITeacherService iTeacherService = new TeacherRepository();
    List<Teacher> teacherList = new ArrayList<>();
    static {

    }
    @Override
    public void add(Teacher teacher) {
        iTeacherService.add(teacher);
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public double getSalary(Teacher teacher) {
        return teacher.getNumberWorkDay() * 800000;
    }

    @Override
    public List sortByName() {
        return null;
    }
}
