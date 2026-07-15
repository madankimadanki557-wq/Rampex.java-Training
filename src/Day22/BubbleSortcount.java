package Day22;
import java.util.Arrays;
class BubbleSortcount {
    public static void main(String[] args){
        int [] arr= {5,3,1,4,2};
        bubbleSort(arr);
    }
    public static int [] bubbleSort(int [] arr){
        int n= arr.length;
        int temp=0;
        int count =0;
        int swap = 0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                count++;
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);

        System.out.println(swap);
        return arr;
    }
}

