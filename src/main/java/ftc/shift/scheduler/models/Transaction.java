package ftc.shift.scheduler.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Transaction implements Serializable {

    private String idTransaction;

    private String idCategory;

    private String idBudget;

    private String text;

    private Integer spending;
}