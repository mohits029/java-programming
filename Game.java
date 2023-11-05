import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String args[]){
        Random rand= new Random();
        int rand_num= rand.nextInt(10);
        Scanner sc= new Scanner(System.in);
        int attempt=3;

        System.out.println("*******Enter a number between 1 to 10 ********");
        System.out.print("Enter number: ");

        while(true){
            int temp_num= sc.nextInt();

            if(temp_num== rand_num){
                System.out.print("Wohoo!!! you win Let'Party");
                break;
            }
            
            else{
                if(temp_num> rand_num){
                    System.out.println("oh'ho the number is smaller than "+temp_num);
                }else{
                    System.out.println("oh'ho the number is grater than "+temp_num);
                }
                
                System.out.print("Try again: ");
            }
            attempt--;
        }
    }
}
