package za.co.thabo.factory;

import za.co.thabo.domain.Reputation;
import java.util.Date;
/**
 * Created by thabomoopa on 2017/05/06.
 */
public class ReputationFactory {

    private ReputationFactory(){

    }

    public static Reputation createReputation(Date date, int value)
    {
        return new Reputation(date, value);
    }
}
