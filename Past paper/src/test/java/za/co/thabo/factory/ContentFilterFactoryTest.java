package za.co.thabo.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.co.thabo.domain.ContentFilter;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class ContentFilterFactoryTest extends TestCase {
    ContentFilter filter = ContentFilterFactory.getContentFilter();

    @Test
    public void testContentCheck()
    {
        filter.setContentCheck("Warning");
        assertEquals(filter.getContentCheck(), "Warning");
    }
}
