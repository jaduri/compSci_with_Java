public class Animal{
    //declare attributes
    private String name = "name";
    private double weight = 0.0d;
    private String favouriteFood = "Favourite food";
    private int age = 0;

    //basic constructor
    Animal(){

    }

    //parametric constructor
    Animal(String name, double weight, String favouriteFood, int age){
        this.name = name;
        this.weight = weight;
        this.favouriteFood = favouriteFood;
        this.age = age;
    }

    //attribute accessors and mutators
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name = name;
    }
    double getWeight(){
        return this.weight;
    }
    void setWeight(double weight){
        this.weight = weight;
    }
    String getFavouriteFood(){
        return this.favouriteFood;
    }
    void setFavouriteFood(String food){
        this.favouriteFood = food;
    }
    int getAge(){
        return this.age;
    }
    void setAge(int age){
        this.age = age;
    }
}