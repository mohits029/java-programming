public class recursion2 {

    public static int number(int n){

        if(n==0){
            return n;
        }
        int x= number(n-1);
        System.out.println(x+1);
        return n;
    }
    public static void main(String args[]){
        int n=5;
        int t= number(n);
    }
}
