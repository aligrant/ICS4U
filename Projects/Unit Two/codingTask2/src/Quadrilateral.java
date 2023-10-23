import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;  
/**
 *
 * <h1>This is the Quadrilateral program</h1>
 * <p>The Quadrilateral program generates Quadrilateral objects. The fields are not private because the data is not in need of protection.</p>
 * @author      Alessandra Grant
 * @version     1.0
 * @since       1.0
 */
public final class Quadrilateral {
    /**
    * The x value of the first point   
    */        
    final double xa;
    /**
    * The y value of the first point   
    */
    final double ya;
    /**
     * The x value of the second point   
     */
    final double xb;
    /**
    * The y value of the second point
    */
    final double yb;
    /**
    * The x value of the third point   
    */
    final double xc;
    /**
     * The y value of the third point
     */
    final double yc;
    /**
    * The x value of the fourth point
    */
    final double xd;
    /**
    *The y value of the fourth point 
    */
    final double yd;
    /**
    *The type of shape the quadrilateral is
    */
    final String type;
    /**
    *The perimeter of the quadrilateral
    */
    final Double perimeter;
    /**
    *The area of the quadrilateral 
    */
    final Double area;
    /**
    * Constructor to be used to make quadrilateral objects, assuming the points are in order/counter-clockwise around the quadrilateral.
    *  
    *@param x_a first x value of a quadrilateral
    *@param y_a first y value of a quadrilateral
    *@param x_b second x value of a quadrilateral
    *@param y_b second y value of a quadrilateral
    *@param x_c third x value of a quadrilateral
    *@param y_c third y value of a quadrilateral
    *@param x_d fourth x value of a quadrilateral
    *@param y_d fourth y value of a quadrilateral
    */
   public Quadrilateral(double x_a, double y_a, double x_b, double y_b, double x_c, double y_c, double x_d, double y_d){
xa=x_a;
ya=y_a;
xb=x_b;
yb=y_b;
xc=x_c;
yc=y_c;
xd=x_d;
yd=y_d;
type=verifyQuad(xa,ya,xb,yb,xc,yc,xd,yd);
perimeter= perimeterQuad(xa,ya,xb,yb,xc,yc,xd,yd);
area=areaQuad(xa,ya,xb,yb,xc,yc,xd,yd);
   }
    
    /**
    * Method to find the slope between two points
    * 
    * @return gives the slope of a line 
    * @param x1 contains the x value of the first point on a line
    * @param y1 contains the y value of the first point on a line
    * @param x2 contains the x value of the second point on a line
    * @param y2 contains the y value of the second point on a line
    */
    public Double slope(double x1,double y1,double x2, double y2){
        double slope = (y2-y1)/(x2-x1);
        return(slope);
    }
    
    /**
    * Method to find the slope perpendicular to the slope of a line
    * 
    * @return gives the perpendicular slope
    * @param x1 contains the x value of the first point on a line
    * @param y1 contains the y value of the first point on a line
    * @param x2 contains the x value of the second point on a line
    * @param y2 contains the y value of the second point on a line
    */
    public Double perp(double x1,double y1,double x2, double y2){
        double perp = (x2-x1)/(y2-y1)*(-1);
        return(perp);
    }
    
    /**
    * Method to find the distance between two points
    * 
    * @return gives the distance between two points
    * @param x1 contains the x value of the first point
    * @param y1 contains the y value of the first point
    * @param x2 contains the x value of the second point
    * @param y2 contains the y value of the second point
    */
    public Double distance(double x1, double y1, double x2, double y2){
        double distance = Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
        return(distance);
    }
    
    /**
    * Method to test if two lines are the same length 
    * <p>The distance between two points is the length of a line, so if this distance is the same as the other set of points, the lines are the same length</p>
    * 
    * @return "true" if the two lines are the same length
    * @param x1 contains the x value of the first point
    * @param y1 contains the y value of the first point
    * @param x2 contains the x value of the second point
    * @param y2 contains the y value of the second point
    * @param x3 contains the x value of the third point
    * @param y3 contains the y value of the third point
    * @param x4 contains the x value of the fourth point
    * @param y4 contains the y value of the fourth point
    */
    public Boolean equal(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        boolean equal = false;
        if(distance(x1,y1,x2,y2).equals(distance(x3,y3,x4,y4))){
            equal=true;
        }
        return(equal);
    }
    
