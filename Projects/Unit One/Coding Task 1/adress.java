/*An address stamp is a tool to quickly stamp your address on a mailing envelope or paperwork. 
 Write a program to print your address with a box around it, and a little design. 
 You don't have to use your real address, but please use your real name. 
 [Hint: use unicode symbols to make an interesting design.]*/
 //just use a string with adress and [ ] --- like plus "{{{" or smt, also use line breaks
public class adress{
    public static void main(String[] args){
        String stamp ="┌─────────────────────┐"+'\n'+"█───Alessandra Grant──█" +'\n'+"█───150 Habor Street──█" +'\n'+"█───Toronto, Ontario──█"+'\n'+"█─────────────────────█"+'\n'+"█───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───█"+'\n'+"█───█▒▒░░░░░░░░░▒▒█───█"+'\n'+"█────█░░█░░░░░█░░█────█"+'\n'+"█─▄▄──█░░░▀█▀░░░█──▄▄─█"+'\n'+"██░░█─▀▄░░░░░░░▄▀─█░░██"+'\n'+"└─────────────────────┘";
        System.out.println(stamp);
    }}
    /*I don't really think any of the code here needs explaining. I used a string with line breaks.
     I could have separated the lines, but I beleive one string is slightly more efficient.*/ 
