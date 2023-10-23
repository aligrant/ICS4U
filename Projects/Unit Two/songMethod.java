public class songMethod {
    public String frogs(int numFrog) {
        String verse="verse";
        if(numFrog!=1){
        verse =numFrog+" little speckled frogs sat on a speckled log"+'\n'
        +"Eating some most delicious grubs (yum, yum!)"+'\n'
        +"One jumped into the pool, where it was nice and cool"+'\n'
        +"Now there are "+(numFrog-1)+" green speckled frogs"+'\n'+'\n';
    }
    else{
        /*I couldn't think of a way to avoid writing this 
        again because of the change in grammar. */
        verse ="1 little speckled frog sat on a speckled log"+'\n'
        +"Eating some most delicious grubs (yum, yum!)"+'\n'
        +"It jumped into the pool, where it was nice and cool"+'\n'
        +"Now there are no green speckled frogs";
    }
    return(verse);}
    public static void main (String[] args){
        //I need to create an object because I didn't make the method static
        songMethod obj = new songMethod();
        for(int i=5;i>0;i--){
            System.out.print(obj.frogs(i));
        }}

}
