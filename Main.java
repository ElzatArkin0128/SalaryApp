import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int salary = 0;
        String status = "";

        System.out.println("Enter your salary: ");
        if (!s.hasNextInt()) {
            System.out.println("Invalid Input for salary, reenter:");
            s.next();
        }
        salary = s.nextInt();

        Pattern pattern = Pattern.compile("[A-Ba-b]*");
        System.out.println("Enter your status: ");
        if (!s.hasNext(pattern)) {
            System.out.println("Invalid Input for status, reenter:");
            s.next();
        }
        status = s.next();


        double tax = 0;
        if (status.equals("A") || status.equals("a")) {
            if (salary > 0 && salary <= 32000) {
                tax = salary * 0.1;
                System.out.println("Tax: " + tax);
                salary = salary - (int) tax;
                System.out.println("Salary utbetalt: " + salary);
            } else {
                tax = salary * 0.25;
                System.out.println("Tax: " + tax);
                salary = salary - (int) tax;
                System.out.println("Salary utbetalt: " + salary);
            }
        }

            if (status.equals("B") || status.equals("b")) {
                if (salary > 0 && salary <= 64000) {
                    tax = salary * 0.1;
                    System.out.println("Tax: " + tax);
                    salary = salary - (int) tax;
                    System.out.println("Salary utbetalt: " + salary);
                } else {
                    tax = salary * 0.25;
                    System.out.println("Tax: " + tax);
                    salary = salary - (int) tax;
                    System.out.println("Salary utbetalt: " + salary);
                }
            }
        }



    }

