package me.nsydykovich.contactbook;

public class Contact {
    private String name;
    private String address;
    private String telephone;

    public Contact(String name, String telephone) {
        this(name, telephone, null);
    }

    public Contact(String name, String telephone, String address) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
