public class Chameleon extends Animal{

    //basic constructor
    Chameleon(){

    }

    //parametric constructor
    Chameleon(String name, double weight, String favouriteFood, int age){
        super(name, weight, favouriteFood, age);
    }

    //define method
    void makeSound(){
        System.out.println("Chameleon.. Hiss!! Hiss!!");
    }
}