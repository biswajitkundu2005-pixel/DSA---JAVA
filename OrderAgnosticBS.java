public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {-18,-15,1,6,7,9,22};
        int[] arr = { 99, 80, 75, 22, 11, 10, 5, 2, -3 };
        int ans = OrderAgnosticBS(arr, 22);
        System.out.println(ans);
    }

    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending and descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) 
                {
                    end = mid - 1;
                } 
                else 
                {
                    start = mid + 1;
                }
            } 
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } 
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
