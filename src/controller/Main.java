package controller;

import model.Student;
import model.Teacher;
import repository.StudentRepository;
import repository.TeacherRepository;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        TeacherRepository teacherRepository = new TeacherRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:" +
                "1.List Student" +
                "2.List Teacher" +
                "3.Add Student" +
                "4.Add teacher" +
                "5.Salary Teacher" +
                "6.AVG Student" +
                "7.Sort Students By Grade" +
                "8.Sort Students By Name" +
                "9.Exit");
        System.out.println("Mời nhập yêu cầu:");
        int number = Integer.parseInt(scanner.next());
        switch (number) {
            case 1:
                studentRepository.findAll();
                break;
            case 2:
                teacherRepository.findAll();
                break;
            case 3:
                System.out.println("Mời nhập thông tin sinh viên");
                System.out.println("Mời nhập id");
                int studentID = Integer.parseInt(scanner.next());
                System.out.println("mời nhập tên");
                String studentName = scanner.next();
                System.out.println("mời nhập sdt");
                String numberPhone = scanner.next();
                System.out.println("mời nhập địa chỉ");
                String address = scanner.next();
                System.out.println("mời nhập lô hàng");
                String batch = scanner.next();
                System.out.println("mời nhập điểm toán 1");
                double mark1 = Double.parseDouble(scanner.next());
                System.out.println("mời nhập điểm toán 2");
                double mark2 = Double.parseDouble(scanner.next());
                Student student = new Student(studentID, studentName, numberPhone, address, batch, mark1, mark2);
                studentRepository.add(student);
                break;
            case 4:
                System.out.println("Mời nhập thông tin giáo viên");
                System.out.println("Mời nhập id");
                int teacherID = Integer.parseInt(scanner.next());
                System.out.println("mời nhập tên");
                String teacherName = scanner.next();
                System.out.println("mời nhập sdt");
                String numberPhone1 = scanner.next();
                System.out.println("mời nhập địa chỉ");
                String address1 = scanner.next();
                System.out.println("mời nhập lương");
                double salary = Double.parseDouble(scanner.next());
                System.out.println("mời nhập số ngày làm việc");
                int numberWorkDay = Integer.parseInt(scanner.next());
                Teacher teacher = new Teacher(teacherID, teacherName, numberPhone1, address1, salary, numberWorkDay);
                teacherRepository.add(teacher);
                break;
            case 5:
                System.out.println("nhập tên giáo viên muốn tìm");
                String nameTeacher = scanner.next();
                if (nameTeacher.equals(teacherRepository.findAll())) {
//                    System.out.println(teacherRepository.getSalary(nameTeacher));
                }
                break;
            case 6:
                System.out.println("mời nhập sinh viên cần tìm");
                String nameStudent = scanner.next();
                if (nameStudent.equals(studentRepository.findAll())) {
//                    System.out.println(studentRepository.avgMark(nameStudent));
                }
                break;
            case 7:
                studentRepository.sortByGrade();
                break;
            case 8:
                teacherRepository.sortByName();
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Bạn đã nhập sai");
        }

    }
}