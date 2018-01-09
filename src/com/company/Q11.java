package com.company;

import java.io.*;
import java.util.HashMap;

public class Q11 {

    private HashMap<Character, Integer> chars = new HashMap<>();
    private static final File file = new File("C:\\Users\\cameron\\IdeaProjects\\COMP103P-exercises1\\src\\com\\company\\text.txt");

    public static void main(String[] args) throws IOException {

        Q11 q11 = new Q11();

        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        int r;
        while ((r = bufferedReader.read()) != -1) {
            char c = ((char) r);
            q11.handleChar(c);
        }

        q11.displayCharCount();
    }

    private void handleChar(char c) {
        if (chars.containsKey(c)) chars.put(c, chars.get(c) + 1); // increment map value
        else chars.put(c, 1);
    }

    private void displayCharCount() {
        chars.forEach((c, i) -> {
            System.out.println("character \"" + c + "\" occurs " + i + " times.");
        });
    }
}
