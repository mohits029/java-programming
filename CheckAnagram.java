import java.util.Arrays;
public class CheckAnagram {
    public static void main(String args[]){
        String str1= "racE";
        String str2= "cAe";

        str1= str1.toLowerCase();
        str2= str2.toLowerCase();

        char str1charArray[]= str1.toCharArray();
        char str2charArray[]= str2.toCharArray();

        Arrays.sort(str1charArray);
        Arrays.sort(str2charArray);

        if(Arrays.equals(str1charArray, str2charArray)){
            System.out.println("Strings are Anagram");
        }else{
            System.out.println("Strings are not Anagram");
        }

    }
}
