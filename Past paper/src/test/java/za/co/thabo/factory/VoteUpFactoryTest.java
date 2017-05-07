package za.co.thabo.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.co.thabo.domain.VoteUp;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class VoteUpFactoryTest extends TestCase {

    VoteUp voteUp = VoteUpFactory.getVoteUp(1);
    @Test
    public void testCounter()
    {
        assertEquals(voteUp.getCounter(), 1);
    }

}
