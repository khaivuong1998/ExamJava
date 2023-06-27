package service;

import model.Teacher;

import java.util.List;

public interface ITeacherService {
    public void add(Teacher teacher);
    public List findAll();
    public double getSalary(Teacher teacher);
    public List sortByName();
}
