package main.java;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    public static void main(String[] args) {
        Cohort x = new Cohort();
        x.testCanAdd();
        x.testCanGetStudents();
        x.testAvg();
    }
}
