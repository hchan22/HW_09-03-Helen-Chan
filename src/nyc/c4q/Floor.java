package nyc.c4q;

import java.util.Scanner;


public class Floor extends Entering{

    public void exitOrContinue(){

        String exploreOrNot = scanAnswer();
            if (exploreOrNot.equals("explore") || exploreOrNot.equals("exit") || exploreOrNot.equals("yes")) {
                prompt("Let's see if we can find more clues here brave warrior.  You step out and spot some Reese's peanut buttercup wrappers on the floor." +
                        "\nThat is now he got the infamous nickname 'Buttercup' you sigh.  His MO was to leave the candy bar next to the victims, now to think of it..." +
                        "\nPerhaps you can track down his candy purchase history...ha...  You look inside an old dresser there was a clipping of an article about illegal organ harvesting in thrid world countries." +
                        "\nThere is not much here. Lets head down.\n");
            } else if (exploreOrNot.equals("continue") || exploreOrNot.equals("down")) {
                prompt("No distractions for you! Anxious to get to the cellar as quickly as you can and as far away you can get from these giant rodents.");

            } else {
                prompt("Well lets head to the cellar and get this over with.");
            }
    }
    public void enterRoom() {

        String userInput = scanAnswer();
        if (userInput.equals("door") || userInput.equals("open") || userInput.equals("enter") || userInput.equals("open the door") || userInput.equals("open door")) {
            prompt("You slowly open the door and peek inside, you walk in and whisper 'hello?' biting your lip for your stupidity" +
                    "\nwho did you expect to respond back!? You stride inside and admire the vast room, you notice a second door from the opposite hallway and " +
                    "\nanother located in the center. As you examine the shelves of books lining the walls you find a photo of of a physican with some sickly looking children." +
                    "\nTake a quick picture of it... perhaps you will instagram this later? You rummage through the sole desk and find some medical records... if they had HIPPA regulations then" +
                    "\nthis guy would be violating all of them!  There was nothing notable about their health records except for O- blood type, perhaps that is how they are sorted? You put the " +
                    "\ncontents back and make your way towards the center door until you notice a knife on the floor. Pick-up? Y or N.");
            String knifePickUp = scanAnswer();
            knifePickUp = knifePickUp.toUpperCase();
            if (knifePickUp.equals("Y")) {
                prompt("You grab the knife and cut yourself as you see a giant rat jump out from the shadows.  You hastily put the knife on your belt and make a bolt for the door. " +
                        "\nGet away from monstrous rat first, worry about tetanus later.");
            } else {
                prompt("As you stare at the knife a giant rat jumps out on to the knife.  There is no way you are touching that now! You make a break to the door away from the monstrous rodent.");
            }
        } else {
            prompt("You continue down the path of the hall noting the scattered children's toys and portraits of frail child.  " +
                    "\nThe creaking of the floors and rattling of the windows are startling you.");
        }
    }

    public void readJournalOrNot(){
        String readJournal = scanAnswer();
        readJournal = readJournal.toUpperCase();
        if(readJournal.equals("Y") || readJournal.equals("YES")){
            prompt("Written by a grieving father with sickly children. He had lost two children already and refused to lose a third.  Despite the oath he took when he became a physician, he decided" +
                    "\nhe will leave no stone unturned for his remaining daughter.  He stole hospital records to track down victims with matching blood types and conducted test treatments on them. " +
                    "\nwhen the test subjects inevitably died he made sure their bodies were discovered to be returned their families.  Nothing else is written regards to the physician and his daughter");
    }else{
        prompt("Lets keep this to examine later.");
    }

    }

    public void ventureFurther(){
        String venture = scanAnswer();
        if(venture.equals("venture deeper") || venture.equals("venture") || venture.equals("deeper") || venture.equals("go") ||venture.equals("cellar")){
            prompt("You enter deeper into the cellar.  There is more equipment and books, you turn the corner and you set your eyes on two skeletons.  One significantly larger embracing the smaller with a gun inches away." +
                    "\nYou turn back unable to bear the sight and leave the mansion.");
        }else{
            prompt("You turn back and leave the mansion with journal in hand.");
        }
    }
}
