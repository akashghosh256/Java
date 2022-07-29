import java.util.*;

// Encrypts a string to unique characters
public class Encryption {

    public static void main(String[] args) {

        EncryptionProgram ep = new EncryptionProgram();

    }

}

class EncryptionProgram {

    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private String line;
    private char[] letters;

    EncryptionProgram() {
        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList();
        shuffledList = new ArrayList();
        character = ' ';

        newKey();
        askQuestion();
    }

    private void askQuestion() {
        while (true) {
            System.out.println("-------------------------------------------------------");
            System.out.println("What do you want to do?");
            System.out.println("(N)ewKey,(G)etKey,(E)ncrypt,(D)ecrypt,(Q)uit");
            char response = Character.toUpperCase(scanner.nextLine().charAt(0)); // get first char of response

            switch (response) {
                case 'N':
                    newKey();
                    break;
                case 'G':
                    getKey();
                    break;
                case 'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'Q':
                    quit();
                    break;
                default:
                    System.out.println("Not a valid answer :(");
            }
        }
    }

    private void newKey() {

        character = ' ';
        // To clear any previous data in the list and shuffledList.
        list.clear();
        shuffledList.clear();

        // Creating new list of characters.
        for (int i = 32; i < 127; i++) {
            list.add(Character.valueOf(character));
            character++;
        }

        shuffledList = new ArrayList(list); // Creating a new list of characters.
        Collections.shuffle(shuffledList); // Shuffle the list of characters.
        System.out.println("*A new key has been generated* \n tocheck the key, select 'Get Key' option.");

    }

    private void getKey() {

        System.out.print("Normal Key:\t                ");
        for (Character x : list) {
            System.out.print(x);
        }
        System.out.print("\nShuffled Key(encrypted key):\t");
        for (Character x : shuffledList) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void encrypt() {
        System.out.println("Enter a message to be encrypted: ");
        String message = scanner.nextLine();

        letters = message.toCharArray(); // Convert the message to a char array.

        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < list.size(); j++) {
                if (letters[i] == list.get(j)) {
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }
        System.out.println("Encrypted: ");
        for (char x : letters) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void decrypt() {
        System.out.println("Enter a message to be decrypted: ");
        String message = scanner.nextLine();

        letters = message.toCharArray();

        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < shuffledList.size(); j++) {
                if (letters[i] == shuffledList.get(j)) {
                    letters[i] = list.get(j);
                    break;
                }
            }
        }
        System.out.println("Decrypted: ");
        for (char x : letters) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void quit() {
        System.out.println("Thank you, have a nice day bro!");
        System.exit(0);
    }
}