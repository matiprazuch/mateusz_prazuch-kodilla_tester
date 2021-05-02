public class GradesTest {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(6);
        grades.add(2);
        grades.add(5);
        System.out.println(grades.returnLastGrade());
        System.out.println(grades.returnAverage());
    }
}
