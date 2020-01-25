/**
 * Handles the exception of the description of the task is not given.
 */

public class EmptyException extends Exception {
    public static final String space = "     ";
    public EmptyException() {};

    public String toString() {
        return space + " ☹ OOPS!!! The description of a Task cannot be empty.";
    }
}
