/*You are going to write a program that helps students with some grade 10 math work. 
Consider a quadratic in standard form to be f(x) = Ax2 + Bx + C
Design and create a quadratic class that can be used to display the following information about a quadratic to the user
The direction of opening
The vertex
The y intercept
The zeros of the quadratic
The Vertex Form of the Equation
Write a program that uses that quadratic class to display all of that relevant information to a grade 10 math student.  The program should let the student enter as many quadratics as they want.
Use Netbeans to create the program and email me the .java files.  No time limit for this.  I will wait to mark it until I get the java files sent to my email.*/
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public final class Quadratic {
private final String dir;
private final double yval;
private final String xval;
private final String ver;
private final String verF;

public Quadratic(double in_a,double in_b,double in_c){
dir=getDirection(in_a,in_b,in_c);
ver=getVertex(in_a,in_b,in_c)[0];
yval=in_c;
xval=getX(in_a,in_b,in_c);
verF=getVertex(in_a,in_b,in_c)[1];}
    //method to find direction
    public static String getDirection(double a_in, double b_in, double c_in){
        String direct;
        if(a_in<0){
        direct = " is facing downwards";
        }else{
        direct =" is facing upwards";
        }return(direct);}
//method to get vertex point and form
    public static String[] getVertex(double a_in, double b_in, double c_in){
     Double h=(-1*b_in)/(2*a_in);
     Double k=a_in*h*h+b_in*h+c_in;
     String[] vertex=new String[2];
     vertex[0]="("+h+","+k+")";
     vertex[1]="Vertex form is f(x)= "+a_in+"(x-"+h+")^2+"+k;
     return(vertex);
    }
    //method to get x intercept(s) and print result
     public static String getX(double a_in, double b_in, double c_in){
     double disc=b_in*b_in-4*a_in*c_in; 
     String xval="";
     double x1=(-b_in+Math.sqrt(disc))/2*a_in;
     double x2=(-b_in-Math.sqrt(disc))/2*a_in;
          if (disc > 0){
         xval="X-intercepts are ("+x1+",0) and ("+x2+",0)";
     }else if (disc == 0){
         xval="X-intercept is "+getVertex(a_in,b_in,c_in)[0];
     }else if (disc < 0){
         xval="No X-intercepts";}
     return(xval); 
    }
 //user input
static Scanner quad_in = new Scanner(System.in);
public static void print(){
System.out.println("Input a quadratic equation using the format f(x)= Ax2+Bx+C"+'\n');
//true as condition so that the loop never ends, user can input as many as they want
for(int z=0;true;z++){
    //everything from here till the end of the while loop is just getting the a b c values from inputted function
      double[] value = new double[3];
      value[0]=0;
      value[1]=0;
      value[2]=0;
      System.out.println("Quadratic #"+(z+1));
      System.out.print("f(x)= ");
          int i=0;
      while (quad_in.hasNext()) {
        i++;
         Pattern x2 =Pattern.compile("x2");  
         String[] step1 = x2.split(quad_in.next());
         Pattern xs = Pattern.compile("x"); 
         String[] step2 = xs.split(step1[1]); 
              value[0]=Double.parseDouble(step1[0]);
              value[1]=Double.parseDouble(step2[0]);
              value[2]=Double.parseDouble(step2[1]);
              //NEW QUAD FROM INPUT
              Quadratic quad = new Quadratic(value[0],value[1],value[2]);
              System.out.println("Parabola"+ quad.dir);
              System.out.println("Vertex is "+ quad.ver);
              System.out.println("Y-intercept is "+quad.yval);
              System.out.println(quad.xval);
              System.out.println(quad.verF); 
              break;}
      System.out.print('\n'+"Press ENTER to input another quadratic");
          try {
        System.in.read();
    } catch (IOException e) {}}}
 
    public static void main(String[] args) {
print();
}}