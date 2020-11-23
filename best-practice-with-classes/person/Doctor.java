
public class Doctor extends Person{
    //declare attributes
    String specialty = "specialty";

    //basic constructor
    Doctor(){

    }

    //parametric constructor
    Doctor(String givenName, String lastName, int age, String gender, String citizenship, String specialty){
        super(givenName, lastName, age, gender, citizenship);
        this.specialty = specialty;
    }

    //attribute accessors and mutators
    String getSpecialty(){
        return this.specialty;
    }
    void setSpecialty(String specialty){
        this.specialty = specialty;
    }

}
