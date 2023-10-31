public class SprialMatrix {
    
   
    public static void sprialmatrixx(int arr[][]){
        
        int row= 0;
        int col= 0;
        int endrow= arr.length-1;
        int endcol= arr[0].length-1;

        while(row<= endrow && col<= endcol){

            for(int i=col; i<= endcol; i++){
                System.out.print(arr[row][i]+" ");
            }

            for(int i= row+1; i<= endrow; i++){
                System.out.print(arr[i][endcol]+" ");
            }


            for(int i=endcol-1; i>= col; i--){
                System.out.print(arr[endrow][i]+" ");
            }

            for(int i= endrow-1; i>= row; i--){
                System.out.print(arr[i][col]+" ");
            }

            row++;
            col++;
            endrow--;
            endcol--;

        }

    }
    
    public static void main(String args[]){
        int arr[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

      

        sprialmatrixx(arr);
        
    }
}
