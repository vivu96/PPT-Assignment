public class Question3 {
    public static void main(String[] args) {
        int []arr={1,2,3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arr.length)
            {
                arr[i]=arr[i]+1;
            }
            System.out.print(arr[i]+ " ");
        }
    }
}
