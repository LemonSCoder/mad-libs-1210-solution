import java.util.Scanner;
public class MadLibsImproved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Mad Lib (for any input, the type of input should be in angle brackets ex. <noun>): ");
        String originalStory = sc.nextLine();
        System.out.println(generateStory(originalStory));
        sc.close();
    }
    public static String generateStory(String originalStory) {
        String finalStory = "";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < originalStory.length(); i++) {
            //if (originalStory.indexOf("<") == i) {
            try {
                if (i + 6 <= originalStory.length()) {
                    if (originalStory.substring(i, i + 6).equals("<noun>")) {
                        System.out.print("Input a noun: ");
                        String newNoun = sc.nextLine();
                        finalStory += originalStory.substring(compareStories(originalStory, finalStory, i), i) + newNoun;
                    } else if (originalStory.substring(i, i + 6).equals("<verb>")) {
                        System.out.print("Input a verb: ");
                        String newVerb = sc.nextLine();
                        finalStory += originalStory.substring(compareStories(originalStory, finalStory, i), i) + newVerb;
                    } else if (originalStory.substring(i, i+11).equals("<adjective>")) {
                        System.out.print("Input an adjective: ");
                        String newAdjective = sc.nextLine();
                        //I'll fix this later.
                        finalStory += originalStory.substring(compareStories(originalStory, finalStory, i), i) + newAdjective;
                    } else if (originalStory.substring(i, i+7).equals("<adverb>")) {
                        System.out.print("Input an adverb: ");
                        String newAdverb = sc.nextLine();
                        //I'll fix this later.
                        finalStory += originalStory.substring(compareStories(originalStory, finalStory, i), i) + newAdverb;
                    } else if (originalStory.substring(i, i+11).equals("<plural noun>")) {
                        System.out.print("Input a plural noun: ");
                        String newPluralNoun = sc.nextLine();
                        //I'll fix this later.
                        finalStory += originalStory.substring(compareStories(originalStory, finalStory, i), i) + newPluralNoun;
                    }
                }
            } catch (Exception e) {
                ;
            }
        }
        //}
        sc.close();
        return finalStory;
    }
    public static int compareStories(String originalStory, String finalStory, int index) {
        int storyLength = originalStory.substring(0, index).length();
        for (int j = storyLength; j < originalStory.length(); j--) {
            if (originalStory.substring(0, index).indexOf(">") == j) {
                return j+1;
            }
        }
        return originalStory.substring(0, index).length();
    }
}
