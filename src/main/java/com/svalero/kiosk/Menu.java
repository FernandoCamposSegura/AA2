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
            System.out.println("4. Ver libros ");
            System.out.println("5. Ver revistas ");
            System.out.println("6. Ver periódicos ");
            System.out.println("4. Salir ");

            System.out.println("Elige una opción del menú");
            choice = Integer.parseInt(scn.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Introduce el ISBN del libro: ");
                    String ISBN = scn.nextLine();
                    System.out.println("Introduce el título del libro: ");
                    String title = scn.nextLine();
                    System.out.println("Introduce el autor del libro: ");
                    String author = scn.nextLine();
                    System.out.println("Introduce el número de páginas: ");
                    int numPages = Integer.parseInt(scn.nextLine());
                    System.out.println("Introduce el precio: ");
                    float price = Float.parseFloat(scn.nextLine());

                    books.add(new Book(title, author, ISBN, numPages, price));
                    break;
                case 2:
                    System.out.println("Introduce el código de la revista: ");
                    String code = scn.nextLine();
                    System.out.println("Introduce el género de la revista: ");
                    String category = scn.nextLine();
                    System.out.println("Introduce el año publicación: ");
                    int yearPublication = Integer.parseInt(scn.nextLine());
                    System.out.println("Introduce el número de páginas: ");
                    numPages = Integer.parseInt(scn.nextLine());
                    System.out.println("Introduce el precio: ");
                    price = Float.parseFloat(scn.nextLine());

                    magazines.add(new Magazine(category, code, yearPublication, numPages, price));
                    break;
                case 3:
                    System.out.println("Introduce el código del periódico: ");
                    code = scn.nextLine();
                    System.out.println("Introduce el género del periódico: ");
                    category = scn.nextLine();
                    System.out.println("Introduce la editorial del periódico: ");
                    String editorial = scn.nextLine();
                    System.out.println("Introduce el año publicación: ");
                    yearPublication = Integer.parseInt(scn.nextLine());
                    System.out.println("Introduce el precio: ");
                    price = Float.parseFloat(scn.nextLine());

                    newspapers.add(new Newspaper(category, editorial, code, yearPublication, price));
                    break;
                case 4:
                    books.forEach((book) -> System.out.println(book));
                    break;
                case 5:
                    magazines.forEach((magazine) -> System.out.println(magazine));
                    break;
                case 6:
                    newspapers.forEach((newspaper) -> System.out.println(newspaper));
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Elige una opción entre las disponibles");

            }
        } while(choice != 7);

    }

}
