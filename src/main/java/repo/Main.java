package repo;

public class Main {

    public static void main(String[] args) {

        Friend contact1 = new Friend("Andy", "0173556438");
        System.out.println(contact1);

        Friend contact2 = new Friend("Benny", "0173555432");
        System.out.println(contact2);

        Contacts[] contacts = {contact1, contact2};

        Smartphone handy1 = new Smartphone("iPhone 12", "Apple", contacts);
        System.out.println(handy1);
    }
}
