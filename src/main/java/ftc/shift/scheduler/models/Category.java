package ftc.shift.scheduler.models;

import java.io.Serializable;

public class Category implements Serializable {

    private String idCategory;

    private String name;

    private int money;

    private int spending;


    public Category(String idCategory, String name, int money, int spending) {
        this.idCategory = idCategory;
        this.name = name;
        this.money = money;
        this.spending = spending;
    }

    public Category() {
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getSpending() {
        return spending;
    }

    public void setSpending(int spending) {
        this.spending = spending;
    }
}
