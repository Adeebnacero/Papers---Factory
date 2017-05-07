package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class VoteDownTest extends TestCase {
    VoteDown down = new VoteDown(1);
    @Test
    public void testCounter()
    {
        assertEquals(down.getCounter(), 1);
    }
}
