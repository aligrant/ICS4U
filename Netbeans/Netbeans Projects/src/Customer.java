
import java.io.*;
// the underlined imports are needed if the program were to be text-file-less. See commented out method Map().
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public final class Customer {

    /*
There is a bunch of customer information. The manager can make a new customer and get info about other customers
    
     */
    /**
     *
     * <h1>This is the Customer program</h1>
     * <p>
     * The customer program allows a manager to receive and edit information about customers. </p>
     *
     * @author Alessandra Grant
     * @version 1.0
     * @since 1.0
     */
    
    /*
    I created my own sort of object database in the text file(unleashed my inner software engineer),
    so the fields below aren't needed but I added them incase this code ever were to be text-file-less.
    see the commented out method below for how the fields can be accessed
     */
    private final String username;
    private String firstName;
    private String lastName;
    private String[] Passwords;
    private String[] itemNames;
    private Double[] itemPrices;

    public Customer(String User) {
        username = User;
        firstName = getFirstName(User);
        lastName = getLastName(User);
        for (int i = 0; i < 6; i++) {
            Passwords[i] = getPassword(User, i);
        }
        for (int j = 0; j < 10; j++) {
            itemNames[j] = getItem(User, j);
        }
        for (int k = 0; k < 10; k++) {
            itemPrices[k] = getPrice(User, k);
        }
    }

    public static String getFirstName(String user) {
        String[] lines = {"name", "name", "name"};
        try {
            File myObj = new File("customersData.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String nLine = myReader.nextLine();
//need to have this if statement here because if manager chooses first customer this needs to check if theyre there before moving to the next line. 
                if (nLine.contains(user)) {
                    lines = nLine.split(",");
                }
                for (int i = 0; nLine.contains(user) == false; i++) {
                    nLine = myReader.nextLine();
                    if (nLine.contains(user)) {
                        lines = nLine.split(",");
                    }
                }
                break;
            }
            myReader.close();
        } catch (IOException ioe) {
        }
        return (lines[1]);
    }

    public static String getLastName(String user) {
        String[] lines = {"name", "name", "name"};
        try {
            File myObj = new File("customersData.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String nLine = myReader.nextLine();
//need to have this if statement here because if manager chooses first customer this needs to check if theyre there before moving to the next line. 
                if (nLine.contains(user)) {
                    lines = nLine.split(",");
                }
                for (int i = 0; nLine.contains(user) == false; i++) {
                    nLine = myReader.nextLine();
                    if (nLine.contains(user)) {
                        lines = nLine.split(",");
                    }
                }
                break;
            }
            myReader.close();
        } catch (IOException ioe) {
        }
        return (lines[2]);
    }

    public static String getPassword(String user, int num) {
        String[] pswds = {"0", "0", "0", "0", "0", "0"};
        /*Passwords must contain 8 characters (with 1 letter, 1 number, 1 symbol)

The passwords are in order from newest to oldest*/
        try {
            File myObj = new File("customersData.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String nLine = myReader.nextLine();
//need to have this if statement here because if manager chooses first customer this needs to check if theyre there before moving to the next line. 
                if (nLine.contains(user)) {
                    //each time i call next line it references previous, so this makes it go to second line
                    pswds = myReader.nextLine().split(",");
                }
                for (int i = 0; nLine.contains(user) == false; i++) {
                    nLine = myReader.nextLine();
                    if (nLine.contains(user)) {
                        //same as before, i need to get second line
                        pswds = myReader.nextLine().split(",");
                    }
                }
                break;
            }
            myReader.close();
        } catch (IOException ioe) {
        }
        return (pswds[num]);
    }

    public static Double getPrice(String user, int num) {
        //spaces for ten prices
        String[] prices = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
//The item prices are in order from newest to oldest
        try {
            File myObj = new File("customersData.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String nLine = myReader.nextLine();
//need to have this if statement here because if manager chooses first customer this needs to check if theyre there before moving to the next line. 
                if (nLine.contains(user)) {
                    //each time i call next line it references previous, so this makes it go to second line
                    //extra 2 reader.nextline because item prices are on third line of each customers section
                    myReader.nextLine();
                    myReader.nextLine();
                    prices = myReader.nextLine().split(",");
                }
                for (int i = 0; nLine.contains(user) == false; i++) {
                    nLine = myReader.nextLine();
                    if (nLine.contains(user)) {
                        //same as before, i need to get second and then third and then fourth line
                        myReader.nextLine();
                        myReader.nextLine();
                        prices = myReader.nextLine().split(",");
                    }
                }
                break;
            }
            myReader.close();
        } catch (IOException ioe) {
        }
        Double priceDouble = Double.parseDouble(prices[num]);
        return (priceDouble);
    }

    public static String getItem(String user, int num) {
        //spaces for ten items
        String[] items = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
//The items are in order from newest to oldest
        try {
            File myObj = new File("customersData.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String nLine = myReader.nextLine();
//need to have this if statement here because if manager chooses first customer this needs to check if theyre there before moving to the next line. 
                if (nLine.contains(user)) {
                    //each time i call next line it references previous, so this makes it go to second line
                    //extra reader.nextline because items are on third line of each customers section
                    myReader.nextLine();
                    items = myReader.nextLine().split(",");
                }
                for (int i = 0; nLine.contains(user) == false; i++) {
                    nLine = myReader.nextLine();
                    if (nLine.contains(user)) {
                        //same as before, i need to get second and then third line
                        myReader.nextLine();
                        items = myReader.nextLine().split(",");
                    }
                }
                break;
            }
            myReader.close();
        } catch (IOException ioe) {
        }
        return (items[num]);
    }
    public static void itemOptions(String user) {
        System.out.println('\n' + "ITEM OPTIONS");
        System.out.println("#1 PRICE: HIGH TO LOW");
        System.out.println("#2 PRICE: LOW TO HIGH");
        System.out.println("#3 CALCULATE: AVERAGE PRICE");
        System.out.println("#4 CALCULATE: MEDIAN PRICE");
        System.out.println("#5 ITEM: HIGHEST PRICED");
        System.out.println("#6 ITEM: LOWEST PRICED");
        System.out.println("#7 GET PRICE OF ITEM");
        System.out.println('\n' + "#8 BACK");
        System.out.print("Select a number" + '\n' + "#");
        Scanner scanning = new Scanner(System.in);
        switch (scanning.nextInt()) {
            case 1:
                System.out.println('\n' + "Items from highest to lowest price");
                for (int i = 9; i >= 0; i--) {
                    System.out.println(getItem(user, orderItem(user, i)) + ": $" + getPrice(user, orderItem(user, i)));
                }
                System.out.println('\n' + "Press enter to go back to options.");
                try {
                    System.in.read();
                } catch (IOException e) {
                }
                itemOptions(user);
                break;
            case 2:
                System.out.println('\n' + "Items from lowest to highest price");
                for (int i = 0; i < 10; i++) {
                    System.out.println(getItem(user, orderItem(user, i)) + ": $" + getPrice(user, orderItem(user, i)));
                }
                System.out.println('\n' + "Press enter to go back to options.");
                try {
                    System.in.read();
                } catch (IOException e) {
                }
                itemOptions(user);
            case 3:
                System.out.println("Average price: $" + getAverage(user));
                System.out.println('\n' + "Press enter to go back to options.");
                try {
                    System.in.read();
                } catch (IOException e) {
                }
                itemOptions(user);
                break;
            case 4:
                System.out.println("Median price: $" + getMedian(user));
                System.out.println('\n' + "Press enter to go back to options.");
                try {
                    System.in.read();
                } catch (IOException e) {
                }
                itemOptions(user);
                break;
            case 5:
                System.out.println('\n' + "Highest priced item" + '\n' + getItem(user, orderItem(user, 9)) + ": $" + getPrice(user, orderItem(user, 9)));
                System.out.println('\n' + "Press enter to go back to options.");
                try {
                    System.in.read();
                } catch (IOException e) {
                }
                itemOptions(user);
                break;
            case 6:
                System.out.println('\n' + "Lowest priced item" + '\n' + getItem(user, orderItem(user, 0)) + ": $" + getPrice(user, orderItem(user, 0)));
                System.out.println('\n' + "Press enter to go back to options.");
                try {
                    System.in.read();
                } catch (IOException e) {
                }
                itemOptions(user);
                break;
            case 7:
                System.out.println("What item would you like to get the price of?");
//list of items with numbers
                for (int i = 0; i < 10; i++) {
                    System.out.println("#" + (i + 1) + " " + getItem(user, i));
                }
                System.out.println("Select an item");
                System.out.print('\n' + "#");
                Scanner scanner7 = new Scanner(System.in);
                int itemInput = Integer.parseInt(scanner7.next()) - 1;

                System.out.println("The price is " + getPrice(user, itemInput));
                System.out.println('\n' + "Press enter to go back to options.");
                try {
                    System.in.read();
                } catch (IOException e) {
                }
                itemOptions(user);
                break;
            case 8:
                Options(user);
                break;
            default:
                System.out.println("Unrecognised user input, please try again.");
                itemOptions(user);
                break;
        }
    }

    public static int orderItem(String user, int num) {
        //selection sort but i keep track of the index changes so that i just return the ordered original indexes
        Double tempNum;
        int tempI;
        int tempIndex = 0;
        int[] indexi = new int[10];
        //using selection sort because there is only ten variables
        Double[] orderedItems = new Double[10];
        //geting array of prices unsorted
        for (int j = 0; j < 10; j++) {
            orderedItems[j] = getPrice(user, j);
            indexi[j] = j;
        }
        for (int n = 0; n < 10; n++) {
            //Find lowest number in array left to be sorted
            tempNum = orderedItems[n];
            tempI = indexi[n];
            for (int i = n; i < 9; i++) {
                if (orderedItems[i + 1] < tempNum) {
                    tempNum = orderedItems[i + 1];
                    tempI = indexi[i + 1];
                    tempIndex = i + 1;
                }
            }
            /*If the array at n is not the lowest, swap with the lowest*/
            if (tempNum != orderedItems[n]) {
                indexi[tempIndex] = indexi[n];
                indexi[n] = tempI;
                orderedItems[tempIndex] = orderedItems[n];
                orderedItems[n] = tempNum;
            }
        }
        return indexi[num];
    }

    public static Double getMedian(String user) {
        //median is mean of ordered items [3] and [4]
        Double median = (getPrice(user, orderItem(user, 3)) + getPrice(user, orderItem(user, 4))) / 2;
        return median;
    }

    public static Double getAverage(String user) {
        //add all prices and divide by ten
        Double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += getPrice(user, i);
        }
        Double average = sum / 10;
        return average;
    }

    public static void newFirstName(String user, String input) {
        try {
            File file = new File("customersData.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            String oldtext = "";
            while ((line = reader.readLine()) != null) {
                oldtext += line + "\r\n";

            }
            reader.close();
            //To replace a line in a file
            String newtext = oldtext.replace(getFirstName(user), " " + input);
            FileWriter writer = new FileWriter("customersData.txt");
            writer.write(newtext);
            writer.close();
        } catch (IOException ioe) {
        }
    }

    public static void newLastName(String user, String input) {
        try {
            File file = new File("customersData.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            String oldtext = "";
            while ((line = reader.readLine()) != null) {
                oldtext += line + "\r\n";
            }
            reader.close();
            //To replace a line in a file
            String newtext = oldtext.replace(getLastName(user), " " + input);
            FileWriter writer = new FileWriter("customersData.txt");
            writer.write(newtext);
            writer.close();
        } catch (IOException ioe) {
        }
    }

    public static void newPassword(final String user) {
        System.out.print("New Password: ");
        Scanner scanning3 = new Scanner(System.in);
        String input = scanning3.next();
        //newPline is final because if i used the method to update passwords each time then it would just return the same string for every password
        //clarification: getPassword() reads from file, so if I update file with new password then when i try and get old password it will just return the new one
        final String newPline = input + ", " + getPassword(user, 0) + ", " + getPassword(user, 1) + ", " + getPassword(user, 2) + ", " + getPassword(user, 3) + ", " + getPassword(user, 4);
        boolean valid = true;
        for (int i = 0; i < 5; i++) {
            if (input.equals(getPassword(user, i))) {
                System.out.println("Password must not be one of the past 6 passwords.");
                valid = false;
            }
        }
        if (input.length() != 8) {
            System.out.println("Password must be 8 characters");
            valid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        String lowerCaseChars = "(.*[a-z].*)";
        if (!input.matches(upperCaseChars) & !input.matches(lowerCaseChars)) {
            System.out.println("Password must have atleast one letter");

            valid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!input.matches(numbers)) {
            System.out.println("Password must have atleast one number");
            valid = false;
        }
        String specialChars = "(.*[#,$,%,.,^,&,*,(,),<,>,?,;,:,`,!,~].*$)";
        if (!input.matches(specialChars)) {
            System.out.println("Password must have atleast one symbol (@ not included)");
            valid = false;
        }
        if (valid == false) {
            newPassword(user);
        } else {
            System.out.println("Saved!");
            try {
                //the code below basically replaces the line after the selected user line with the new password + last five passwords
                File file = new File("customersData.txt");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                String text = "";
                while ((line = reader.readLine()) != null) {
                    if (line.contains(user)) {
                        text += line + "\r\n" + newPline + "\r\n";
                        //reads line to skip over the previous password line
                        reader.readLine();
                    } else {
                        //if line is not from selected user, just written normally with no changes
                        text += line + "\r\n";
                    }
                }
                reader.close();
                FileWriter writer = new FileWriter("customersData.txt");
                writer.write(text);
                writer.close();
            } catch (IOException ioe) {
            }
            editProfile(user);
        }
    }

    public static String newItem(String user) {
        System.out.print("Item Name: ");
        Scanner scanning4 = new Scanner(System.in);
        String input = scanning4.next();
        System.out.print("Item Price: $");
        Scanner scanning5 = new Scanner(System.in);
        String inputNum = scanning5.next();
        //both below are final because if i used the method to update items each time then it would just return the same string for every item
        //clarification: getItems() and getPrices() reads from file, so if I update file with new item then when i try and get old item it will just return the new one
        final String newIline = " " + input + "," + getItem(user, 0) + "," + getItem(user, 1) + "," + getItem(user, 2) + "," + getItem(user, 3) + "," + getItem(user, 4) + "," + getItem(user, 5) + "," + getItem(user, 6) + "," + getItem(user, 7) + "," + getItem(user, 8);
        final String newPrline = " " + inputNum + "," + getPrice(user, 0) + "," + getPrice(user, 1) + "," + getPrice(user, 2) + "," + getPrice(user, 3) + "," + getPrice(user, 4) + "," + getPrice(user, 5) + "," + getPrice(user, 6) + "," + getPrice(user, 7) + "," + getPrice(user, 8);
        try {
            //the code below basically replaces 2 line after the selected user line with the new item + last 9 items
            File file = new File("customersData.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            String text = "";
            while ((line = reader.readLine()) != null) {
                if (line.contains(user)) {

                    text += line + "\r\n";
                    //replaces item names and prices with updated lines
                    text += reader.readLine() + "\r\n" + newIline + "\r\n" + newPrline + "\r\n";
                    //reads line to skip over the previous item line
                    reader.readLine();
                    reader.readLine();
                } else {
                    //if line is not from selected user, just written normally with no changes
                    text += line + "\r\n";
                }
            }
            reader.close();
            FileWriter writer = new FileWriter("customersData.txt");
            writer.write(text);
            writer.close();
        } catch (IOException ioe) {
        }
        viewItems(user);
        return null;
    }
    static Scanner userInput = new Scanner(System.in);
    public static void Search() {
        System.out.print("Enter a username:" + '\n' + "@");
        String input = userInput.next();
        switch (input) {
            case "sarahg1":
                Options(input);
                break;
            case "sohaila2":
                Options(input);
                break;
            case "emilyz3":
                Options(input);
                break;
            case "alig4":
                Options(input);
                break;
            default:
                System.out.println("Unrecognised user input, please run again.  ");
                Search();
        }
    }

    public static void Options(String user) {
        System.out.print(
                '\n' + "Options" + '\n' + "#1 PROFILE" + '\n' + "#2 PURCHASED ITEMS" + '\n' + "#3 SEARCH AGAIN" + '\n' + "Select a number" + '\n' + "#");
        Scanner scanning = new Scanner(System.in);
        switch (scanning.nextInt()) {
            case 1:
                viewProfile(user);
                break;
            case 2:
                viewItems(user);
                break;

            case 3:
                System.out.println();
                Search();
                break;

            default:
                System.out.println("Unrecognised user input, please try again.");
                Options(user);
        }

    }
//Previously I was using the objects instead of the text file to acess data, this is how I did it:(reffered to customer from String input)

    /*
    public static Map<String, Customer> conver = new HashMap<String, Customer>();
    public static Customer getCustomer(String user) {
        Customer sarahg1 = new Customer("sarahg1");
        Customer sohaila2 = new Customer("sohaila2");
        Customer emilyz3 = new Customer("emilyz3");
        Customer alig4 = new Customer("alig4");
        conver.put("sarahg1", sarahg1);
        conver.put("sohaila2", sohaila2);
        conver.put("emilyz3", emilyz3);
        conver.put("alig4", alig4);
        return (conver.get(user));
    }
     */

    public static void print() {
        try {
            File file = new File("customersData.txt");
            file.createNewFile();
            FileWriter fw = new FileWriter("customersData.txt"); //makes a text file object

            PrintWriter pw = new PrintWriter(fw); // Makes a new Print Writer object
            //SARAH INFO
            pw.println("@sarahg1, Sarah, Graham" + '\n' + "Sarahg.1, Sarahg.2, Sarahg.3, Sarahg.4, Sarahg.5, Sarahg.6");
            pw.println(" apple, bananna, hockey_puck, orange, popcorn, paper, pencil_case, iphone_charger, white_paint, tissue_box");
            pw.println(" 1.50, 2.05, 8.00, 1.00, 7.00, 25.00, 12.00, 29.00, 48.00, 5.00");
            //SOHAIL INFO
            pw.println("@sohaila2, Sohail, Adil" + '\n' + "Sohail.1, Sohail.2, Sohail.3, Sohail.4, Sohail.5, Sohail.6");
            pw.println(" pencil, hairbrush, notebook, keycaps, mouse, toy_car, wallet, bubblegum, marker, tablet");
            pw.println(" 0.50, 13.00, 12.00, 33.00, 31.00, 5.00, 11.00, 2.00, 1.00, 600.00");
            //EMILY INFO
            pw.println("@emilyz3, Emily, Zhang" + '\n' + "Emilyz.1, Emilyz.2, Emilyz.3, Emilyz.4, Emilyz.5, Emilyz.6");
            pw.println(" cup, coaster, agenda, origami_paper, binder, folder, mirror, trim_paint, ceiling_light, desk");
            pw.println(" 11.00, 4.00, 14.00, 16.00, 15.00, 2.00, 49.00, 50.00, 220.00, 490.99");
            //ALI INFO
            pw.println("@alig4, Ali, Grant" + '\n' + " Aligr.1, Aligr.2, Aligr.3, Aligr.4, Aligr.5, Aligr.6");
            pw.println(" monitor, webcam, lamp, stickers, carpet, laundry_hamper, book, travel_mug, stool, keychain");
            pw.println(" 140.00, 50.00, 54.00, 5.00, 270.00, 30.00, 15.00, 17.00, 25.00, 3.50");

            pw.close(); //close print writer 
        } catch (IOException e) {
            System.out.println("there was an error");
        }
    }

    public static void viewProfile(String user) {
        System.out.println('\n' + "PROFILE");
        System.out.println("First Name:" + getFirstName(user) + '\n' + "Last Name:" + getLastName(user));
        System.out.println("Username: " + "@" + user);
        System.out.print("Password: " + getPassword(user, 0) + '\n');
        System.out.print('\n' + "#1 EDIT PROFILE" + '\n' + "#2 BACK" + '\n' + "#");
        Scanner scanning = new Scanner(System.in);
        switch (scanning.nextInt()) {
            case 1:
                editProfile(user);
                break;
            case 2:
                Options(user);
                break;
            default:
                System.out.println("Unrecognised user input, please try again.");
                viewProfile(user);
                break;
        }
    }

    public static void viewItems(String user) {
        System.out.println('\n' + "PURCHASED ITEMS");
        for (int i = 0; i < 10; i++) {
            System.out.println(getItem(user, i) + ": $" + getPrice(user, i));
        }
        System.out.print('\n' + "#1 ADD ITEM" + '\n' + "#2 ITEM OPTIONS" + '\n' + "#3 BACK" + '\n' + "#");
        Scanner scanning = new Scanner(System.in);
        switch (scanning.nextInt()) {
            case 1:
                newItem(user);
                break;
            case 2:
                itemOptions(user);
                break;
            default:
                System.out.println("Unrecognised user input, please try again.");
                viewItems(user);
                break;
        }
    }

    public static void editProfile(String user) {
        System.out.println('\n' + "PROFILE");
        System.out.println("What would you like to edit?");
        System.out.println("#1 FIRST NAME:" + getFirstName(user) + '\n' + "#2 LAST NAME:" + getLastName(user));
        System.out.print("#3 PASSWORD: " + getPassword(user, 0) + '\n');
        System.out.println('\n' + "#4 DONE");
        System.out.print("Select a number" + '\n' + "#");
        Scanner scanning = new Scanner(System.in);
        switch (scanning.nextInt()) {
            case 1:
                System.out.print("New First Name: ");
                Scanner scanning1 = new Scanner(System.in);
                String fName = scanning1.next();
                newFirstName(user, fName);
                editProfile(user);
                break;
            case 2:
                System.out.print("New Last Name: ");
                Scanner scanning2 = new Scanner(System.in);
                String lName = scanning2.next();
                newLastName(user, lName);
                editProfile(user);
                break;
            case 3:
                System.out.println("Password must be 8 characters long and include a number, letter, and symbol.");
                newPassword(user);
                break;
            case 4:
                viewProfile(user);
                break;
            default:
                System.out.println("Unrecognised user input, please try again.");
                editProfile(user);
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Customer usernames in database: sarahg1, sohaila2, emilyz3, alig4" + '\n');
        print();
        Search();
    }
}
