import java.util.*;

class Challange {
    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> number = new HashSet<>();

    public Challange(String name) {
        this(name, null);
    }

    public Challange(String name, String email) {
        this(name, email, 0);
    }

    public Challange(String name, long phNumber) {
        this(name, null, phNumber);
    }

    public Challange(String name, String email, long phNumber) {
        this.name = name;
        if (email != null) {
            emails.add(email);
        }
        if (phNumber > 0) {
            String p = String.valueOf(phNumber);
            p = "(%s) %s - %s ".formatted(p.substring(0, 3), p.substring(3, 6), p.substring(6));
            number.add(p);
        }
    }

    public String getName(String name) {
        return name;
    }

    public String toString() {
        return "%s - %s %s".formatted(name, emails, number);
    }

    public Challange mergeContactData(Challange contact) {
        Challange challange = new Challange(name);
        challange.emails = new HashSet<>(emails);
        challange.number = new HashSet<>(number);
        challange.emails.addAll(emails);
        challange.number.addAll(number);
        return challange;
    }

    public static void printData(String header, Collection<Challange> contacts) {
        System.out.println("-".repeat(50));
        System.out.println(header);
        System.out.println("-".repeat(50));
        contacts.forEach(System.out::println);
    }

        public static void main(String[] args) {

            List<Challange> emails = CollectData.getData("emails");
            List<Challange> phones = CollectData.getData("phone");
            printData("Phone List", phones);
            printData("Email List", emails);
        }
}