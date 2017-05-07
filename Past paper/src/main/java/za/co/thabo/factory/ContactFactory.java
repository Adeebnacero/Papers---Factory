package za.co.thabo.factory;

import za.co.thabo.domain.Contact;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class ContactFactory {
    private ContactFactory(){

    }
    public static Contact getContact(String cellphone, String address, String postalCode)
    {
       return new Contact(cellphone, address, postalCode);
    }

}
