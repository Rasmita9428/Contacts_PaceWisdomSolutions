package com.example.contacts_pacewisdomsolutions;

public class ContactList {
    String Name;

    public ContactList(String name, String phoneNo) {
        this.Name=name;
        this.PhoneNo=phoneNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    String PhoneNo;
}
