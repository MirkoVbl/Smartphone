package repo;

import java.util.Arrays;

public class Smartphone implements Radio, GPS {


    private String model;

    private String manufacturer;

    private Contacts[] contacts;




    public Smartphone() {
    }


    public Smartphone(String model, String manufacturer, Contacts[] contacts) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.contacts = contacts;
    }


    public boolean startRadio() {
        System.out.println("Radio starded");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public String toString() {
        return "Smartphone: "+model+"\n" +
                "manufacturer: " + manufacturer + "\n"+
                "contacts" + Arrays.toString(contacts);
    }
}