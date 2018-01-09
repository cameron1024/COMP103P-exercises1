package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q12 {

    private static final File inputFile = new File("C:\\Users\\cameron\\IdeaProjects\\COMP103P-exercises1\\src\\com\\company\\text.txt");
    private static final File outputFile = new File("C:\\Users\\cameron\\IdeaProjects\\COMP103P-exercises1\\src\\com\\company\\outputText.txt");

    public static void main(String[] args) throws IOException {

        if (!outputFile.exists()) outputFile.createNewFile();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile)));
        ArrayList<Character> chars = new ArrayList<>();

        String s;

        while ((s = bufferedReader.readLine()) != null) {
            for (char c : s.toCharArray()) {
                chars.add(c);
            }
        }

        Collections.reverse(chars);

        char[] outputChars = new char[chars.size()];
        for (int i = 0; i < outputChars.length; i++) {
            outputChars[i] = chars.get(i);
        }

        String outputString = new String(outputChars);

//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile)));
        Files.write(Paths.get(outputFile.getPath()), outputString.getBytes());

    }
}
