package Week_1_DP5_CipherSchools.Class20;

import java.util.Stack;

public class MaxAreaInHistogram {
    public static int maxAreaInHist(int[] arr){
        Stack<Integer> s=new Stack<>();
        int max=0;
        int i=0;
        while (i< arr.length){
            int currentBuilding=arr[i];
            if(s.isEmpty() || currentBuilding>=arr[s.peek()]){
                s.push(i);
                i++;
            }
            else{
                int previousBar=s.pop();
                int height=arr[previousBar];
                int width;
                if(s.isEmpty()){
                    width=i;
                }
                else{
                    width=i- s.peek()-1;
                }
                int area=height*width;
                max=Math.max(area,max);
            }
        }
        while (!s.isEmpty()){
            int previousBar=s.pop();
            int height=arr[previousBar];
            int width;
            if(s.isEmpty()){
                width=i;
            }
            else{
                width=i-s.peek()-1;
            }
            int area=height*width;
            max=Math.max(area,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        System.out.println(maxAreaInHist(arr));
    }
}
