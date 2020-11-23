
public class Bicycle extends VehicleAbstract implements Vehicle{

    //declare attributes
    boolean is_serviced = false;
    String inDate = "in Date";
    String outDate = "out Date";
    String serviceResponsible = "service";

    //basic constructor
    Bicycle(){

    }

    //parametric constructors
    Bicycle(String color, int year, int numberGears){
        super(color, year, numberGears);
    }
    Bicycle(boolean is_serviced, String inDate, String outDate, String serviceResponsible){
        this.is_serviced = is_serviced;
        this.inDate = inDate;
        this.outDate = outDate;
        this.serviceResponsible = serviceResponsible;
    }

    //accessors and mutators
    boolean getIsServiced(){
        return this.is_serviced;
    }
    void setIsServiced(boolean serviced){
        this.is_serviced = serviced;
    }
    String getInDate(){
        return this.inDate = inDate;
    }
    void setInDate(String inDate){
        this.inDate = inDate;
    }
    String getOurDate(){
        return this.outDate;
    }
    void setOutDate(String outDate){
        this.outDate = outDate;
    }
    String getServiceResponsible(){
        return this.serviceResponsible;
    }
    void setServiceResponsible(String service){
        this.serviceResponsible = service;
    }

    //define class methods
    void checkoutService(){
        this.is_serviced = true;
    }

    //implement abstract methods
    public void changeGear(double a){
        if(a <= this.getNumberGears() && a > 0){
            System.out.println(a+" gears out of "+this.getNumberGears()+" have been changed");
        }else if(a > this.getNumberGears()){
            System.out.println("All"+this.getNumberGears()+" have been changed");
        }
    }

    public void checkBrake(double a){
        if(a < 4.0){
            System.out.println("Brakes are below minimum of 4.0 and will be replaced");
        }else if(a > 12.0){
            System.out.println("Brakes are above maximum of 12.0 and will not fit in vehicle");
        }else{
            System.out.println("Brakes are in perfect condition!");
        }
    }
}
