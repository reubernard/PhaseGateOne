import java.util.Random;
import java.util.Scanner;
public class SimpleArithmeticApp {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
Random random = new Random();

int score = 0;
int maxQuestions = 10;

System.out.println("Subtraction problem");
System.out.println(" ");
System.out.println("Note: Yoy have 10 subtraction questions.");
System.out.println("You have only 2 attempts per question.\n");

for (int index = 1; index <= maxQuestions; index++) {

    int num1 = random.nextInt(21);
    int num2 = random.nextInt(21);

    if (num2 > num1) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

          
    int correctAnswer = num1 - num2;

    System.out.println("Question " + index + ": What is " + num1 + " - " + num2 + "?");

    boolean answeredCorrectly = false;

    for (int attempt = 1; attempt <= 2; attempt++) {
        System.out.print("Your answer: ");
        int userAnswer = input.nextInt();

        if (userAnswer == correctAnswer) {
            System.out.println("Correct!\n");
            score++;
            answeredCorrectly = true;
            break;
        } else {
            if (attempt == 1) {
                System.out.println("Wrong. Try again.");
            } else {
                System.out.println("Wrong again. Correct answer = " + correctAnswer + "\n");
            }
        }
}
}
}
}

