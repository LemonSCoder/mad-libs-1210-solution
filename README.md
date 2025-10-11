# 1.2.10 Mad Libs

## Note: The Improved Mad Lib code only works if the customized Mad Lib by the user has two or less inputs.

## Objective:
Create a program that takes the user's input for various nouns, verbs, adjectives, and names and concatenate them into a Mad Libs story, which may or may not be customized by the user.

## How this was Accomplished:
The Scanner class was imported from the java.util package in order to get user input. A new Scanner object (sc) was instantiated in my code shortly after. The user, upon running the program, will be asked which Mad Lib they want to input parts of speech for (Mad Lib 1 or 2; one is about visiting a grocery store and the other is about a wedding). Once the user inputs an answer, the program will check if the input, stored as an integer in the variable chooseMadLib, is either one or two. If chooseMadLib is equal to one, the player will be prompted to enter various parts of speech for the first Mad Lib, one by one. Each of the player's inputs are stored in String variables (ex. nounOne, pluralNounOne, adjectiveOne) to be used later in the final Mad Lib. Once the player is done with their inputs, these inputs, in the forms of String variables, will be concatenated into other String variables, which each consist of different, broken-down sentences of the first Mad Lib (putting the entire Mad Lib into one String variable produced an error). These new String variables containing different sentences of the first Mad Lib as well as the users' input will be concatenated together, with line breaks in between each String variable to ensure better readability by the user. Finally, the resulting Mad Lib is printed out for the user to see and the Scanner object is closed. If chooseMadLib is equal to two, the same logic as when chooseMadlib is equal to one is applied, however within the context of the second Mad Lib.

In the improved Mad Libs code, the Scanner class is imported, and a new Scanner object (sc) is instantiated in the code shortly after. The user will be prompted to put in their own custom Mad Lib, with any inputs for parts of speech being written with brackets (ex. </noun/> or </adjective/>). The custom Mad Lib will proceed to be saved in a String named originalStory. Then, the result of calling the function generateStory (which is supposed to return a String) on originalStory will be printed. The generateStory function iterates through each character in the originalStory String. If the substring of originalStory, which starts from the index i of the character the for loop is currently iterating through and ends at the length of a certain part of speech in brackets (ex. "</noun/>"), is equal to the aforementioned certain part of speech in brackets, the user will be prompted to input a certain part of speech based on that part of speech in brackets (ex. if the part of speech in brackets is equal to "</verb/>", then the user will be prompted to input a verb). That input will then be saved into a String variable. This will only apply i + 6 is less than or equal to the length of the originalStory variable (if this is not so, the catch part of the try-catch block will catch an exception and return and do nothing, as there is only a semicolon inside of the catch part of the try-catch block). There are several options for the parts of speech the player can put in currently (nouns, verbs, adjectives, adverbs, and plural nouns), however they are very limited. The new String, finalStory, will be concatenated with the substring of the original story (from the result of calling the compareStories function with originalStory, finalStory, and i as arguments and the variable i) plus the input part of speech by the user. The compareStories function will asssign the length of the substring of the originalStory from zero to i to the int variable storyLength. The function will then proceed to loop for as long as the length of originalStory is using the integer variable j. If originalStory's substring's index for ">" is equal to j, the substring appended to the final story will start from j + 1. Otherwise, the substring appended to the final story will start from the length of the substring of originalStory from 0 to i. In the generateStory function, the String finalStory will be returned and the Scanner object will close.

## 🎖️ Milestones:

### The first two rows were done together while programming. The third and fourth row were also done together while programming.

| Milestones  | Estimated Time to Develop | Actual Time to Develop |
| ------------- | ------------- | ------------- |
| Create the Mad Lib riddles  | 10 minutes  | 20 minutes |
| Find each part of speech to replace  | 10 minutes  | 20 minutes  |
| Show each part of speech to the user  | 15 minutes  | 10 minutes |
| Get the user's response  | 15 minutes | 10 minutes |
| Get the user's response Cell  | 5 minutes | 10 minutes  |
| Get user's custom Mad Lib input | 5 minutes | 5 minutes |
| Parse user input into user's custom Mad Lib | 30 minutes | 60 minutes |
| Output new Mad Lib | 5 minutes | 5 minutes |

## Code in Action:
-----------------------------
### Mad Lib One:
![images/PromptOne.png](https://github.com/LemonSCoder/mad-libs-1210-solution/blob/main/images/PromptOne.png)
### Mad Lib Two:
![https://github.com/LemonSCoder/mad-libs-1210-solution/blob/main/images/PromptTwo.png](https://github.com/LemonSCoder/mad-libs-1210-solution/blob/main/images/PromptTwo.png)
### Improved Mad Lib:
![https://github.com/LemonSCoder/mad-libs-1210-solution/blob/main/images/madLibsImproved.png](https://github.com/LemonSCoder/mad-libs-1210-solution/blob/main/images/madLibsImproved.png)
-----------------------------
