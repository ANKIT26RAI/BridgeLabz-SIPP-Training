package inheritance.SampleProblem1;

public class Author extends Book {
    String name;
    String bio;

    public Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
        System.out.println("Author: " + name + " - " + bio);
    }

    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2020, "Ankit Rai", "Java Developer");
        a.displayInfo();
    }
}
