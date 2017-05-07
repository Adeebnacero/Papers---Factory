package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class VoteUpTest extends TestCase {

    VoteUp voteUp = new VoteUp(1);
    @Test
    public void testCounter()
    {
        assertEquals(voteUp.getCounter(), 1);
    }
}
