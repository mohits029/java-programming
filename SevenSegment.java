import java.util.Scanner;

public class SevenSegment {

    public static int largestSevenSegment(int matchstickCount){
        int sevenSegment=0;

        if(matchstickCount%2==0){
            while(matchstickCount!=0){
                sevenSegment= sevenSegment*10 +1;
                matchstickCount-=2;
            }
        
        }
        else if(matchstickCount<3){
            sevenSegment= 0;
        }
        else if(matchstickCount==3){
            sevenSegment= 7;
        }

        else{
            matchstickCount= matchstickCount-3;
            sevenSegment= sevenSegment*10 +7;
            while(matchstickCount!=0){
                sevenSegment= sevenSegment*10 +1;
                matchstickCount-=2;
            }
            
            
        }
        return sevenSegment;
    }


    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        int cycle= scan.nextInt();
        while(cycle!=0){

        int matchstick[]= {6,2,5,5,4,5,6,3,7,6};
        
        System.out.print("Enter integer: ");
        int n= scan.nextInt();
        int matchstickCount=0;
        if(n==0){
            matchstickCount+= matchstick[0];
        }
        while(n!=0){
            int x= n%10;
            matchstickCount+= matchstick[x];
            n= n/10;
        }
        
        int x= largestSevenSegment(matchstickCount);
        System.out.println(x);
    }
    }
}
