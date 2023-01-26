package Week_1_DP5_CipherSchools.Class11;

import java.util.ArrayList;

public class GeneratePermutation {
    public static void printArrayList(ArrayList<Integer> al){

        for(int x:al){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void helper(int[] nums, ArrayList<Integer> ans){
        if(ans.size()== nums.length){
            printArrayList(ans);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])){
                continue;
            }
            ans.add(nums[i]);
            helper(nums,ans);
            //backtrack
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] ans={1,2,3};
        ArrayList<Integer> al=new ArrayList<>();
        helper(ans,al);

    }
}
