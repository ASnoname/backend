package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Budget;
import ftc.shift.scheduler.models.TempPlannedCategory;

import java.util.Collection;

public interface BudgetService {

    Budget provideBudget(String idBudget);

    Budget updateBudget(Budget budget);

    boolean deleteBudget(String idBudget);

    Budget createBudget(Collection<TempPlannedCategory> categories);

    Collection<Budget> provideBudgetes();
}