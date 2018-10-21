package pl.sda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMap {

    private static final String FILE_PATH = "words.txt";

    public static void main(String[] args) throws FileNotFoundException {

        Map<String, String> dictionary = prepareDictionary();
        String word = getWord();
        System.out.println(translate(dictionary, word));
    }

    private static String translate(Map<String, String> dictionary, String word) {
        return dictionary.get(word);
    }

    private static String getWord() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static Map<String, String> prepareDictionary() throws FileNotFoundException {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(new File(FILE_PATH));

        while (scanner.hasNextLine()) {
            String key = scanner.next();
            String value = scanner.next();

            dictionary.put(key, value);
        }

        scanner.close();
        return dictionary;
    }
}
