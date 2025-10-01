# 1.2.10 Mad Libs

## Objective:
Create a program that takes the user's input for various nouns, verbs, adjectives, and names and parses them into a Mad Libs story.

## How this was Accomplished:
The Scanner class was imported from the java.util package in order to get user input. A new Scanner object (sc) was instantiated in my code shortly after. The user, upon running the program, will be asked which Mad Lib they want to input parts of speech for (Mad Lib 1 or 2; one is about visiting a grocery store and the other is about a wedding). Once the user inputs an answer, the program will check if the input, stored as an integer in the variable chooseMadLib, is either one or two. If chooseMadLib is equal to one, the player will be prompted to enter various parts of speech for the first Mad Lib, one by one. Each of the player's inputs are stored in String variables (ex. nounOne, pluralNounOne, adjectiveOne) to be used later in the final Mad Lib. Once the player is done with their inputs, these inputs, in the forms of String variables, will be concatenated into other String variables, which each consist of different, broken-down sentences of the first Mad Lib (putting the entire Mad Lib into one String variable produced an error). These new String variables containing different sentences of the first Mad Lib as well as the users' input will be concatenated together, with line breaks in between each String variable to ensure better readability by the user. Finally, the resulting Mad Lib is printed out for the user to see and the Scanner object is closed. If chooseMadLib is equal to two, the same logic as when chooseMadlib is equal to one is applied, however within the context of the second Mad Lib.

## 🎖️ Milestones:

### The first two rows were done together while programming. The third and fourth row were also done together while programming.

| Milestones  | Estimated Time to Develop | Actual Time to Develop |
| ------------- | ------------- | ------------- |
| Create the Mad Lib riddles  | 10 minutes  | 20 minutes |
| Find each part of speech to replace  | 10 minutes  | 20 minutes  |
| Show each part of speech to the user  | 15 minutes  | 10 minutes |
| Get the user's response  | 15 minutes | 10 minutes |
| Get the user's response Cell  | 5 minutes | 10 minutes  |

## Code in Action:
-----------------------------
### Mad Lib One:
![images/PromptOne.png](https://github.com/LemonSCoder/mad-libs-1210-solution/blob/main/images/PromptOne.png)
### Mad Lib Two:
![https://github.com/LemonSCoder/mad-libs-1210-solution/blob/main/images/PromptTwo.png](https://github.com/LemonSCoder/mad-libs-1210-solution/blob/main/images/PromptTwo.png)
-----------------------------
