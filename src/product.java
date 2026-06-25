import java.util.Scanner;
public class product {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        long product = 1;

        for (int i = 3; i <= n - 2; i += 2) {
            product *= i;
        }

        System.out.println("Product = " + product);

        sc.close();
    }
}