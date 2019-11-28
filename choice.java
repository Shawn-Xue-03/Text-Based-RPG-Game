
/**
 * This is the multiple choice minigame
 *
 * Shawn Xue
 * 04/10/19
 */
public class choice
{
    public int choice(){
        //calling the global variable
        rpg.pass = 0;
        
        //asking the question
        String map  = IBIO.inputString("\"HB: wow you are impatient and also have no manners, ok fine. I have roads but no pavement, rivers but no water, buildings but no bricks. What am I?\na)a globe\nb)Space\nc)A map\nd)Ground\n");
        if(map.toLowerCase().equals("c") || map.toLowerCase().equals("a map")){
            //if right
            rpg.pass = 1;
        }
        else{
            //if incorrect 
            rpg.pass =  0;
        } 
        return rpg.pass;
    }
}
