import java.util.Scanner;
import java.util.regex.Pattern;

public class SwitchMain {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int salary = 0;
        String status = "";

        System.out.println("Enter your salary: ");
        if (!s.hasNextInt()) {
            System.out.println("Invalid input for salary, reenter:");
            s.next(); // Reads and discards invalid input
        }
        salary = s.nextInt();

        Pattern pattern = Pattern.compile("[a-b]");
        System.out.println("Enter your status: ");
        if (!s.hasNext(pattern)) {
            System.out.println("Invalid input for status, reenter:");
            s.next(); // Reads and discards invalid input
        }
        status = s.next();

        double tax = 0;
        switch (status.toLowerCase()) {
            case "a":
                if (salary > 0 && salary <= 32000) {
                    tax = salary * 0.1;
                } else {
                    tax = salary * 0.25;
                }
                break;
            case "b":
                if (salary > 0 && salary <= 64000) {
                    tax = salary * 0.1;
                } else {
                    tax = salary * 0.25;
                }
                break;
                default:
                    System.out.println("Invalid status");
                    return;
                }
            System.out.println("Tax: " + tax);
    }
}
