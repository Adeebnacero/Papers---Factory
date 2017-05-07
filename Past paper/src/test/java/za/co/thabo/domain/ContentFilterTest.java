package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class ContentFilterTest extends TestCase {
    ContentFilter filter = new ContentFilter();

    @Test
    public void testContentCheck()
    {
        filter.setContentCheck("Warning");
        assertEquals(filter.getContentCheck(), "Warning");
    }
}
