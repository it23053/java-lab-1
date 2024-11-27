import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class fileNumberProcessor{
    public static void main(String[] args) throws Exception {
        // File paths
        File inputFile = new File("input.txt");
        FileWriter outputFile = new FileWriter("output.txt");

        // Scanner to read the input file
        Scanner scanner = new Scanner(inputFile);

        int highestValue = Integer.MIN_VALUE;
        int sum = 0;
        // Read numbers and calculate
        while (scanner.hasNext()) {
            String num = scanner.nextLine();
            int number = Integer.parseInt(num);
            sum += number;
            if (number > highestValue) {
                highestValue = number;
            }
        }
        scanner.close();

        // Write results to the output file
        outputFile.write("Highest Value: " + highestValue);
        outputFile.write("Sum of Values: " + sum);
        outputFile.close();

        System.out.println("Done! Results saved to output.txt.");
    }
}

