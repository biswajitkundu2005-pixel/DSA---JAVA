public class Binary_Search {
    public static void main(String[] args) {
        
        int[] arr = {2, 4, 6, 8, 10, 15, 49, 85, 99};
        int ans = BS(arr, 10);
        System.out.println(ans);

    }

    static int BS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (arr[start] <= arr[end]) {

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) 
            {
                end = mid - 1;
            }

            else if(target > arr[mid]){
                start = mid + 1;
            }

            else
            {
                return mid;
            }
        }
        return -1;
    }
}
