package za.co.thabo.domain;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class VoteUp {
    public VoteUp(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    private int counter;
}
