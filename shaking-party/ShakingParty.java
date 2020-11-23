
public class ShakingParty{

	//attribute
	int nPeople;

	//default constructor
	ShakingParty(){
		this.nPeople = (int) Math.round(Math.random()*10);
	}
	//parameterized constructor
	ShakingParty(int nTmp){
		this();
		this.nPeople += nTmp;
	}
	//display number of people in the party
	void display(){
		System.out.println(this.nPeople);
	}

	//method
	public int countHandShakes(){
		if(this.nPeople <= 1){
			return 0;
		}else{
			return --this.nPeople + countHandShakes();
		}
	}

}
