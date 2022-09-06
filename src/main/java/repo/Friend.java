package repo;

public class Friend extends Contacts{
    String nickname;


    public Friend(String contactsName, String phonenumber) {
        super(contactsName, phonenumber);
        this.nickname = nickname;
    }

    public Friend() {
    }


    @Override
    public String toString() {
        return "nickname:"+  nickname + "\n"+"Number: " +getPhonenumber() +"\n"+"Contact: " +getContactsName();
    }
}
