
public class ElectricBike extends Bicycle{
    //attributes
    int battery = 0;

    //basic constructor
    ElectricBike(){

    }

    //patametric constructors
    ElectricBike(String color, int year, int numberGears){
        super(color, year, numberGears);
    }
    ElectricBike(boolean is_serviced, String inDate, String outDate, String serviceResponsible){
        super(is_serviced, inDate, outDate, serviceResponsible);
    }
    ElectricBike(int battery){
        this.battery = battery;
    }

    //accessors and mutators
    int getBattery(){
        return this.battery;
    }
    void setBattery(int battery){
        //ensure that battery value is between 0 to 100 inclusive
        if(battery > 100){
            this.battery = 100;
        }else if(battery < 0){
            this.battery = 0;
        }else{
            this.battery = battery;
        }
    }

    //methods
    void chargeBike(){
        this.battery = 100;
        System.out.println("Your battery is now "+this.battery+"%");
    }
}
