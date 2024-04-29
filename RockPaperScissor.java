import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("0 is for Rock");
        System.out.println("1 is for Paper");
        System.out.println("2 is for Scissor");

        int computer_choice;
        int computerwon = 0;
        int my_choice;
        int me = 0;

        int game = 1;

        while (game <= 5) {
            Random rand = new Random();
            computer_choice = rand.nextInt(2);
            System.out.print("Enter your choice: ");
            my_choice = sc.nextInt();

            switch (my_choice) {
                case 0:
                    System.out.println("You choose Rock");
                    break;
                case 1:
                    System.out.println("You choose Paper");
                    break;
                case 2:
                    System.out.println("You choose Scissor");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                    continue;
            }
            switch (computer_choice) {
                case 0:
                    System.out.println("Computer choose Rock");
                    break;
                case 1:
                    System.out.println("Computer choose Paper");
                    break;
                case 2:
                    System.out.println("Computer choose Scissor");
                    break;
            }
            if (computer_choice == my_choice) {
                System.out.println("It's a tie!");
            } else if (computer_choice == 0 && my_choice == 1) {
                System.out.println("You won!!");
                me++;
            } else if (computer_choice == 0 && my_choice == 2) {
                System.out.println("Computer won!!");
                computerwon++;
            } else if (computer_choice == 1 && my_choice == 0) {
                System.out.println("Computer won!!");
                computerwon++;
            } else if (computer_choice == 1 && my_choice == 2) {
                System.out.println("You won!!");
                me++;
            } else if (computer_choice == 2 && my_choice == 0) {
                System.out.println("You won!!");
                me++;
            } else if (computer_choice == 2 && my_choice == 1) {
                System.out.println("Computer won!!");
                computerwon++;
            }
            if (game == 5) {
                break;
            }
            game++;
        }
        System.out.println("------------------------------------");
        System.out.println("Computer" + " :" + computerwon);
        System.out.println("Me" + " :" + me);

        if (computerwon > me) {
            System.out.println("Computer won the game!!");
        } else if (computerwon == me) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("You won the game!");
        }
    }
}