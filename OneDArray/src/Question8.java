public class Question8 {
    public static void main(String[] args) {
        int res[] = {0,0};
        int [] arr={1,2,2,4};

        int count [] = new int[arr.length +1];

        for (int i : arr) count[i] += 1;

        for(int i=1; i<=arr.length; i++){
            if(count[i] == 2) res[0] = i;
            else if(count[i] == 0) res[1] = i;
        }
    }
}
