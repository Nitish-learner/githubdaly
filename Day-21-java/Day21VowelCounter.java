public class Day21VowelCounter {
    public static void main(String[] args) {

        String text = "Java Developer";
        int count = 0;

        for (char c : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}