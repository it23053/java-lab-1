import java.util.Scanner;
public class quiz {
    public static void main(String[] args){

        //Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        //Display a welcome message
        System.out.println("Wlcome to the Java Quiz!");
        System.out.println("Answer the following questions by typing a, b, or c\n");

        //Declare variables to store the score
        int score=0;

        //Question 1
        System.out.println("Question 1: What is the default value of a boolean in Java?");
        System.out.println("a) true\nb) false\nc) 0\n");
        System.out.println("Your answer: ");
        String answer1=scanner.nextLine();
        //Check if the answer is correct
        if(answer1.equalsIgnoreCase("b")){
            System.out.println("Correct!");
            score++;
        }
        else{
            System.out.println("Wrong! The correct answer is b) false.");
        }

        //Question 2
        System.out.println("\nQuestion 2: Which keyword is used to inherit a class in Java?");
        System.out.println("a) extends\nb) implements\nc) inherits\n");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        // Check if the answer is correct
        if (answer2.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is a) extends.");
        }

        //Question 3
        System.out.println("\nQuestion 3: Which of these is not a primitive data type in Java?");
        System.out.println("a) int\nb) boolean\nc) String\n");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();
        // Check if the answer is correct
        if (answer3.equalsIgnoreCase("c")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is c) String.");
        }

        //Question 4
        System.out.println("\nQuestion 4: Which of the following is used to handle exceptions in Java?");
        System.out.println("a) if-else\nb) try-catch\nc) switch-case\n");
        System.out.println("Your answer: ");
        String answer4=scanner.nextLine();
        // Check if the answer is correct
        if (answer4.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) try-catch.");
        }

        //Question 5
        System.out.println("\nQuestion 5: Which package contains the Scanner class?");
        System.out.println("a) java.util\nb) java.io\nc) java.net\n");
        System.out.println("Your answer");
        String answer5=scanner.nextLine();
        // Check if the answer is correct
        if (answer5.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) try-catch.");
        }


        //Display the final score
        System.out.println("\nQuiz Over!");
        System.out.println("Your final score is: " + score + " out of 5");


        // Step 8: Close the Scanner b
        scanner.close();

    }
    
}
