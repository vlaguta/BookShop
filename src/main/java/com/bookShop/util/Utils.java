package com.bookShop.util;

import com.bookShop.model.Book;
import com.bookShop.model.Customer;

import java.util.Scanner;

import static com.bookShop.util.InputUtils.INPUT_AUTHOR_MESSAGE;
import static com.bookShop.util.InputUtils.INPUT_COUNT_MESSAGE;
import static com.bookShop.util.InputUtils.INPUT_EMAIL_MESSAGE;
import static com.bookShop.util.InputUtils.INPUT_GENRE_MESSAGE;
import static com.bookShop.util.InputUtils.INPUT_LANGUAGE_MESSAGE;
import static com.bookShop.util.InputUtils.INPUT_LAST_NAME_MESSAGE;
import static com.bookShop.util.InputUtils.INPUT_NAME_MESSAGE;
import static com.bookShop.util.InputUtils.INPUT_PATRONYMIC_MESSAGE;
import static com.bookShop.util.InputUtils.INPUT_PHONE_MESSAGE;
import static com.bookShop.util.InputUtils.INPUT_PRICE_MESSAGE;
import static com.bookShop.util.InputUtils.INPUT_PUBLISHING_HOUSE_MESSAGE;

public class Utils {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static Book createBook(){

        System.out.print(INPUT_NAME_MESSAGE);
        String name = SCANNER.nextLine();

        System.out.println(INPUT_AUTHOR_MESSAGE);
        String author = SCANNER.nextLine();

        System.out.println(INPUT_GENRE_MESSAGE);
        String genre = SCANNER.nextLine();

        System.out.println(INPUT_PRICE_MESSAGE);
        double price = SCANNER.nextDouble();
        SCANNER.nextLine();

        System.out.println(INPUT_PUBLISHING_HOUSE_MESSAGE);
        String publishingHouse = SCANNER.nextLine();

        System.out.println(INPUT_LANGUAGE_MESSAGE);
        String language = SCANNER.nextLine();

        System.out.println(INPUT_COUNT_MESSAGE);
        int count = SCANNER.nextInt();

        return new Book(name, author, genre, price, publishingHouse, language, count);
    }

    public static Customer createUser(){

        System.out.print(INPUT_NAME_MESSAGE);
        String name = SCANNER.nextLine();

        System.out.println(INPUT_LAST_NAME_MESSAGE);
        String lastName = SCANNER.nextLine();

        System.out.println(INPUT_PATRONYMIC_MESSAGE);
        String patronymic = SCANNER.nextLine();

        System.out.println(INPUT_PHONE_MESSAGE);
        String phone = SCANNER.nextLine();

        System.out.println(INPUT_EMAIL_MESSAGE);
        String email = SCANNER.nextLine();

     return new Customer(name, lastName, patronymic, phone, email);
    }


}
