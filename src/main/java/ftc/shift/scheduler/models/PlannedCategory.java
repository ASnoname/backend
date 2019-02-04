package ftc.shift.scheduler.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class PlannedCategory implements Serializable {

    private Category category;

    private Integer money;

    private Integer spending;
}