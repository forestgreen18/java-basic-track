import com.illiakornyk.stringoperations.StringOperations;

public class Main {
    public static void main(String[] args) {
        int studentId = 8;
        StringBuffer textBuffer = new StringBuffer("Example text with various words to sort by frequency.");
        char targetLetter = 'e';

        StringOperations stringOps = new StringOperations(studentId, textBuffer, targetLetter);

        stringOps.performTextOperation();
    }
}