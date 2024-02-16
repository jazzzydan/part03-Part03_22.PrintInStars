
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {

        for (int iterate = 0; iterate < array.length; iterate++) {
            int number = array[iterate];
            int i = 0;
            while (i < number) {
                System.out.print("*");
                i++;
            }
            System.out.println("");
        }
    }
}
