package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q19 {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\cameron\\IdeaProjects\\COMP103P-exercises1\\src\\com\\company\\Q18.java");
        byte[] bytes = Files.readAllBytes(Paths.get(f.toURI()));
        String s = new String(bytes, "UTF-8");

        Parser parser = new Parser(s);
        System.out.println(parser.verify());
    }

    static class Parser {
        final String textToParse;

        int currentIndex = 0;
        boolean singleLineComment = false;
        boolean multilineComment = false;

        int parentheses = 0;
        int braces = 0;
        int brackets = 0;

        private void iterate() {

            if (textToParse.charAt(currentIndex) == '/' && textToParse.charAt(currentIndex + 1) == '/') singleLineComment = true;
            if (textToParse.charAt(currentIndex) == '\n') singleLineComment = false;

            if (textToParse.charAt(currentIndex) == '/' && textToParse.charAt(currentIndex + 1) == '*') multilineComment = true;
            if (textToParse.charAt(currentIndex) == '*' && textToParse.charAt(currentIndex + 1) == '/') multilineComment = false;

            if (!singleLineComment && !multilineComment) {
                if (textToParse.charAt(currentIndex) == '{') braces++;
                if (textToParse.charAt(currentIndex) == '}') braces--;
                if (textToParse.charAt(currentIndex) == '(') parentheses++;
                if (textToParse.charAt(currentIndex) == ')') parentheses--;
                if (textToParse.charAt(currentIndex) == '[') brackets++;
                if (textToParse.charAt(currentIndex) == ']') brackets--;
            }

            currentIndex++;

        }

        public boolean verify() {
            for (int i = 0; i < textToParse.length() - 1; i++) {
                iterate();
            }

            return (parentheses == 0) && (brackets == 0) && (braces == 0);
        }


        public Parser(String textToParse) {
            this.textToParse = textToParse;
        }
    }
}
