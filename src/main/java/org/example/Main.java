package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double Zemly_Radius = 6371.0; // Объявление константы с радиусом Земли в километрах
        Scanner sc = new Scanner(System.in); // Создаём сканер, который будет считывать вводимые данные с клавиатуры

        System.out.print("Введите долготу первой точки: "); // Вывод текста для первой долготы
        double dolgota1 = Math.toRadians(sc.nextDouble()); // Считывание долготы первой точки и её перевод в радианы
        System.out.print("Введите широту первой точки: "); // Вывод текста для первой широты
        double shirota1 = Math.toRadians(sc.nextDouble()); // Считывание широты первой точки и её перевод в радианы
        System.out.print("Введите долготу второй точки: "); // Вывод текста для второй долготы
        double dolgota2 = Math.toRadians(sc.nextDouble()); // Считывание долготы второй точки и её перевод в радианы
        System.out.print("Введите широту второй точки: "); // Вывод текста для второй широты
        double shirota2 = Math.toRadians(sc.nextDouble()); // Считывание широты второй точки и её перевод в радианы

        double dlon = dolgota2 - dolgota1; // Вычисление разницы между долготами
        double dlat = shirota2 - shirota1; // Вычисление разницы между широтами

        double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(shirota1) * Math.cos(shirota2) * Math.pow(Math.sin(dlon / 2), 2);
        // Вычисление значения по формуле Гаверсинусов
        double c = 2 * Math.asin(Math.sqrt(a)); // Вычисление угола между точками на сфере

        double distance = Zemly_Radius * c; // Вычисление окончательного расстояния между точками в километрах

        System.out.println("Расстояние между точками: " + distance + " км"); // Вывод итогового расстояния между точками
    }
}
