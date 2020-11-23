
public class Hibrid extends Bicycle{
    //attributes
    String suspension = "suspension";

    //basic constructor
    Hibrid(){

    }

    //patametric constructors
    Hibrid(String color, int year, int numberGears){
        super(color, year, numberGears);
    }
    Hibrid(boolean is_serviced, String inDate, String outDate, String serviceResponsible){
        super(is_serviced, inDate, outDate, serviceResponsible);
    }
    Hibrid(String suspension, String forks){
        this.suspension = suspension;
    }

    //accessors and mutators
    String getSuspension(){
        return this.suspension;
    }
    void setSuspension(String suspension){
        this.suspension = suspension;
    }

}
