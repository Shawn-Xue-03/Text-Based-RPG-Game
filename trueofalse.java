/**
 * This is the true or false minigame
 *
 * Shawn Xue
 * 04/10/19
 */
public class trueofalse
{
    public static int trueofalse(){
        //calling the global variable
        rpg.pass = 0;

        //asking the question
        String tof = IBIO.inputString("\"True or false: Carrots are good for the eyes.\" ");
        if(tof.toLowerCase().equals("true")){
            //If right
            rpg.pass = 1;
        }
        else{
            //if wrong
            rpg.pass = 0;
        }
        return rpg.pass;
    }
}
