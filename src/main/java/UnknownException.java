/**
 * Handles the exception if the user
 * gives an inappropriate command.
 */

public class UnknownException extends Exception{
    public static final String space = "     ";
    public UnknownException() {};

    public String toString() {
        return space + " ☹ OOPS!!! I'm sorry, but I don't know what that means :-(";
    }
}
