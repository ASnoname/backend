package ftc.shift.scheduler.models;

import java.io.Serializable;

public class Transaction implements Serializable {

    private String idTransaction;

    private String idCategory;

    private String idBudget;

    private String text;

    private int spending;

    public Transaction(String idTransaction, String idCategory, String idBudget, String text, int spending) {
        this.idTransaction = idTransaction;
        this.idCategory = idCategory;
        this.idBudget = idBudget;
        this.text = text;
        this.spending = spending;
    }

    public Transaction() {
    }

    public String getIdBudget() {
        return idBudget;
    }

    public void setIdBudget(String idBudget) {
        this.idBudget = idBudget;
    }

    public String getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(String idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getSpending() {
        return spending;
    }

    public void setSpending(int spending) {
        this.spending = spending;
    }
}