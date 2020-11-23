
import java.util.Scanner;


public interface Referee{
    //instantiate new scanner object
    Scanner input = new Scanner(System.in);

    //method to begin game
    public static void startGame(){
        //game introduction and create new player objects
        System.out.print("\nWelcome to rock, paper, scissors.\n\nPlease enter your name: ");
        String userName = input.nextLine();
        Player[] players = {new Human(userName), new Computer("PC")};

        //print game instructions to screen and prompt for user input
        System.out.println("-----------\nLet's play Rock, Papaer, Scissors!");
        System.out.println(players[0].getName()+" vs "+players[1].getName());
        System.out.println("-----------\n"+players[0].getName()+" please select:\n'r' for rock\n'p' for paper\n's' for scissors");

        //store human players input
        String p0;
        String verification;

        //prompt for user input until input is valid
        do{
            System.out.print(players[0].getName()+"'s move: ");
            p0 = players[0].performMove();
            verification = validate(p0);
        }while(verification != "Pass");

        //request and store computer move
        String p1 = players[1].performMove();

        players[0].setMove(p0);
        players[1].setMove(p1);

        //call method to decide winner
        decide(players[0], players[1]);
    }

    //methods
    public static String validate(String userInput){
        String[] validOptions = {"r", "p", "s"};
        for(String option: validOptions){
            if(option.equals(userInput)){
                return "Pass";
            }
        }
        System.out.println("\nInvalid input please select:\n'r' for rock\n'p' for paper\n's' for scissors");
        return "Invalid input";
    }
    public static void decide(Player p1, Player p2){
        String userInput = p1.getMove();
        String computerInput = p2.getMove();

        String result = "";
        //compare inputs
        if(userInput.equals("r") && computerInput == "s"){
            result =p1.getName()+" wins!";
        }else if(userInput.equals("s") && computerInput == "p"){
            result = p1.getName()+" wins!";
        }else if(userInput.equals("p") && computerInput == "r"){
            result = p1.getName()+" wins!";
        }else if(userInput.equals("s") && computerInput == "r"){
            result = p2.getName()+" wins!";
        }else if(userInput.equals("r") && computerInput == "p"){
            result = p2.getName()+" wins!";
        }else if(userInput.equals("p") && computerInput == "s"){
            result = p2.getName()+" wins!";
        }
        else{
            result = "\nIt's a tie!!";
        }
        System.out.println("PC's move: "+computerInput);
        System.out.println(result);
    }
}
