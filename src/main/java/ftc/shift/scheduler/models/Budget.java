package ftc.shift.scheduler.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class Budget implements Serializable {

    private String idBudget;

    private List<PlannedCategory> categories;

    private List<Transaction> transactions;

    private Date date;
}