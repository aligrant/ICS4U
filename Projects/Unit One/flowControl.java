import java.util.Scanner;
public class flowControl {
    static Scanner numInput = new Scanner(System.in);
    static void evenOrOdd() {
        System.out.println("Even or Odd");
        //0 is even because it gives a remainder of 0 when divided by two.
        System.out.println("Input a whole number between 0 and 100 to find out if it is even or odd: ");
        if (numInput.hasNextByte()){
            byte numberChosen = numInput.nextByte();
            if (numberChosen>100||numberChosen<0){
                System.out.println("Your number is not between 0 and 100. Try again.");
                evenOrOdd();
            }
            if (numberChosen%2==1){
                System.out.println("odd");
                run();
            }
            else{
                System.out.println("even");
                run();
            }            
        }
        else{
            System.out.println("Only whole numbers can be classified as even or odd.(You may also be receiving this message if your number was over 100). Please rerun. ");
        }
  }
  static void threeMultiples(){
    System.out.println("Multiples of Three");
    for (int i = 1; i < 21; i++) {
        System.out.println(i+". "+ 3*i);
      }
      run();
  }
  static void horizontal(){
    System.out.println("Horizontal");
    for (int i = 0; i < 20; i++) {
        System.out.print("~");
      }
      run();
  }
  static void diagonal(){
    System.out.println("Diagonal");
    for (int i = 0; i < 21; i++) {
        String spaces = "  ";
        String repeatedSpaces = new String(new char[i]).replace("\0", spaces);
        System.out.println(repeatedSpaces + "~");
      }
      run();
  }
  static Scanner funcInput = new Scanner(System.in);
  static void run(){
    System.out.println("Pick a program to run: 1:Even or Odd 2:Multiples of Three 3:Horizontal 4:Diagonal");
    if (funcInput.hasNextByte()){
        byte choice = funcInput.nextByte();
        if (choice==1){
            evenOrOdd(); 
        }
        else if (choice==2){
            threeMultiples();
        }
        else if(choice==3){
            horizontal();
        }
        else if(choice==4){
            diagonal();
        }
        else{
            run();
        }

    }
  }

  public static void main(String[] args) {
   run();
  }
}