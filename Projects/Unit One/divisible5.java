import static java.lang.Math.random;
public class divisible5 {
    
public static void main(String[] args) {
//Because random() is double, I had to convert it to an int'(int)'
    int n= (int)(random()*1000);
//This sees if the remainder of the number is 0 when divided by 5(meaning it is divisible)

    if (n%5==0){
//if it is divisible, it prints that it is
        System.out.println(n+" is divisible by 5.");
    }
    else{
//otherwise it prints it is not
        System.out.println(n+" is not divisible by 5.");
    }
//this program checks if i equals d,
//and prints d if they are equal, and i if they are not

 int i = 1000;
 double d = 2.5;
 if(i == d)
 {
   System.out.print(d);
 }
 else{
 System.out.print(i);
 }
String name = "Alessandra";
int length = name.length();
if(length%2==0){
    System.out.println("The name "+name+" is "+length+" letters long and is even.");
}
else{
    System.out.println("The name "+name+" is "+length+" letters long and is odd.");
}

}
} 

