public abstract class Contestant{
	//attributes
	private String name;
	private String country;
	private int age;
	private float confidence;
	private float ambition;
	private float authenticity;
	private float credibility;
	private float grace;
	//basic constructor
	Contestant(){
		this.name = "unknown";
		this.country = "unknown";
		this.age = 0;
		this.confidence = 0.0f;
		this.ambition = 0.0f;
		this.authenticity = 0.0f;
		this.credibility = 0.0f;
		this.grace = 0.0f;
	}
	Contestant(String name, String country, int age){
		this();
		this.name = name;
		this.country = country;
		this.age = age;
	}
	Contestant(String name, String country, int age, float confidence, float ambition, float authenticity, float credibility, float grace){
		this(name, country, age);
		this.confidence = confidence;
		this.ambition = ambition;
		this.authenticity = authenticity;
		this.credibility = credibility;
		this.grace = grace;
	}
	//accessors and mutators
	String getName(){
		return this.name;
	}
	void setName(String name){
		this.name = name;
	}
	String getCountry(){
		return this.country;
	}
	void setCountry(String country){
		this.country = country;
	}
	int getAge(){
		return this.age;
	}
	void setAge(int age){
		this.age = age;
	}
	float getConfidence(){
		return this.confidence;
	}
	void setConfidence(float confidence){
		if(confidence > 10.0f){//limit value to 10
			this.confidence = 10.0f;
			return;
		}
		this.confidence = confidence;
	}
	float getAmbition(){
		return this.ambition;
	}
	void setAmbition(float ambition){
		if(ambition > 10.0f){//limit value to 10
			this.ambition = 10.0f;
			return;
		}
		this.ambition = ambition;
	}
	float getAuthenticity(){
		return this.authenticity;
	}
	void setAuthenticity(float authenticity){
		if(authenticity > 10.0f){//limit value to 10
			this.authenticity = 10.0f;
			return;
		}
		this.authenticity = authenticity;
	}
	float getCredibility(){
		return this.credibility;
	}
	void setCredibility(float credibility){
		if(credibility > 10.0f){//limit value to 10
			this.credibility = 10.0f;
			return;
		}
		this.credibility = credibility;
	}
	float getGrace(){
		return this.grace;
	}
	void setGrace(float grace){
		if(grace > 10.0f){//limit value to 10
			this.grace = 10.0f;
			return;
		}
		this.grace = grace;
	}
	//methods
	float getMean(){
		return (float) Math.round(((this.confidence + this.ambition + this.authenticity + this.credibility + this.grace)/5)*10)/10;
	}
}