import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tax Calculator App");
        System.out.println("-----WELCOME-----");
        System.out.println("Enter total person count: ");
        int count = sc.nextInt();
        String names[] = new String[count];
        long income[] = new long[count];

        for (int i = 0; i <count; i++) {
            System.out.println("Enter name " + (i+1) + ": ");
            names[i] = sc.next();
            System.out.println("Enter "+names[i]+"'s Annual Income:");
            income[i] = sc.nextLong();
            sc.nextLine();
        }

        System.out.println("Names with liable taxes");
        System.out.println("------------------------");

        for (int i = 0; i <count; i++) {
                 calculateTax(names[i], income[i]);
            }
            sc.close();
        }


    public static void calculateTax(String names, long income) {
        long tax = 0;

        if (income >= 300000) {
            tax = (long)(income * 0.2f);

        } else if (income >= 100000 && income < 300000) {
            tax = (long) (income *0.1f);

        } else if (income < 100000) {
            tax = 0;

        } else {
            System.out.println("Exempted from paying tax");
        }
        System.out.println(names+": Rs "+tax);
    }
}

