package Week_1_DP5_CipherSchools.Class12;

import java.util.ArrayList;

public class GenerateSubset {
    public static void generateAllSubset(int[] arr, ArrayList<Integer> ans ,int begin){
        System.out.println(ans);
        for(int i=begin;i< arr.length;i++){
            ans.add(arr[i]);
            generateAllSubset(arr,ans,i+1);
            ans.remove(ans.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] a={12,3,1,6};
        generateAllSubset(a,new ArrayList<>(),0);
    }
}
