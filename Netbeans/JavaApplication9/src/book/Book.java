package book;
import java.io.*;
import static java.lang.System.*;
/**
 *
 * <h1>This is the Book program</h1>
 * <p>The book program generates book objects</p>
 * @author      Alessandra Grant
 * @version     1.0
 * @since       1.0
 */
public class Book {
    //Book has 4 fields (also called class variables or instance variables), which are private to protect the data
    /**
    * The title of a book, private to protect the data.
    */
    private final String title;
    /**
    * The genre of a book, private to protect the data.
    */
    private final String genre;
    /**
    * The publishing date of a book, private to protect the data.
    */
    private final int publishDate;
    /**
    * The rating of a book, private to protect the data.
    */
    private int rating;
 /**
    *Constructor to be used to make objects
    *  
    *@param newTitle The title of a book
    *@param newGenre The genre of a book
    *@param newDate The publishing date of a book
    *@param newRating The rating of a book
    */

    public Book (String newTitle, String newGenre, int newDate, int newRating) {
       title = newTitle;
       genre = newGenre;
       publishDate = newDate;
       rating = newRating;
    }
    /**
    * Constructor to be used to make objects and cast strings to integers
    *  
    *@param newTitle The title of a book
    *@param newGenre The genre of a book
    *@param newDate The publishing date of a book casted to integer
    *@param newRating The rating of a book casted to integer
    */
 public Book (String newTitle, String newGenre, String newDate, String newRating) {
    title = newTitle;
    genre = newGenre;
    publishDate = Integer.parseInt(newDate);
    rating = Integer.parseInt(newRating);}

    /**
    * Method to access the title of the book
    * 
    * @return gives the title of the book
    */
    public String getTitle() {
       return title;
    }
    
    /**
    * Method to access the genre of the book
    * 
    * @return gives the genre of the book
    */
    public String getGenre() {
       return genre;
    }
   
   /**
    * Method to access the publish date of the book
    * 
    * @return the publish date of the book
    */
   public int getPublishDate() {
       return publishDate;
    }
 
  
  /**
    * Method to set a new rating for the book object
    * 
     * @param newRating sets a new rating 
    */
  public void setRating (int newRating) {
     rating = newRating;
  }
  /**
    * Method to print the data of a book
    */
 public void print() {
    System.out.println("Title: " + title);
    System.out.println("Genre: " + genre);
    System.out.println("Publish Date: " + publishDate);
    System.out.println("Rating: " + rating);
 }
 
 /**
  * Main class to make a book object
  * 
  * @param args makes a book object
  */
 public static void main(String[] args) {
    Book book1 = new Book("Curious George", "Children Fiction", 1941, 4);
    book1.print();
    Book book2 = new Book("Cool Book", "Comedy", 2020, 14444);
    //all strings, testing
    Book book3 = new Book("Curious George", "Children Fiction", "1941", "4");
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
/**
 * <h1>This is the Booklet class</h1>
 * <p>Booklet has 1 additional field in addition to the 4 inherited from Book</p>
 * @see Book
 * @author      Alessandra Grant
 * @version     1.0
 * @since       1.0
 */
public class Booklet extends Book {
    /**
    * How many of a particular Booklet are sold in a pack together, private to protect the data.
    */
    private int numBundle;
 
    /**
    *Constructor to be used to make objects
    *  
    *@param newTitle The title of a book
    *@param newGenre The genre of a book
    *@param newDate The publishing date of a book
    *@param newRating The rating of a book
    *@param numB The number of bundles
    */
    public Booklet(String newTitle, String newGenre, int newDate, int newRating, int numB) {
       super(newTitle, newGenre, newDate, newRating); //uses Book constructor
       numBundle = numB;
     }
    
    //Getters and Setters are inherited, but we need new ones for numBundles
    /**
    * Method to access the number of bundles
    * 
    * @return the number of bundles
    */
    public int getNumBundles(){
       return numBundle;
    }
    /**
    * Method to set the number of bundles
    * @param n the number of bundles
    */
    public void setNumBundles(int n){
       numBundle = n;
    } 
 }
 }
