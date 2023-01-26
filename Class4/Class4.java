package Week_1_DP5_CipherSchools.Class4;

public class Class4 {
    /*
     1. Assuming arrival and dep time is in sorted order
     2. currentArivalTrainTime=Consider second train schedule of arrival vala array
              2.1. currentDepTrainTime= Consider second train schedule of departure vala array
     3. if(currentArrivalTrainTime <= currentDepTrainTime){
               increasePlatForm by 1
               currentArrivalTrainTime=arrival index +1
         }
         else{
               decreasePlatForm by 1
               currentDepTrainTime= departure index + 1
         }
     */
    public static  int minPlatform(int[] arr,int[] dep){
        int result=1;
        int arrivalIndex=1;
        int deparTureIndex=0;
        int platformRequired=1;
        while(arrivalIndex<arr.length && deparTureIndex<dep.length){
            int currentArrivalTime=arr[arrivalIndex];
            int currentDeparturETime=dep[deparTureIndex];

            if(currentArrivalTime<=currentDeparturETime){
                platformRequired++;
                arrivalIndex+=1;
            }
            else{
                platformRequired--;
                deparTureIndex+=1;
            }
            result=Math.max(result,platformRequired);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={900,915,1100};
        int[] dep={1000,1105,1200};
        System.out.println(minPlatform(arr,dep));

    }
}
