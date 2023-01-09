import java.util.ArrayList;
import java.util.Collections;

public class Encryption {
    private static ArrayList<Character> list;
    private ArrayList<Character> shuffleList;
    private char aChar;

    Encryption() {
        list = new ArrayList<>();
        shuffleList = new ArrayList<>();
        aChar = ' ';
    }

    public ArrayList<Character> key() {
        aChar = ' ';
        list.clear();
        shuffleList.clear();

        for (int i = 32; i < 127; i++) {
            list.add(aChar);
            aChar++;
        }
        shuffleList = new ArrayList<>(list);
        Collections.shuffle(shuffleList);
        return shuffleList;
    }

    public char[] encrypt(String note, ArrayList<Character> key) {
        char[] letters = note.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (letters[i] == list.get(j)) {
                    letters[i] = key.get(j);
                    break;
                }
            }
        }
        return letters;
    }

    public String decrypt(char[] encryptedList, ArrayList<Character> key) {
        char[] letters;
        letters = encryptedList;
        aChar = ' ';
        list.clear();

        for (int i = 32; i < 127; i++) {
            list.add(aChar);
            aChar++;
        }

        StringBuilder builder = new StringBuilder();
        for (char letter : letters) {
            for (int j = 0; j < key.size(); j++) {
                if (letter == key.get(j)) {
                    builder.append(list.get(j));
                    break;
                }
            }
        }
        return builder.toString();
    }
}