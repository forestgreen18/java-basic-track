import com.illiakornyk.matrixoperations.MatrixOperations;

public class Main {
    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations(8);
        System.out.println("Order number: " + matrixOps.getStudentId());
        matrixOps.calculateCValues();
    }
}