
public class Rectangle extends Shape{

	//basic constructor
	Rectangle(){

	}

	//parametric constructor
	Rectangle(double height, double length){
		super(0, height, 0, length);
	}

	//method
	double area(){
		return this.getLength() * this.getHeight();
	}

}
