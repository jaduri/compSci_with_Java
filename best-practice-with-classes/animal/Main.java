public class Main{
    public static void main(String[] args){

        //instantiate objects of different animal sub-classes
        Lion leo = new Lion("Leo", 15.0, "bacon", 12);
        Chameleon kami = new Chameleon("Kami", 14.0, "bacon", 17);
        Turtle angie = new Turtle("Angie", 19.0, "bacon", 11);

        //call methods on all objects
        leo.makeSound();
        kami.makeSound();
        angie.makeSound();

    }
}