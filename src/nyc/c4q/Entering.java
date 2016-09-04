package nyc.c4q;

import java.util.Scanner;

public class Entering {
    String leftOrRight;
    boolean direction = false;

    public void prompt(String line) {
        System.out.println(line);
    }

    public void directionInput(){
        do{
        Scanner scanner = new Scanner(System.in);
        leftOrRight = scanner.nextLine();
        leftOrRight = leftOrRight.toUpperCase();
            if (leftOrRight.equals("R")) {
                System.out.print("You go right.");
                break;
            } else if (leftOrRight.equals("L")) {
                System.out.println("You go left.");
                break;
            } else {
                System.out.println("There is no turning back now. Pick a direction.");
                direction = true;
            }

        }while (direction);

    }


    public String enteringCheck() {
        boolean enter = false;
        int wrongAnswer = 0;
            do {
                Scanner check = new Scanner(System.in);
                String entering = check.next();
                String input = entering.toLowerCase();
                if (input.equals("door")) {
                    System.out.print("You try going through the front door.  It's locked and door doesn't budge. \n");
                    enter = true;
                } else if (input.equals("window")) {
                    System.out.println("You climbed up the window, it wasn't pretty but you made it in.");
                    break;
                } else {
                    for(int i = 0; i < 1; i++){
                        wrongAnswer++;
                    }
                    System.out.println("That is not a way in.");
                    enter = true;
                    if(wrongAnswer >= 3){
                        System.out.println("Perhaps try the window...");
                    }
                }

        }while (enter);

        return null;
    }

}


//        for(int i = 0; i <= leftOrRight.charAt(0); i++){


//            if(leftOrRight.equals("R")){
//                System.out.println("You go right.");
//                break;
//            }else if(leftOrRight.equals("L")){
//                System.out.println("You go left.");
//                break;
//            }else{
//                System.out.println("Choose a valid direction.");
//                leftOrRight = scanner.next();
//
//            }
//        }