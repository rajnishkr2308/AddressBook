package com.bridgelabz;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class AddessBook {
    /*
    create Arraylist of contactPerson object called contact for store the contact of each person.
     */
    ArrayList<Contact> contact = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addContact(){
        /*
        creating contact for each person by using Scanner method
         */
        Contact contactPerson = new Contact();
        System.out.print("Enter the first name");
        contactPerson.setFirstName(scanner.nextLine());
        System.out.print("Enter last name");
        contactPerson.setLastName(scanner.nextLine());
        System.out.print("Enter Address");
        contactPerson.setAddress(scanner.nextLine());
        System.out.print("Enter city");
        contactPerson.setCity(scanner.nextLine());
        System.out.print("Enter state");
        contactPerson.setState(scanner.nextLine());
        System.out.print("Enter zip code");
        contactPerson.setZip(scanner.nextLine());
        System.out.print("Enter phonenumber");
        contactPerson.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter email");
        contactPerson.setEmail(scanner.nextLine());
        contact.add(contactPerson);
    }
    public void display(){
        /*
        to print arraylist to contact
         */
        System.out.println(contact);
        System.out.println("Conatct Added ");
    }
}
