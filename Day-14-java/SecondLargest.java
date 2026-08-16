public class SecondLargest {

    public static int findSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 20, 15};

        // Check if array has at least two elements
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements");
            return;
        }

        int result = findSecondLargest(arr);

        System.out.println("Second Largest Element: " + result);
    }
}