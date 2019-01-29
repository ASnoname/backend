package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Budget;
import ftc.shift.scheduler.models.PlannedCategory;
import ftc.shift.scheduler.models.TempPlannedCategory;
import ftc.shift.scheduler.repositories.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BudgetServiceImpl implements BudgetService {

    private final BudgetRepository budgetRepository;

    private final CategoryService categoryService;

    public CategoryService getCategoryService() {
        return categoryService;
    }

    @Autowired
    public BudgetServiceImpl(BudgetRepository budgetRepository, CategoryService categoryService) {
        this.budgetRepository = budgetRepository;
        this.categoryService = categoryService;
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
    public Budget createBudget(Collection<TempPlannedCategory> categories) {

        Budget budget = new Budget();

        budget.setCategories(categories.stream().map(c -> {

            PlannedCategory plannedCategory = new PlannedCategory();

            plannedCategory.setMoney(c.getMoney());

            plannedCategory.setSpending(0);

            plannedCategory.setCategory(categoryService.provideCategory(c.getIdCategory()));

            return plannedCategory;

        }).collect(Collectors.toList()));

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
