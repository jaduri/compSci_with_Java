public class Finalist extends Contestant{
	//attributes
	private String moto;
	//constructors
	Finalist(){
		super();
		this.moto = "unknown";
	}
	Finalist(String name, String country, int age){
		super(name, country, age);
		this.moto = "unknown";
	}
	Finalist(String name, String country, int age, float confidence, float ambition, float authenticity, float credibility, float grace, String moto){
		super(name, country, age, confidence, ambition, authenticity, credibility, grace);
		this.moto = moto;
	}
	//accessors and mutators
	String getMoto(){
		return this.moto;
	}
	void setMoto(String moto){
		this.moto = moto;
	}
	//methods
	void display(){
		System.out.printf("Contestant: %s, %d yr from %s\n", this.getName(), this.getAge(), this.getCountry());
		System.out.printf("confidence: %.1f\nambition: %.1f\ncredibility: %.1f\ngrace: %.1f\nauthenticity: %.1f\n", this.getConfidence(), this.getAmbition(), this.getCredibility(), this.getGrace(), this.getAuthenticity());
		System.out.println("mean: "+this.getMean());
		System.out.println(this.moto);
	}
}