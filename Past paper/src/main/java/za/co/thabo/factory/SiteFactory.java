package za.co.thabo.factory;

import za.co.thabo.domain.Site;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class SiteFactory {
    public static Site getSite(String name, String url, String storyUrl)
    {
        return new Site(name, url, storyUrl);
    }
}
