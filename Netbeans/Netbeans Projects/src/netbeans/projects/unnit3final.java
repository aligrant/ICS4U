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
public class unnit3final {

    public static double[][] sortRect(double[][] rectangles){
        //I use insertion sort. Modified for 2d array by adding one dimension to everything--tempNumb is now an array. 
      for (int n = 1; n<rectangles.length; n++){
      double[] tempNumb = {rectangles[n][0],rectangles[n][1]}; // temporary 1d double array
      int i = n;
      while ((i > 0) && (tempNumb[0]*tempNumb[1]<rectangles[i-1][0]*rectangles[i-1][1])){
         //shift larger rectangles to the right by one
         rectangles[i][0] = rectangles[i-1][0];
         rectangles[i][1] = rectangles[i-1][1];
         //prepare to check the next area to the left
         i--;
      }
      rectangles[i][0]=tempNumb[0];
      rectangles[i][1]=tempNumb[1]; // put sorted rectangle in open location
   }
return rectangles;
}
public static String[] myMethod(String[] myArray) {

int n = myArray.length;
for (int i = 0; i < n-1; i++){

for (int j = 0; j < n-i-1; j++){

if (myArray[j].length() > myArray[j+1].length()){

String temp = myArray[j];
myArray[j] = myArray[j+1];
myArray[j+1] = temp;

}

}

}
return myArray;
}
public static void printBoard(String[][] pieces){
for(int i=0;i<pieces.length;i++){
    for (int j=0;j<pieces[i].length;j++){
    System.out.print("|"+pieces[i][j]);
    }
    System.out.println("|");
}
}

//Binary Search
public static int binarySearch(int[] a, int element){

int start = 0; //lowest index
int end = a.length - 1; //highest index

while(start <= end){

int m = (start+end)/2; //middle of array to search
if (element == a[m]){

return m;

}else{

if (element < a[m]){ //element in bottom half

end = m-1; //set the upper index to search

}else{

start = m+1; //set the lower index to search

}

}

} return -1;

}

    public static void main(String[] args){
        int[] heights = {149, 158, 179, 183, 200, 201, 202, 205, 600};
int index = binarySearch(heights,200);
System.out.println(index);

//
//        String[][] pieces = new String[][]{
//
//{"bR1", "bK1", "bB1", "b_Q", "b_K", "bB2", "bK2", "bR2"},
//{"bP1", "bP2", "bP3", "bP4", "bP5", "bP6", "bP7", "bP8"},
//{"___", "___", "___", "___", "___", "___", "___", "___"},
//{"___", "___", "___", "___", "___", "___", "___", "___"},
//{"___", "___", "___", "___", "___", "___", "___", "___"},
//{"___", "___", "___", "___", "___", "___", "___", "___"},
//{"wP1", "wP2", "wP3", "wP4", "wP5", "wP6", "wP7", "wP8"},
//{"wR1", "wK1", "wB1", "w_Q", "w_K", "wB2", "wK2", "wR2"},
//
//};
//      printboard(pieces);
//        double[][] rectangles = new double[][]{
//{2, 9},
//{5.5, 7},
//{5.5, 7},
//{2, 7},
//        };
//for(int i=0;i<rectangles.length;i++){
//System.out.println(sortRect(rectangles)[i][0]+","+sortRect(rectangles)[i][1]);
//}
//
//String[] testA = {"sdfsdf","zf","sdf","fg"};
//for(int i=0;i<testA.length;i++){
//System.out.println(myMethod(testA)[i]);
//}


}
}
