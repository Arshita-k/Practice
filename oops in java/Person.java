public class Person {
    private int id;
    private String name;

    // Constructor
    public Person(int id, String name) {
        this.id = id; // 'this' refers to the current instance of the class
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}
public class Main_2{
    public static void main(String[] args) {
        // Creating an instance of Person
        Person person1 = new Person(1, "John Doe");

        // Accessing attributes using getter methods
        System.out.println("ID: " + person1.getId());
        System.out.println("Name: " + person1.getName());

        // Changing attribute values using setter methods
        person1.setId(2);
        person1.setName("Jane Smith");

        // Displaying updated attributes
        System.out.println("\nUpdated values:");
        System.out.println("ID: " + person1.getId());
        System.out.println("Name: " + person1.getName());
    }
}
