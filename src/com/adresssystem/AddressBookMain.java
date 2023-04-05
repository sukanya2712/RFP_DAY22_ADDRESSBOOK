package com.adresssystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    public static Map<String,AddressBook> addressBookMap= new HashMap<>();


    public static void addAddressBook() {
        Scanner in = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Enter the name of the new Address Book: ");
        addressBook.setAddressBookName(in.next());

        if (addressBookMap.containsKey(addressBook.getAddressBookName())) {
            System.out.println("Address Book already exists!!!!");
            return;
        }

        addressBookMap.put(addressBook.getAddressBookName(),addressBook);
        System.out.println("Address Book Added!!!");
        System.out.println();

        boolean status= true;
        while(status){
            System.out.println("=> To ADD a Contact to this Address Book: PRESS 1");
            System.out.println("=> To Close this Address Book: PRESS 2");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    addressBook.addContact();
                    System.out.println(addressBook);
                    System.out.println("Contact Added!!!");
                    System.out.println();
                    break;
                case 2:
                    status=false;
                    break;
                default:
                    System.out.println("Enter a valid choice!!!");
            }
        }
    }

    public static void addContacts() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the address book you want to add contact:");
        String name = in.next();

        if(addressBookMap.containsKey(name)) {
            AddressBook Temp= addressBookMap.get(name);
            Temp.addContact();
            System.out.println(Temp);
            System.out.println("Contact Added!!!");
            System.out.println();
        }
        else
            System.out.println("Given Address Book not Found!!!\n");
    }

    public static void editContact(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the address book, the contact you want to edit exists:");
        String name= in.next();

        if(addressBookMap.containsKey(name)) {
            AddressBook Temp= addressBookMap.get(name);
            Temp.editDetails();
        }
        else
            System.out.println("Given Address Book not Found!!!\n");
    }

    public static void deleteContact(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the address book, the contact you want to Delete exists:");
        String name= in.next();

        if(addressBookMap.containsKey(name)) {
            AddressBook Temp= addressBookMap.get(name);
            Temp.deleteDetails();
        }
        else
            System.out.println("Given Address Book not Found!!!\n");
    }

    public static void displayAddressBook(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the address book you want to Display:");
        String name = in.next();
        if(addressBookMap.containsKey(name)) {
            AddressBook Temp = addressBookMap.get(name);
            System.out.println(Temp);
        }
        else
            System.out.println("Given Address Book not Found!!!\n");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program in Address Book Main class on Main Branch");

        Scanner in = new Scanner(System.in);
        boolean status= true;
        while(status) {
            System.out.println("******************MENU:******************");
            System.out.println("=> To Add Address Book: PRESS 1");
            System.out.println("=> To Add Contact: PRESS 2");
            System.out.println("=> To Edit an Existing Contact: PRESS 3");
            System.out.println("=> To Delete a Contact: PRESS 4");
            System.out.println("=> To Display Dictionary of Address Books: PRESS 5");
            System.out.println("=> To Display Address Books Of Contacts: PRESS 6");
            System.out.println("=> To EXIT: PRESS 7");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    addAddressBook();
                    System.out.println();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:

                    break;
                case 6:
                    displayAddressBook();
                    break;
                default:
                    status=false;
                    break;
            }
        }
    }
}