package Unit3;

public class TriangleClassifier {
    public static void main(String[] args) {
        System.out.println(classifyTriangle(3, 4, 5)); //Scalene
        System.out.println(classifyTriangle(2, 2, 2)); //Equilateral
        System.out.println(classifyTriangle(2, 2, 1)); //Isosceles
        System.out.println(classifyTriangle(1, 9, 2)); //Not

    }
    public static String classifyTriangle(int a, int b, int c){
        if(a + b > c && b + c > a && c + a > b){
            if(a == b && b == c){
               return "Equilateral Triangle";
            }
            else if (a == b || b == c || c == a){
                return "Isosceles Triangle";
            }
            else return "Scalene Triangle";
        }

        return "Not a triangle";
    }
}