    /**
    * Method to check that the coordinates form a quadrilateral.
    * 
    * @return the type of quadrilateral
    * @param xa contains the x value of the first point
    * @param ya contains the y value of the first point
    * @param xb contains the x value of the second point
    * @param yb contains the y value of the second point
    * @param xc contains the x value of the third point
    * @param yc contains the y value of the third point
    * @param xd contains the x value of the fourth point
    * @param yd contains the y value of the fourth point
    */
    public String verifyQuad(double xa,double ya,double xb,double yb,double xc,double yc,double xd,double yd){
        String typeVal;
        //paralellograms
        if(slope(xa,ya,xb,yb).equals(slope(xd,yd,xc,yc))&&slope(xb,yb,xc,yc).equals(slope(xa,ya,xd,yd))){
                typeVal = "paralellogram";
            //rhombus   
            if(!perp(xa,ya,xb,yb).equals(slope(xb,yb,xc,yc))&&equal(xa,ya,xb,yb,xb,yb,xc,yc).equals(equal(xa,ya,xb,yb,xc,yc,xd,yd))){
                typeVal="rhombus";
            }
            //rectangle
            else if(perp(xa,ya,xb,yb).equals(slope(xb,yb,xc,yc))){
                typeVal = "rectangle";
                //square
                if(equal(xa,ya,xb,yb,xc,yc,xd,yd).equals(equal(xa,ya,xb,yb,xb,yb,xc,yc))){
                    typeVal = "square";
                }
            } 
        }
        //trapezoid
        else if(slope(xa,ya,xb,yb).equals(slope(xd,yd,xc,yc))||slope(xb,yb,xc,yc).equals(slope(xa,ya,xd,yd))){
            typeVal = "trapezoid";
        }
        //kite
        else if(equal(xa,ya,xb,yb,xb,yb,xc,yc).equals(true)||equal(xa,ya,xb,yb,xa,ya,xd,yd).equals(true)){
            typeVal = "kite";
        }
        //none of the above
        else{
            typeVal="error";
        }
        return (typeVal);}
    
    /**
    * Method to calculate the perimeter of a quadrilateral
    * 
    * @return the perimeter of the quadrilateral
    * @param xa contains the x value of the first point
    * @param ya contains the y value of the first point
    * @param xb contains the x value of the second point
    * @param yb contains the y value of the second point
    * @param xc contains the x value of the third point
    * @param yc contains the y value of the third point
    * @param xd contains the x value of the fourth point
    * @param yd contains the y value of the fourth point
    * 
    */
    public Double perimeterQuad(double xa,double ya,double xb,double yb,double xc,double yc,double xd,double yd){
        double perimeterVal = distance(xa,ya,xb,yb)+distance(xb,yb,xc,yc)+distance(xc,yc,xd,yd)+distance(xd,yd,xa,ya);
return(perimeterVal);}
    
    /**
    * Method to calculate the area of a quadrilateral
    * <p>Heron's formula is used to calculate the area of two triangles in the quadrilateral. The area is the sum of these calculations.</p>
    * 
    * @return the area of the quadrilateral
    * @param xa contains the x value of the first point
    * @param ya contains the y value of the first point
    * @param xb contains the x value of the second point
    * @param yb contains the y value of the second point
    * @param xc contains the x value of the third point
    * @param yc contains the y value of the third point
    * @param xd contains the x value of the fourth point
    * @param yd contains the y value of the fourth point
    * 
    */
public Double areaQuad(double xa,double ya,double xb,double yb,double xc,double yc,double xd,double yd){
    //if not an error(type would be error if the cords dont make any of the registered quadrilaterals)
    double areaVal;
    if(!type.equals("error")){
        //I use Heron's formula to find the area. 
        double a=distance(xa,ya,xb,yb);
        double b=distance(xb,yb,xc,yc);
        double diagonal=distance(xa,ya,xc,yc);
        double c=distance(xc,yc,xd,yd);
        double d=distance(xd,yd,xa,ya);
        double s1=(a+b+diagonal)/2;
        double s2=(c+d+diagonal)/2;
        areaVal = Math.sqrt(s1*(s1-a)*(s1-b)*(s1-diagonal))+ Math.sqrt(s2*(s2-c)*(s2-d)*(s2-diagonal));
    }else{
        areaVal = 0;}
return(areaVal);}

/**
    * Method to print the data of a Quadrilateral 
    */
 public void print() {
    if(!type.equals("error")){
    System.out.println('\n'+"The shape is a "+type+".");
    System.out.println("The perimeter is "+perimeter+".");
    System.out.println("The area is "+area+" units squared"+".");
    System.out.println("The coordinates are: "+"("+(int)xa+","+(int)ya+")"+","+"("+(int)xb+","+(int)yb+")"+","+"("+(int)xc+","+(int)yc+")"+","+"("+(int)xd+","+(int)yd+")");}
 else {
    System.out.println("The shape with coordinates"+"("+(int)xa+","+(int)ya+")"+","+"("+(int)xb+","+(int)yb+")"+","+"("+(int)xc+","+(int)yc+")"+","+"("+(int)xd+","+(int)yd+")"+" is not a valid quadrilateral.");
}
}
 
