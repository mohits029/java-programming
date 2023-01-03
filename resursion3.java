public class resursion3 {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            int x= sum(n-1)+n;
            return x;
        }
    }
    public static void main(String args[]){
        int n= 6;
        int x= sum(n);
        System.out.println(x);
    }
}
