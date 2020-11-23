
public class Circle extends Shape{
	//basic constructor
	Circle(){

	}

	//parametric constructor
	Circle(double radius){
		super(0, 0, radius, 0);
	}

	//method definition
	double area(){
		return Math.PI * this.getRadius() * this.getRadius();
	}
}
