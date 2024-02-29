import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Admin {
    public Admin() {
    }
    public static void main(String[] args) {
        ArrayList<Teacher> teacherList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        School rajshahi = new School(teacherList, studentList);
        int count=0;
        int calculation1=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Admin, whom you want to register first Students or Teachers? Type 0 if you want to register student first or type 1 if you want to register teacher first. ");
        String student_or_teacher = scanner.nextLine();
        if (student_or_teacher.equals("0")) {
            while(true) {
                System.out.println("Want to add Student? If not simply type 0 and if you want to add student type 1");
                String statement1 = scanner.nextLine();
                if ( "0".equals(statement1)) {
                    System.out.println("Thank You");
                    break;
                }
                System.out.println("Provide Student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Student name: ");
                String name = scanner.nextLine();
                System.out.println("Enter Student department: ");
                String department = scanner.nextLine();
                System.out.println("Enter Student's Section: ");
                int section = scanner.nextInt();
                scanner.nextLine();
                Student newStudent = new Student(id,name,department,section);
                studentList.add(newStudent);
                count++;
            }
            while(true) {
                System.out.println("Please Assign Teacher Now");
                System.out.println("Want to add Teacher? If not simply type 0 and if you want to add type 1 ");
                String statement1 = scanner.nextLine();
                if ("0".equals(statement1)) {
                    System.out.println("Thank You");
                    break;
                }
                System.out.println("Enter Teacher ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Teacher's name: ");
                String name = scanner.nextLine();
                System.out.println("Enter teacher department: ");
                String department = scanner.nextLine();
                System.out.println("Enter teachers' assigned sections' (space-separated): ");
                String sectionsInput = scanner.nextLine();
                List<Integer> sections = parseSections(sectionsInput);
                Teacher newteacher = new Teacher(id, name, department, sections);
                teacherList.add(newteacher);
                calculation1++;
            }
        } else if(student_or_teacher.equals("1")) {
            while(true) {
                System.out.println("Want to add Teacher? If not simply type 0 and if you want to add type 1");
                String statement1 = scanner.nextLine();
                if ("0".equals(statement1)) {
                    System.out.println("Thank You");
                    break;
                }
                System.out.println("Enter Teacher ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Teacher's name: ");
                String name = scanner.nextLine();
                System.out.println("Enter teacher department: ");
                String department = scanner.nextLine();
                System.out.println("Enter teachers' assigned sections' (space-separated): ");
                String sectionsInput = scanner.nextLine();
                List<Integer> sections = parseSections(sectionsInput);
                Teacher newteacher = new Teacher(id, name, department, sections);
                teacherList.add(newteacher);
                calculation1++;
            }
            while(true) {
                System.out.println("Please Assign Student Now");
                System.out.println("Want to add Student? If not simply type 0 and if you want to add student type 1");
                String statement1 = scanner.nextLine();
                if ( "0".equals(statement1)) {
                    System.out.println("Thank You");
                    break;
                }
                System.out.println("Provide Student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Student name: ");
                String name = scanner.nextLine();
                System.out.println("Enter Student department: ");
                String department = scanner.nextLine();
                System.out.println("Enter Student's Section: ");
                int section = scanner.nextInt();
                scanner.nextLine();
                Student newStudent = new Student(id, name, department, section);
                studentList.add(newStudent);
                count++;
            }
        }
        System.out.println("Admin Panel: Assigning students' to teachers' ");
        Student_Assign(teacherList, studentList);
        System.out.println("Now Teacher will provide Attendance to his/her students' ");

        Teacher.attendance1(rajshahi.getStudents());

        System.out.println("Student Attendance Summary: ");
        Student.attendance_summary();
    }
    private static void Student_Assign(ArrayList<Teacher> teacherList, ArrayList<Student> studentList) {
        for (Student student : studentList) {
            for (Teacher teacher : teacherList) {
                if (teacher.getdepartment().equals(student.getdepartment()) && teacher.getSectionsAssigned().contains(student.getsection())) {
                    teacher.addStudent(student);
                }
            }
            }
    }
    private static List<Integer> parseSections(String input) {
        List<Integer> sections = new ArrayList<>();
        String[] sectionStrings = input.split(" ");
        for (String sectionString : sectionStrings) {
            sections.add(Integer.parseInt(sectionString));
        }
        return sections;
    }
}







