package exceptions.example01;

public class NumberTooBigException extends Exception {
    public NumberTooBigException(String message){
        super(message);
    }
}
