import java.util.Scanner;
public class Array01 {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int x[]= new int[5];
        for(int i=0; i<x.length; i++){
            System.out.print("Enter value at "+i+ ":");
            x[i]= scan.nextInt();
        }

        System.out.print("Unshorted Array: ");
        for(int i=0; i<x.length; i++){
            System.out.print(x[i]+ "\t");
        }
        System.out.println("");


        // Bubble shorting
        for(int i=0; i<x.length; i++){
           for(int j=0; j<x.length; j++){
            if(x[i] < x[j]){
                int temp= x[j];
                x[j]= x[i];
                x[i]= temp;
            }
            
           }
        }
        System.out.print("Shorted Array: ");
        for(int i=0; i<x.length; i++){

            System.out.print(x[i] + "\t");
        }

    }
    
}
