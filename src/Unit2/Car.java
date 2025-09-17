package Unit2;

public class Car {
    //attributes
    String model;
    int year;
    static int counter; //this attribute belongs to the class Car
    //not to a single car object

    //Constructor, same name with Class
    //a special method that creates an object
    //usually by assigning values to attributes
    public Car(String m, int y) {
        model = m;
        year = y;
        counter++; //adding each new instance of a Car class
    }

    public static void howManyCars(){
        System.out.println("We have " + counter + " cars");
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla",2021);
        Car car2 = new Car("BMW", 2022);
        Car car3 = new Car("Mercedes", 2023);
        Car.howManyCars(); //calling a static method from the class Car

        //According to the best principles of OOP, we should not access attributes
        //and modify them directly as we did it in a Student class
        //student.name = "John" is not good
        //pass the name as a parameter like Student student = new Student("John");
        //use a method setName()

        //encapsulation - one of the most important OOP concepts
        //classes must protect data from direct access
        //achieved by using access modifiers

    }
}
