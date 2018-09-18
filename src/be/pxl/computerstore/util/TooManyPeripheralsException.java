package be.pxl.computerstore.util;

//TODO: Checked vs Unchecked Exceptions
public class TooManyPeripheralsException extends RuntimeException {

    public TooManyPeripheralsException(String message) {
        super(message);
    }
}
