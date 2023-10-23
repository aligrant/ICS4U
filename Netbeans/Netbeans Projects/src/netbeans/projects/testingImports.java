/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans.projects;
import java.io.*;
/**
 *
 * @author Alessandra
 */
public class testingImports {
       public static void main(String args[]) {
      String Str;
           Str = "Welcome-to-Tutorialspoint.com";
      System.out.println("Return Value :" );      
      
      for (String retval: Str.split("-")) {
         System.out.println(retval);
      }
   }
}
