public class Turtle extends Animal{

    //basic constructor
    Turtle(){

    }

    //parametric constructor
    Turtle(String name, double weight, String favouriteFood, int age){
        super(name, weight, favouriteFood, age);
    }

    //define method
    void makeSound(){
        System.out.println("Turtle.. hiss! hiss!");
    }
}