package Unit2;

import java.util.Scanner;

public class StringLesson {
     public static void main(String[] args) {
        /*String text = "Hello";
        String text1 = new String("Hello"); //constructor: a method used to instantiate an object
        String text2 = "1" + 2; //automatically casts int to String if
        //there's at least one String in the expression
        System.out.println(1 + 2 + "25"); //equals 425

        System.out.println("25" + 3 + 1); //equals 2531
        //this is like "25" + "3" + "1" bc from left to right
        System.out.println("25" + (3 + 1)); //254 bc parenthesis first

        // == compares memory addresses, not the actual content

        //String a = "apple"
        //a.equals("apple");
        // true
        // 5==5 true, for primitives you can use it
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4); //true because behaves like primitive

        boolean x = s3.equals(s4); //true
        //method equals allows us to compare the actual content of string
        System.out.println(x);

        //Strings are not changeable
        String tt = "abcd";
        tt = "cdef";
        //heap memory, garbage
        System.out.println("dwadwa\ndwasdwasdwa"); //Change line
        String tt2 = "Hello \"Java\""; //Hello "Java" \" prints quotation marks
        String path = "C: \\documents"; //print a single backslash */
         printName();
    }

    static void printName(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); //input the full name
        //figure out where is the space
        int firstSpace = input.indexOf(" ");
        String firstName = input.substring(0,firstSpace);
        System.out.println("First name: " + firstName);

        //extracting second name
        input = input.substring(firstSpace + 1);
        int secondSpace = input.indexOf(" ");
        String secondName = input.substring(0,secondSpace);
        System.out.println("Second name: " + secondName);

        //extracting last name
        String lastName = input.substring(secondSpace + 1);
        System.out.println("Last name: " + lastName);
    }
}
