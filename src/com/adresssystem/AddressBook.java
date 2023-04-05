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
        System.out.print("Enter the Address: ");
        contact.setAddress(in.nextLine());
        System.out.print("Enter the City: ");
        contact.setCity(in.nextLine());
        System.out.print("Enter the State: ");
        contact.setState(in.nextLine());
        System.out.print("Enter the Phone number: ");
        contact.setPhoneNumber(in.nextLine());
        System.out.print("Enter the Email Address: ");
        contact.setEmail(in.nextLine());

        contacts.add(contact);
        System.out.println("Contact Added!!!");
        System.out.println(contact);
        System.out.println();
    }

    public void editContact(){
        System.out.println("Enter the Name of the Contact you want to Edit:");
        String name= in.nextLine();

        for (Contact Temp : contacts) {
            if (Temp.getName().equals(name)) {
                System.out.println("Current Contact Details:");
                System.out.println(Temp);
                System.out.println("Enter the name of the Field you want to Edit in Contact's Details:");
                System.out.println("1. Name\t2.Address\t3.City\t4. State\t5. Phone Number\t6.Email Address");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Current Name: " + Temp.getName());
                        System.out.print("Enter the NEW Name: ");
                        Temp.setName(in.nextLine());
                    case 2:
                        System.out.println("Current Address: " + Temp.getAddress());
                        System.out.print("Enter the NEW Address: ");
                        Temp.setAddress(in.nextLine());
                    case 3:
                        System.out.println("Current City: "+Temp.getCity());
                        System.out.print("Enter the NEW City: ");
                        Temp.setCity(in.nextLine());
                    case 4:
                        System.out.println("Current State: "+Temp.getState());
                        System.out.println("Enter the NEW State: ");
                        Temp.setState(in.nextLine());
                    case 5:
                        System.out.println("Current Phone Number: "+Temp.getPhoneNumber());
                        System.out.println("Enter the NEW Phone Number: ");
                        Temp.setPhoneNumber(in.nextLine());
                    case 6:
                        System.out.println("Current Email Address: "+Temp.getEmail());
                        System.out.println("Enter the NEW Email Address: ");
                        Temp.setEmail(in.nextLine());
                    default:
                        System.out.println("Enter a valid field!!!");
                }
                System.out.println("Contact Edited!!!");
                System.out.println("Contact Details AFTER Edit:");
                System.out.println(Temp);
            }
            else
                System.out.println("Contact with given name not found!!!");
        }
    }
}