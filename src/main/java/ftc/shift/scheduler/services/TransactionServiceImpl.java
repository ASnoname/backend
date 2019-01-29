package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Transaction;
import ftc.shift.scheduler.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
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
    public void deleteTransaction(String idTransaction) {

        transactionRepository.deleteTransaction(idTransaction);
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {

        return transactionRepository.createTransaction(transaction);
    }

    @Override
    public Collection<Transaction> provideTransactions() {

        return transactionRepository.getAllTransactions();
    }

    public TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }
}
