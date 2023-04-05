package com.adresssystem;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    private String addressBookName;
    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    Scanner in = new Scanner(System.in);

    @Override
    public String toString() {
        return "AddressBook{" +
                "contacts=" + contacts +
                ", addressBookName='" + addressBookName + '\'' +
                '}';
    }

    public void addContact(){
        Contact contact= new Contact();

        System.out.println("Enter the details to add a contact:");

        System.out.print("Enter the Name: ");
        contact.setName(in.nextLine());
        System.out.print("Enter the Age: ");
        contact.setAge(in.nextLine());
        System.out.print("Enter the Phone number: ");
        contact.setPhoneNumber(in.nextLine());
        System.out.print("Enter the City: ");
        contact.setCity(in.nextLine());
        System.out.print("Enter the State: ");
        contact.setState(in.nextLine());

        contacts.add(contact);
        System.out.println("Contact Added!!!");
        System.out.println(contact);
        System.out.println();
    }
}
