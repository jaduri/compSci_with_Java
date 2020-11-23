
public class RoadBike extends Bicycle{
    //attributes
    String tyres = "tyres";

    //basic constructor
    RoadBike(){

    }

    //patametric constructors
    RoadBike(String color, int year, int numberGears){
        super(color, year, numberGears);
    }
    RoadBike(boolean is_serviced, String inDate, String outDate, String serviceResponsible){
        super(is_serviced, inDate, outDate, serviceResponsible);
    }
    RoadBike(String tyres){
        this.tyres = tyres;
    }

    //accessors and mutators
    String getTyres(){
        return this.tyres;
    }
    void setTyres(String tyres){
        this.tyres = tyres;
    }
}
