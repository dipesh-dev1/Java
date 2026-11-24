public class Lab3 {
    public static void accessArrayElement(int[] arr, int index) {
        System.out.println("Accessing index " + index + ": " + arr[index]);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        accessArrayElement(numbers, 10);
    }
}
