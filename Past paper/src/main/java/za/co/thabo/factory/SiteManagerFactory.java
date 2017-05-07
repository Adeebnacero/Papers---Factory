package za.co.thabo.factory;

import za.co.thabo.domain.Contact;
import za.co.thabo.domain.Role;
import za.co.thabo.domain.Site;
import za.co.thabo.domain.SiteManager;

import java.util.List;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class SiteManagerFactory {
    private SiteManagerFactory()
    {

    }

    public static SiteManager getSiteManager(String email, String firstName, String lastName, String password, List<Role> role, List<Site> site, Contact contact)
    {
        return new SiteManager(email, firstName, lastName, password, role, site, contact);
    }
}
