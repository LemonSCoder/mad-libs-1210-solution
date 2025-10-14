import java.util.Scanner;
public class MadLibsImproved {
    public static void main(String[] args) {
        //Instantiate new Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Mad Lib (for any input, the type of input should be in angle brackets ex. <noun>): ");
        //User story input saved in originalStory String variable.
        String originalStory = sc.nextLine();
        //Result will be printed out.
        System.out.println(generateStory(originalStory));
        //Close Scanner sc to prevent any data leakage.
        sc.close();
    }
    public static String generateStory(String originalStory) {
        String finalStory = "";
        Scanner sc = new Scanner(System.in);
        //Checks each character in originalStory
        for (int i = 0; i < originalStory.length(); i++) {
            //if (originalStory.indexOf("<") == i) {
            try {
                //Checks if the length of originalStory is greater than or equal to i + 6 (prevents an out of bounds exception from occurring).
                if (i + 6 <= originalStory.length()) {
                    //Checks for "<noun>" in originalStory.
                    if (originalStory.substring(i, i + 6).equals("<noun>")) {
                        System.out.print("Input a noun: ");
                        //Saves user's noun input.
                        String newNoun = sc.nextLine();
                        //Saves original contents of originalStory up until the new noun and adds the new noun to it.
                        finalStory += originalStory.substring(compareStories(originalStory, finalStory, i), i) + newNoun;
                    //Checks for "<verb>" in originalStory.
                    } else if (originalStory.substring(i, i + 6).equals("<verb>")) {
                        System.out.print("Input a verb: ");
                        //Saves user's verb input.
                        String newVerb = sc.nextLine();
                        //Saves original contents of originalStory up until the new verb and adds the new verb to it.
                        finalStory += originalStory.substring(compareStories(originalStory, finalStory, i), i) + newVerb;
                    //Checks for "<adjective>" in originalStory.
                    } else if (originalStory.substring(i, i+11).equals("<adjective>")) {
                        System.out.print("Input an adjective: ");
                        //Saves user's adjective input.
                        String newAdjective = sc.nextLine();
                        //Saves original contents of originalStory up until the new adjective and adds the new adjective to it.
                        finalStory += originalStory.substring(compareStories(originalStory, finalStory, i), i) + newAdjective;
                    //Checks for "<adverb>" in originalStory.
                    } else if (originalStory.substring(i, i+7).equals("<adverb>")) {
                        System.out.print("Input an adverb: ");
                        //Saves user's adverb input.
                        String newAdverb = sc.nextLine();
                        //Saves original contents of originalStory up until the new adverb and adds the new adverb to it.
                        finalStory += originalStory.substring(compareStories(originalStory, finalStory, i), i) + newAdverb;
                    //Checks for "<plural noun>" in originalStory.
                    } else if (originalStory.substring(i, i+11).equals("<plural noun>")) {
                        System.out.print("Input a plural noun: ");
                        //Saves user's plural noun input.
                        String newPluralNoun = sc.nextLine();
                        //Saves original contents of originalStory up until the new plural noun and adds the new plural noun to it.
                        finalStory += originalStory.substring(compareStories(originalStory, finalStory, i), i) + newPluralNoun;
                    }
                }
            //In case of any exception that occurs (ex. index out of bounds)
            } catch (Exception e) {
                //Nothing is printed.
                ;
            }
        }
        //}
        sc.close();
        //The finalStory is returned.
        return finalStory;
    }
    public static int compareStories(String originalStory, String finalStory, int index) {
        //Gets length of the story up until before the replacement for a certain part of speech.
        int storyLength = originalStory.substring(0, index).length();
        //Goes backward through storyLength.
        for (int j = storyLength; j < originalStory.length(); j--) {
            //Tries to look for the index of the closest ">".
            if (originalStory.substring(0, index).indexOf(">") == j) {
                //String appended to finalStory will start after the ">" sign found by the conditional.
                return j+1;
            }
        }
        //String appended to finalStory will start at the end of the given substring.
        return originalStory.substring(0, index).length();
    }
}
