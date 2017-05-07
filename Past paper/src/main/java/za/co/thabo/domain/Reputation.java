package za.co.thabo.domain;

import java.io.Serializable;
import java.io.SerializablePermission;
import java.util.Date;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class Reputation {
    private int value;

    public Reputation( Date date, int value) {
        this.value = value;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reputation{" +
                "value=" + value +
                ", date=" + date +
                '}';
    }

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
