package za.co.thabo.factory;

import za.co.thabo.domain.User;
import za.co.thabo.domain.Reputation;

import java.util.List;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class UserFactory {
    private UserFactory()
    {

    }

    public static User getUser(String email, String screenName, String password, String status, List<Reputation> reputation)
    {
        return new User(email, screenName, password, status, reputation);
    }
}
