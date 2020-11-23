
public abstract class VehicleAbstract{

    //declare attributes
    private String color = "color";
    private int year = 0;
    private int numberGears = 0;

    //basic constructor
    VehicleAbstract(){

    }

    //parametric constructor
    VehicleAbstract(String color, int year, int numberGears){
        this.color = color;
        this.year = year;
        this.numberGears = numberGears;
    }

    //accessors and mutators
    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color = color;
    }
    int getYear(){
        return this.year;
    }
    void setYear(int year){
        this.year = year;
    }
    int getNumberGears(){
        return this.numberGears;
    }
    void setNumberGears(int num){
        this.numberGears = num;
    }

}
