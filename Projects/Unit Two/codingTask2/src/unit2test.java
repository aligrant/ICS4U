import java.io.FileWriter;  
public class unit2test {
    // public static double findSlope(double x1, double y1, double x2, double y2) {
    //     return((y2 - y1)/(x2 - x1));
    //   }
      public static void main(String[] args){
    //   System.out.print(findSlope(2.1, 3.5, 5, 8));
    try{    
        FileWriter fw=new FileWriter("testout.txt");    
        fw.write("Welcome to javaTpoint.");    
        fw.close();    
       }catch(Exception e){System.out.println(e);}    
       System.out.println("Success...");    
    }
}