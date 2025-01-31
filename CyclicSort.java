public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,3,4,2,1};
        cyclic(arr);


    }
    public static void cyclic(int[] arr){
        int i = 0;

        while( i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] == (i+1)){
                i++;
            }
            else{
                int temp;
                temp = arr[i];
                arr[i]= arr[correct];
                arr[correct]=temp;
              //  i++; you dont need to increment here i guess coz if its at right position in next iteration the if statement will take care of incrementing
            }
        }
        for (int x : arr) {
            System.out.print(x);
        }
    }
}

