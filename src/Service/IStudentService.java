package Service;

import model.Student;

import java.util.List;

public interface IStudentService {
   public void add(Student student);
   public List findAll();
   public double avgMark(Student student);
   public List sortByGrade();
}
