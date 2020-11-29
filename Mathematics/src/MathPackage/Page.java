package MathPackage;

import java.util.*;

public class Page {
    String shortWorksheetName;
    String longWorksheetName;
    int numbersRangeStart;
    int numbersRangeEnd;

    public Page(String shortWorksheetName,
                     String longWorksheetName,
                     int numbersRangeStart,
                     int numbersRangeEnd) {
        this.shortWorksheetName = shortWorksheetName;
        this.longWorksheetName = longWorksheetName;
        this.numbersRangeStart = numbersRangeStart;
        this.numbersRangeEnd = numbersRangeEnd;
    }

    public static void main(String[] args) {

        Page[] grade2Add = new Page[10];

        grade2Add[0] = new Page (
                "Сложение чисел", "Сложение чисел однозначных чисел. Сумма до 10",
                1,9);
        grade2Add[1] = new Page (
                "Сложение чисел", "Выбери примеры, чтобы сумма сошлась с зданной",
                1,9);
        grade2Add[2] = new Page (
                "Сложение чисел", "Выбери картинки, чтобы они сошлись с примером",
                1,9);

/*
        Worksheet add = new Worksheet(
                "Сложение чисел",
                "Сложение чисел однозначных чисел. Сумма до 10.",
                1, 9);
*/
    }
}
