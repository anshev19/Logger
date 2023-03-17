package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Введите размер списка: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int listSize = Integer.parseInt(reader.readLine());
        System.out.println("Введите верхнюю границу для значений: ");
        int maxValue = Integer.parseInt(reader.readLine());
        logger.log("Создаём и наполняем список");
        var randomList = createRandomList(listSize, maxValue);
        System.out.print("Вот случайный список: ");
        printList(randomList);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int threshold = Integer.parseInt(reader.readLine());
        var filteredList = new Filter(threshold).filterOut(randomList);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: ");
        printList(filteredList);
        logger.log("Завершаем программу");
    }

    public static List<Integer> createRandomList(int size, int maxValue) {
        List<Integer> randomList = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < size; i++) {
            randomList.add(r.nextInt(maxValue));
        }

        return randomList;
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
