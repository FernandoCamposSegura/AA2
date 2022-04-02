package com.svalero.kiosk;

import com.svalero.kiosk.domain.Book;
import com.svalero.kiosk.domain.Magazine;
import com.svalero.kiosk.domain.Newspaper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    public void showMenu() {
        Scanner scn = new Scanner(System.in);
        int choice;
        List<Book> books = new ArrayList();
        List<Magazine> magazines = new ArrayList<>();
        List<Newspaper> newspapers = new ArrayList<>();

        do {
            System.out.println("-----MENÚ-----");
            System.out.println("1. Registrar un libro ");
            System.out.println("2. Registrar una revista ");
            System.out.println("3. Registrar un periódico ");
            System.out.println("4. Salir ");

            System.out.println("Elige una opción del menú");
            choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Introduce el ISBN del libro: ");
                    String ISBN = scn.next();
                    System.out.println("Introduce el título del libro: ");
                    String title = scn.next();
                    System.out.println("Introduce el autor del libro: ");
                    String author = scn.next();
                    System.out.println("Introduce el número de páginas: ");
                    int numPages = scn.nextInt();
                    System.out.println("Introduce el precio: ");
                    float price = scn.nextFloat();

                    books.add(new Book(title, author, ISBN, numPages, price));
                    break;
                case 2:
                    System.out.println("Introduce el código de la revista: ");
                    String code = scn.next();
                    System.out.println("Introduce el género de la revista: ");
                    String gender = scn.next();
                    System.out.println("Introduce el año publicación: ");
                    int yearPublication = scn.nextInt();
                    System.out.println("Introduce el número de páginas: ");
                    numPages = scn.nextInt();
                    System.out.println("Introduce el precio: ");
                    price = scn.nextFloat();

                    magazines.add(new Magazine(gender, code, yearPublication, numPages, price));
                    break;
                case 3:
                    System.out.println("Introduce el código del periódico: ");
                    code = scn.next();
                    System.out.println("Introduce el género del periódico: ");
                    gender = scn.next();
                    System.out.println("Introduce la editorial del periódico: ");
                    String editorial = scn.next();
                    System.out.println("Introduce el año publicación: ");
                    yearPublication = scn.nextInt();
                    System.out.println("Introduce el precio: ");
                    price = scn.nextFloat();

                    newspapers.add(new Newspaper(gender, editorial, code, yearPublication, price));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Elige una opción entre las disponibles");

            }
        } while(choice != 4);

    }

}
