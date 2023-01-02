package pl.akademiaprogramowania.botcapabilities.exception;

public class RuleNotSupportedException extends RuntimeException {
    public RuleNotSupportedException(String message) {
        super(message);
    }
}
