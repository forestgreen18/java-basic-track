import com.illiakornyk.stringoperations.StringOperations;

public class Main {
    public static void main(String[] args) {
        int studentId = 8;
        String rawText = "Example text        with various    words\nto sort by ! frequency.";
        char targetLetter = 'e';

        StringOperations stringOps = new StringOperations(studentId, rawText, targetLetter);

        stringOps.performTextOperation();
    }
}
