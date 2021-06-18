package Inheritance;

public class MatrixException extends RuntimeException {

    private String cause;

    MatrixException(String cause) {
        this.cause = cause;
    }

    public String getMessage() {
        return this.cause;
    }
}