package za.co.thabo.domain;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class VoteDown {
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    private int counter;

    public VoteDown(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "VoteDown{" +
                "counter=" + counter +
                '}';
    }
}
