import java.util.Random;
import java.util.Scanner;
                                                           
class Game{
    int number;
    public Game(){
        Random rand = new Random();
        number = rand.nextInt(100);                                                   
        System.out.println("Guess the Number Form  1 to 100");
    }
    public int compNo(){
        return number;
    }
}
public class GuessTheNumber {
    static int takeUserInput(){
        int user;
        System.out.println("Enter ");
        Scanner sc= new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("Correct guess!");
        }
        else if(i>j){
            System.out.println("Your guess is bigger than the computer's number.");
        }
        else {
            System.out.println("Your guess is smaller than the computer's number.");
        }
    }
    public static void main(String[] args) {
        int user=0,number=0,iteration=0;
        Game g = new Game();
        do {
            user = takeUserInput();
            number = g.compNo();

            isCorrectNumber(user, number);
            iteration++;
        }while (user!=number);
        System.out.println("Congratulations!! You guessed the number in "+ iteration+" iterations.");

    }
}