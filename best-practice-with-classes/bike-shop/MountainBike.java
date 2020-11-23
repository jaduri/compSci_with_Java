
public class MountainBike extends Bicycle{
    //attributes
    String suspension = "suspension";
    String forks = "forks";

    //basic constructor
    MountainBike(){

    }

    //patametric constructors
    MountainBike(String color, int year, int numberGears){
        super(color, year, numberGears);
    }
    MountainBike(boolean is_serviced, String inDate, String outDate, String serviceResponsible){
        super(is_serviced, inDate, outDate, serviceResponsible);
    }
    MountainBike(String suspension, String forks){
        this.suspension = suspension;
        this.forks = forks;
    }

    //accessors and mutators
    String getSuspension(){
        return this.suspension;
    }
    void setSuspension(String suspension){
        this.suspension = suspension;
    }
    String getForks(){
        return this.forks;
    }
    void setForks(String forks){
        this.forks = forks;
    }
}
