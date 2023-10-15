class Abc{

    public static int BinarySearch(int arr[], int key){
        int left= 0;
        int right= arr.length-1;

        while(left<= right){
            int mid= (left+right)/2;
            if(arr[mid]== key){
                return mid;
            }
            else if(key< arr[mid]){
                right= mid-1;
            }
            else{
                left= mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]= {1,3,5,7,9,10,11,14,34,66};
        int n= 14;
        int x= BinarySearch(arr, n);
        System.out.println(x);
    }
}