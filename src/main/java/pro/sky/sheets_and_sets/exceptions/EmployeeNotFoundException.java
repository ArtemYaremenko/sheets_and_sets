
package pro.sky.sheets_and_sets.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

   public EmployeeNotFoundException() {
        super("The employee non found!");
    }
}
