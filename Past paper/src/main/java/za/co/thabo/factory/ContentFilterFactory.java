package za.co.thabo.factory;

import za.co.thabo.domain.ContentFilter;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class ContentFilterFactory {
    private ContentFilterFactory()
    {

    }
    public static ContentFilter getContentFilter()
    {
        return new ContentFilter();
    }
}
