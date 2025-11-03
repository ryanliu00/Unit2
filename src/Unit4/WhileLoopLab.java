package Unit4;

import java.util.Scanner;

public class WhileLoopLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter a number between 1 and 1000: ");
        number = sc.nextInt();
        while (number < 1 || number > 1000) {
            System.out.println("Invalid!");
            number = sc.nextInt();
        }
        System.out.println("Valid number: " + number);

        System.out.println("Enter a word (a-c): ");
        String word = sc.next();
        while (!checkInput(word)) {
            System.out.println("Invalid word");
            word = sc.next();
        }
        System.out.println("Valid word");
//        int count = 1;
//        while (count <=5 ){
//            System.out.println(count);
//            count++;
        }
        public static boolean checkInput(String word) {
        return word.compareTo("a") >= 0 && word.compareTo("cz") <= 0;

        }
    }

