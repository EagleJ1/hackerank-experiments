package com.hackerrank.test.challenging;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

/**
 * Created by jackalhan on 1/27/17.
 */
public class Hash_Tables_Ransom_Note {

    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Hash_Tables_Ransom_Note(String magazine, String note) {
        if (magazineMap == null)
            magazineMap = new HashMap<String, Integer>();
        addMagazine(magazine);
        if (noteMap == null)
            noteMap = new HashMap<String, Integer>();
        addNote(note);
    }

    public void addMagazine(String magazine) {
        for (String word : magazine.split(" ")) {
            magazineMap.compute(word, (key, value) -> (value == null || value == 0) ? 1 : (value + 1));
        }
    }

    public void addNote(String note) {
        for (String word : note.split(" ")) {
            noteMap.compute(word, (key, value) -> (value == null || value == 0) ? 1 : (value + 1));
        }
    }

    public boolean solve() {

        for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            if (magazineMap.get(entry.getKey()) < entry.getValue())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Hash_Tables_Ransom_Note s = new Hash_Tables_Ransom_Note(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if (answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
