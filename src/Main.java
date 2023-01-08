import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int index_del;
        int valueX;
        System.out.println("Enter the value you want to delete: ");
        valueX = scanner.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (valueX == array[j]) {
                index_del = j;
                for (int k = index_del; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
            }
        }
        System.out.println("The new array is of the form: " + Arrays.toString(array));
    }
}