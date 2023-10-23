public class user {
/*We will start making a program to be part of a new social media software.  Your task is to create a User class to create user profile objects.  

Users will have the following fields: 

String userName,
int userAge,
String hobbies
int rating
and the following methods:

setName(String newName)
decreaseRating(int rating)
increaseRating(int rating)*/
    private String userName;
    private int userAge;
    private String hobbies;
    private int rating;

    public String setName(String newName) {
        newName = userName;
        return newName;
     }
    public int decreaseRating(int rating){
        return rating;
    }
    public int increastRating(int rating){
        return rating;
    }
public static void main (String[] args){
    System.out.println("hi");
}

}
