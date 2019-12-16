package main.java;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {

    public Cohort exCohort(){
        Cohort temp = new Cohort();
        temp.addStudent(new Student(1, "first mid. last"));
        temp.addStudent(new Student(2, "first mid. last"));
        temp.addStudent(new Student(3, "first mid. last"));
        temp.addStudent(new Student(4, "first mid. last"));
        for (int num = 0; num < 5; num++) {
            for (Student i : temp.getStudents()){
                i.addGrade((int)Math.floor(Math.random() * 100));
            }
        }
        return temp;
    }

    @Test
    public void testCanAdd(){
        Cohort temp = exCohort();
        List<Student> temp1 = temp.getStudents();
        temp1.add(new Student(933, "Namey name of name"));
        temp.addStudent(new Student(933, "Namey name of name"));
        temp.getStudents().get(temp.getStudents().size() - 1).addGrade(100);
        assertEquals(temp1, temp.getStudents());
    }
    @Test
    public void testCanGetStudents(){
        Cohort temp = exCohort();
        assertEquals(temp.getStudents(), temp.getStudents());
    }
    @Test
    public void testAvg(){
        Cohort temp = exCohort();
        double tot = 0;
        for (Student i: temp.getStudents()){
            tot += i.getGradeAverage();
        }
        assertEquals(tot, temp.getCohortAverage(), 0);
    }

    public static void main(String[] args) {
    }
}
