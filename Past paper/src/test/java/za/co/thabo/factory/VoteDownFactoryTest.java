package za.co.thabo.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.co.thabo.domain.VoteDown;
import za.co.thabo.factory.VoteDownFactory;
import za.co.thabo.factory.VoteUpFactory;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class VoteDownFactoryTest extends TestCase {


    VoteDown voteDown = VoteDownFactory.getVoteDown(1);
    @Test
    public void testCounter()
    {
        assertEquals(voteDown.getCounter(), 1);
    }
}
