import java.util.Scanner;
public class Max_Sum_Subarray{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int[] arr= {2,5,1,8,2,9,1};
        int j=0;
        int i=0;
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                maxSum=Math.max(maxSum,sum);
                sum-=arr[i];
                i++;
                j++;
            }
        }
        System.out.println(maxSum);
    }
}