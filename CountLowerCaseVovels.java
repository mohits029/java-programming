import java.util.Scanner;
public class CountLowerCaseVovels {
    public static void main(String args[]){
        //Create scanner object
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a String: ");
        String st= scan.nextLine();
        int count= 0;

        for(int i=0; i< st.length(); i++){
            if(st.charAt(i)== 'a' || st.charAt(i)== 'e' || st.charAt(i)== 'i' || st.charAt(i)== 'o' || st.charAt(i)== 'u'){
                count++;
            }
        }

        System.out.println(count);
    }
}
