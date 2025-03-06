import eu.ase.ro.Student;

public class Main {
    public static void main(String[] args) {
        //C-declaration
        //int a[];

        // int[] a = {1, 2, 3, 4, 5};

        int[] a = new int[7];
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }


        for (int element : a) {
            System.out.println(element);
        }
        System.out.println();
        int[][] m = {{1, 2, 3}, {4, 5, 6}};


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j]);
            }
            System.out.println();
        }

        for (int[] line : m) {
            for (int e : line) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        Student[] students = new Student[3];
        float[] grades = {9.6f, 7.5f, 10};
        students[0] = new Student(1, "Mark", new float[]{9.6f,7.5f,10});
        students[1] = new Student(2, "Luke", grades);
        students[2] = new Student(3, "Ionut", grades);

        float[] copyGrades = students[0].getGrades();
        copyGrades[2] = 10;

        students[2] = students[0].myClone();
        students[2].setId(3);
        students[2].setName("Viktor");


        float[]VictorGrades =students[3].getGrades();
        VictorGrades[1]= 8;
        copyGrades[1]= 6;

        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);


float[] avgList =new float[students.length];
        int count = 0;

    }
}
