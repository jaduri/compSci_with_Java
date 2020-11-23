
import java.util.Scanner;

public class Human extends Player{

    //instantiate scanner object
    Scanner input = new Scanner(System.in);

    //basic constructor
    Human(){

    }
    Human(String name){
        super(name);
    }

    //methods
    @Override
    public String performMove(){
        return input.nextLine();
    }
}
