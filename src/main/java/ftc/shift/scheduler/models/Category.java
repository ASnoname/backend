package ftc.shift.scheduler.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Category implements Serializable {

    private String idCategory;

    private String name;
}