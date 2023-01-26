package Week_1_DP5_CipherSchools.Class2;
/*
1. Assuming first k-1 elements are smallest
2. Lets start iteration from k element
     currentElement=array[k]
    2.1. Lets find out max of 0..k, store it max along with it's index
    2.2. if(cuurentElement<max){
             do something with this window

             shift one element to the left side till we reach to maxPositions
         }

 */
public class Class2 {
    public static void ksmallestElements(int[] a,int k){
        for(int index=k;index<a.length;index++){
            int currentElement=a[index];
            int max=a[k-1];
            int maxPosition=k-1;
            for(int reverseIndex=k-2;reverseIndex>=0;reverseIndex--){
                if(a[reverseIndex]>max){
                    max=a[reverseIndex];
                    maxPosition=reverseIndex;
                }
            }
            if(currentElement<max){
                while(maxPosition<k-1){
                    a[maxPosition]=a[maxPosition+1];
                    maxPosition++;
                }
                a[k-1]=currentElement;
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={50,25,100,200,30};
        ksmallestElements(arr,2);
    }
}




/*
My Soln Brute force
public class Class2 {
    public static void main(String[] args) {
        int[] a={200,500,100,50};
        int k=2;
        int[] res=getVid(a,k);

        for(int x:res){
            System.out.println(x);
        }

    }
    static int[] getVid(int[] a,int k){
        int n=a.length;
        int res[]=new int[k];
        k=k-1;
        for(int i=n-1;i>=0;i--){
            int min=getNextMin(a,i);
            if(k>=0){
                res[k]=min;
                k--;
            }
            else{
                break;
            }
        }
        return res;
    }
    static int getNextMin(int[] a,int i){
        int min=Integer.MAX_VALUE;
        for(int j=i;j>=0;j--){
            if(a[j]<min){
                min=a[j];
            }
        }
        return min;
    }
}
 */
