import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public void addGrade(int n){
        this.grades.add(n);
    }
    public double getGradeAverage(){
        double tot = 0;
        for (int i : this.grades) {
            tot += i;
        }
        return tot / this.grades.size();
    }
    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }
}