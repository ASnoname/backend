package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Budget;

import java.util.Collection;

public interface BudgetService {

    Budget provideBudget(String idBudget);

    Budget updateBudget(Budget budget);

    void deleteBudget(String idBudget);

    Budget createBudget(Budget budget);

    Collection<Budget> provideBudgetes();
}
