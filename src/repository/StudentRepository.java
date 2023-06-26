package repository;

import Service.IStudentService;
import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentRepository implements IStudentService {
    //    private IStudentService iStudentService = new StudentRepository();
    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "sdhgsd", "34518350", "tcxvgsdf", "cxhvh", 6.8, 7.7));
        studentList.add(new Student(2, "cvhz", "2514188", "shdhvz", "cvc", 7.0, 7.1));
        studentList.add(new Student(3, "ưucc", "69747993", "vbbsb", "ủuehv", 5.2, 8.7));
        studentList.add(new Student(4, "bjjd", "578441", "dfbfuua", "xchgfha", 3.3, 4.9));
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
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
        return Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) ((o1.getMark1() + o1.getMark2() / 2) - (o2.getMark1() + o2.getMark2() / 2));
            }
        });
    }
}
