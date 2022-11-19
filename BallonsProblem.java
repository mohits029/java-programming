import java.util.Scanner;


public class BallonsProblem {


    public static float greenFirstPurpleSecond(boolean prize_report[],float const_of_green_ballon, float const_of_purple_ballon){

        int countGreen=0;
        int countPurple=0;

        for (int i=0; i<prize_report.length; i+=2){
            if(prize_report[i]==true){
                countGreen+=1;
            }
        }

        for (int i=1; i<prize_report.length; i+=2){
            if(prize_report[i]==true){
                countPurple+=1;

            }
            
        }
        
        float totalCost= (countGreen*const_of_green_ballon) + (countPurple* const_of_purple_ballon);
        return totalCost;
    }



    public static float purpleFirstGreenSecond(boolean prize_report[],float const_of_green_ballon, float const_of_purple_ballon){

        int countPurple=0;
        int countGreen=0;

        for (int i=0; i<prize_report.length; i+=2){
            if(prize_report[i]==true){
                countPurple+=1;
            }
        }

        for (int i=1; i<prize_report.length; i+=2){
            if(prize_report[i]==true){
                countGreen+=1;

            }
            
        }
        
        float totalCost= (countGreen*const_of_green_ballon) + (countPurple* const_of_purple_ballon);
        return totalCost;
    }



    // this is main function
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter cost of Green Ballon: ");
        float const_of_green_ballon = scan.nextFloat();

        System.out.print("Enter cost of Purple Ballon: ");
        float const_of_purple_ballon= scan.nextFloat();

        System.out.print("Enter Number of Participants: ");
        int number_of_participants= scan.nextInt();

        boolean[] prize_report= new boolean[number_of_participants*2];


        System.out.println("Enter '1' for WIN, '0' for LOSE:");
        int temp=1;

        for(int i=0; i<prize_report.length; i+=2){
            System.out.println("Participant: "+ temp +"\n");


            System.out.print("Problem 1: ");
            int booleanVal1= scan.nextInt();
            if(booleanVal1==1){
                prize_report[i]= true;
            }
            else{
                prize_report[i]= false;
            }



            System.out.print("Problem 2: ");
            int booleanVal2= scan.nextInt();
            if(booleanVal2==1){
                prize_report[i+1]= true;
            }
            else{
                prize_report[i+1]= false;
            }

            temp++;
        }


        for( int i=0; i<prize_report.length; i+=2){
            System.out.print(prize_report[i]+ "\t");
            System.out.print(prize_report[i+1]+ "\n");

        }


        // If green for First and Purple for Second Prize
        float cost1= greenFirstPurpleSecond(prize_report, const_of_green_ballon, const_of_purple_ballon);


        // If Purple First and green Second
        float cost2= purpleFirstGreenSecond(prize_report, const_of_green_ballon, const_of_purple_ballon);


        if(cost1>cost2){
            System.out.println("The minimum cost is :"+cost2);
            System.out.println("For Purple 1st prize and Green 2nd prize");
        }

        else{
            System.out.println("The minimum cost is :"+ cost1);
            System.out.println("For Green 1st and Purple 2nd Prize");
        }

        
    }
    
}
