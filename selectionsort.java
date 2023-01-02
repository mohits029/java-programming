public class selectionsort {
    public static void main(String args[]){
        int arr[]= {13,4,2,4,23,25,1,9};
        
        for(int i=0; i<arr.length; i++){
            int min= i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[j]< arr[min]){
                    min= j;
                }
            }

            int temp= arr[i];
            arr[i]= arr[min];
            arr[min]= temp;
        }

        for (int x: arr){
            System.out.println(x);
        }
    }
}
