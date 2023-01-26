package Week_1_DP5_CipherSchools.Class8;

public class Class8_part1 {
    public static int findMaximum(int[] arr,int index){
        if(index<0){
            return Integer.MIN_VALUE;
        }
        int temp=findMaximum(arr,index-1);

        int max=Math.max(temp,arr[index]);
        return max;
    }
    public static void main(String[] args) {
         int[] arr={5,4,17,45,15,12};
         System.out.println(findMaximum(arr, arr.length-1));

    }
}
