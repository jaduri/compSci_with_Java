
public class Student extends Person{
    //declare attributes
    double[] marks = new double[0];
    String[] disciplines = new String[0];

    //basic constructor
    Student(){

    }

    //parametric constructor
    Student(String givenName, String lastName, int age, String gender, String citizenship, double[] marks, String[] disciplines){
        super(givenName, lastName, age, gender, citizenship);
        this.marks = marks;
        this.disciplines = disciplines;
    }

    //attribute accessors and mutators
    double[] getMarks(){
        return this.marks;
    }
    void setMarks(double[] marks){
        this.marks = marks;
    }
    String[] getDisciplines(){
        return this.disciplines;
    }
    void setDisciplines(String[] disciplines){
        this.disciplines = disciplines;
    }

    //define methods
    double averageMarks(){
        double average = 0;
        for(double mark: marks){
            average += mark;
        }
        return average/marks.length;
    }

    void displayDisciplines(){
        System.out.print("[");
        for(int i = 0; i<disciplines.length-1; i++){
            System.out.print(""+disciplines[i]+", ");
        }
        System.out.println(""+disciplines[disciplines.length-1]+"]");
    }

}
