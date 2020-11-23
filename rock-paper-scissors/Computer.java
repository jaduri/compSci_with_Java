
public class Computer extends Player{
    //basic constructor
    Computer(){

    }

    //parametric constructor
    Computer(String name){
        super(name);
    }

    //methods
    @Override
    public String performMove(){
        String[] validOptions = {"r", "p", "s"};// array of possible moves
        int index = (int) Math.round(Math.random()*2);//generate random index and use to select move
        return validOptions[index];
    }

}
