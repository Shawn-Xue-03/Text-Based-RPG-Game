/**
 * This is the battle against King Dice.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dice
{
    //stating instance variables
    int square = 0;
    int boss = 0;
    public int game(){
        //instrundctions
        System.out.println("In this game you will need to roll a dice and do either one or 2 of the challenges.");
        System.out.println("Afterwards you will have a chance to defeat King Dice");
        
        //staring the game
        String roll = IBIO.inputString("Are you ready to roll?");
        if(roll.equalsIgnoreCase("y") || roll.equalsIgnoreCase("yes")){
            //calling the dice roll method to get a number
            diceroll();
            square = square + boss;
        }
        //while square is less than 3, its <3 because there are 2 minigames
        while(square<3){

            System.out.println("You are on square "+boss);
            
            //switches are basically if statements so these are used to replace them
            switch(square){
                case 1:
                System.out.println("You have picked the trident game.");
                System.out.println("In this game you will have to print out a trident and defeat the boss.");
                trident();
                break;
                case 2:
                System.out.println("You have picked a math question.");
                System.out.println("King Dice has given you a math question, and you cannot escape unless you get it right.");
                math();
                break;
            }
            
            //asking to roll again
            roll = IBIO.inputString("Are you ready to roll?");
            if(roll.equalsIgnoreCase("y") || roll.equalsIgnoreCase("yes")){
                diceroll();
                square = square + boss;
            }

            else{
                System.out.println("You lost!");
                return rpg.pass = 0;
            }

        }
        //After the player surpasses square 2
        System.out.println("King Dice: \"WHAT! Impossible how did you get pass my minigames, noone has ever done that.\" ");
        System.out.println("Cuphead: \"It was quite simeple really, now hand over your soul!\" ");
        System.out.println("King DIce: \"Not so fast, you still have to beat me! Finish my game of snakes and ladders and you can have it.\" ");
        
        //calls the snakes and ladders class
        snakes();
        rpg.pass = 1;
        return rpg.pass;
    }

    
    //this method is basically a random number generator
    public int diceroll(){
        boss = (int) ((Math.random()*1)+1);
        System.out.println("You rolled a "+boss);
        return boss;
    }

    //stating variables for snakes and ladders
    int pr1 = 0;
    int pr2 = 0;
    int sump = 0;
    int spacep = 1;
    public int snakes(){
        while(spacep < 100){
            //Done in switch not if
            switch(spacep){
                //For the ladder at square 9.
                case 9:
                spacep = 34;
                System.out.println("You landed on a ladder!");
                System.out.println("You are now on square "+spacep+".");
                break;
                //For the ladder at square 40.
                case 40:
                spacep = 64;
                System.out.println("You landed on a ladder!");
                System.out.println("You are now on square "+spacep+".");
                break;
                //For the snake at square 54.
                case 54:
                spacep = 19;
                System.out.println("You landed on a snake!");
                System.out.println("You are now on square "+spacep+".");
                break;
                //For the snake at square 90.
                case 90:
                spacep = 48;
                System.out.println("You landed on a snake!");
                System.out.println("You are now on square "+spacep+".");  
                break;
                //For the ladder at square 67.
                case 67: 
                spacep = 86;
                System.out.println("You landed on a ladder!");
                System.out.println("You are now on square "+spacep+".");
                break;
                //For the snake at square 99.
                case 99:
                spacep = 77;
                System.out.println("You landed on a snake!");
                System.out.println("You are now on square "+spacep+".");  
                break;
                //For when the user hits or surpasses 100 and wins.case 99:
                default:
                spacep += sump;
                System.out.println("You are on square "+spacep+".");
                break;
            }
            if(spacep >= 100){
                System.out.println("You have reaching square 100! You win");
                rpg.pass = 1;
                break;
            }
            String again = IBIO.inputString("Would you like to roll again? (y/n) ");
            if(again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y")) 
                player();
        }
        
        return rpg.pass;
    }

    //another RNG
    public int player(){
        pr1 = (int)(Math.random()*5+1);
        pr2 = (int)(Math.random()*5+1);
        sump = pr1 + pr2;
        System.out.println("You rolled " + sump);
        return sump;
    }

    //this is my trident code
    public void trident(){
        //Variable for amount of prongs
        int prong = IBIO.inputInt("How many prongs would you like in the trident? (Whole number) ");
        //Variable for the gap between each prong
        int gap = IBIO.inputInt("How much of a gap between the prongs? (Whole number) ");
        //Variable for height of each prong
        int height = IBIO.inputInt("How tall should each prong be? (Whole mumber) ");
        //Variable for handle size
        int handle = IBIO.inputInt("How tall should the handle be? (Whole number)");
        
        //This for loop repeats as many times as the height
        for(int i = 1 ; i <= height ; i++){
            //This loop repeats the loop inside as many times as the amount of prongs.
            //the -1 is put in to make sure that there arent any extra spaces after the last asterisk.
            for(int j = 1 ; j <= prong - 1; j++){
                System.out.print("*");
                //This loop prints out the spacing between each gap. 
                for(int k = 1 ; k <= gap ; k++){
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }

        //This loop is to make the base of the trident that is below the prongs.
        for(int i = 1 ; i <= (gap * prong - gap)+prong ; i++){
            System.out.print("*");
        }
        System.out.println("");

        //This loop will make the handle.
        for(int i = 1 ; i <= handle ; i++){
            //This loop will create the spacing for the handle to ensure that it is centered.
            for(int j = 1 ; j <= ((gap * prong - gap)+prong)/2 ; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    //this basically asks a math question
    public void math(){
        int ok = 0;
        //while the answer is wrong
        while(ok != 1){
            int math = IBIO.inputInt("What is (1*35-123^2)? ");
            if(math == -15094){
                System.out.println("Correct!");
                ok = 1;
            }
            else{
                System.out.println("Incorrect");
                ok = 0;
            }
        }
    }
}
