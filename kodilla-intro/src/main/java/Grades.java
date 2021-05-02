import java.util.Arrays;

public class Grades {

    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }

        this.grades[this.size] = value;
        this.size++;
    }

    public int returnLastGrade() {
        int result = this.grades[this.size - 1];
        return result;
    }

    public double returnAverage() {
        double sum = 0;
        for (double i = 0; i < size; i++) {
            sum += this.grades[(int) i];
        }
        return sum / this.size;
    }
}
