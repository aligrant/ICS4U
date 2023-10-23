public class test3 {
   
//INSERTION SORT
//start at the second element, {look for the correct position for an element 
//by comparing elements to the left, repeat}
public static int[] insertSort(int[] classMarks){
   for (int n = 1; n < classMarks.length; n++){
      int tempNumb = classMarks[n]; // temporary variable
      int i = n;
      while ((i > 0) && (tempNumb < classMarks[i-1])){
         //shift larger items to the right by one
         classMarks[i] = classMarks[i-1];
         //prepare to check the next item to the left
         i--;
      }
      classMarks[i] = tempNumb; // put sorted item in open location
   }
return classMarks;
}


//SELECTION SORT
//look for the lowest element in the array, put it in the first position, repeat for second lowest, etc.
public static int[] selectionSort(int[] classMarks){ 
   int tempNumb;
   int tempIndex=0; 
   for(int n = 0; n < 6; n++){ 
      //Find lowest number in array left to be sorted
      tempNumb = classMarks[n];
      for(int i = n; i < 5; i++){
         if(classMarks[i+1] < tempNumb){
            tempNumb = classMarks[i+1];
            tempIndex = i+1; 
         }
       }
      /*If the array at n is not the lowest, swap with the lowest*/
      if(tempNumb != classMarks[n]){
         classMarks[tempIndex] = classMarks[n];
         classMarks[n] = tempNumb;
      }
   }
return classMarks;
}


//BUBBLE SORT
//compare two adjacent elements at a time, switch positions if needed.
  
//LINEAR SEARCH
//goes through each element and tests if it is the right one
    public static int searchArray(int[] a, int element){
    for(int i = 0; i < a.length;i++ ){
       if(a[i] == element){
       return i;
       }
    }
 return -1;
 }



//2D ARRAYS
public static void arrayTwoD(){
    String[][] cubby = new String[][]{

{"cash register", "boots", "soccer ball"},
{"book", "basket ball", "doll"},
{"duck", "drums", "food"}

};
}

public static void timeComp(){
//best to worst time complexity
//O(logn),  O(n),  O(nlogn),  O(n2)

/*
Simplifying Time Complexity:

RULE 1:

Ignore numerical coefficients: O(c*n) = O(n), where c is a constant. More generally, O(c*f(n)) = O(f(n)).

RULE 2:

If lines of code or loops run one after the other, then we can ADD the O(n).

RULE 3:

If loops (or recursion in Unit 4) are nested, then we can MULTIPLY the O(n).

RULE 4:
Take the largest term: If the function representing the time complexity of the algorithm is the sum of functions, 
take the greatest function only. 
I.e. O(n2+4n) = O(n2) because as n becomes very large, a quadratic will be much larger than a linear function.
*/

//bubble insertion and selection all have the same worst case time complecity: O(n^2)

}
}