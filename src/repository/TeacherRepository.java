package repository;

import Service.ITeacherService;
import model.Teacher;

import java.util.*;

public class TeacherRepository implements ITeacherService {
    //    private ITeacherService iTeacherService = new TeacherRepository();
    private static List<Teacher> teacherList = new ArrayList<>();

    static {
        teacherList.add(new Teacher(1, "sdhhvz", "sydscdva", "fvvgyz", 5.5, 7));
        teacherList.add(new Teacher(2, "xcvh", "thdsf", "idbdb", 6.8, 4));
        teacherList.add(new Teacher(3, "ídghusd", "cvbnv", "qqnscan", 7.2, 9));
        teacherList.add(new Teacher(4, "cvnbvhab", "uzgz", "pdvd", 8.1, 6));
    }

    @Override
    public void add(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public List findAll() {
        return teacherList;
    }

    @Override
    public double getSalary(Teacher teacher) {
        return teacher.getNumberWorkDay() * 800000;
    }

    @Override
    public List sortByName() {
        return Collections.sort(teacherList, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getTeacherName().compareTo(o2.getTeacherName());
            }
        });
    }
}
