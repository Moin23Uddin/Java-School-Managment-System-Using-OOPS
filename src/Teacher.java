import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Teacher implements Serializable{
    private int id;
    private String name;
    private String department ;
    private List<Student> students;
    private List<Integer> sectionsAssigned;
    public Teacher(int id, String name, String department,List<Integer> sectionsAssigned) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.students = new ArrayList<>();
        this.sectionsAssigned =  sectionsAssigned;

    }
    public int getId() {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getdepartment() {
        return this.department;
    }
    public List<Integer> getSectionsAssigned() {
        return this.sectionsAssigned;
    }
    public String toString() {
        return "Name of the Teacher: " + this.name +  "\nDepartment: "+ this.department ;
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }
    static void saveStudentList(String fileName, List<Student> studentList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(studentList);
            System.out.println("Student list saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving student list.");
        }
    }
    public static void main(String[] args) {}
    public static void attendance1(List<Student> studentList){

        Scanner scanner = new Scanner(System.in);
      System.out.println("Enter Teacher ID: ");
      int teacherid = scanner.nextInt();
      Teacher teacher = getTeacherById(teacherid);
      System.out.println("Give Attendance for : " + teacher.getName() + "'s" + " students' " );
      if (teacher != null) {
          for (Student student : studentList) {
              for (Student teacherstudent : teacher.getStudents()) {
                  if(teacherstudent.equals(student)){

                      for (int day = 1; day <= 2; day++) {
                          System.out.println("Day " + day + " Attendance:");
                          System.out.println("Student Information:");
                          System.out.println("ID: " + student.getId() + ", Name: " + student.getName() +", Department: " + student.getdepartment() +", Section: " + student.getsection()+", Department: ");
                          System.out.println("Give attendance for the student (Enter 'yes' or 'no'): ");
                          String attendanceStatus = scanner.next().toLowerCase();
                          student.setAttendanceForDay(day, attendanceStatus);
                          System.out.println("Attendance updated for " + student.getName() + " on Day " + day);
                          System.out.println(student.getAttendanceForDay(day));
                      }

                  }
              }
          }

  }
    }
    public static Teacher getTeacherById(int teacherId) {
        List<Teacher> teacherList1 = School.getTeachers();
        for (Teacher teacher : teacherList1) {
            if (teacher.getId() == teacherId) {
                return teacher;
            }
        }
        return null;
    }
}














