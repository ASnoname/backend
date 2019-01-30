package ftc.shift.scheduler.repositories;

import ftc.shift.scheduler.models.Budget;
import ftc.shift.scheduler.models.Date;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BudgetRepositoryImpl implements BudgetRepository{

    private Map<String, Budget> budgets;

    private Map<Integer, String> months;

    {
        months = new HashMap<>();

        months.put(Calendar.JANUARY, "Январь");
        months.put(Calendar.FEBRUARY, "Февраль");
        months.put(Calendar.MARCH, "Март");
        months.put(Calendar.APRIL, "Апрель");
        months.put(Calendar.MAY, "Май");
        months.put(Calendar.JUNE, "Июнь");
        months.put(Calendar.JULY, "Июль");
        months.put(Calendar.AUGUST, "Август");
        months.put(Calendar.SEPTEMBER, "Сентябрь");
        months.put(Calendar.OCTOBER, "Октябрь");
        months.put(Calendar.NOVEMBER, "Ноябрь");
        months.put(Calendar.DECEMBER, "Декабрь");
    }

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

        budget.setDate(new Date(months.get(budgets.size() % 12), budgets.size() % 12));

        budget.setTransactions(new ArrayList<>(0));

        budgets.put(budget.getIdBudget(), budget);

        return budget;
    }

    @Override
    public Collection<Budget> getAllBudgetes() {

        return budgets.values();
    }
}