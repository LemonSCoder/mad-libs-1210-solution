//Scanner imported in order to take user input.
import java.util.Scanner;
public class Le_MadLibs {
    public static void main(String[] args) {
        //Instantiate a new Scanner object.
        Scanner sc = new Scanner(System.in);
        //Player can choose between two mad libs to play. Whichever one they choose will determine the contents of their story and what inputs are needed from them.
        System.out.println("Choose a Mad Lib (1 or 2): ");
        //Stores player's input as an integer, as the input should only be either 1 or 2.
        int chooseMadLib = sc.nextInt();
        //Mad Lib option one.
        if (chooseMadLib == 1) {
            //Avoids skipping over getting input for the name.
            sc.nextLine();
            System.out.println("Input a name: ");
            //Saves user input in String variables so that they can be referenced later and concatenated into the Mad Lib.
            String nameOne = sc.nextLine();
            System.out.println("Input an adjective: ");
            String adjectiveOne = sc.nextLine();
            System.out.println("Input a noun: ");
            String nounOne = sc.nextLine();
            System.out.println("Input a plural noun: ");
            String pluralNounOne = sc.nextLine();
            System.out.println("Input the name of a celebrity: ");
            String celebrityNameOne = sc.nextLine();
            System.out.println("Input a second plural noun: ");
            String pluralNounTwo = sc.nextLine();
            System.out.println("Input a second noun: ");
            String nounTwo = sc.nextLine();
            System.out.println("Input a song name: ");
            String songName = sc.nextLine();
            System.out.println("Input a verb ending in -ing: ");
            String verbEndOne = sc.nextLine();
            System.out.println("Input a place name: ");
            String placeOne = sc.nextLine();
            System.out.println("Input a second verb ending in -ing: ");
            String verbEndTwo = sc.nextLine();
            System.out.println("Input a third verb ending in -ing: ");
            String verbEndThree = sc.nextLine();
            //The Mad lib was too long to be held in one String variable alone, so it had to be split up into five parts.
            String madLibTextOne = "\nOne day, my friend " + nameOne  + " felt a bit " + adjectiveOne + " and wanted to go to the " + nounOne + " store. ";
            String madLibTextOneTwo = "They said that, in a perfect world, there would be no " + pluralNounOne + ". Once we got to the store, we met " + celebrityNameOne + ", who had " + pluralNounTwo + " in their " + nounTwo + ". ";
            String madLibTextOneThree = "They were singing " + songName + " and talking about " + verbEndOne + " in " + placeOne + ".";
            String madLibTextOneFour = "We said goodbye to them and went back home, " + verbEndTwo;
            String madLibTextOneFive =  " and " + verbEndThree + ".";
            //Mad Lib is concatenated together. Line breaks are present for easier readability.
            System.out.println(madLibTextOne + "\n" + madLibTextOneTwo + "\n" + madLibTextOneThree + "\n" + madLibTextOneFour + madLibTextOneFive + "\n");
        //Mad Lib option two.
        } else if (chooseMadLib == 2) {
            //Avoids skipping over getting input for the season.
            sc.nextLine();
            System.out.println("Input a season: ");
            //Saves user input in String variables so that they can be referenced later and concatenated into the Mad Lib.
            String seasonName = sc.nextLine();
            System.out.println("Input a name: ");
            String nameOne = sc.nextLine();
            System.out.println("Input a second name: ");
            String nameTwo = sc.nextLine();
            System.out.println("Input a third name: ");
            String nameThree = sc.nextLine();
            System.out.println("Input the name of a place: ");
            String placeOne = sc.nextLine();
            System.out.println("Input a type of vehicle: ");
            String vehicleOne = sc.nextLine();
            System.out.println("Input a plural noun: ");
            String pluralNounOne = sc.nextLine();
            System.out.println("Input a food: ");
            String foodOne = sc.nextLine();
            System.out.println("Input a drink: ");
            String beverageName = sc.nextLine();
            System.out.println("Input a second plural noun: ");
            String pluralNounTwo = sc.nextLine();
            System.out.println("Input the name of a song: ");
            String songName = sc.nextLine();
            //The Mad lib was too long to be held in one String variable alone, so it had to be split up into four parts.
            String madLibTextTwo = "\nOn a fine " + seasonName + " evening, my friend " + nameOne + " and I got invited to a wedding between " + nameTwo + " and " + nameThree +".";
            String madLibTextTwoTwo = "The wedding would take place at " + placeOne + ". My friend and I went by " + vehicleOne + " and got there just in time before the couple exchanged " + pluralNounOne + ".";
            String madLibTextTwoThree = "After they kissed each other, everyone got " + foodOne + " cake and drank " + beverageName  + ". We ate the cake with " + pluralNounTwo + " before going on the dance floor.";
            String madLibTextTwoFour = "We danced to " + songName + " before leaving the wedding.";
            //Mad Lib is concatenated together. Line breaks are present for easier readability.
            System.out.println(madLibTextTwo + "\n" + madLibTextTwoTwo + "\n" + madLibTextTwoThree + "\n" + madLibTextTwoFour + "\n");
        }
        //Scanner object closed to avoid memory leaks.
        sc.close();
    }
}
