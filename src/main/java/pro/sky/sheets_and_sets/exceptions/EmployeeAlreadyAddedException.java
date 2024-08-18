package pro.sky.sheets_and_sets.exceptions;

public class EmployeeAlreadyAddedException extends RuntimeException {

    public EmployeeAlreadyAddedException() {
        super("This employee has already been added!");
    }
}
