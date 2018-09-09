package classes;

import static classes.TimeUnit.MONTH;
import static classes.TimeUnit.WEEK;

/**
 * Created by Elimane on Sep, 2018, at 11:55
 */
public class MyTime {

    private int amount;
    private TimeUnit timeUnit;

    public MyTime() {
    }

    public MyTime(int number, TimeUnit timeUnit) {
        this.amount = number;
        this.timeUnit = timeUnit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public boolean equals(Object o) {
        if (o == null || this == null) {
            return false;
        }

        if (this.timeUnit.equals(MONTH) && ((MyTime) o).amount == (4 * this.amount)) {
            return true;
        }

        if (this.timeUnit.equals(WEEK) && ((MyTime) o).amount == (7 * this.amount)) {
            return true;
        }

        if (((MyTime) o).timeUnit.equals(MONTH) && this.amount == (4 * ((MyTime) o).amount)) {
            return true;
        }

        if (((MyTime) o).timeUnit.equals(WEEK) && this.amount == (7 * ((MyTime) o).amount)) {
            return true;
        }

        return false;
    }
}
