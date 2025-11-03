package Unit3;

import java.util.Scanner;

public class Unit3Practice {
    public static void main(String[] args) {
        //System.out.println(isValidUsername("STU_0169"));
        //System.out.println(canDeliver(20.1, 9000, 44, 8));
        solveQuadratic();
    }
    public static boolean isValidUsername(String username) {
        if (username.length() != 8) {
            return false;
        }
        if(username.substring(0,4).equals("STU_")){
            return true;
        } else {
            return false;
        }
    }

    public static boolean canDeliver (double x1, double x2, double y1, double y2){
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2));
        if(distance <= 100){
            return true;
        } else {
            return false;
        }
    }

    public static void solveQuadratic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients a, b, c:  "); //entered in a line
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        //solve the equation and produce output
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double output1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double output2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        if(discriminant < 0){
            System.out.println("There are no real roots");
        } else if (discriminant == 0){
            System.out.println("The root is " + output1);
        } else {
            System.out.println("The roots are " + output1 + " and " + output2);
        }
    }
}
