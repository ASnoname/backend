package ftc.shift.scheduler.models;

public class PlannedCategory {

    private Category category;

    private int money;

    private int spending;

    public PlannedCategory(Category category, int money, int spending) {
        this.category = category;
        this.money = money;
        this.spending = spending;
    }

    public PlannedCategory() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
