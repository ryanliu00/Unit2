package Unit2;

public class Student {
    //attributes are class variables responsible for
    //storing data in objects
    private String name; //private makes it unaccessible from direct modifications
    int age;
    String id;
    //public allows access from other classes
    //private locks access from other classes

    //Constructor

    //Behavior or methods
    //what actions objects can take
    public void printStudentInfo (){
        System.out.println(name + ", " + age + ", " + id);
    }
    public static void printWelcomingMessage(String studentName){
        System.out.println(studentName + ", " + "Welcome to our school!");
    }

    public static void main(String[] args) {
        //create the variable student
        //Type name = new Type()
        Student student1 = new Student(); //this is a real object that lives in RAM
        student1.printStudentInfo();
        student1.name = "John";
        student1.id = "214a";
        student1.age = 15;
        student1.printStudentInfo();

        student1.id = "1234567";
        student1.age = 16;
        student1.printStudentInfo(); //stores the last data and overwrites it

        //we need attributes to store info about our objects

        Student.printWelcomingMessage(student1.name);
        //static functions are only accessible from the Class itself
        //like Math.sqrt(), Math.round()

        //static functions are used either as elements of static
        //libraries of functions (like Math class)
        //in OOP also static functions are used to represent
        //a behavior shared by ALL objects of that type
        Student.printWelcomingMessage("Mary");

    }
}
