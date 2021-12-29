import java.util.Arrays;
public class interview1 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 3, 11, 7};
        MyApproach(arr);
        for(int i :arr){
            System.out.println(i);
        }
    }

    public static int[] MyApproach(int arr[]) {
        Arrays.sort(arr);
        //tc 1&2
        if (arr.length == 1 || arr.length == 2)
            return arr;

        //tc3
        int result[] = new int[arr.length];
        int l = 0, k = arr.length - 1;
        for (int i = result.length - 2, j = 1; i >= 0 && j < result.length; i -= 2, j += 2) {
            result[i] = arr[l];
            l += 1;
            result[j] = arr[k];
            k--;
        }
        return result;
    }


}
