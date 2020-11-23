public class Lion extends Animal{

    //basic constructor
    Lion(){

    }

    //parametric constructor
    Lion(String name, double weight, String favouriteFood, int age){
        super(name, weight, favouriteFood, age);
    }

    //define method
    void makeSound(){
        System.out.println("Rooaaarrrr!!!!!!");
    }
}