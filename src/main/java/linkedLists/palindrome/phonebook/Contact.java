package linkedLists.palindrome.phonebook;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Contact {
    public String firstName;
    public String lastName;
    public String email;
    public String phoneNumber;
}
