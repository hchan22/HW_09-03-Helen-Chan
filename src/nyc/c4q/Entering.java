package nyc.c4q;

import java.util.Scanner;

public class Entering {
    String leftOrRight;
    boolean direction = false;

    public void prompt(String line) {

        System.out.println(line);
    }

    public String scanAnswer(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toLowerCase();
        return input;
    }

    public void directionInput(){
        do{
        leftOrRight = scanAnswer();
            if (leftOrRight.equals("r")) {
                prompt("You go right.");
                break;
            } else if (leftOrRight.equals("l")) {
                prompt("You go left.");
                break;
            } else {
                prompt("There is no turning back now. Pick a direction.");
                direction = true;
            }

        }while (direction);

    }


    public String enteringCheck() {
        boolean enter = false;
        int door = 0;
        int wrongAnswer = 0;
        String check;

            do {
                String entering = scanAnswer();
                if (entering.equals("door")) {
                    prompt("You try going through the front door.  It's locked and door doesn't budge.");
                    enter = true;
                } else if (entering.equals("window")) {
                    prompt("You climbed up the window, it wasn't pretty but you made it in.");
                    break;
                } else {
                    for(int i = 0; i < 1; i++){
                        wrongAnswer++;
                    }
                    prompt("That is not a way in.");
                    enter = true;
                    if(wrongAnswer >= 3){
                        prompt("Perhaps try the window...");
                    }
                }

        }while (enter);

        return null;
    }

}





//                    for(int i= 0; i < 1; i++){
//                        door++;
//                    }
//                    if(door >= 3){
//                        prompt("You pull with all your strength, the handle breaks and you go flying backwards. You get up in immense pain." +
//                                " Do you want to try entering through the window? Enter: Y or N.");
//                        check = scanAnswer();
//                        if(check.equals("y") ||check.equals("yes")){
//                            prompt("You try your best but in your injured state you fail to climb in.  You waddle your way back to your car in shame.");
//
//                        }else{
//                            prompt("You give up and fail as an investigative reporter");
//                            break;
//                        }
//                    }