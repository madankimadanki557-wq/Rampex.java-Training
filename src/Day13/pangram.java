package Day13;
public class pangram{
    public static void main(String[] args){
        int[] arr ={2,7,11,15};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((arr[i] + arr[j]) == 9){
                    System.out.print(i);
                }
            }
        }
    }
}