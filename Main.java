package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы хотите пиццу?");

        String answer = read.readLine();

        if (answer.equals("да")) {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("Пицца притоговлена, кушать подано");
        }
        else if (answer.equals("нет")) {
            System.out.println("Пока!");
        }
        else {
            System.out.println("Неизвестная команда! Напишите \"да\" или \"нет\"");
        }

    }
}
