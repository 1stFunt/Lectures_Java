package OOP;

public class Cat {
    private int id;
    int age;
    String firstName;
    String species;
    String male;
    String lastVisit;

    public Cat(int id, int age, String firstName, String species, String male, String lastVisit) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.species = species;
        this.male = male;
        this.lastVisit = lastVisit;
    }

    public Cat(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %s %d", id, firstName, species, male, age);
    }

    @Override
    public boolean equals (Object o) {
    var t = (Cat) o;
    return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }
}