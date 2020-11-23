
public class Patient extends Person{
    //declare attributes
    String diagnostic = "diagnostic";
    String inTime = "inTime";
    String prevTime = "prevTime";

    //basic constructor
    Patient(){

    }

    //parametric constructor
    Patient(String givenName, String lastName, int age, String gender, String citizenship, String diagnostic, String inTime, String prevTime){
        super(givenName, lastName, age, gender, citizenship);
        this.diagnostic = diagnostic;
        this.inTime = inTime;
        this.prevTime = prevTime;
    }

    //attribute accessors and mutators
    String getDiagnostic(){
        return this.diagnostic;
    }
    void setDiagnostic(String diagnostic){
        this.diagnostic = diagnostic;
    }
    String getInTime(){
        return this.inTime;
    }
    void setInTime(String inTime){
        this.inTime = inTime;
    }
    String getPrevTime(){
        return this.prevTime;
    }
    void setPrevTime(String prevTime){
        this.prevTime = prevTime;
    }

}
