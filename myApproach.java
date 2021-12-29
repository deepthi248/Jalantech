import java.util.Arrays;
public class interview1 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 3, 11, 7};
        int [] result = MyApproach(arr);
        for(int i :result){
            System.out.print(i+" ");
        }
    }

    public static int[] MyApproach(int arr[]) {
        Arrays.sort(arr);

        if (arr.length == 1 || arr.length == 2)
            return arr;

        int length = arr.length - 1;
        for (int i =1;i<length;i++) {
                if(i%2 != 0){
                    if(arr[i] <arr[i+1])
                        swap(arr,i,i+1);
                }
            }
        return arr;
    }
    
    public static void swap(int [] arr, int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
