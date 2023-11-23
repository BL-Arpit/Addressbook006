import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Addressbook a1 = new Addressbook("Book1");
        Person p1 = new Person("Arpit","Sahu","12388218",546,"Associate");
        a1.contactList.add(p1);
        System.out.println(a1.contactList);

    }
}

class Addressbook{
    String Name;
     ArrayList <Person> contactList = new ArrayList<>();

    Addressbook(String name){
        this.Name =name;
    }
}