import eu.ase.ro.Student;

public class Main {
    public static void main(String[] args)
    {
        //c-style array declaration
        //int a[];

        int[] a = new int[7];
//
//        for (int i = 0; i < a.length; i++)
//        {
//            System.out.println(a[i]);
//        }

//        for (int e: a)
//        {
//            System.out.println(e);
//        }

        int[][] m = {{1, 2, 3}, {4, 5, 6}};

//        for(int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                System.out.print(m[i][j]);
//            }
//            System.out.println();
//        }

        //System.out.println((m.length));

        for (int[] line: m) {
            for (int e: line) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

        Student[] students = new Student[3];

        float[] grades = {9.6f, 7.5f, 10};
        students[0] = new Student(1, "Mark", new float[] {9.6f, 10, 10});
        students[1] = new Student(2, "Luke", grades);

        float[] copyGrades = students[0].getGrades();
        copyGrades[1] = 10;

//        float[] newGrades = {10, 10, 10};
//        students[1].setGrades(newGrades);

        students[2] = students[0].myClone();
        students[2].setId(3);
        students[2].setName("Viktor");

        float[] ViktorsGrades = students[2].getGrades();
        ViktorsGrades[1] = 8;

//        copyGrades[1] = 6;

        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);

        float[] avgList = new float[students.length];

        int count = 0;
        for (float avgGrade: avgList) {
            avgGrade = students[count].getAvgGrade();
            avgList[count] = avgGrade;
            count += 1;
        }

        for (float avgGrade: avgList) {
            System.out.println(avgGrade);
        }

    }
}

