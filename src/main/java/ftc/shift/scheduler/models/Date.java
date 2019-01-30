package ftc.shift.scheduler.models;

import java.io.Serializable;

public class Date implements Serializable {

    private String date;

    private Integer numberOfMonth;

    public Date(String date, Integer numberOfMonth) {
        this.date = date;
        this.numberOfMonth = numberOfMonth;
    }

    public Date() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getNumberOfMonth() {
        return numberOfMonth;
    }

    public void setNumberOfMonth(Integer numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }
}
