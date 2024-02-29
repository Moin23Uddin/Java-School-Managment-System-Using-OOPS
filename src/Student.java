import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class Student implements Serializable {
    private int id;
    private String name;
    private String department ;
    private int section;

    private String[] monthlyAttendance = new String[2];
    public Student(int id, String name, String department,int section) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.section=section;

    }
    public int getId() {
        return this.id;
    }
    public String getName() {

    return this.name;
    }
    public String getdepartment() {

        return this.department;
    }
    public int getsection() {

        return this.section;
    }
    public String getAttendanceForDay(int day) {
        return monthlyAttendance[day - 1];
    }
    public void setAttendanceForDay(int day, String attendance) {
        if (attendance.equalsIgnoreCase("yes") || attendance.equalsIgnoreCase("no")) {
            monthlyAttendance[day - 1] = attendance;
        } else {
            System.out.println("Invalid attendance status. Please enter 'yes' or 'no'.");
        }
    }
    public String toString() {
        StringBuilder attendanceDetails = new StringBuilder("Student's name: " + this.name + "\nDepartment: " + this.department + "\nSection: " + this.section );
        attendanceDetails.append("\nMonthly Attendance:");
        for (int day = 1; day <= monthlyAttendance.length; day++) {
            attendanceDetails.append("\nDay ").append(day).append(": ").append(getAttendanceForDay(day));
        }
        return attendanceDetails.toString();
}
public static void main(String[] args) {

    }
    public static void attendance_summary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Student ID: ");
        int studentId = scanner.nextInt();
        Student student = getStudentById(studentId);
        if (student != null) {
            System.out.println("Student information based on ID " + studentId + ":");
            System.out.println(student);
        } else {
            System.out.println("Student not found with ID: " + studentId);
        }
    }
    public static Student getStudentById(int studentId) {
        List<Student> studentList1 = School.getStudents();
        for (Student student : studentList1) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null;
}
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return id == student.id && name.equals(student.name) && department.equals(student.department) && section == student.section;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, section);
    }
}
