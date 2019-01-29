package ftc.shift.scheduler.repositories;

import ftc.shift.scheduler.models.Transaction;

import java.util.Collection;

public interface TransactionRepository {

    Transaction fetchTransaction(String idTransaction);

    Transaction updateTransaction(Transaction transaction);

    void deleteTransaction(String idTransaction);

    Transaction createTransaction(Transaction transaction);

    Collection<Transaction> getAllTransactions();
}
