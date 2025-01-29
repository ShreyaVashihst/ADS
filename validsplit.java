import java.util.*;

public class validsplit {
    public static void main(String[] args) {
        int[] arr={10,4,-8,7};
        System.out.println((validSplit(arr)));
    }

    public static int validSplit(int[] arr){
        int totalsum=0;
        for(int num:arr){
            totalsum=totalsum+num;
        }
        int leftsum=0;
        int validSplits=0;

        for(int i=0;i<arr.length-1;i++){
            leftsum=leftsum+arr[i];
            int rightsum=totalsum-leftsum;
            if(leftsum>=rightsum){
                validSplits++;
            }
        }
        return validSplits;
    }
}