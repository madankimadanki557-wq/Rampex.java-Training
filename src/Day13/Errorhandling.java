package Day13;
import java.util.Scanner;
public class Errorhandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        try{
            if (a>10){
                throw new ArithmeticException();
            }
        }
        catch(Exception e){
        }
        System.out.println(a);
    System.out.println("program ended successfully");
    }
}
