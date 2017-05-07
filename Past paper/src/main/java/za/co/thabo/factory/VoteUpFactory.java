package za.co.thabo.factory;

import za.co.thabo.domain.Comment;
import za.co.thabo.domain.VoteUp;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class VoteUpFactory {
    private VoteUpFactory()
    {

    }
    public static VoteUp getVoteUp(int counter)
    {
        return new VoteUp(counter);
    }
}
