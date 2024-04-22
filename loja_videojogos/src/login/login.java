package login;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class login {


    //LINE COUNT
    public static int lineCount(String path) throws FileNotFoundException {

        Scanner reader = new Scanner(new File(path));

        String line;
        int counter = 0;

        //count lines in file
        while (reader.hasNextLine()) {

            //Scan each line and add to counter
            line = reader.nextLine(); //iterator

            counter++;


        }
        return counter;
    }


    //COLUMN COUNT
    public static int columnCount(String path, String delimiter) throws FileNotFoundException {

        Scanner reader = new Scanner(new File(path));

        String line= reader.nextLine();

        String[] dividedLine = line.split(delimiter);

        int numColumns = dividedLine.length;

        return numColumns;
    }



        //TRANSFER DATA FROM FILE TO MATRIX
        public static String[][] dataTransfer (String path) throws FileNotFoundException {


            //variable to hold whole of text
            String results = " ";

            //new scanner for file
            Scanner reader = new Scanner("ficheiros/GameStart_Admins.csv");

            //declare matrix
            String[][] fileMatrix = new String[lineCount("ficheiros/GameStart_Admins.csv")][columnCount("ficheiros/GameStart_Admins.csv", ";")];

            //read matrix
            for (int l = 0; l < fileMatrix.length; l++){
                for (int c = 0; c < fileMatrix[0].length; c++){
                    fileMatrix[l][c] = reader.next();
                    //results = results + reader.next();
                }
            }


            //print matrix
            for (int l = 0; l < fileMatrix.length; l++){
                for (int c = 0; c < fileMatrix[0].length; c++){
                    System.out.println("2D Vector["+l+"]["+c+"]: " + fileMatrix[l][c]);
                }
            }


        return  fileMatrix;

        }

     public static void main(String[] args)throws FileNotFoundException {

         lineCount("ficheiros/GameStart_Admins.csv");
         columnCount("ficheiros/GameStart_Admins.csv", ";");
         dataTransfer("ficheiros/GameStart_Admins.csv");


     }


}
