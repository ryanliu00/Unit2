package Unit3;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //clientValidation(22, true);
        //getGrade(99);
        //passwordValidation(sc);
        int h = (int)(Math.random()*11) + 10;
        int l = (int)(Math.random()*6) + 3;
        String input = sc.nextLine();
        boolean result = isVowel(input);
        
    }

   public static int rollDie(int low, int high){
        return (int)((high - low + 1) * Math.random()) + low;
   }
    public static void getGrade(int percentage){
        if(percentage >= 90){
            System.out.println("You got an A for \"Average\"");
        }
        else if (percentage >= 80){
            System.out.println("You got a B for \"Below average\"");
        }
        else {
            System.out.println("You failed!");
        }
    }

    public static void clientValidation(int age, boolean isRegistered){
        if(age < 18){
            System.out.println("Your age is below 18");
        }
        if(!isRegistered){
            System.out.println("Please register first");
        }
    }
    public static void passwordValidation(Scanner sc){
        System.out.println("Enter Password: ");
        String text1 = sc.nextLine();

        System.out.println("Enter password again: ");
        String text2 = sc.nextLine(); //second reference

        //we cannot do reference == another reference
        boolean equal = text1.equals(text2);

        //System.out.println(equal); To check
        if(equal){
            System.out.println("Password is valid");
        } else {
            System.out.println("Check your password again");
        }
    }
    public static boolean isVowel(String a){

        if(a.equals("a") || a.equals("e") || a.equals("i")){
            return true;
        }
        return false;
    }
}
