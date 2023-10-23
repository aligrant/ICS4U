import java.io.*;
import static java.lang.System.*;
/**
 *
 * <h1>This is the Book program</h1>
 * <p>The book program generates book objects</p>
 * @author Alessandra
 */
//Declare the class
public class Bookk {

    //Book has 4 fields (also called class variables or instance variables), which are private to protect the data
    private final String title;
    private final String genre;
    private final int publishDate;
    private int rating;
 
    //constructor to be used to make objects
    public Bookk (String newTitle, String newGenre, int newDate, int newRating) {
       title = newTitle;
       genre = newGenre;
       publishDate = newDate;
       rating = newRating;
    }
    //constructor to be used to make objects and cast strings to ints
 public Bookk (String newTitle, String newGenre, String newDate, String newRating) {
    title = newTitle;
    genre = newGenre;
    publishDate = Integer.parseInt(newDate);
    rating = Integer.parseInt(newRating);}

 
    
    /** 
     * @return String
     */
    //useful methods to access fields
    public String getTitle() {
       return title;
    }
    
    /** 
     * @return String
     */
    public String getGenre() {
       return genre;
    }
   
   /** 
    * @return int
    */
   public int getPublishDate() {
       return publishDate;
    }
 
  
  /** 
   * @param newRating
   */
  //method to set a new rating for the book object
  public void setRating (int newRating) {
     rating = newRating;
  }
  //prints fields of a book object
 public void print() {
    System.out.println("Title: " + title);
    System.out.println("Genre: " + genre);
    System.out.println("Publish Date: " + publishDate);
    System.out.println("Rating: " + rating);
 }
 
 /** 
  * @param args
  */
 //main class to make a book object
 public static void main(String[] args) {
    Bookk book1 = new Bookk("Curious George", "Children Fiction", 1941, 4);
    book1.print();
    Bookk book2 = new Bookk("Cool Book", "Comedy", 2020, 14444);
    //all strings, testing
    Bookk book3 = new Bookk("Curious George", "Children Fiction", "1941", "4");
    //File writer 
 try{
    FileWriter fw = new FileWriter("BookExample.txt"); //makes a text file object
    PrintWriter pw = new PrintWriter(fw); // Makes a new Print Writer object
 
    pw.println("Here is the information to print to the file:"); //writes text to file
    pw.println(book1.title + ", " + book1.genre+ ", " +book1.publishDate+ ", " +book1.rating); //writes more text to file 
    pw.println(book2.title + ", "+ book2.genre+ ", " +book2.publishDate+ ", " +book2.rating);
    pw.println(book3.title + ", "+ book3.genre+ ", " +book3.publishDate+ ", " +book3.rating);
    
 
    pw.close(); //close print writer
 }
 catch (IOException e){
    out.println("Error in main method.");
 }
 }
 //Declare the sub class using "extends" keyword
public class Booklet extends Bookk {

    //Booklet has 1 additional field in addition to the 4 inherited from Book 
    private int numBundle;
 
    //constructor to be used to make objects
    public Booklet(String newTitle, String newGenre, int newDate, int newRating, int numB) {
       super(newTitle, newGenre, newDate, newRating); //uses Book constructor
       numBundle = numB;
     }
    
    //Getters and Setters are inherited, but we need new ones for numBundles
    public int getNumBundles(){
       return numBundle;
    }
    public void setNumBundles(int n){
       numBundle = n;
    } 
 }
 }

