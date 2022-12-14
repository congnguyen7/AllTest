package buoi8_exceptions.testThrow;

public class MyExceptions extends Exception {

    private String error;

    public MyExceptions(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}