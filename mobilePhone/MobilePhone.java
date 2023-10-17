package mobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        myContacts.add(contact);
        System.out.println("Contact is added   " + contact.getName());
        return true;
    }

    public boolean upDateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println("I didn't find that contact  ");
            return false;
        }
        myContacts.set(position, newContact);
        System.out.println("Contact "+oldContact.getPhoneNumber()+" is updated. Now use number "+ newContact.getPhoneNumber());
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                System.out.println("Contact is found");
                return i;
            }
        }
        System.out.println("Contact isn't found");
        return -1;
    }
    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if (position<0){
            System.out.println("Contact  " +contact.getName() + " is removed");
        }
        return true;
    }

}

