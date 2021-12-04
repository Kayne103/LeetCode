package PeeksAndValleys;
import java.util.Scanner;

public class PeeksAndValleys {
    private static StringValidator validation = new StringValidator();
    static Logic logic = new Logic();

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        // get string from input
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        // validate input
        validation.validateUserInput(str.toUpperCase());

        // process string
        int level = logic.getLevel(str.toUpperCase());

        // convert level to string
        String stringLevel = logic.convertIntLevelToStringLevel(level);

        // print result
        Utils.printLevel(stringLevel);

        //scanner.close();

    }
}
