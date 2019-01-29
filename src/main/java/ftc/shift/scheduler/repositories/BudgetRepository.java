package ftc.shift.scheduler.repositories;

import ftc.shift.scheduler.models.Budget;

import java.util.Collection;

public interface BudgetRepository {

    Budget fetchBudget(String idBudget);

    Budget updateBudget(Budget budget);

    void deleteBudget(String idBudget);

    Budget createBudget(Budget budget);

    Collection<Budget> getAllBudgetes();
}
