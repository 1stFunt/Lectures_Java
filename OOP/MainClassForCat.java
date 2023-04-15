package OOP;

public class MainClassForCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat(10);
        cat1.firstName = "Bars";
        cat1.species = "British";
        cat1.male = "male";
        cat1.lastVisit = "12.04.2023";
        cat1.age = 2;
        System.out.println(cat1.getId());

        Cat cat2 = new Cat(20, 5, "Alice", "Perc", "shemale", "20230401");

        System.out.println(cat1);
        System.out.println(cat2);
    }
}