package model;

public class Teacher extends Persion{
    private int teacherId;
    private String teacherName;
    private String numberPhone;
    private String address;
    private double salary;
    private int numberWorkDay;

    public Teacher() {
    }

    public Teacher(int teacherId, String teacherName, String numberPhone, String address, double salary, int numberWorkDay) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.numberPhone = numberPhone;
        this.address = address;
        this.salary = salary;
        this.numberWorkDay = numberWorkDay;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
//        salary = numberWorkDay * 800000;
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberWorkDay() {
        return numberWorkDay;
    }

    public void setNumberWorkDay(int numberWorkDay) {
        this.numberWorkDay = numberWorkDay;
    }

    @Override
    public String toString() {
        return "model.Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", numberWorkDay=" + numberWorkDay +
                '}';
    }
}
