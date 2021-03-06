package ftc.shift.scheduler.repositories;

import ftc.shift.scheduler.models.Transaction;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    private Map<String, Transaction> transactions;

    public TransactionRepositoryImpl() {

        transactions = new HashMap<>();
    }

    @Override
    public Transaction fetchTransaction(String idTransaction) {

        return transactions.get(idTransaction);
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {

        transactions.put(transaction.getIdTransaction(), transaction);

        return transaction;
    }

    @Override
    public boolean deleteTransaction(String idTransaction) {

        transactions.remove(idTransaction);

        return !transactions.containsKey(idTransaction);
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {

        transaction.setIdTransaction(String.valueOf(transaction.hashCode()));

        transactions.put(transaction.getIdTransaction(), transaction);

        return transaction;
    }

    @Override
    public Collection<Transaction> getAllTransactions() {

        return transactions.values();
    }
}