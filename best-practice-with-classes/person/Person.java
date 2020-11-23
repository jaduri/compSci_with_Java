
public class Person{
    //declare attributes
    private String givenName = "Given Name";
    private String lastName = "Last Name";
    private int age = 0;
    private String gender = "gender";
    private String citizenship = "citizenship";

    //basic constructor
    Person(){

    }

    //parametric constructor
    Person(String givenName, String lastName, int age, String gender, String citizenship){
        this.givenName = givenName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.citizenship = citizenship;
    }

    //attribute accessors and mutators
    String getGivenName(){
        return this.givenName;
    }
    void setGivenName(String name){
        this.givenName = name;
    }
    String getLastName(){
        return this.lastName;
    }
    void setLastName(String name){
        this.lastName = name;
    }
    int getAge(){
        return this.age;
    }
    void setAge(int age){
        this.age = age;
    }
    String getGender(){
        return this.gender;
    }
    void setGender(String gender){
        this.gender = gender;
    }
    String getCitizenship(){
        return this.citizenship;
    }
    void setCitizenship(String citizenship){
        this.citizenship = citizenship;
    }
}
