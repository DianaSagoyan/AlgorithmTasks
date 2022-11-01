package linkedLists.palindrome.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PhoneBookSinglyLinkedList {
    public PhoneBookNode head;
    public PhoneBookNode tail;
    public int size;

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void printPhoneBook(){
        PhoneBookNode current = head;
        if(isEmpty()) throw new NoSuchElementException();

        while (current != null){
            System.out.println(current.contact);
            current = current.next;
        }
    }

    public void add(Contact contact){
        PhoneBookNode newContact = new PhoneBookNode(contact);
        if(isEmpty()){
            head = tail = newContact;
        }
        else{
            tail.next = newContact;
            tail = newContact;
        }
        size++;
    }

    public PhoneBookNode findByFirstName(String firstName){
        PhoneBookNode current = head;

        if(isEmpty()) throw new NoSuchElementException();

        while (current != null){
            if(current.contact.firstName.equals(firstName)) return current;
            current = current.next;
        }
        return null; //if no such contact
    }

    public List<PhoneBookNode> findAllByLastName(String lastName){

        List<PhoneBookNode> list = new ArrayList<>();

        if(isEmpty()) throw new NoSuchElementException();

        PhoneBookNode current = head;
        while(current != null){
            if(current.contact.lastName.equals(lastName)) list.add(current);
            current = current.next;
        }
        return list;
    }

    public void deleteByFirstName(String firstName){
        PhoneBookNode previous = head;
        PhoneBookNode current = head;

        if(isEmpty()) throw new NoSuchElementException();

        while (current != null){
            if(current.contact.firstName.equals(firstName)){
                if(current == head) {
                    head = current.next;

                }else if(current == tail){
                    tail = previous;
                    tail.next = null;

                }else{
                    previous.next = current.next;
                    current.next = null;

                }
                size--;
                break;
            }
            previous = current;
            current = current.next;
        }
    }

    public void deleteAllMatchingWithLastName(String lastName) {
        PhoneBookNode previous = head;
        PhoneBookNode current = head;

        if(isEmpty()) throw new NoSuchElementException();

        while (current != null) {
            if (current.contact.lastName.equals(lastName)) {
                if (current == head) {
                    head = current.next;
                    current.next = null;

                } else if (current == tail) {
                    tail = previous;
                    previous.next = null;

                } else {
                    previous.next = current.next;
                    current.next = null;

                }
                size--;
            }
            previous = current;
            current = current.next;
        }
    }


    public List<PhoneBookNode> findAll(){
        List<PhoneBookNode> list = new ArrayList<>();
        PhoneBookNode current = head;

        if(isEmpty()) throw new NoSuchElementException();

        while (current != null){
            list.add(current);
            current = current.next;
        }

        return list;
    }
}
