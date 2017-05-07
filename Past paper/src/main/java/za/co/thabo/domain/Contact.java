package za.co.thabo.domain;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class Contact {
    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    private String cellphone;
    private String address;
    private String postalCode;

    public Contact(String cellphone, String address, String postalCode) {
        this.cellphone = cellphone;
        this.address = address;
        this.postalCode = postalCode;
    }
}
