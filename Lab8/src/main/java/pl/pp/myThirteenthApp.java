package pl.pp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class myThirteenthApp {

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

        int totalWords = 0;
        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+");
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z0-9]", "");
                    if (!word.isEmpty()) {
                        totalWords++;
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("\n--- RESULTS ---");
        System.out.println("Total words: " + totalWords);
        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write("File name: " + inputFile.getName());
            writer.newLine();
            writer.write("Total words: " + totalWords);
            writer.newLine();
            writer.write("Word occurrences:");
            writer.newLine();
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
            System.out.println("\nResults successfully saved to " + outputPath);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
