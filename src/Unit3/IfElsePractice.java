package Unit3;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        if (n2 > n1) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }
        System.out.println("What is " + n1 + " - " + n2 + "?");
        int x = sc.nextInt();
        if (x == n1 - n2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Enter day: ");
        int day = sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println(dayOfWeek(month, day, year));
    }

    public static String dayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x0 = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int D = (d + x0 + 31 * m0 / 12) % 7;
        if (D == 1) {
            return "Monday";
        }
        else if (D == 2) {
            return "Tuesday";
        } 
        else if (D == 3) {
            return "Wednesday";
        } 
        else if (D == 4) {
            return "Thursday";
        } 
        else if (D == 5) {
            return "Friday";
        } 
        else if (D == 6) {
            return "Saturday";
        } 
        else if (D == 0) {
            return "Sunday";
        }
        return "stop";
    }
}
