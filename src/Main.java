public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Irem",
                new PhoneNumber("5071234567"));
        Contact contact2 = new Contact("Ozge",
                new PhoneNumber(41,"5071234567"));
        Contact contact3 = new Contact("Joe",
                new PhoneNumber("345678912345"));
        Contact contact4 = new Contact("David",
                "david@gmail.com");
        Contact contact5 = new Contact("Sarah",
                new PhoneNumber("34325436546"), "sarah@gmail.com");

        System.out.println(contact1);
        System.out.println(contact2);
        System.out.println(contact3);
        System.out.println(contact4);
        System.out.println(contact5);
    }
}
