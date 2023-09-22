import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Store {
    public static void main(String[] args) {
        //Computer c1 = new Computer("Apple", "MacPro", 3000);
        //c1.displayComputer(c1);
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to Pargol Computer Store!");
        int maxComputers = 0;
        final String password = "password";
        int inputCount = 0;

        while (maxComputers < 1) {
            System.out.println("Please enter the maximum amount of computers your store can contain: ");
            maxComputers = kb.nextInt();
            if (maxComputers < 1) {
                System.out.println("Invalid, your inventory should be positive");
            }
        }
        Computer[] inventory = new Computer[maxComputers];

        do {
            //menu
            System.out.println("What do you want to do ?\n" +
                    "1.\tEnter new computers (password required)\n" +
                    "2.\tChange information of a computer (password required)\n" +
                    "3.\tDisplay all computers by a specific brand\n" +
                    "4.\tDisplay all computers under a certain a price.\n" +
                    "5.\tQuit\n");
            int choiceMenu = kb.nextInt();

            switch (choiceMenu) {
                //careful as not entering the number first shows an error, at the password prompt, to fix
                case 1:
                    String userPassword;
                    do {
                        System.out.println("Please enter your password: " + "You have " + (3 - inputCount) + " tries remaining.");
                        userPassword = kb.next();
                        inputCount++;
                    } while (inputCount < 3);
                    if (userPassword.equals(password)) {
                        System.out.println("How many computers would you like to add?");
                        int numOfComputers = kb.nextInt();
                        if (numOfComputers > inventory.length){

                        }


                    } else {
                        System.out.println("wrong password, please try again!");
                        inputCount++;
                        if (inputCount >= 3) {
                            System.out.println("You have no more tries, back to the main menu");
                            break;
                        }

                    }
                    break;

            }


        } while (true);

    }
}