package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Transaction;

import java.util.Collection;

public interface TransactionService {

    Transaction provideTransaction(String idTransaction);

    Transaction updateTransaction(Transaction transaction);

    void deleteTransaction(String idTransaction);

    Transaction createTransaction(Transaction transaction);

    Collection<Transaction> provideTransactions();
}