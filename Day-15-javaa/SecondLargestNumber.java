public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 8, 40, 15};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } 
            else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Second Largest Number: " + secondLargest);
    }
}