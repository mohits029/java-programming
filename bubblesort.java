public class bubblesort {
    public static void main(String args[]){
        int arr[]= {12,1,2,54,3,20};
        for(int i=0; i<arr.length; i++){
            for (int j=1; j<arr.length-i; j++){

                if(arr[j-1]>arr[j]){
                    int temp= arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]= temp;
                }
            }
        }

        for(int x: arr){
            System.out.println(x);
        }
    }
}
