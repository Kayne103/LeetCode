package PeeksAndValleys;
public class StringValidator implements InputValidator{
    
    static final String LEGAL_CHARS = "[ACB]+";
    static final int EMPTY_STRING_LENGTH = 0;

    @Override
    public void validateUserInput(String str) {
        if (str.length() == EMPTY_STRING_LENGTH) {
            throw new IllegalArgumentException("String cannot be empty");
        }
        if (!str.matches(LEGAL_CHARS)) {
            throw new IllegalArgumentException("String must contain only A, C, and B characters");
        }
    }
}
