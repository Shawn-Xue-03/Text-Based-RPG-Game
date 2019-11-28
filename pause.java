
/**
 * Write a description of class pause here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pause
{
    //this class pauses the code when its called
        public void pause(){
        try
        {
            Thread.sleep(rpg.time);
        }
        catch(InterruptedException m)
        {
            ;
        }
    }
}
