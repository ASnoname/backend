package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Budget;
import ftc.shift.scheduler.repositories.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BudgetServiceImpl implements BudgetService {

    private final BudgetRepository budgetRepository;

    @Autowired
    public BudgetServiceImpl(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    @Override
    public Budget provideBudget(String idBudget) {

        return budgetRepository.fetchBudget(idBudget);
    }

    @Override
    public Budget updateBudget(Budget budget) {

        return budgetRepository.updateBudget(budget);
    }

    @Override
    public boolean deleteBudget(String idBudget) {

        budgetRepository.deleteBudget(idBudget);

        return true;
    }

    @Override
    public Budget createBudget(Budget budget) {

        return budgetRepository.createBudget(budget);
    }

    @Override
    public Collection<Budget> provideBudgetes() {

        return budgetRepository.getAllBudgetes();
    }

    public BudgetRepository getBudgetRepository() {
        return budgetRepository;
    }
}
