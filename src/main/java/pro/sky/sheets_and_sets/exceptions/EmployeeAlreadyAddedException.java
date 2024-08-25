package pro.sky.sheets_and_sets.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyAddedException extends RuntimeException {

    public EmployeeAlreadyAddedException() {
        super("This employee has already been added!");
    }
}
