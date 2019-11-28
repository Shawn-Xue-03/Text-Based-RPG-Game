/**
 * The is the riddle minigame
 *
 * Shawn Xue
 * 04/10/19
 */
public class riddle
{
    public static int riddle( ){
        //asking the question
        String rid = IBIO.inputString("\"Goopy: whatever you say. I have bark but no bite what am I?\"");
        rpg.pass = 0;
        if(rid.toLowerCase().equals("tree")){
            //if right
            rpg.pass = 1;
        }
        
        else{
            //if wrong
            rpg.pass=0;}
        return rpg.pass;
    }
}
