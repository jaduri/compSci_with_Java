
public class Lecturer extends Person{
    //declare attributes
    double salary = 0.0d;
    String[] disciplines = new String[0];

    //basic constructor
    Lecturer(){

    }

    //parametric constructor
    Lecturer(String givenName, String lastName, int age, String gender, String citizenship, double salary, String[] disciplines){
        super(givenName, lastName, age, gender, citizenship);
        this.salary = salary;
        this.disciplines = disciplines;
    }

    //attribute accessors and mutators
    double getSalary(){
        return this.salary;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    String[] getDisciplines(){
        return this.disciplines;
    }
    void setDisciplines(String[] disciplines){
        this.disciplines = disciplines;
    }

    //define methods
    double annualSalary(){
        return salary*12;
    }
    void displayDisciplines(){
        System.out.print("[");
        for(int i = 0; i<disciplines.length-1; i++){
            System.out.print(""+disciplines[i]+", ");
        }
        System.out.println(""+disciplines[disciplines.length-1]+"]");
    }

}
