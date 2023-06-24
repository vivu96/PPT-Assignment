public class Question4 {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int find = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==find)
            {
                System.out.println(i);
            }
        }
    }
}
