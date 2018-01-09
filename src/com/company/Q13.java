package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Q13 {

    private static final File inputFile = new File("C:\\Users\\cameron\\IdeaProjects\\COMP103P-exercises1\\src\\com\\company\\text.txt");
    private static final File outputFile = new File("C:\\Users\\cameron\\IdeaProjects\\COMP103P-exercises1\\src\\com\\company\\outputText.txt");

    public static void main(String[] args) throws IOException {

        if (outputFile.exists()) {
            outputFile.delete();
            outputFile.createNewFile();
        } else {
            outputFile.createNewFile();
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile)));
        ArrayList<String> lines = new ArrayList<>();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile, true));

//        lines.stream().filter(s -> checkPalindrome(s)).forEach(s -> {
//            try {
//                bufferedWriter.append(s + "\n");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });

        lines.forEach(s -> {
            if (checkPalindrome(s)) {
                try {
                    Files.write(Paths.get(outputFile.toURI()), (s + "\n").getBytes(), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


    }

    private static String tidyString(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }

    private static boolean checkPalindrome(String s) {
        s = tidyString(s);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
