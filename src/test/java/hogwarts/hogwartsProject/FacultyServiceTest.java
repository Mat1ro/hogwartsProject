//package hogwarts.hogwartsProject;
//
//import org.junit.jupiter.api.BeforeEach;
//import hogwarts.hogwartsProject.services.FacultyService;
//import hogwarts.hogwartsProject.models.Faculty;
//import org.junit.jupiter.api.Test;
//
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class FacultyServiceTest {
//
//    private FacultyService facultyService;
//
//    @BeforeEach
//    void setUp() {
//        facultyService = new FacultyService();
//    }
//
//    @Test
//    void testCreateFaculty() {
//        Faculty faculty = new Faculty(null, "Engineering", "Blue");
//        Faculty created = facultyService.createFaculty(faculty);
//
//        assertNotNull(created);
//        assertEquals(1L, created.getId());
//        assertEquals("Engineering", created.getName());
//        assertEquals("Blue", created.getColor());
//    }
//
//    @Test
//    void testGetFacultyById() {
//        Faculty faculty = new Faculty(null, "Science", "Green");
//        Faculty created = facultyService.createFaculty(faculty);
//
//        Faculty retrieved = facultyService.getFacultyById(created.getId());
//
//        assertNotNull(retrieved);
//        assertEquals(created.getId(), retrieved.getId());
//        assertEquals("Science", retrieved.getName());
//        assertEquals("Green", retrieved.getColor());
//    }
//
//    @Test
//    void testUpdateFaculty() {
//        Faculty faculty = new Faculty(null, "Math", "Red");
//        Faculty created = facultyService.createFaculty(faculty);
//
//        Faculty updated = new Faculty(created.getId(), "Mathematics", "Red");
//        Faculty result = facultyService.updateFaculty(updated);
//
//        assertNotNull(result);
//        assertEquals("Mathematics", result.getName());
//        assertEquals("Red", result.getColor());
//
//        Faculty retrieved = facultyService.getFacultyById(created.getId());
//        assertEquals("Mathematics", retrieved.getName());
//    }
//
//    @Test
//    void testDeleteFaculty() {
//        Faculty faculty = new Faculty(null, "History", "Yellow");
//        Faculty created = facultyService.createFaculty(faculty);
//
//        Faculty deleted = facultyService.deleteFaculty(created.getId());
//
//        assertNotNull(deleted);
//        assertEquals(created.getId(), deleted.getId());
//        assertNull(facultyService.getFacultyById(created.getId()));
//    }
//
//    @Test
//    void testGetFacultyByColor() {
//        facultyService.createFaculty(new Faculty(null, "Physics", "Blue"));
//        facultyService.createFaculty(new Faculty(null, "Chemistry", "Green"));
//        facultyService.createFaculty(new Faculty(null, "Biology", "Blue"));
//
//        List<Faculty> blueFaculties = facultyService.getFacultyByColor("Blue");
//
//        assertNotNull(blueFaculties);
//        assertEquals(2, blueFaculties.size());
//        assertTrue(blueFaculties.stream().allMatch(f -> "Blue".equals(f.getColor())));
//    }
//}
