import java.util.Scanner;

public class CrudOperation {
    void AddContact(AddressBook a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String fname = sc.next();
        System.out.println("Enter last name");
        String lname = sc.next();
        System.out.println("Enter Phone number");
        String phoneNumber = sc.next();
        System.out.println("Enter ZipCode");
        int zip = sc.nextInt();
        System.out.println("Enter Relation");
        String relation = sc.next();
        //Person.java constructor
        Person p1 = new Person(fname,lname,phoneNumber,zip,relation);
        //added to the address book instance
        a.contactList.add(p1);
    }

    void searchByFirstName(AddressBook a , String s1){
        boolean flag = false;
        for (Person p : a.contactList){
            if (p.getFname().equalsIgnoreCase(s1)) {
                System.out.println(p);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("The name is not found");
        }
    }

     void searchByPhoneNumber(AddressBook a, String a1){
        boolean flag = false;
        for (Person p : a.contactList){
            if (p.getPhnNo().equalsIgnoreCase(a1)) {
                System.out.println(p);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Phone number is not existing");
        }
    }
}
