package Lesson2;

public class PetClinic {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Buddy", "Dog", 5, 35.0);
        Pet pet2 = new Pet("Luna", "Cat", 3, 9.5);
        //It didn't print anything
        //Because we didn't tell the computer to output anything
        pet1.displayInfo();
        //The information of the dog was printed
        pet2.displayInfo();
        //both were printed out
        pet1.makeSound();
        //Buddy says woof
        pet2.makeSound();
        //Both pets made the right sound
        pet1.setAge(6);
        System.out.println(pet1.getName() + " is now " + pet1.getAge() + " years old");
        //it worked
        pet1.setWeight(-10);
        //it said weight must be positive
        Pet.getCount();

        /*
        REFLECTION QUESTIONS
        1. So it can only be accessed by certain methods.
        2. getAge
        3. getters let us access the private codes and read only.
           Setter allows us to modify the values.
        4. To set a boundary of what values could be legal.
        5. This means that we are referring to the current object.
        6. It will print a value if it matches the parameter and the code.
           It will print void when values are not printed.
         */

        //BONUS CHALLENGE

    }

}
