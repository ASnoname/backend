package ftc.shift.scheduler.models;

import java.io.Serializable;

public class Transaction implements Serializable {

    private String idTransaction;

    private String idCategory;

    private String text;

    private int money;

    public Transaction(String idTransaction, String idCategory, String text, int money) {
        this.idTransaction = idTransaction;
        this.idCategory = idCategory;
        this.text = text;
        this.money = money;
    }

    public Transaction() {
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
