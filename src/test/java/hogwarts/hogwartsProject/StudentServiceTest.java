//package hogwarts.hogwartsProject;
//
//import hogwarts.hogwartsProject.models.Student;
//import hogwarts.hogwartsProject.services.StudentService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class StudentServiceTest {
//
//    private StudentService studentService;
//
//    @BeforeEach
//    void setUp() {
//        studentService = new StudentService();
//    }
//
//    @Test
//    void createStudent() {
//        Student student = new Student(null, "Harry Potter", 11);
//        Student createdStudent = studentService.createStudent(student);
//
//        assertNotNull(createdStudent.getId());
//        assertEquals("Harry Potter", createdStudent.getName());
//        assertEquals(11, createdStudent.getAge());
//    }
//
//    @Test
//    void getStudentById() {
//        Student student = new Student(null, "Hermione Granger", 12);
//        Student createdStudent = studentService.createStudent(student);
//
//        Student fetchedStudent = studentService.getStudentById(createdStudent.getId());
//
//        assertNotNull(fetchedStudent);
//        assertEquals(createdStudent.getId(), fetchedStudent.getId());
//        assertEquals("Hermione Granger", fetchedStudent.getName());
//    }
//
//    @Test
//    void updateStudent() {
//        Student student = new Student(null, "Ron Weasley", 11);
//        Student createdStudent = studentService.createStudent(student);
//
//        createdStudent.setName("Ronald Weasley");
//        createdStudent.setAge(12);
//
//        Student updatedStudent = studentService.updateStudent(createdStudent);
//
//        assertEquals("Ronald Weasley", updatedStudent.getName());
//        assertEquals(12, updatedStudent.getAge());
//    }
//
//    @Test
//    void deleteStudent() {
//        Student student = new Student(null, "Draco Malfoy", 12);
//        Student createdStudent = studentService.createStudent(student);
//
//        Student deletedStudent = studentService.deleteStudent(createdStudent.getId());
//
//        assertNotNull(deletedStudent);
//        assertEquals("Draco Malfoy", deletedStudent.getName());
//        assertNull(studentService.getStudentById(createdStudent.getId()));
//    }
//
//    @Test
//    void getStudentsByAge() {
//        Student student1 = new Student(null, "Ginny Weasley", 11);
//        Student student2 = new Student(null, "Luna Lovegood", 11);
//        Student student3 = new Student(null, "Neville Longbottom", 12);
//
//        studentService.createStudent(student1);
//        studentService.createStudent(student2);
//        studentService.createStudent(student3);
//
//        List<Student> studentsByAge = studentService.getStudentsByAge(11);
//
//        assertEquals(2, studentsByAge.size());
//        assertTrue(studentsByAge.stream().anyMatch(s -> s.getName().equals("Ginny Weasley")));
//        assertTrue(studentsByAge.stream().anyMatch(s -> s.getName().equals("Luna Lovegood")));
//    }
//}
