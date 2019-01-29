package ftc.shift.scheduler.repositories;

import ftc.shift.scheduler.models.Budget;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BudgetRepositoryImpl implements BudgetRepository{

    private Map<String, Budget> budgets;

    public BudgetRepositoryImpl() {

        budgets = new HashMap<>();
    }

    @Override
    public Budget fetchBudget(String idBudget) {

        return budgets.get(idBudget);
    }

    @Override
    public Budget updateBudget(Budget budget) {

        budgets.put(budget.getIdBudget(), budget);

        return budget;
    }

    @Override
    public void deleteBudget(String idBudget) {

        budgets.remove(idBudget);
    }

    @Override
    public Budget createBudget(Budget budget) {

        budget.setIdBudget(String.valueOf(budget.hashCode()));

        budgets.put(budget.getIdBudget(), budget);

        return budget;
    }

    @Override
    public Collection<Budget> getAllBudgetes() {

        return budgets.values();
    }
}