 /**
  * Main class to make a Quadrilateral an object
  * <p>This class makes two files:
  * 1."Quadrilateral_Type" is used to store data for pre-entered cords. 
  * 2."Quadrilateral_Cords" contains coordinates that are read and outputted into the terminal.</p>
  * 
  * @param args makes a Quadrilateral an object
  */
public static void main(String[] args){
    Quadrilateral rhombus = new Quadrilateral(1,-2,2,2,-2,1,-3,-3);
    //rhombus.print();
    Quadrilateral rect = new Quadrilateral(3,2,3,3,1,3,1,2);
    //rect.print();
    Quadrilateral square = new Quadrilateral(2,2,2,3,1,3,1,2);
    //square.print();
    Quadrilateral trapezoid = new Quadrilateral(4,1,3,2,2,2,1,1);
    // trapezoid.print();
    Quadrilateral kite = new Quadrilateral(5,-1,2,2,-4,-1,2,-4);
    //kite.print();
    
    //testing sideways trapezoid: successful
    //Quadrilateral test = new Quadrilateral(4,-2,4,4,2,2,0,0);
    //test.print();
    
    //writing to quad type file
        try{
            FileWriter fw = new FileWriter("Quadrilateral_Type.txt"); //makes a text file object
            PrintWriter pw = new PrintWriter(fw); // Makes a new Print Writer object
                    
            pw.println("The quadrilateral with coordinates "+"("+(int)rhombus.xa+","+(int)rhombus.ya+")"+","+"("+(int)rhombus.xb+","+(int)rhombus.yb+")"+","+"("+(int)rhombus.xc+","+(int)rhombus.yc+")"+","+"("+(int)rhombus.xd+","+(int)rhombus.yd+") is a "+rhombus.type); //writes text to file
            pw.println("The quadrilateral with coordinates "+"("+(int)rect.xa+","+(int)rect.ya+")"+","+"("+(int)rect.xb+","+(int)rect.yb+")"+","+"("+(int)rect.xc+","+(int)rect.yc+")"+","+"("+(int)rect.xd+","+(int)rect.yd+") is a "+rect.type);
            pw.println("The quadrilateral with coordinates "+"("+(int)square.xa+","+(int)square.ya+")"+","+"("+(int)square.xb+","+(int)square.yb+")"+","+"("+(int)square.xc+","+(int)square.yc+")"+","+"("+(int)square.xd+","+(int)square.yd+") is a "+square.type);    
            pw.println("The quadrilateral with coordinates "+"("+(int)trapezoid.xa+","+(int)trapezoid.ya+")"+","+"("+(int)trapezoid.xb+","+(int)trapezoid.yb+")"+","+"("+(int)trapezoid.xc+","+(int)trapezoid.yc+")"+","+"("+(int)trapezoid.xd+","+(int)trapezoid.yd+") is a "+trapezoid.type); 
            pw.println("The quadrilateral with coordinates "+"("+(int)kite.xa+","+(int)kite.ya+")"+","+"("+(int)kite.xb+","+(int)kite.yb+")"+","+"("+(int)kite.xc+","+(int)kite.yc+")"+","+"("+(int)kite.xd+","+(int)kite.yd+") is a "+kite.type); 
            pw.close(); 
        } 
        catch (IOException e){
             out.println("Error in main method.");}
        
        //quad cords
        try{
            FileWriter fw = new FileWriter("Quadrilateral_Cords.txt"); //makes a text file object
            PrintWriter pw = new PrintWriter(fw); // Makes a new Print Writer object
                    
            pw.println(rhombus.xa+","+rhombus.ya+","+rhombus.xb+","+rhombus.yb+","+rhombus.xc+","+rhombus.yc+","+rhombus.xd+","+rhombus.yd); //writes text to file
            pw.println(rect.xa+","+rect.ya+","+rect.xb+","+rect.yb+","+rect.xc+","+rect.yc+","+rect.xd+","+rect.yd);
            pw.println(square.xa+","+square.ya+","+square.xb+","+square.yb+","+square.xc+","+square.yc+","+square.xd+","+square.yd);    
            pw.println(trapezoid.xa+","+trapezoid.ya+","+trapezoid.xb+","+trapezoid.yb+","+trapezoid.xc+","+trapezoid.yc+","+trapezoid.xd+","+trapezoid.yd); 
            pw.println(kite.xa+","+kite.ya+","+kite.xb+","+kite.yb+","+kite.xc+","+kite.yc+","+kite.xd+","+kite.yd); 
            pw.close(); } 
        catch (IOException e){
             out.println("Error in main method.");}
        
        //reading file
        try {
      File cords = new File("Quadrilateral_Cords.txt");
      Scanner myReader = new Scanner(cords);
      int i=0;
      while (myReader.hasNextLine()) {
        i++;
        String data;
          data = myReader.nextLine();
          Pattern ptr = Pattern.compile(","); 
          String[] quadCords = ptr.split(data); 
          double[] cord = new double[8];
            for(int h=0; h<8; h++)
            {
            cord[h] = Double.parseDouble(quadCords[h]);
           }
        Quadrilateral[] shape;
        //dimension 100 so that I can add more later
        shape = new Quadrilateral[100];
        shape[i] = new Quadrilateral(cord[0],cord[1],cord[2],cord[3],cord[4],cord[5],cord[6],cord[7]);
        shape[i].print();
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
    }
  }        
}



