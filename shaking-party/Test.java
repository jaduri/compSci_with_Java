
public class Test{
	public static void main(String[] args){
		ShakingParty party = new ShakingParty();
		ShakingPartyConstrained ball = new ShakingPartyConstrained();

		System.out.println("Normal shaking party");
		party.display();
		System.out.println(party.countHandShakes()+" shakes");
		System.out.println("Couples shaking party");
		ball.display();
		System.out.println(ball.countHandShakes()+" shakes");
	}
}
