/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandra
 */
public class NewClass {
    public static void main(String[] args)
    {
//    System.out.println(sayWhat(5,4));
//    }
//    public static int sayWhat(int a, int b){
//        if(b==0){    
//            return 0;}
//        if(b%2==0){
//           return (sayWhat(a+a,b/2));
//       }
//        return(sayWhat(a+a,b/2)+a);
////    }
//System.out.println(myMethod(20, 25));
//}
//
//public static int myMethod(int p, int q) {
//
//if (q == 0){
//
//return p;
//
//}
//else {
//
//return myMethod(q, p % q);
//
//}
//
//}        
        System.out.println(pyramid(6));

}

public static int pyramid(int n){

if (n==1){

return 1;

}
return n + pyramid(n-1);

}
            }
