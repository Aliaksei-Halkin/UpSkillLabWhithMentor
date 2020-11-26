package module.fifth.task4;

import java.util.Scanner;

public class CaseMenu {
    private Cave cave;
    private final Scanner scanner;

    public CaseMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printMenu() {
        System.out.println("1. Просмотреть сокровища\n" +
                "2. Выбора самого дорогого по стоимости сокровища\n" +
                "3. Выбора сокровища на заданную сумму\n");
    }

    public void start(Cave cave) {
        int key;
        printMenu();
        do {
            System.out.println("Введите номер меню: ");
            key = this.scanner.nextInt();
            switch (key) {
                case 1:
                    cave.viewRiches();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Вы ввели неверное значение меню...\n");
            }

        } while (key < 0 && key > 4);


    }
}