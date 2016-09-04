package nyc.c4q;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Entering enter = new Entering();


        enter.prompt("It is a quiet night, you stare at the decrepit mansion in front of you. " +
                "\nAll your research lead you believe this was the home of the infamous serial killer Buttercup from the 1970s." +
                "\nNow all you need is some solid evidence to back your theory.  From here you see two points to entry");
        enter.prompt("Would you like to enter through the door or window?");
        enter.enteringCheck();
        enter.prompt("With your flickering flashlight in hand you examine the hallway. Instant regret... It smells like mildrew" +
                "\nand there are things creaking around you.  Alrighty all creepy mansions have a creepy cellar where they hide stuff right?" +
                "\nLet's find a way down. Do you want to go left or right? Please enter L or R");
        enter.directionInput();
        enter.prompt("\nYou reached a door. You reach for the handle but hesitate a moment.  Open the door or continue to round the corner down the hall?");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        userInput = userInput.toLowerCase();
        if(userInput.equals("door") || userInput.equals("open") || userInput.equals("enter") ||userInput.equals("open the door") || userInput.equals("open door")){
            enter.prompt("You slowly open the door and peek inside, you walk in and whisper 'hello?' biting your lip for your stupidity" +
                    "\nwho did you expect to respond back!? You stride inside and admire the vast room, you notice a second door from the opposite hallway and " +
                    "\nanother located in the center. As you examine the shelves of books lining the walls you find a photo of of a physican with some sickly looking children." +
                    "\nTake a quick picture of it... perhaps you will instagram this later? You rummage through the sole desk and find some medical records... if they had HIPPA regulations then" +
                    "\nthis guy would be violating all of them!  There was nothing notable about their health records except for O- blood type, perhaps that is how they are sorted? You put the " +
                    "\ncontents back and make your way towards the center door until you notice a knife on the floor. Pick-up? Y or N.");
            String knifePickUp = scanner.next();
            knifePickUp = knifePickUp.toUpperCase();
                if(knifePickUp.equals("Y")){
                    enter.prompt("You grab the knife and cut yourself as you see a giant rat jump out from the shadows.  You hastily put the knife on your belt and make a bolt for the door. " +
                            "\nGet away from monstrous rat first, worry about tetanus later.");
                }else{
                    enter.prompt("As you stare at the knife a giant rat jumps out on to the knife.  There is no way you are touching that now! You make a break to the door away from the monstrous rodent.");
                }
        }else{
            enter.prompt("You continue down the path of the hall noting the scattered children's toys and portraits of frail child.  " +
                    "\nThe creaking of the floors and rattling of the windows are startling you.");
        }

        enter.prompt("Alias the stairs! And in a creepy mansion fashion there is yet another portrait of the sickly child. You have reached a landing, do you want to explore or continue down the stairs?");
        Floor choice = new Floor();
        choice.exitOrContinue();
        enter.prompt("Creepy cellar check, unknown noise check, questioning life choices check.  You made it this far...  There is a strong smell of formaldehyde mixed with rot.  There are rows of medical equipment and supplies laying about." +
                "\nYou take pictures of the numerous of xrays along the walls, more charts.  Under a pile of some paper you find a journal.  Do you want to read the journal? Y or N");
        choice.readJournalOrNot();
        enter.prompt("Do you want to venture deeper into the cellar or leave?");
        choice.ventureFurther();
        enter.prompt("You turn in what you found to the authorities and closed this case\nThank you for playing.");
    }

//    public static String doorOrContinue() {
//        boolean choice = false;
//        String enterDoorOrCont;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            enterDoorOrCont = scanner.nextLine();
//            enterDoorOrCont = enterDoorOrCont.toLowerCase();
//            if (enterDoorOrCont.equals("door") || enterDoorOrCont.equals("open")) {
////                System.out.print("");
//                break;
//            } else if (enterDoorOrCont.equals("continue") || enterDoorOrCont.equals("go")) {
////                System.out.println("");
//                break;
//            } else {
//                System.out.println("There is no turning back now. Pick a direction.");
//                choice = true;
//            }
//
//        } while (choice);
//        return enterDoorOrCont;
//    }


}