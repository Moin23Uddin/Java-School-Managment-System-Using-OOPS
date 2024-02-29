import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
public class School implements Serializable {
    private static List<Teacher> teachers;
    private static List<Student> students;
    public School(ArrayList<Teacher> teachers,ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }
    public static List<Teacher> getTeachers() {
        return teachers;
    }
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
    public static List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }

}
