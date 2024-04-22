package login;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class unused {

    //to print matrix, if necessary
    public static void printMatrixStrings(String[][] matrix) {

        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.print(matrix[line][column] + "\t|\t");
            }
            System.out.println();
        }
    }
}
