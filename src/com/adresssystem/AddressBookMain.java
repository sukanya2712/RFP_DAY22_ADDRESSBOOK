package com.adresssystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    Scanner in = new Scanner(System.in);
    Map<String,AddressBook> Dictionary= new HashMap<>();

    public void addAddressBook() {
        AddressBook addressBook = new AddressBook();

        System.out.println("Enter the name of the address book: ");
        addressBook.setAddressBookName(in.nextLine());

        Dictionary.put(addressBook.getAddressBookName(),addressBook);
        System.out.println(addressBook);
        System.out.println("Address Book Added!!!");
        System.out.println();
    }

    public void editContacts(){
        System.out.println("Enter the name of the address book, the contact you want to edit exists:");
        String name= in.nextLine();

        if(Dictionary.containsKey(name)) {
            AddressBook Temp= Dictionary.get(name);
            Temp.editContact();
            System.out.println(Temp);
            System.out.println("Contact Added!!!");
            System.out.println();
        }
        else
            System.out.println("Given Address Book not Found!!!\n");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program in Address Book Main class on Main Branch");

    }
}