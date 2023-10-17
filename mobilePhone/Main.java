package mobilePhone;

public class Main {

    public static void main(String[] args) {
        MobilePhone mobilePhone= new MobilePhone("123456");

        Contact contact1= Contact.createContact("Elena", "1234545");
        Contact contact2= Contact.createContact("Olga", "176545");
        Contact contact3= Contact.createContact("Anna", "45667");
        Contact contact4= Contact.createContact("Mary", "657464");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);

        Contact updateContact=Contact.createContact("Anna","234456");
        mobilePhone.upDateContact(contact2, updateContact);

        mobilePhone.findContact("Elena");
        mobilePhone.findContact("Alice");

        mobilePhone.removeContact(contact2);








    }
}

