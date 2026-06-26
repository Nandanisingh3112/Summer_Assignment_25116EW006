import java.util.Scanner;
class Question{
//create Quiz application
private String questionText;
private String[] options;
private int correctAnswerIndex;
public Question(String questionText, String[] options, int correctAnswerIndex){
    this.questionText = questionText;
    this.options = options;
    this.correctAnswerIndex = correctAnswerIndex;
}
public String getQuestionText(){
    return questionText;
}
public String[] getOptions(){
    return options;
}
public int getcorrectAnswerIndex(){
    return correctAnswerIndex;
}
}
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question[] quizBank = {
                new Question(
                "Which data type is used to create a variable that should store text in Java?",
                new String[]{"Char", "String", "Txt", "string"},
                2
            ),
            new Question(
                "What is the correct way to create an object called myObj of MyClass?",
                new String[]{"class MyClass = new myObj();", "MyClass myObj = new MyClass();", "new myObj = MyClass();", "Object myObj = MyClass();"},
                2
            ),
            new Question(
                "Which operator is used to multiply numbers in Java?",
                new String[]{"x", "%", "*", "#"},
                3
            ),
             new Question(
                "Which method can be used to find the highest value of x and y?",
                new String[]{"Math.max(x, y)", "Math.maximum(x, y)", "Math.highest(x, y)", "Math.ceil(x, y)"},
                1
            )
        };

        int score = 0;
        System.out.println("=== Welcome to the Java Knowledge Quiz ===");
        System.out.println("Answer by entering the number of your choice (1-4).\n");
        for (int i = 0; i < quizBank.length; i++) {
            Question currentQuestion = quizBank[i];
            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestionText());
            
            String[] options = currentQuestion.getOptions();
            for (int j = 0; j < options.length; j++) {
              System.out.println("  " + (j + 1) + ") " + options[j]);
            }
            int userChoice = 0;
            while (true) {
                System.out.print("Your answer (1-" + options.length + "): ");
                if (sc.hasNextInt()) {
                    userChoice = sc.nextInt();
                    if (userChoice >= 1 && userChoice <= options.length) {
                        break;
                    }
                } else {
                    sc.next(); 
                }
                System.out.println("Invalid entry. Please pick a number matching the choices.");
            }
            if (userChoice == currentQuestion.getcorrectAnswerIndex()) {
                System.out.println("Result: Correct!\n");
                score++;
            } else {
                 System.out.println("Result: Incorrect. (Correct choice was: " + currentQuestion.getcorrectAnswerIndex() + ")\n");
            }
        }
        System.out.println("==========================================");
        System.out.println("Quiz Completed!");
        System.out.println("Your Performance Score: " + score + " out of " + quizBank.length);
        double percentage = ((double) score / quizBank.length) * 100;
        System.out.printf("Success Percentage: %.2f%%\n", percentage);
        System.out.println("==========================================");

        
    }
}
