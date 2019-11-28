/**
 * Write a description of class rpg here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class rpg
{
    //creating objects for my class
    pause pauseObject = new pause();
    blackjack jackObject = new blackjack();
    binary binObject = new binary();
    choice choiceObject = new choice();
    blank blankObject = new blank();
    riddle ridObject = new riddle();
    trueofalse trueObject = new trueofalse();
    dice diceObject = new dice();
    //global variables
    public static int pass;
    public static int time;
    //instance variables
    String contract;
    char restart = 'n';
    String name;

    public static void main (String args[]){
        new rpg();
    }

    public rpg(){
        //Usename and passwords
        String username = IBIO.inputString("Enter Username: ");
        String password = IBIO.inputString("Enter Password: ");
        if(password.toLowerCase().equals("password")){
            System.out.println("Password is correct.");}
        else
            System.out.println("Password invalid");
        while(!(password.toLowerCase().equals("password"))){
            if(password.toLowerCase().equals("password")){
                System.out.println("Password is correct");
                break;}
            else
                System.out.println("Password incorrect");
            password = IBIO.inputString("Enter Password: ");
        }

        //To determine how much of a delay there is.
        time = IBIO.inputInt("How much delay would you like between each line? (measured in ms, 1000ms is 1s) ");

        //Introducing the backstory
        System.out.println("                                                                                                                                     "); 
        System.out.println("                                                                                                                             dddddddd");
        System.out.println("         CCCCCCCCCCCCC                                    hhhhhhh                                                            d::::::d");
        System.out.println("      CCC::::::::::::C                                    h:::::h                                                            d::::::d");
        System.out.println("    CC:::::::::::::::C                                    h:::::h                                                            d::::::d");
        System.out.println("   C:::::CCCCCCCC::::C                                    h:::::h                                                            d:::::d ");
        System.out.println("  C:::::C       CCCCCCuuuuuu    uuuuuu ppppp   ppppppppp   h::::h hhhhh           eeeeeeeeeeee    aaaaaaaaaaaaa      ddddddddd:::::d ");
        System.out.println(" C:::::C              u::::u    u::::u p::::ppp:::::::::p  h::::hh:::::hhh      ee::::::::::::ee  a::::::::::::a   dd::::::::::::::d ");
        System.out.println(" C:::::C              u::::u    u::::u p:::::::::::::::::p h::::::::::::::hh   e::::::eeeee:::::eeaaaaaaaaa:::::a d::::::::::::::::d ");
        System.out.println(" C:::::C              u::::u    u::::u pp::::::ppppp::::::ph:::::::hhh::::::h e::::::e     e:::::e         a::::ad:::::::ddddd:::::d ");
        System.out.println(" C:::::C              u::::u    u::::u  p:::::p     p:::::ph::::::h   h::::::he:::::::eeeee::::::e  aaaaaaa:::::ad::::::d    d:::::d ");
        System.out.println(" C:::::C              u::::u    u::::u  p:::::p     p:::::ph:::::h     h:::::he:::::::::::::::::e aa::::::::::::ad:::::d     d:::::d ");
        System.out.println(" C:::::C              u::::u    u::::u  p:::::p     p:::::ph:::::h     h:::::he::::::eeeeeeeeeee a::::aaaa::::::ad:::::d     d:::::d ");
        System.out.println("  C:::::C       CCCCCCu:::::uuuu:::::u  p:::::p    p::::::ph:::::h     h:::::he:::::::e         a::::a    a:::::ad:::::d     d:::::d ");
        System.out.println("   C:::::CCCCCCCC::::Cu:::::::::::::::uup:::::ppppp:::::::ph:::::h     h:::::he::::::::e        a::::a    a:::::ad::::::ddddd::::::dd");
        System.out.println("    CC:::::::::::::::C u:::::::::::::::up::::::::::::::::p h:::::h     h:::::h e::::::::eeeeeeeea:::::aaaa::::::a d:::::::::::::::::d");
        System.out.println("      CCC::::::::::::C  uu::::::::uu:::up::::::::::::::pp  h:::::h     h:::::h  ee:::::::::::::e a::::::::::aa:::a d:::::::::ddd::::d");
        System.out.println("         CCCCCCCCCCCCC    uuuuuuuu  uuuup::::::pppppppp    hhhhhhh     hhhhhhh    eeeeeeeeeeeeee  aaaaaaaaaa  aaaa  ddddddddd   ddddd");
        System.out.println("                                        p:::::p                                                                                      ");
        System.out.println("                                        p:::::p                                                                                      ");
        System.out.println("                                       p:::::::p                                                                                     ");
        System.out.println("                                       p:::::::p                                                                                     ");
        System.out.println("                                       p:::::::p                                                                                     ");
        System.out.println("                                       ppppppppp                                                                                     ");
        System.out.println("");
        System.out.println("");
        System.out.println("In this game two characters called Cuphead and Mugman have lost a gamble with the devil himself.");
        System.out.println("In order to save their own souls they have agreed to be the devil’s personal hitmen and take the");
        System.out.println("souls of the people that escaped him. In order to escape this predicament you must get the souls");
        System.out.println("of the following people.");
        System.out.println("The Root Pack");
        System.out.println("Goopy Le Grande");
        System.out.println("Ribby and Croaks");
        System.out.println("Hilda Berg");
        System.out.println("Beppi the Clown");

        char start = IBIO.inputChar("Are you up for the task? (y/n): ");

        if(Character.toLowerCase(start) == 'n'){
            System.out.println("That is ok just restart the game when you are ready!");
            System.exit(0);
        }
        else if(Character.toLowerCase(start) == 'y')
            System.out.println("Let the challenge begin!");

        else{
            System.out.println("Invalid choice");
            while(!(Character.toLowerCase(start) == 'y'||Character.toLowerCase(start) == 'n')){
                start = IBIO.inputChar("Are you up for the task? (y/n): ");
                if(Character.toLowerCase(start) == 'n'){
                    System.out.println("That is ok just restart the game when you are ready!");
                    System.exit(0);
                    break;}
                else if(Character.toLowerCase(start) == 'y')
                    System.out.println("Let the challenge begin!");
            }
        }

        //Intro to the story
        System.out.println("Cuphead: \"Lets go Mugman we need to talk to Old Kettle he might know what to do.\"");
        pauseObject.pause();
        System.out.println("Mugman: \"We better hurry, if we aren't fast enough The Devil will get mad and hunt us down to take our souls.\"");
        pauseObject.pause();
        System.out.println("*30 minutes later when cuphead and mugman reach home*\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"Old Kettle, you must help us! We made a bad mistake and now we are The Devil’s hitmen! Is there anything you can do to help us?\"");
        pauseObject.pause();
        System.out.println("Old Kettle: \"There is one way, you must do as The Devil asks and get the souls from the 5 people. However, when you give it to the devil,");
        pauseObject.pause();
        System.out.println("you must act like you are completely loyal to him, and then stab him in the back and take his soul. You must hurry and leave quickly before you run out of time.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"Mugman be alert,  we are approaching the garden of The Root Pack.\"");
        pauseObject.pause();
        System.out.println("Mugman: \"I guess we are, but where did they go I do not see them.\"");
        pauseObject.pause();
        System.out.println(" *The Root Pack members jump out of the ground*");
        pauseObject.pause();
        System.out.println("The Root Pack: \"Who dares trespass onto our garden! Hasn't  anyone warned you that anyone that enters our garden will never leave?\"");
        pauseObject.pause();
        System.out.println("Mugman: \"Root Pack, we were sent here by The Devil, give us your souls peacefully or we will have to do this the hard way.\"");
        pauseObject.pause();
        System.out.println("The Root Pack: \"The devil? Never heard of him.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"Listen here you, we know all about you, now hand over your souls.\"");
        pauseObject.pause();
        System.out.println("The Root Pack: \"Very Well...but in order to get our souls you must answer this riddle:\"");

        trueObject.trueofalse();
        //If the player lost and is asked if they want to retry
        while(pass != 1){
            System.out.println("The Root Pack: \"AHAHA incorrect! You are trapped here forever.\"");
            restart = IBIO.inputChar("\n\nWouild you like to restart? (y/n)");
            if(restart == 'y'){
                trueObject.trueofalse();
            }
            else{
                System.out.println("  _____                        _____");               
                System.out.println("|  __ \\                      |  _  |");                
                System.out.println("| |  \\/ __ _ _ __ ___   ___  | | | |_   _____ _ __ "); 
                System.out.println("| | __ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|"); 
                System.out.println("| |_\\ \\ (_| | | | | | |  __/ \\ \\_/ /\\ V /  __/ |   "); 
                System.out.println(" \\____/\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_| "); 
                System.exit(0);
                break;
            }
        }

        //If the player wins
        System.out.println("                       ________________");
        System.out.println("                  ____/ (  (    )   )  \\___");
        System.out.println("                 /( (  (  )   _    ))  )   )\\");
        System.out.println("               ((     (   )(    )  )   (   )  )");
        System.out.println("             ((/  ( _(   )   (   _) ) (  () )  )");
        System.out.println("            ( (  ( (_)   ((    (   )  .((_ ) .  )_");
        System.out.println("           ( (  )    (      (  )    )   ) . ) (   )");
        System.out.println("          (  (   (  (   ) (  _  ( _) ).  ) . ) ) ( )");
        System.out.println("          ( (  (   ) (  )   (  ))     ) _)(   )  )  )");
        System.out.println("         ( (  ( \\ ) (    (_  ( ) ( )  )   ) )  )) ( )");
        System.out.println("          (  (   (  (   (_ ( ) ( _    )  ) (  )  )   )");
        System.out.println("         ( (  ( (  (  )     (_  )  ) )  _)   ) _( ( )");
        System.out.println("          ((  (   )(    (     _    )   _) _(_ (  (_ )");
        System.out.println("           (_((__(_(__(( ( ( |  ) ) ) )_))__))_)___)");
        System.out.println("           ((__)        \\||lll|l||///          \\_))");
        System.out.println("                    (   /(/ (  )  ) )\\   )");
        System.out.println("                  (    ( ( ( | | ) ) )\\   )");
        System.out.println("                   (   /(| / ( )) ) ) )) )");
        System.out.println("                 (     ( ((((_(|)_)))))     )");
        System.out.println("                  (      ||\\(|(|)|/||     )");
        System.out.println("                (        |(||(||)||||        )");
        System.out.println("                  (     //|/l|||)|\\ \\     )");
        System.out.println("                (/ / //  /|//||||\\  \\ \\  \\ _)");

        System.out.println("\"Root Pack: How did you know the answer? You cheated! What's happening? Everything is going dark. My soul! Where is it going?\"");
        System.out.println("What have you done to me? Give me back my soul!\"");
        pauseObject.pause();

        //prints out the soul contract
        contract("The Root Pack");

        //Transition into the next boss
        System.out.println("Cuphead: \"Ok that's one down. Next up is Goopy le grande.\"");
        System.out.println("Cuphead: \"Mugman be careful we are about to enter the jungle we must be on the watch for Goopy le Grande. He hides within the trees waiting carefully to trap his prey.\"");
        pauseObject.pause();
        System.out.println("*BOOM*");
        pauseObject.pause();
        System.out.println("_______________________________");
        System.out.println("|     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |");
        System.out.println("_______________________________");
        pauseObject.pause();
        System.out.println("Mugman: \"Oh no Cuphead what just happened? We are stuck in a cage! How did this even happen?\"");
        pauseObject.pause();
        System.out.println("Goopy:\" HAHAHA I have trapped you inside my cage. There is only one escape and that is to answer my riddle correct. However it is impossible to\"");
        pauseObject.pause();
        System.out.println("get it right. I keep the answer well secure as it is connected to my soul.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"yea yea yea, just tell us the question.\"");
        pauseObject.pause();
        //calling the riddle class
        ridObject.riddle();
        while(pass != 1){
            System.out.println("Goopy le Grande: \"HAHAHA incorrect! You are trapped here forever.\"");
            pauseObject.pause();
            restart = IBIO.inputChar("\n\nWouild you like to restart? (y/n) ");
            if(restart == 'y'){
                ridObject.riddle();
            }
            else{
                System.out.println(" _____                        _____");               
                System.out.println("|  __ \\                      |  _  |");                
                System.out.println("| |  \\/ __ _ _ __ ___   ___  | | | |_   _____ _ __ "); 
                System.out.println("| | __ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|"); 
                System.out.println("| |_\\ \\ (_| | | | | | |  __/ \\ \\_/ /\\ V /  __/ |   "); 
                System.out.println(" \\____/\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_| "); 
                System.exit(0);
                break;
            }
        }

        //If the player wins
        System.out.println("_________________________________");
        System.out.println("|   |   |   |   |   |   |   |   |");
        System.out.println("|   |   | ______________|   | |");
        System.out.println("|   |    /              \\   |   |");
        System.out.println("|   |    |              |   |   |");
        System.out.println("|   |    |              |   |   |");
        System.out.println("|   |    |              |   |   |");
        System.out.println("|   |    \\______________/   |   |");
        System.out.println("|   |   |   |   |   |   |   |   |");
        System.out.println("_________________________________");

        System.out.println("Goopy: \"WHAT? impossible! how did you get it right, no one has ever gotten it right. Wait what's happening, I'm fading away, my soul you're ");
        pauseObject.pause();
        System.out.println("taking my soul too? Please have mercy, I don't want to go see The Devil, please nooooooooooooo.\"");
        pauseObject.pause();

        //contract printing
        name = "Goopy le Grande";
        contract(name);

        //Transition into next boss
        pauseObject.pause();
        System.out.println("Cuphead: \"Ok that's is 2 down, next up is Ribby and Croaks they are professional boxers so we must be careful and quick.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"We are approaching boxer town, the home of Ribby and Croaks. I have a feeling we will need to answer a boxing riddle.\"");
        pauseObject.pause();
        System.out.println(" *20 minutes later*");
        pauseObject.pause();
        System.out.println("Mugman: \"Cuphead we are at the boxing ring let’s confront Ribby and Croaks.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"Ribby and Croaks! We are sent here from The Devil and want your soul. We are here for your souls, hand them over we are short on time.\""); 
        pauseObject.pause();
        System.out.println("Ribity and Croak: \"We are not handing over anything, if you want our souls you must answer our fill in the blank question. ");
        pauseObject.pause();
        System.out.println("If you get it right our souls will automatically leave our bodies, but if you get it wrong you will be our personal punching bags forever.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"This will be easy, what is the question?\"");
        pauseObject.pause();

        //calling the blank class
        blankObject.blank();

        //if player loses
        while(pass != 1){
            System.out.println("Ribity and Croaks: \"HAHAHA incorrect! you are trapped here forever. Have fun being my punching bag.\"");
            restart = IBIO.inputChar("\n\nWouild you like to restart? (y/n) ");
            if(restart == 'y'){
                blankObject.blank();
            }
            else{
                System.out.println(" _____                        _____");               
                System.out.println("|  __ \\                      |  _  |");                
                System.out.println("| |  \\/ __ _ _ __ ___   ___  | | | |_   _____ _ __ "); 
                System.out.println("| | __ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|"); 
                System.out.println("| |_\\ \\ (_| | | | | | |  __/ \\ \\_/ /\\ V /  __/ |   "); 
                System.out.println("\\____/\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_| "); 
                System.exit(0);
                break;
            }
        }

        //if player wins
        System.out.println("Ribity and Croak: \"Gasp that is impossible noone has ever heard of that boxer before, you must have found an answer book somewhere you CHEATER.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"Nope your riddle was just that easy. Now, souls please.\"");
        pauseObject.pause();
        System.out.println("Ribity and Croak: \"I'm starting to lose feeling, my soul is leaving my body! Please, you must not take our prized possession, pleaseeeeeeeeeeee.\"");
        pauseObject.pause();

        //printing contract
        name = "Ribity and Croak";
        contract(name);

        //transition into next boss
        System.out.println("Mugman: \"They had so much passion for their hobby.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"We only have 2 more to go. Don't give up! Next up is Hilda Berg.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"We are at the space station, we must take a spacecraft in order to reach Hilda Berg.\"");
        pauseObject.pause();
        System.out.println("                   __,' __`.                _..----....____");
        System.out.println("        __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'");
        System.out.println("  _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'");
        System.out.println(",'________________                          \\`-._`-','");
        System.out.println(" `._              ```````````------...___   '-.._'-:");
        System.out.println("    ```--.._      ,.                     ````--...__\\-.");
        System.out.println("            `.--. `-`                       ____    |  |`");
        System.out.println("              `. `.                       ,'`````.  ;  ;`");
        System.out.println("                `._`.        __________   `.      \'__/`");
        System.out.println("                   `-:._____/______/___/____`.     \\  `");
        System.out.println("                               |       `._    `.    \\");
        System.out.println("                               `._________`-.   `.   `.___");
        System.out.println("                                                  `------'`");
        pauseObject.pause();
        System.out.println("Mugman: \"Oh boy Cuphead, we are really high up, we are about to leave our precious planet. I can see Earth right now.\"");
        pauseObject.pause();
        System.out.println("        _____");
        System.out.println("    ,-:` \\;',`'-, ");
        System.out.println("  .'-;_,;  ':-;_,'.");
        System.out.println(" /;   '/    ,  _`.-\\");
        System.out.println("| '`. (`     /` ` \\`|");
        System.out.println("|:.  `\\`-.   \\_   / |");
        System.out.println("|     (   `,  .`\\ ;'|");
        System.out.println(" \\     | .'     `-'/");
        System.out.println("  `.   ;/        .'");
        System.out.println("    `'-._____..");
        pauseObject.pause();
        System.out.println("\n\nCuphead: \"I can see Hilda Berg!\"");
        pauseObject.pause();
        System.out.println("Hilda Berg: \"Who are you and why have you disturbed my peace.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"We are servants of The Devil tasked to take your soul, hand it over nicely or things will get messy.\"");
        pauseObject.pause();
        System.out.println("Hilda Berg: \"Who do you think you are coming into my personal space and demanding things. The only way you are going to get my soul is by answering my multiple choice question.");
        System.out.println("Are you up for the task?\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"Yes. What is the question?\"");

        //calling the choice class
        choiceObject.choice();

        //if player loses
        while(pass != 1){
            System.out.println("Hilda Berg: \"HAHAHA incorrect! you are trapped here forever. Good luck finding your way home in the vacuum of space.\"");
            pauseObject.pause();
            restart = IBIO.inputChar("\n\nWouild you like to restart? (y/n) ");
            if(restart == 'y'){
                choiceObject.choice();
            }
            else{
                System.out.println(" _____                        _____");               
                System.out.println("|  __ \\                      |  _  |");                
                System.out.println("| |  \\/ __ _ _ __ ___   ___  | | | |_   _____ _ __ "); 
                System.out.println("| | __ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|"); 
                System.out.println("| |_\\ \\ (_| | | | | | |  __/ \\ \\_/ /\\ V /  __/ |   "); 
                System.out.println("\\____/\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_| "); 
                System.exit(0);
                break;
            }
        }

        //if player wins
        System.out.println("Hilda Berg: \"HAHAHA incorrect, wait….that is correct. How did you know> You must be cheating. No one has ever guessed it right.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"I didn't guess, I was just smarter than you and your riddles. Now I will be taking your soul. Thank you very much!\"");
        pauseObject.pause();
        System.out.println("Hilda Berg: \"Noooooo come back I need my soul pleaseeeeee.\"");

        //contract printing
        name = "Hilda Berg";
        contract(name);

        //transition into next boss
        pauseObject.pause();
        System.out.println("Mugman: \"We're almost done!\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"We are so close to the finish I can already taste the freedom. Let's go back right now we have almost all of them.\"");
        pauseObject.pause();
        System.out.println(" *Entering the Casino World*");
        pauseObject.pause();
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------|");                                                                                                                                                                                                                                                                  
        System.out.println("|     ,----..                                                                            .---.                     ,--,               |");
        System.out.println("|    /   /   \\                           ,--,                                           /. ./|                   ,--.'|         ,---, |");
        System.out.println("|   |   :     :                        ,--.'|         ,---,    ,---.                .--'.  ' ;   ,---.    __  ,-.|  | :       ,---.'| |");
        System.out.println("|   .   |  ;. /              .--.--.   |  |,      ,-+-. /  |  '   ,'\\              /__./ \\ : |  '   ,'\\ ,' ,'/ /|:  : '       |   | : |");
        System.out.println("|   .   ; /--`   ,--.--.    /  /    '  `--'_     ,--.'|'   | /   /   |         .--'.  '   \\' . /   /   |'  | |' ||  ' |       |   | | |");
        System.out.println("|   ;   | ;     /       \\  |  :  /`./  ,' ,'|   |   |  ,\"' |.   ; ,. :        /___/ \\ |    ' '.   ; ,. :|  |   ,''  | |     ,--.__| | |");
        System.out.println("|   |   : |    .--.  .-. | |  :  ;_    '  | |   |   | /  | |'   | |: :        ;   \\  \\;      :'   | |: :'  :  /  |  | :    /   ,'   | |");
        System.out.println("|   .   | '___  \\__\\/: . .  \\  \\    `. |  | :   |   | |  | |'   | .; :         \\   ;  `      |'   | .; :|  | '   '  : |__ .   '  /  | |");
        System.out.println("|   '   ; : .'| ,\" .--.; |   `----.   \'  : |__ |   | |  |/ |   :    |          .   \\    .\\  ;|   :    |;  : |   |  | '.'|'   ; |:  | |");
        System.out.println("|   '   | '/  :/  /  ,.  |  /  /`--'  /|  | '.'||   | |--'   \\   \\  /            \\   \\   ' \\ | \\   \\  / |  , ;   ;  :    ;|   | '/  ' |");
        System.out.println("|   |   :    /;  :   .'   \'--'.     / ;  :    ;|   |/        `----'              :   '  |--\"   `----'   ---'    |  ,   / |   :    :| |");
        System.out.println("|    \\   \\ .' |  ,     .-./  `--'---'  |  ,   / '---'                              \\   \\ ;                        ---`-'   \\   \\  /   |");
        System.out.println("|     `---`    `--`---'                 ---`-'                                      '---\"                                   `----'    |");
        System.out.println("|_____________________________________________________________________________________________________________________________________|"); 
        pauseObject.pause();
        System.out.println("Cuphead: \"Come on Mugman lets go we are so close just one more soul.\"");
        pauseObject.pause();
        System.out.println("Beppi the Clown: \"Hello boys! Would you like to see my carnival performance?.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"SURE!\"");
        pauseObject.pause();
        System.out.println("Beppi the Clown: \"Teriffic! Here we go!.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"Wait whats happening? I feel weird!\"");
        pauseObject.pause();
        System.out.println("             __,aaPPPPPPPPaa,__");
        System.out.println("          ,adP\"\"\"'          `\"\"Yb,_");
        System.out.println("       ,adP'                     `\"Yb,");
        System.out.println("     ,dP'     ,aadPP\"\"\"\"\"YYba,_     `\"Y,");
        System.out.println("    ,P'    ,aP\"'            `\"\"Ya,     \"Y,");
        System.out.println("   ,P'    aP'     _________     `\"Ya    `Yb,");
        System.out.println("  ,P'    d\"    ,adP\"\"\"\"\"\"\"\"Yba,    `Y,    \"Y,");
        System.out.println(" ,d'   ,d'   ,dP\"            `Yb,   `Y,    `Y,");
        System.out.println(" d'   ,d'   ,d'    ,dP\"\"Yb,    `Y,   `Y,    `b");
        System.out.println(" 8    d'    d'   ,d\"      \"b,   `Y,   `8,    Y,");
        System.out.println(" 8    8     8    d'    _   `Y,   `8    `8    `b");
        System.out.println(" 8    8     8    8     8    `8    8     8     8");
        System.out.println(" 8    Y,    Y,   `b, ,aP     P    8    ,P     8");
        System.out.println(" I,   `Y,   `Ya    \"\"\"\"     d'   ,P    d\"    ,P");
        System.out.println(" `Y,   `8,    `Ya         ,8\"   ,P'   ,P'    d'");
        System.out.println("  `Y,   `Ya,    `Ya,,__,,d\"'   ,P'   ,P\"    ,P");
        System.out.println("   `Y,    `Ya,     `\"\"\"\"'     ,P'   ,d\"    ,P'");
        System.out.println("    `Yb,    `\"Ya,_          ,d\"    ,P'    ,P'");
        System.out.println("        `Yba,                   ,d'    ,dP'");    
        System.out.println("           `\"Yba,__       __,adP\"     dP\"");
        System.out.println("               `\"\"\"\"\"\"\"\"\"\"\"\"\"'");
        pauseObject.pause();
        System.out.println("Beppi the Clown: \"HAHAH I have tricked you! You are now trapped in my dimension and the only way to leave is to get my riddle correct.\"");
        pauseObject.pause();
        System.out.println("Cuphead and Mugman: \"Oh no!\"");
        pauseObject.pause();
        System.out.println("Mugman: \"Cuphead, what are we supposed to do?\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"I guess all we can do is to answer the question...\"");
        pauseObject.pause();
        System.out.println("Beppi the Clown: \"So what will it be boys?\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"We'll do it\"");
        pauseObject.pause();
        System.out.println("Beppi the Clown: \"Very well, here's your question\"");
        pauseObject.pause();

        //calling binary class
        binObject.binary();

        //if player loses
        while(pass != 1){
            System.out.println("Beppi the Clown: \"HAHAHA incorrect! Thanks for the souls boys!.\"");
            pauseObject.pause();
            restart = IBIO.inputChar("\n\nWouild you like to restart? (y/n) ");
            if(restart == 'y'){
                binObject.binary();
            }
            else{
                System.out.println(" _____                         _____");               
                System.out.println("|  __ \\                       |  _  |");                
                System.out.println("| |  \\/ __ _ _ __ ___   ___   | | | |_   _____ _ __ "); 
                System.out.println("| | __ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|"); 
                System.out.println("| |_\\ \\ (_| | | | | | |  __/ \\ \\_/ /\\ V /  __/ |   "); 
                System.out.println("\\____/\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_| "); 
                System.exit(0);
                break;
            }
        }

        //if player wins
        System.out.println("Beppi the Clown: \"How did you get the answer right, I've been told it is impossible to get right. I've been lied to!\"");
        pauseObject.pause();
        contract("Beppi the Clown");
        System.out.println("Cuphead: \"All right now we are free to go see the devil, time for freedom.\"");
        pauseObject.pause();
        System.out.println("*Near the entrance to the Casino*");
        pauseObject.pause();
        System.out.println("Cuphead: \"Come on Mugman lets go we are so close.\"");
        pauseObject.pause();
        System.out.println("King Dice: \"Just a second boys. Thanks to you I lost a bet to the Devil and am tasked to take your souls.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"No way we spent all day getting these souls.\"");
        pauseObject.pause();
        System.out.println("King Dice: \"How about I make it fair for you guys, if you answer this riddle correctly you can get my soul, if you get it wrong I will take your souls and all the ones you collected.\"");
        pauseObject.pause();
        System.out.println("Mugman: \"Cuphead, I don't think this is a good idea it must be a trick.\""); 
        pauseObject.pause();
        System.out.println("Cuphead: \"DEAL!\"");

        //calling the dice clas
        diceObject.game();

        //if player loses
        while(pass != 1){
            System.out.println("King Dice: \"HAHAHA incorrect! Thanks for the souls boys!.\"");
            diceObject.game();
            restart = IBIO.inputChar("\n\nWouild you like to restart? (y/n)");
            if(restart == 'y'){
                diceObject.game();
            }
            else{
                System.out.println(" _____                         _____");               
                System.out.println("|  __ \\                       |  _  |");                
                System.out.println("| |  \\/ __ _ _ __ ___   ___   | | | |_   _____ _ __ "); 
                System.out.println("| | __ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|"); 
                System.out.println("| |_\\ \\ (_| | | | | | |  __/ \\ \\_/ /\\ V /  __/ |   "); 
                System.out.println("\\____/\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_| "); 
                System.exit(0);
                break;
            }
        }

        //if player wins
        System.out.println("King Dice: \"IMPOSSIBLE! No one has ever beaten all 3 of my challenges ever!\"");
        System.out.println("Cuphead: T\"here's always a first time for everything.\"");
        System.out.println("King Dice: \"No, there should never be a first time to lose, you will never have my soul.\"");
        System.out.println("Wait whats happening? I'm fading away, my vision is getting blurry. Please stop this!\"");
        contract("King Dice");
        pauseObject.pause();
        System.out.println("Cuphead: Ok that's one extra soul! The Devil will be pleased, I can already taste the freedom.\"");
        pauseObject.pause();

        //When the brothers go meet the devil
        System.out.println("________              .__.__/\\         _________               .__               ");
        System.out.println("\\______ \\   _______  _|__|  )/  ______ \\_   ___ \\_____    _____|__| ____   ____  ");
        System.out.println(" |    |  \\_/ __ \\  \\/ /  |  |  /  ___/ /    \\  \\/\\__  \\  /  ___/  |/    \\ /  _ \\ ");
        System.out.println(" |    `   \\  ___/\\   /|  |  |__\\___ \\  \\     \\____/ __ \\_\\___ \\|  |   |  (  <_> )");
        System.out.println("/_______  /\\___  >\\_/ |__|____/____  >  \\______  (____  /____  >__|___|  /\\____/ ");
        System.out.println("       \\/     \\/                  \\/          \\/     \\/     \\/        \\/        ");
        pauseObject.pause();
        System.out.println("Cuphead: \"Devil we got all 4 of the souls that you requested.\"");
        pauseObject.pause();
        System.out.println("Devil: \"That's great, I see you also got the soul of that pesky King Dice. I always hated him, and to give you boys one final challenge I sent him out to get you.\""); 
        pauseObject.pause();
        System.out.println("Cuphead: \"Well we won and have brought you the souls.\"");
        pauseObject.pause();
        System.out.println("Mugman: \"Ar-Ar-Are we free to go now?\"");
        pauseObject.pause();
        System.out.println("Devil: \"Hmmmm, let me think about that. No, while you are here I’m going to take the souls you collected, and yours too.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"What? That's not fair.\"");
        pauseObject.pause();
        System.out.println("Devil: \"You know what, just to make it a fair deal. If you hand over your souls you can serve me and have access to all the riches.\""); 
        pauseObject.pause();
        System.out.println("Mugman: \"Cuphead please think about this carefully. Do not make anymore impulsive decisions like you have previously. Don't get the greed get to u.\"");
        pauseObject.pause();
        System.out.println("Devil: \"So what will it be boys?\"");
        pauseObject.pause();

        //asking if the brothers will join the devil
        char join = IBIO.inputChar("Would you like to join the devil or not?: (y/n) ");

        //if they say yes
        if(join == 'y'){
            System.out.println("Devil: \"Good to hear, now hand over the souls.\"");
            pauseObject.pause();
            System.out.println("You have joined the Devil and are his servant forever.\"");
            System.exit(0);
        }

        //if they say no
        else
        System.out.println("Devil: \"Wrong choice boys. I’m going to take them anyways. Just to make it fair and the recognize your confidence, how about we play a game. Winner gets the losers soul.\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"You’re on!\"");
        pauseObject.pause();
        System.out.println("Devil: \"The game we are going to play is Black Jack. Are you ready?\"");
        pauseObject.pause();
        System.out.println("Cuphead: \"All right let's go!\"");
        pauseObject.pause();
        System.out.println("Devil: \"Very well, before we start I just want to let you know I've never lost.\"");
        pauseObject.pause();
        System.out.println("Mugman: \"Oh No.\"");
        
        //calling the blackjack class
        jackObject.blackjack();
        
        //if player wins
        if(rpg.pass == 1){
            System.out.println("Devil: \"IMPOSSIBLE. How can some puny mortal beat me at my own game. I even rigged it into my favour.\"");
            pauseObject.pause();
            System.out.println("Cuphead: \"HAHAHA I am victorious, and before we take your soul, we will release all the souls that we collected before.\"");
            pauseObject.pause();
            System.out.println("*Cuphead rips all the contracts*");
            pauseObject.pause();
            System.out.println("All past characters: \"Thank you for freeing us! We will forever be at your side.\"");
            pauseObject.pause();
            System.out.println("Devil: \"NOOOOOO why would you do this, you traitors. Wait my soul where is my soul.\"");
            pauseObject.pause();
            System.out.println("Cuphead: \"Right here loser HAHAHA!\"");
            pauseObject.pause();
            System.out.println("Old Kettle: \"Well done boys I knew you would come to your senses. You have grown very powerful over the past 24 hours. Now remember, with great power comes great responsibility.\""); 
            pauseObject.pause();
            System.out.println("Cuphead and Mugman: \"I understand.\"");
            pauseObject.pause();
            System.out.println("Cuphead: \"Now with The Devil gone the world can now revert into its peaceful state and we can all have a happy life.\"");
            pauseObject.pause();
            System.out.println("__   __            _    _ _       ");
            System.out.println("\\ \\ / /           | |  | (_)      ");
            System.out.println(" \\ V /___  _   _  | |  | |_ _ __  ");
            System.out.println("  \\ // _ \\| | | | | |/\\| | | '_ \\ ");
            System.out.println("  | | (_) | |_| | \\  /\\  / | | | |");
            System.out.println("  \\_/\\___/ \\__,_|  \\/  \\/|_|_| |_|");
            pass = 1;
        }
        
        //if player loses
        else{
            while(pass != 1){
                System.out.println("The Devil: \"HAHAHA incorrect! Thanks for the souls boys!.\"");
                pauseObject.pause();
                restart = IBIO.inputChar("\n\nWouild you like to restart? (y/n) ");
                if(restart == 'y'){
                    jackObject.blackjack();
                }
                else{
                    System.out.println(" _____                        _____");               
                    System.out.println("|  __ \\                      |  _  |");                
                    System.out.println("| |  \\/ __ _ _ __ ___   ___  | | | |_   _____ _ __ "); 
                    System.out.println("| | __ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|"); 
                    System.out.println("| |_\\ \\ (_| | | | | | |  __/ \\ \\_/ /\\ V /  __/ |   "); 
                    System.out.println("\\____/\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_| "); 
                    System.exit(0);
                    break;
                }
            }
        }
    }

    //printing the contacts BTS
    public String contract(String name){
        int length = name.length();
        System.out.println(" .-.---------------------------------.-.");
        System.out.println("((o))                                   )");
        System.out.println(" \\U/_______          _____         ____/");
        System.out.println("   |                                  |");
        System.out.println("   |                                  |");
        System.out.println("   |                                  |");
        System.out.println("   |        THIS IS THE SOUL OF       |");
        System.out.println("   |                                  |");
        System.out.println("   |                                  |");
        System.out.print("   |");
        //made to find the right spacing and the name of the boss just defeated
        for(int i=1 ; i<=(34-length)/2 ; i++){
            System.out.print(" ");
        }
        System.out.print(name);
        for(int i=1 ; i<=(34-length)/2 ; i++){
            System.out.print(" ");
        }
        System.out.println(" |");
        System.out.println("   |                                  |");
        System.out.println("   |                                  |");
        System.out.println("   |                                  |");
        System.out.println("   |                                  |");
        System.out.println("   |____    _______    __  ____    ___|");
        System.out.println(" /A\\                                  \\");
        System.out.println("((o))                                  )");
        System.out.println(" '-'----------------------------------'");
        return contract;
    }
}
