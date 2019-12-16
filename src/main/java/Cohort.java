package main.java;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class Cohort {
    private List<Student> students;
    public Cohort() {
        this.students = new ArrayList<>();
    }

    public double getCohortAverage() {
        double avg = 0;
        for (Student student: this.getStudents()) {
            avg += student.getGradeAverage();
        }
        return avg / this.getStudents().size();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void testCanAdd(){
        List<Student> temp1 = this.students;
        temp1.add(new Student(933, "Namey name of name"));
        addStudent(new Student(933, "Namey name of name"));

        assertEquals(temp1, this.getStudents());
    }

    public void testCanGetStudents(){
        assertEquals(this.students, this.getStudents());
    }

    public void testAvg(){
        double tot = 0;
        for (Student i: this.students){
            tot += i.getGradeAverage();
        }
        assertEquals(tot, this.getCohortAverage(), 0);
    }
}