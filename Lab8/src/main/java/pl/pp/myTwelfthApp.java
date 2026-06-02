package pl.pp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class myTwelfthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPath = "";
        File inputFile = null;

        while (true) {
            System.out.print("Enter the path to the input text file: ");
            inputPath = scanner.nextLine();
            inputFile = new File(inputPath);

            if (inputFile.exists() && inputFile.isFile()) {
                break;
            } else {
                System.out.println("Error: File does not exist! Please try again.");
            }
        }

        System.out.print("Enter the path to the output text file: ");
        String outputPath = scanner.nextLine();

        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("Number of lines in the file: " + lineCount);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write("File name: " + inputFile.getName());
            writer.newLine();
            writer.write("Number of lines: " + lineCount);
            System.out.println("Results successfully saved to " + outputPath);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
