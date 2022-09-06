package repo;

public abstract class Contacts {
    private String contactsName;
    private String phonenumber;

    public Contacts(String contactsName, String phonenumber) {

        this.contactsName = contactsName;
        this.phonenumber = phonenumber;
    }

    public Contacts() {

    }


    public String getContactsName() {
        return contactsName;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
}
