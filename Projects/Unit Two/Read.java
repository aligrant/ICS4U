import java.io.*;
import static java.lang.System.*;

public class Read {

  /* This method tries to read from a text file in the same package, 
  and prints out the contents of the text file in the output window */
 
  public static void main(String[] args) {
    try{
      FileReader fr = new FileReader("readExample.txt"); //reads from text file
      BufferedReader br = new BufferedReader(fr); //makes reading more efficient
      String str;
      while ((str = br.readLine()) != null){
        out.println(str + "\n"); //prints lines in text file to output window
      }
    }
    catch (IOException e){
      out.println("File not found"); //catches error if the file is not created
    }
  }
}