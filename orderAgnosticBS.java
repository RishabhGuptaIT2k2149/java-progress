public class orderAgnosticBS {
    public static void main(String[] args) {
       // int[] arr = {99, 89, 5, 4, 3, 2};
        int[] arr = {1,2,3,4,5,6};
        int target = 5;

        int ans = orderagnostic(arr,target);
        System.out.println(ans);
;    }
         static int orderagnostic(int[] arr,int target)
        {

            int start = 0;
            int end = arr.length - 1;
            boolean isAsc = arr[start] < arr[end];
//        System.out.println(isAsc);            // i was confused on how this will let a descending order array enter the while loop but then again start and end are the index not the actual array elements so it does not matter if the elements of array are ascending or descending this condition will always be true
        while (start <= end) {
           int mid = start + (end-start/2);
           if (arr[mid] == target){
               return mid;
           }
            else if (isAsc){
            if (arr[mid]<target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
           }else{
                if(arr[mid]<target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
           }

           }
        return -1;
        }
    }

