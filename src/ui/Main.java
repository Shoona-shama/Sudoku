package ui;

import domain.Spiel;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import static domain.Spiel.readFile;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("---- Sudoku -----");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("    a  b  c   d  e  f   g  h  i ");
        System.out.println("---------------------------------");
        Spiel sudoku = new Spiel();
        String path = "resources/sudokus.csv";
        ArrayList<String> lines = readFile(path);

        String firstLine = lines.get(0); // Take the first puzzle
        String sudokuNumbers = firstLine.split(",")[0];

        int[][] grid = sudoku.sudokuBelegen(sudokuNumbers);
        printSudoku(grid);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("the solved Sudoku game : ");
        System.out.println("---------------------------------");
        System.out.println("    a  b  c   d  e  f   g  h  i ");
        System.out.println("---------------------------------");
        String firstLine2 = lines.get(1); // Take the first puzzle
        String sudokuNumbers2 = firstLine2.split(",")[1];
        int[][] grid2 = sudoku.sudokuBelegen(sudokuNumbers2);
        printSudoku(grid2);
        System.out.println("---------------------------------");
    }
    private static void printSudoku(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(" -------------------------------");
            }
            System.out.print((i + 1) + " |");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("|");
                }
                System.out.print(grid[i][j] == 0 ? "   " : " " + grid[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("  -------------------------------");
    }

}
