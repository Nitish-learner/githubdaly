public class Day22 {
    public static void main(String[] args) {
        int[] marks = {70, 85, 60, 90, 75};

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        System.out.println("Total Marks: " + total);
    }
}