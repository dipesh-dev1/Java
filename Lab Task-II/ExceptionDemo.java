public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        try {
            String num = "abc";
            int value = Integer.parseInt(num);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        }
    }
}
