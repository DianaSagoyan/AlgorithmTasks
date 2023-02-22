package trees.phonebook_task;

public class CustomerNode {
    CustomerNode leftChild;
    CustomerNode rightChild;
    String firstName;
    String lastName;
    String email;
    String number;

    public CustomerNode(String firstName, String lastName, String email, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
    }
}