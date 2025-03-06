package eu.ase.ro;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private float[] grades;
    private float avgGrade;

    public Student(int id, String name, float[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    //getteri
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float[] getGrades() {
        return grades;
    }

    public float getAvgGarade() {
        avgGrade = 0;
        for (float grade : this.grades) {
            avgGrade += grade;
        }
        avgGrade /= grades.length;
        return avgGrade;
    }

    public float getAvgGrade() {
        float sum = 0;
        for (float grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? sum / grades.length : 0;
    }

//setteri

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public Student myClone() {
        float[] copyGrades = new float[this.grades.length];
        System.arraycopy(this.grades, 0, copyGrades, 0, this.grades.length);
        return new Student(this.id, this.name, copyGrades);
    }
}
