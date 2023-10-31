import java.util.Scanner;
public class hello {
    public static void main(String arga[]){
        Scanner scan= new Scanner(System.in);
        int n, sum=0, r, temp;

        System.out.print("Enter a number: ");
        n= scan.nextInt();

        for(temp=n; n!=0; n= n/10){
            r= n%10;
            sum= sum*10+r;
        }

        if(temp== sum){
            System.out.println("Plaindrome");
        }
        else{
            System.out.println("Non plaindrom");
        }


    }
}
