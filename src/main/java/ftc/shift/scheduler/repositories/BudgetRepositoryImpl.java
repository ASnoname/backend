package ftc.shift.scheduler.repositories;

import ftc.shift.scheduler.models.Budget;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;

@Repository
public class BudgetRepositoryImpl implements BudgetRepository{

    private Map<String, Budget> budgets;

    public BudgetRepositoryImpl() {
    }

    @Override
    public Budget fetchBudget(String idBudget) {

        return budgets.get(idBudget);
    }

    @Override
    public Budget updateBudget(Budget budget) {

        return ;
    }

    @Override
    public void deleteBudget(String idBudget) {

    }

    @Override
    public Budget createBudget(Budget budget) {
        return null;
    }

    @Override
    public Collection<Budget> getAllBudgetes() {
        return null;
    }
}
