import java.util.Arrays;

/*Practice Questions:
Part A
1. Make an array called multThree with elements: 3, 6, 9, 12, 15
2. Print the length of the array.
3. Copy the elements that are less than 10 to a new array.

Part B
4. Make another array that stores the first 100 multiplies of 3.
5. Divide every other number by 3 and print the array.
*/

public class arrayPractice {
    public static void main(String[] args) {
        //PART A
        //1.
        int[] multThree = {3, 6, 9, 12, 15};

        //2.
        System.out.println(multThree.length);
        int i;
        int counter=0;

        //3.
        //counter 
        for (i=0; i< multThree.length; i++){
            if(multThree[i]<10){ 
                counter = counter + 1;
            }}
        int counterth = 0;
        int[] newArray = new int[counter];
        int a;

        //second loop 
        for (a=0;a<multThree.length;a++){
            if (multThree[a]<10){
                counterth = counterth+1;
                newArray[counterth-1]=multThree[a];
            }}
            String theNewArray = Arrays.toString(newArray);
            System.out.println(theNewArray);
        
        //PART B
        //1.
        int[] centMultThree = new int[100];
        int b;
        for (b=1; b<=centMultThree.length; b++){
            centMultThree[b-1] = (b)*3;
        }
        String multiples = Arrays.toString(centMultThree);
        System.out.println(multiples);

        //2.
        int c;
        int[] multDiv = new int[100];
        System.arraycopy(centMultThree, 0, multDiv, 0, 100);
        for (c=0;c<multDiv.length;c+=2){
            multDiv[c]= (multDiv[c])/3;
            System.out.println(multDiv[c]);
        }
        String multString = Arrays.toString(multDiv);
        System.out.println(multString);
        }
    }