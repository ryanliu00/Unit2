package Unit2;

public class Methods {
    //method overloading
    //allows us to reuse the same method name for different methods
    // essentially doing the same thing
    // it is a feature of programming languages
    public static void main(String[] args) {
       int por = add(6, 7);

       int a = Math.abs(-2);
       double b = Math.abs(-9.0);
       //These are different abs() functions
        double c = Math.pow(5, 9);
        double d = Math.sqrt(4);
        System.out.println(Math.random());
        //Generates random numbers between 0 and 1
        System.out.println(8 * Math.random() + 7);
        //(high - low) * random() + low
        System.out.println(random(90, 80));

    }
    public static int add(int x, int y){
        return x + y;
    }
    public static int add(int x, int y, int z){
        return x + y + z;
    }
    public static double add(double x, double y){
        return x + y;
    }
    public static double random(int high, int low){
        return (high - low) * Math.random() + low;

    }
}
