public class KadanesAlgo2{
    public static void main(String[] args){
        /* Steps of kadanes algo
         Initilization:
         [1,-2,3,4,-1,2,1,-5,4]
         start:currentSum=0,maxSum=Integer.min_value
         First element (1): currentSum = max(1, 0 + 1) = 1, maxSum = max(_, 1) = 1
         Second element (-2): currentSum = max(-2, 1 - 2) = -1, maxSum = max(1, -1) = 1
         Third element (3): currentSum = max(3, -1 + 3) = 3, maxSum = max(1, 3) = 3
         Fourth element (4): currentSum = max(4, 3 + 4) = 7, maxSum = max(3, 7) = 7
         Fifth element (-1): currentSum = max(-1, 7 - 1)  = max(7, 6) = 7
         Sixth element (2): currentSum = max(2, 6 + 2) = 8, maxSum = 6, maxSum max(7, 8) = 8
         Seventh element (1): currentSum = max(1, 8 + 1) = 9, maxSum = max(8, 9) = 9 */
    int[]nums={1,-2,3,4,-1,2,1,-5,4};
    System.out.println("Maximum SubArray Sum"+maxSubArray(nums));
    }
    public static int maxSubArray(int[]nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        int currentSum=0;
        int maxSum= Integer.MIN_VALUE;
        for(int num:nums){
            currentSum=Math.max(num, currentSum+num);
            maxSum=Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}