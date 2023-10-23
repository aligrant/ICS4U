/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans.projects;

/**
 *
 * @author Alessandra
 */
public class searchPractice{
    public static int linearSearch(int[] intArray, int targetNum){
        int index=0;
        for(int i=0;i<intArray.length;i++){
            if (intArray[i]==targetNum){
                 index=i;
                }
            }
        return(index);
    }
    public static int[] sortOrder(int[] intArray){
        int le=intArray.length;
        //basically swapping each number to its place for every number in the array
        for (int i=0;i<le-1;i++){
            for (int k=0;k<le-1;k++){
            if(intArray[k]>intArray[k+1]){
            //swap
            int hold = intArray[k];
            intArray[k]=intArray[k+1];
            intArray[k+1]=hold;
            }
            }
        }
        
    return(intArray);
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
    public static void printArray(int[] arr){
    for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
    }
    }
    
public static void main(String[] args){
    int[] classMarks = {67, 71, 78, 82, 83, 94};
    int[] classMarks2 = {82, 71, 78, 83, 94, 67};
    printArray(sortOrder(classMarks2));
    //System.out.println(binarySearch(classMarks,78));
    
}
}