
public class ShakingPartyConstrained extends ShakingParty{

	//attribute
	int nCouples;

	//default constructor
	ShakingPartyConstrained(){
		this.nCouples = (int) Math.round(Math.random()*10);
	}
	//parameterized constructor
	ShakingPartyConstrained(int nTmp){
		this();
		this.nCouples += nTmp;
	}

@Override//override parent method
	void display(){
		//display number of couples at party
		System.out.println(this.nCouples);
	}

	@Override//override parent method
	public int countHandShakes(){
		//base case, when one couple no handshakes
		if(this.nCouples <= 1){
			return 0;
		}else{
			//number of handshakes
			return (--this.nCouples*3 + countHandShakes());
		}
	}

}
