package ftc.shift.scheduler.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Budget implements Serializable {

    private String idBudget;

    private Collection<PlannedCategory> categories;

    private Collection<Transaction> transactions;

    private Date date;

    public Budget(String idBudget, Collection<PlannedCategory> categories, Collection<Transaction> transactions, Date date) {
        this.idBudget = idBudget;
        this.categories = categories;
        this.transactions = transactions;
        this.date = date;
    }

    public Budget() {
    }

    public String getIdBudget() {
        return idBudget;
    }

    public void setIdBudget(String idBudget) {
        this.idBudget = idBudget;
    }

    public Collection<PlannedCategory> getCategories() {
        return categories;
    }

    public void setCategories(Collection<PlannedCategory> categories) {
        this.categories = categories;
    }

    public Collection<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Collection<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}