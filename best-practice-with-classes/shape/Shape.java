
public class Shape{
    //declare attributes
    private double width = 0;
    private double height = 0;
    private double radius = 0;
    private double length = 0;

    //basic constructor
    Shape(){
    }

    //parametric constructor
    Shape(double width, double height, double radius, double length){
        this.width = width;
        this.height = height;
        this.radius = radius;
        this.length = length;
    }

    //attribute accessors and mutators
    double getWidth(){
        return this.width;
    }
    void setWidth(double width){
        this.width = width;
    }
    double getHeight(){
        return this.height;
    }
    void setHeight(double height){
        this.height = height;
    }
    double getRadius(){
        return this.radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    double getLength(){
        return this.length;
    }
    void setLength(double length){
        this.length = length;
    }
}
