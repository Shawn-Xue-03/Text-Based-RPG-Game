
/**
 * This is the fill in the blank minigame
 *
 * Shawn Xue
 * 04/10/19
 */
public class blank
{
    public int blank(){
        //calling global variable
        rpg.pass = 0;
        
        //asking question
        String ali = IBIO.inputString("\"Ribity and Croak: There was once a great boxer called Muhammad ___.\" ");
        if(ali.equalsIgnoreCase("ali")){
            //if right
            rpg.pass = 1;
        }
        else{
            //if wrong
            rpg.pass = 0;
        }

        return rpg.pass;
    }
}
