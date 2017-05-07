package za.co.thabo.factory;

import za.co.thabo.domain.Role;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class RoleFactory {
    private RoleFactory()
    {

    }
    public static Role getRole(String name, String description)
    {
        return new Role(name, description);
    }
}
