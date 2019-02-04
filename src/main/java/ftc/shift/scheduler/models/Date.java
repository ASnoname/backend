package ftc.shift.scheduler.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Date implements Serializable {

    private String date;

    private Integer numberOfMonth;
}