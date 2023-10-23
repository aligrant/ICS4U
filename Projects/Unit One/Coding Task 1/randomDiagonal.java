/*Write a program that generates a random number between 20 and 50,
 and then generates a diagonal of the random number of asterisks.*/

//Importing this so that I can generate a random number. 
import java.util.Random;
public class randomDiagonal{
public static void main(String[] args) {
  //This generates a random number between 20 and 50, stored in 'num'. 
  int num = new Random().nextInt(31) + 20;
  // As long as i is less than the random number, the loop will repeat and add another asterisk. 
  for (int i = 0; i < num; i++) {
    //This repeats spaces in a new string based on how many times the loop has ran, giving the diagonal effect. 
    String repeatedSpaces = new String(new char[i]).replace("\0", " ");
    System.out.println(repeatedSpaces + "*");
  }
  System.out.println("This diagonal line is made up of "+num+" astericks.");
}}