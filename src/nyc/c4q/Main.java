package nyc.c4q;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Entering enter = new Entering();
        Floor floor = new Floor();
        Boolean play = true;

        while (play) {

            enter.prompt("It is a quiet night, you stare at the decrepit mansion in front of you. " +
                    "\nAll your research lead you believe this was the home of the infamous serial killer Buttercup from the 1970s." +
                    "\nNow all you need is some solid evidence to back your theory.  From here you see two points to entry.");

            enter.prompt("Would you like to enter through the door or window?");

            enter.enteringCheck();

            enter.prompt("With your flickering flashlight in hand you examine the hallway. Instant regret... It smells like mildrew" +
                    "\nand there are things creaking around you.  Alrighty all creepy mansions have a creepy cellar where they hide stuff right?" +
                    "\nLet's find a way down. Do you want to go left or right? Please enter L or R");

            enter.directionInput();

            enter.prompt("\nYou reached a door. You reach for the handle but hesitate a moment.  Open the door or continue to round the corner down the hall?");


            floor.enterRoom();

            enter.prompt("Alias the stairs! And in a creepy mansion fashion there is yet another portrait of the sickly child. You have reached a landing, do you want to explore or continue down the stairs?");

            floor.exitOrContinue();

            enter.prompt("Creepy cellar check, unknown noise check, questioning life choices check.  You made it this far...  There is a strong smell of formaldehyde mixed with rot.  There are rows of medical equipment and supplies laying about." +
                    "\nYou take pictures of the numerous of xrays along the walls, more charts.  Under a pile of some paper you find a journal.  Do you want to read the journal? Y or N");

            floor.readJournalOrNot();

            enter.prompt("Do you want to venture deeper into the cellar or leave?");

            floor.ventureFurther();

            enter.prompt("You turn in what you found to the authorities and closed this case\nThank you for playing.");

            enter.prompt("Do you want to play again?");

            String playAgain = enter.scanAnswer();
            if(playAgain.equals("no") || playAgain.equals("n")){
                play = false;
                break;
            }
        }

    }

}