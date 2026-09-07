

package Arrays;

public class LoopInArray {

    public static void main(String[] args) {

        int marks[] = new int[50];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + i + 1;
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}