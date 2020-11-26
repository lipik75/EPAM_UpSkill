package module4.task1.book;

import java.util.ArrayList;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 *    Найти и вывести:
 *    a) список книг заданного автора;
 *    b) список книг, выпущенных заданным издательством;
 *    c) список книг, выпущенных после заданного года.
 */

public class BookMain {

    public static void main(String[] args) {
        BookStore shafa = new BookStore("Книжная Шафа", new ArrayList<>());
        shafa.addBook("Yiddish Policemen's Union", "Michael Chabon", "HarperCollins Canada",
                2008, 432, 22.78f, "hardcover");
        shafa.addBook("Adventures and Misadventures of Maqroll", "Alvaro Mutis", "New York Review of Books",
                2002, 720, 20.12f, "paperback");
        shafa.addBook("Long Ships", "Michael Chabon", "New York Review of Books",
                2010, 528, 16.16f, "paperback");
        shafa.addBook("Fahrenheit 451", "Ray Bradbury", "Simon & Schuster",
                2012, 256, 14.20f, "paperback");
        shafa.addBook("Amazing Adventures of Kavalier and Clay", "Michael Chabon", "Random House Publishing Group",
                2012, 704, 15.53f, "paperback");

        System.out.println("books by Michael Chabon at the Shafa store:");
        ArrayList<Book> autorsBook = shafa.authorsBooks("Michael Chabon");
        for (Book book : autorsBook) {
            System.out.println(book);
        }

        System.out.println("\nbooks published by \"New York Review of Books\":");
        ArrayList<Book> publishersBook = shafa.publishersBook("New York Review of Books");
        for (Book book : publishersBook) {
            System.out.println(book);
        }

        System.out.println("\nbooks released after 2010:");
        ArrayList<Book> releasedAfter = shafa.releasedAfter(2010);
        for (Book book : releasedAfter) {
            System.out.println(book);
        }
    }
}
