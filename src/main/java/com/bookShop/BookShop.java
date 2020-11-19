package com.bookShop;

import com.bookShop.service.BookService;

import java.util.Scanner;

import static com.bookShop.util.Utils.createBook;

public class BookShop {

    private static final Scanner SCANNER = new Scanner(System.in);
    public BookService bookService = new BookService();

    public void start() {

        boolean run = true;

        while (run) {
            System.out.println("Press 1 to view all books \n"
                    + "Press 2 to add a book\n"
                    + "Press 3 to remove a book\n"
                    + "Press 4 to update a book\n"
                    + "Press 5 exit");

            int number = SCANNER.nextInt();

            if (number < 1 && number > 5) {
                System.out.println("Введите правильное число");
            }

            switch (number) {
                case 1:

                    break;
                case 2:

                    bookService.add(createBook());
                    break;
                case 3:
                    bookService.remove(createBook());
                    break;
                case 4:
                    bookService.update(createBook());
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
    }
}
