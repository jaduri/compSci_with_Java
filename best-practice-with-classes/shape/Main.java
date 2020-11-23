
public class Main{
    public static void main(String[] args){

        Rectangle rect = new Rectangle(40,10);
        Circle circle = new Circle(5);
        Triangle tri = new Triangle(5,5);

        System.out.println(rect.area());
        System.out.println(circle.area());
        System.out.println(tri.area());

    }
}
