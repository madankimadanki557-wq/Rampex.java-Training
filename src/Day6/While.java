package Day6;
import java.util.Scanner;
public class While {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int Originalpass = 1234;
            int i = 0;
            int pass = scanner.nextInt();
            if (pass == Originalpass) {
                System.out.println("Welcome!");
            } else {
                while (pass != Originalpass) {
                    System.out.println("please enter again!!");
                    ++i;
                }

                scanner.close();
            }

        }
    }

