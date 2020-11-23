
public class Triangle extends Shape{
	//basic constructor
	Triangle(){

	}

	//parametric constructor
	Triangle(double width, double height){
		super(width, height, 0, 0);
	}

	//method definition
	double area(){
		return 0.5*(this.getWidth()*this.getHeight());
	}
}
