package nyc.c4q;

import java.util.Scanner;


public class Floor {
    Scanner scanner = new Scanner(System.in);

    public void exitOrContinue(){
        String exploreOrNot = scanner.nextLine();
        exploreOrNot = exploreOrNot.toLowerCase();
            if (exploreOrNot.equals("explore") || exploreOrNot.equals("exit") || exploreOrNot.equals("yes")) {
                System.out.print("Let's see if we can find more clues here brave warrior.  You step out and spot some Reese's peanut buttercup wrappers on the floor." +
                        "\nThat is now he got the infamous nickname 'Buttercup' you sigh.  His MO was to leave the candy bar next to the victims, now to think of it..." +
                        "\nPerhaps you can track down his candy purchase history...ha...  You look inside an old dresser there was a clipping of an article about illegal organ harvesting in thrid world countries." +
                        "\nThere is not much here. Lets head down.\n");
            } else if (exploreOrNot.equals("continue") || exploreOrNot.equals("down")) {
                System.out.println("No distractions for you! Anxious to get to the cellar as quickly as you can and as far away you can get from these giant rodents.");

            } else {
                System.out.println("Well lets head to the cellar and get this over with.");
            }
    }

    public void readJournalOrNot(){
        String readJournal = scanner.nextLine();
        readJournal = readJournal.toUpperCase();
        if(readJournal.equals("Y") || readJournal.equals("YES")){
            System.out.println("Written by a grieving father with sickly children. He had lost two children already and refused to lose a third.  Despite the oath he took when he became a physician, he decided" +
                    "\nhe will leave no stone unturned for his remaining daughter.  He stole hospital records to track down victims with matching blood types and conducted test treatments on them. " +
                    "\nwhen the test subjects inevitably died he made sure their bodies were discovered to be returned their families.  Nothing else is written regards to the physician and his daughter");
    }else{
        System.out.println("Lets keep this to examine later.");
    }

    }

    public void ventureFurther(){
        String venture = scanner.nextLine();
        venture = venture.toLowerCase();
        if(venture.equals("venture deeper") || venture.equals("venture") || venture.equals("deeper") || venture.equals("go")){
            System.out.println("You enter deeper into the cellar.  There is more equipment and books, you turn the corner and you set your eyes on two skeletons.  One significantly larger embracing the smaller with a gun inches away." +
                    "\nYou turn back unable to bear the sight and leave the mansion.");
        }else{
            System.out.println("You turn back and leave the mansion with journal in hand.");
        }
    }
}
