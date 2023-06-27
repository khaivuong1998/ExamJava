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
                "5.Sort Students By Grade" +
                "6.Sort Students By Name" +
                "7.Exit");
        System.out.println("Mời nhập yêu cầu:");
        int number = Integer.parseInt(scanner.next());
        switch (number) {
            case 1:
                System.out.println(studentRepository.findAll());
                break;
            case 2:
                System.out.println(teacherRepository.findAll());
                break;
            case 3:
                studentRepository.getStudent();
                break;
            case 4:
                teacherRepository.getTeacher();
                break;
            case 5:
                System.out.println(studentRepository.sortByGrade());
                break;
            case 6:
                System.out.println(teacherRepository.sortByName());
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Bạn đã nhập sai");
        }

    }
}