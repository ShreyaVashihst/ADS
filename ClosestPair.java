import java.util.Arrays;

public class ClosestPair {
    public static int[] findClosestPair(int[] arr, int target) {
        
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int[] closestPair = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];
            
           
            if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                closestSum = sum;
                closestPair[0] = arr[left];
                closestPair[1] = arr[right];
            }

            
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return closestPair;
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 28, 29, 30, 40};
        int target = 54;
        int[] result = findClosestPair(arr, target);

        System.out.println("Closest pair to target: " + result[0] + ", " + result[1]);
    }
}
