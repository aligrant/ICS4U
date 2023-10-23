public class learnSearch{
    public static int linearSearch(int[] intArray, int targetNum){
        int index=0;
        for(int i=0;i<intArray.length;i++){
            if (intArray[i]==targetNum){
                 index=i;
                }
            }
        return(index);
    }
    public static int binarySearch(int[] intArray, int targetNum){
        int start = 0; //lowest index
        int end = intArray.length - 1; //highest index
          while(start <= end){
             int m = (start+end)/2; //middle of array to search
             if (targetNum==intArray[m])
                return m;
             else{
                if (targetNum<intArray[m]){ //element in bottom half
                   end=m-1; //set the upper index to search
                }
                else{
                   start=m+1; //set the lower index to search
                }
             }
          }
       return -1;
       }

public static void main(String[] args){
    int[] classMarks = {67, 71, 78, 82, 83, 94};
    System.out.println(linearSearch(classMarks,78));
}
}