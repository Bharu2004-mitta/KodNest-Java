
public class Pp1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = k;
            k++;
        }
        System.out.println(arr[0]);
    }
}
