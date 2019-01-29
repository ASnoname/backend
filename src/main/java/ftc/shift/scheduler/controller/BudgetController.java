package ftc.shift.scheduler.controller;

import ftc.shift.scheduler.models.Budget;
import ftc.shift.scheduler.models.TempPlannedCategory;
import ftc.shift.scheduler.services.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class BudgetController {

    private static final String BUDGET_PATH = Resources.BUDGET_PREFIX;

    private final BudgetService budgetService;

    @Autowired
    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    public BudgetService getBudgetService() {
        return budgetService;
    }

    @CrossOrigin
    @PostMapping(BUDGET_PATH)
    public @ResponseBody
    BaseResponse<Budget> createBudget(@RequestBody Collection<TempPlannedCategory> categories) {

        return new BaseResponse<>(budgetService.createBudget(categories));
    }

    @CrossOrigin
    @GetMapping(BUDGET_PATH)
    public @ResponseBody
    BaseResponse<Collection<Budget>> provideAllBudgets() {

        return new BaseResponse<>(budgetService.provideBudgetes());
    }

    @CrossOrigin
    @DeleteMapping(BUDGET_PATH + "/{idBudget}")
    public @ResponseBody
    BaseResponse deleteCategory(@PathVariable(name = "idBudget") String idBudget) {

        return new BaseResponse<>(budgetService.deleteBudget(idBudget));
    }

    @CrossOrigin
    @GetMapping(BUDGET_PATH + "/{idBudget}")
    public @ResponseBody
    BaseResponse<Budget> provideBudget(@PathVariable(name = "idBudget") String idBudget) {

        return new BaseResponse<>(budgetService.provideBudget(idBudget));
    }

    @CrossOrigin
    @PostMapping(BUDGET_PATH + "/{idBudget}")
    public @ResponseBody
    BaseResponse<Budget> updateBudget(@RequestBody Budget budget) {

        return new BaseResponse<>(budgetService.updateBudget(budget));
    }
}