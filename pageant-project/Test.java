public class Test{
	public static void main(String[] args) {
		Pageant missAdelaide = new Pageant();
		
		Finalist anne = new Finalist("Anne Ruoe", "Nigeria", 89);
		Finalist joy = new Finalist("Joy Renae", "Algeria", 59);
		Finalist jane = new Finalist("Jane Doe", "Australia", 99);

		jane.setConfidence(9.3f);
		jane.setAmbition(9.6f);
		jane.setGrace(9.5f);

		anne.setConfidence(7.3f);
		anne.setAmbition(9.6f);
		anne.setGrace(8.5f);

		joy.setConfidence(7.3f);
		joy.setAmbition(9.9f);
		joy.setGrace(6.8f);

		missAdelaide.addFinalist(joy);
		missAdelaide.addFinalist(jane);
		missAdelaide.addFinalist(anne);
		
		System.out.println("############################");
		missAdelaide.printFinalists();
		missAdelaide.sortFinalist();
		System.out.println("############################");
		missAdelaide.printFinalists();
	}
}