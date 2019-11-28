
/**
 * This is the BlackJack minigame
 *
 * @Shawn Xue
 * @04/10/29
 */
public class blackjack
{
    public static void main(String args[]){
        new blackjack();
    }
    public blackjack(){
        //satating the variables
         rpg.pass = 0;
        int total = 0;
        int card1 = (int)(Math.random()*10 + 1);
        int card2 = (int)(Math.random()*10 + 1);
        total = card1 + card2;
        
        //printing the amount of cards
        System.out.println("Card one is: "+card1+"\nYour second card is: "+card2);
        System.out.println("Your total is: "+total);

        if(total == 21)
            System.out.println("BlackJack!");
        while(total < 21){
            //asking for another card
            String cont = IBIO.inputString("Would you like another card? (y/n)");
            if(cont.toLowerCase().equals("yes") || cont.toLowerCase().equals("y")){
                int card3 = (int)(Math.random()*10 + 1);
                total = total + card3;
                System.out.println("Card 3 is: "+card3);
                System.out.println("Your total is: "+total);

                if(total > 21){
                    System.out.println("you have over 21 points, You lose!");
                    break;}
            }
        }
        int dcard1 = 0;
        int dcard2 = 0;
        int dtotal = 0; 
        if(total<=21){
            dcard1 = (int)(Math.random()*10 +1);
            dcard2 = (int)(Math.random()*10 +1);
            dtotal = card1 + card2; 
            while(dtotal < 16){
                int card3 = (int)(Math.random()*10 + 1);
                dtotal = dtotal + card3;
            }
        }
        if(total <= 21){
            if(dtotal > 21){
                System.out.println("\nDealer went over 21, bust");
                rpg.pass = 1;}
            else if(total > dtotal){
                System.out.println("\nDealer has: "+dtotal);
                System.out.println("You win!");
                rpg.pass = 1;}
            else if(total < dtotal){
                System.out.println("\nDealer has: "+dtotal);
                System.out.println("Dealer wins!");                
                rpg.pass = 0;}
            else{
                System.out.println("\nYou tied! House always wins!");            
                rpg.pass = 0;}
        }
       
}
}
