
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Author lev = new Author("Лев", "Толстой");
        Author michail = new Author("Михаил", "Булгаков");
        Book warAndPeace = new Book("Война и мир", lev, 1964);
        Book theMasterAndMargarita = new Book("Мастер и Маргарита", michail, 1927);
        printBook(warAndPeace);
        printBook(theMasterAndMargarita);
        theMasterAndMargarita.setPublishingYear(1928);
        printBook(warAndPeace);
        System.out.println(warAndPeace.equals(theMasterAndMargarita));
        Book warAndPeaceNew = new Book("Война и мир", lev, 2023);
        System.out.println(warAndPeace.equals(warAndPeaceNew));
        System.out.println(warAndPeace.getClass());
        System.out.println(theMasterAndMargarita.getClass());
    }

    private static void printBook(Book book) {
        System.out.println(book.toString());
    }
}