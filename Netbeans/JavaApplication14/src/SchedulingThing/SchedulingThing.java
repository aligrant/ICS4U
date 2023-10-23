/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchedulingThing;

/**
 *
 * @author Alessandra
 */
public class SchedulingThing {
    public static void main(String args[]){
    int Classes[] = {0,1,2,3};
    int a[]={Classes[0], Classes[2]};
    int b[]={Classes[1], Classes[3]};
    int c[]={Classes[2], Classes[3]};
    System.out.println("start");
    for (int i=0; i<2; i++){
        for(int j=0;j<2;j++){
            if(a[i]==b[j]){
            System.out.println(a[i]+"ab"+b[j]);
            }
            else if(a[i]==c[j]){
            System.out.println(a[i]+"ac"+c[j]);
            }
            else if(b[i]==c[j]){
            System.out.println(b[i]+"bc"+c[j]);  
            }
        }
    }
    
    
    }
    public static boolean test(int x, int y){
        boolean z=false;
        int i;
for(i=0;i<2;i++){
            
if(x==y){
    z = true;
}
        }
    return(z);
    }
    
}
