package pro.sky.sheets_and_sets.exceptions;

public class EmployeeStorageIsFullException extends RuntimeException {

    public EmployeeStorageIsFullException() {
        super("There can't be more employees!");
    }
}
