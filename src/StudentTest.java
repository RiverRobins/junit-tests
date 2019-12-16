import org.junit.Test;
import static org.junit.Assert.*;
public class StudentTest {
//    @Test
//    public static void testGradeAvg(Student n) {
//        assertEquals(95, n.getGradeAverage(), 0);
//    }
//    public static void testName(Student n) {
//        assertEquals("Human, listen carefully...", n.getName());
//    }

    public static void main(String[] args) {
        Student x = new Student(9029L, "Human, listen carefully...");
        x.getName();
        x.addGrade(90);
        x.addGrade(100);
        x.addGrade(95);

//        testGradeAvg(x);
//        testName(x);
    }
}
