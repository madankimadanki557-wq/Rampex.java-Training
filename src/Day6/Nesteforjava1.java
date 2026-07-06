package Day6;

public class Nesteforjava1 {
    public static void main(String[] args) {
        int count = 0;

        for (int month = 1; month <= 12; ++month) {
            count += month;

            for (int week = 1; week <= 4; ++week) {
                for (int day = 1; day <= 6; ++day) {
                    ++count;
                    System.out.println(" month " + month + " week " + week + " day " + day + count);
                    System.out.println("Come to clg,study,go home");
                }
            }
        }
    }
}

