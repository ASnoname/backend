package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Budget;
import ftc.shift.scheduler.models.PlannedCategory;
import ftc.shift.scheduler.models.Transaction;
import ftc.shift.scheduler.repositories.BudgetRepository;
import ftc.shift.scheduler.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    private final BudgetRepository budgetRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository, BudgetRepository budgetRepository) {
        this.transactionRepository = transactionRepository;
        this.budgetRepository = budgetRepository;
    }

    @Override
    public Transaction provideTransaction(String idTransaction) {

        return transactionRepository.fetchTransaction(idTransaction);
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {

        return transactionRepository.updateTransaction(transaction);
    }

    @Override
    public boolean deleteTransaction(String idTransaction) {

        transactionRepository.deleteTransaction(idTransaction);

        return true;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {

        Transaction result = transactionRepository.createTransaction(transaction);

        Budget budget = budgetRepository.fetchBudget(transaction.getIdBudget());

        budget.getTransactions().add(result);

        for (PlannedCategory p : budget.getCategories()) {

            if (p.getCategory().getIdCategory().equals(result.getIdCategory())){

                p.setSpending(p.getSpending() + transaction.getSpending());

                break;
            }
        }

        return result;
    }

    @Override
    public Collection<Transaction> provideTransactions() {

        return transactionRepository.getAllTransactions();
    }

    public TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }

    public BudgetRepository getBudgetRepository() {
        return budgetRepository;
    }
}
