/**
 * Handles the exception of an improper done command is given.
 */

public class DoneException extends Exception{
    public static final String space = "     ";
    public DoneException() {};

    public String toString() {
        return space + "☹ OOPS!!! You must specify a Task to be done!";
    }
}
