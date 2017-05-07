package za.co.thabo.factory;

import za.co.thabo.domain.VoteDown;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class VoteDownFactory {
    private VoteDownFactory()
    {

    }
    public static VoteDown getVoteDown(int counter)
    {
        return new VoteDown(counter);
    }
}
