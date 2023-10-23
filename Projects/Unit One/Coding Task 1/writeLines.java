/*Imagine you had to write 100 lines on the board at school for forgetting to do your homework: 
 "I will not forget to do my homework." 
 Write a program to do the lines for you! 
 Make sure to include about 10 typos randomly spaced out to make it look more natural.*/
 
 //Importing this so that I can generate a random number. 
import java.util.Random;
 public class writeLines{
    public static void main(String[] args){
        /*This repeats "I will not forget to do my homework" 100 times in one string. 
        (previously I used a loop but I need it to be in one string in order to add the typos)*/
        String lines = new String(new char[100]).replace("\0", "I will not forget to do my homework. "+'\n');
            //Making the string into an array so that I can randomly space typos. 
            char[] linesFinal = lines.toCharArray();
            //Every time the loop runs, a random typo is inserted.
            //(It runs 15 times to compensate for the typos that are invalid *see below)
            int i; 
            for (i=0;i<14;i++){
                //generating random letter from a-z
                char typo = (char)(new Random().nextInt(26) + 'a');
                //generating random place in the character array to insert this number
                int ranSpot = (int)(Math.random() * lines.length());
                //*this introduces the condition that the typo spot is not a space or line break. 
                if(linesFinal[ranSpot]!=' '&&linesFinal[ranSpot]!='\n')
                //inserting the typo
                {linesFinal[ranSpot] = typo;}
                }
            //printing the final result:
            System.out.println(linesFinal);
    }}