package pro.sky.sheets_and_sets.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeStorageIsFullException extends RuntimeException {

    public EmployeeStorageIsFullException() {
        super("There can't be more employees!");
    }
}
