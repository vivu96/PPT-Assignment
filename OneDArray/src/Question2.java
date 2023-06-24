import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        int []arr = {3,2,3,2};
        int value = 3;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == value) {
                    arr[i] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
