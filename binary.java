
/**
 * This is the binary minigame
 * Shawn Xue
 * 04/10/19
 */
public class binary
{
    public int binary(){
        //calling the global variable
        rpg.pass = 0;
        
        //asking the question
        String bin = IBIO.inputString("Beppi the Clown: \"Great choice boys. What is 999 in binary?\" ");
        if(bin.toLowerCase().equals("1111100111")){
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
