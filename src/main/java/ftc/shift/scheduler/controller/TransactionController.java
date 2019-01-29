package ftc.shift.scheduler.controller;

import ftc.shift.scheduler.models.Budget;
import ftc.shift.scheduler.models.Transaction;
import ftc.shift.scheduler.services.BudgetService;
import ftc.shift.scheduler.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class TransactionController {

    private static final String TRANSACTION_PATH = Resources.TRANSACTION_PREFIX;

    private final BudgetService budgetService;

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(BudgetService budgetService, TransactionService transactionService) {
        this.budgetService = budgetService;
        this.transactionService = transactionService;
    }

    public BudgetService getBudgetService() {
        return budgetService;
    }

    public TransactionService getTransactionService() {
        return transactionService;
    }

    @CrossOrigin
    @PostMapping(TRANSACTION_PATH)
    public @ResponseBody
    BaseResponse<Transaction> createTransaction(@RequestBody Transaction transaction) {

        Transaction result = transactionService.createTransaction(transaction);

        budgetService.provideBudget(transaction.getIdBudget()).getTransactions().add(result);

        return new BaseResponse<>(result);
    }

    @CrossOrigin
    @GetMapping(TRANSACTION_PATH + "/{idTransaction}")
    public @ResponseBody
    BaseResponse<Transaction> provideTransaction(@PathVariable(name = "idTransaction") String idTransaction) {

        return new BaseResponse<>(transactionService.provideTransaction(idTransaction));
    }

    @CrossOrigin
    @GetMapping(TRANSACTION_PATH)
    public @ResponseBody
    BaseResponse<Collection<Transaction>> provideTransactions() {

        return new BaseResponse<>(transactionService.provideTransactions());
    }

    @CrossOrigin
    @DeleteMapping(TRANSACTION_PATH + "/{idTransaction}")
    public @ResponseBody
    BaseResponse deleteTransaction(@PathVariable(name = "idTransaction") String idTransaction) {

        return new BaseResponse<>(transactionService.deleteTransaction(idTransaction));
    }
}