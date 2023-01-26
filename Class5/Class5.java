package Week_1_DP5_CipherSchools.Class5;
public class Class5 {
    /*
     1. Calculate leftMax for every Building.
     2. Calculate rightMax for every Building

     3. Iterate over building array
        getLeftMax for this building from leftMax array;
        getRightMax for this building from rightMax array
     */
    public static int getWaterUnits(int[] buildingArray){
        int[] left=new int[buildingArray.length];
        int[] right=new int[buildingArray.length];
        left[0]=buildingArray[0];
        for(int leftIndex=1;leftIndex<left.length;leftIndex++){
            left[leftIndex]=Math.max(left[leftIndex-1],buildingArray[leftIndex]);
        }
        right[right.length-1]=buildingArray[right.length-1];
        for(int rightIndex=right.length-2;rightIndex>=0;rightIndex--){
            right[rightIndex]=Math.max(right[rightIndex+1],buildingArray[rightIndex]);
        }
        int waterUnits=0;
        for(int cuurentIndex=0;cuurentIndex< buildingArray.length;cuurentIndex++){
            waterUnits=waterUnits+(Math.min(left[cuurentIndex],right[cuurentIndex]))-buildingArray[cuurentIndex];
        }
        return waterUnits;
    }
    public static void main(String[] args) {
          int[] a={5,0,5,3,2,1,4};
          System.out.println(getWaterUnits(a));
    }
}
