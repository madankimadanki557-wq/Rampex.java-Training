package Day18.Day21;

public class print1_n {
    public static void main(String[] arg){
        int num=5;
        print(num);
    }
    public static void print(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        num--;
        print(num);
    }
}

