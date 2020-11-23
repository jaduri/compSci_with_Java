
public abstract class Player{

	//define attributes
    private String name = "Player";
    private String move = "move";

    //basic constructor
    Player(){

    }

    //parametric constructor
    Player(String name){
        this.name = name;
    }

    //accessors and mutators
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name = name;
    }
    String getMove(){
        return this.move;
    }
    void setMove(String move){
        this.move = move;
    }

    //methods
    abstract public String performMove();

}
