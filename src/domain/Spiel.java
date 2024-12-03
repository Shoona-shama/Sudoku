package domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Spiel {

    public static ArrayList<String> readFile(String path) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        Scanner sc = new Scanner(new File(path));
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        sc.close();
        return lines;
    }

    public int [][] sudokuBelegen(String sudokuNumbers) throws IllegalArgumentException{
        int [][] sudokuBelegen = new int[9][9];
        if (sudokuNumbers == null || sudokuNumbers.length() != 81) {
            throw new IllegalArgumentException("Input string must contain exactly 81 digits.");
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Parse the corresponding character from the string and convert it to an integer
                sudokuBelegen[i][j] = Character.getNumericValue(sudokuNumbers.charAt(i * 9 + j));
            }
        }
        return sudokuBelegen;
    }

    














}
