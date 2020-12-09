package MathPackage;

import java.io.IOException;

public class Worksheet {

    static public String siteNameLeftBottom = "https://mathematics-tests.com";
    static public String siteNameRightBottom = "https://magazin-integral.ru";
    static public String workingFolder = "D:\\mathematics-at-school.com\\JavaTemplates/";
    static public String readyFilesFolder = "D:/mathematics-at-school.com/JavaTemplatesReady/";

    String shortWorksheetName;
    String longWorksheetName;
    int numbersRangeStart;
    int numbersRangeEnd;

    public Worksheet(String shortWorksheetName,
                     String longWorksheetName,
                     int numbersRangeStart,
                     int numbersRangeEnd) {
        this.shortWorksheetName = shortWorksheetName;
        this.longWorksheetName = longWorksheetName;
        this.numbersRangeStart = numbersRangeStart;
        this.numbersRangeEnd = numbersRangeEnd;
    }


    public static void main(String[] args) throws Exception {

        Worksheet[] grade2Add = new Worksheet[10];
        Worksheet[] grade4Add = new Worksheet[10];

        grade2Add[0] = new Worksheet(
                "Сложение чисел.", "Сложение однозначных чисел. Сумма до 10.",
                1, 9);
        grade2Add[1] = new Worksheet(
                "Сложение чисел в картинках.", "Сосочитай и запиши числами правильный ответ.",
                1, 9);
        grade2Add[2] = new Worksheet(
                "Сложение чисел  в столбик.", "Сложение чисел в столбик. Двузначных чисел.",
                1, 9);
        grade2Add[3] = new Worksheet(
                "Сложение чисел.", "Подчеркни все примеры, где сумма чисел равна заданному.",
                1, 9);
        grade2Add[4] = new Worksheet(
                "Сложение чисел. Какой рисунок соответствует заданому примеру. ", "Выбери правильный рисунок.",
                1, 9);
        grade2Add[5] = new Worksheet(
                "Сложение 3 многозначных чисел.", "Высимли сумму 3-х чисел.",
                1, 9);
        grade2Add[6] = new Worksheet(
                "Сложение многозначных чисел.", "Реши текстовую задачу на сложение многозначных чисел.",
                1, 9);

        //Creating worksheet

        grade4Add[0] = new Worksheet(
                "Сложение чисел.", "Сложение двух чисел. Числа до 100_000.",
                1, 100_000);

        grade4Add[1] = new Worksheet(
                "Сложение чисел.", "Сложение двух чисел. Числа до 10_000_000.",
                1, 10_000_000);

        grade4Add[2] = new Worksheet(
                "Сложение чисел.", "Сложение двух чисел. Заполните пропущенные цифры.",
                1, 10_000_000);

        grade4Add[3] = new Worksheet(
                "Сложение чисел.", "Сложение трех чисел. Числа до 1_000_000.",
                1, 1_000_000);

        grade4Add[4] = new Worksheet(
                "Сложение чисел.", "Сложение четырех чисел. Числа до 1_000_000.",
                1, 1_000_000);


        Matrix.emptyFolder(workingFolder);
// Adding two numbers in line - OK
//        Matrix.topWorksheet("2 класс.", 6, grade2Add[0].shortWorksheetName, grade2Add[0].longWorksheetName );
//        Matrix.addA1_B1LineWorksheetA4("2 класс.", 6, grade2Add[0].shortWorksheetName,
//                1, 10, 0, 5, 20);
//        Matrix.bottomWorksheet("2 класс.", 6, grade2Add[0].shortWorksheetName, grade2Add[0].longWorksheetName );
//        Matrix.fullWorksheet("2 класс.", 6, grade2Add[0].shortWorksheetName);
//        Matrix.allSameWorksheets("2 класс.", 6, grade2Add[0].shortWorksheetName);
//        Matrix.addA1_B1LineSmallBlock("2 класс.", "1. Сложи однозначные числа. ",
//                1, 10, 0, 5);

        Matrix.emptyFolder(workingFolder);
//        Matrix.emptyFolder(readyFilesFolder);

//Adding two numbers in columns. Numbers up to 100_000 - OK
/*
        Matrix.topWorksheet("4 класс.", 6, grade4Add[0].shortWorksheetName, grade4Add[0].longWorksheetName );
        Matrix.addA1_B1A4ColumnWorksheet("4 класс.", 6, grade4Add[0].shortWorksheetName,
                grade4Add[0].numbersRangeStart, grade4Add[0].numbersRangeEnd, 0, 9, 7);
        Matrix.bottomWorksheet("4 класс.", 6, grade4Add[0].shortWorksheetName, grade4Add[0].longWorksheetName );
        Matrix.fullWorksheet("4 класс.", 6, grade4Add[0].shortWorksheetName);
        Matrix.allSameWorksheets("4 класс.", 6, grade4Add[0].shortWorksheetName, grade4Add[0].longWorksheetName);
*/

//Adding two numbers in columns. Numbers up to 10_000_000 - OK
/*
        Matrix.topWorksheet("4 класс.", 6, grade4Add[1].shortWorksheetName, grade4Add[1].longWorksheetName );
        Matrix.addA1_B1A4ColumnWorksheet("4 класс.", 6, grade4Add[1].shortWorksheetName,
                grade4Add[1].numbersRangeStart, grade4Add[1].numbersRangeEnd, 0, 9, 7);
        Matrix.bottomWorksheet("4 класс.", 6, grade4Add[1].shortWorksheetName, grade4Add[1].longWorksheetName );
        Matrix.fullWorksheet("4 класс.", 6, grade4Add[1].shortWorksheetName);
        Matrix.allSameWorksheets("4 класс.", 6, grade4Add[1].shortWorksheetName, grade4Add[1].longWorksheetName);
*/

//Adding two numbers in columns. Numbers up to 1_000_000. Fill in Missing numbers - OK
/*
        Matrix.topWorksheet("4 класс.", 6, grade4Add[2].shortWorksheetName, grade4Add[2].longWorksheetName );
        Matrix.addA1_B1A4ColumnMissingNumbersWorksheet("4 класс.", 6, grade4Add[2].shortWorksheetName,
                grade4Add[2].numbersRangeStart, grade4Add[2].numbersRangeEnd, 0, 9, 6);
        Matrix.bottomWorksheet("4 класс.", 6, grade4Add[2].shortWorksheetName, grade4Add[2].longWorksheetName);
        Matrix.fullWorksheet("4 класс.", 6, grade4Add[2].shortWorksheetName);
        Matrix.allSameWorksheets("4 класс.", 6, grade4Add[2].shortWorksheetName, grade4Add[2].longWorksheetName);
*/

//Adding three numbers in columns. Numbers up to 1_000_000 - OK
/*
        Matrix.topWorksheet("4 класс.", 6, grade4Add[3].shortWorksheetName, grade4Add[3].longWorksheetName );
        Matrix.addA1_B1_C1ColumnA4Worksheet("4 класс.", 6, grade4Add[3].shortWorksheetName, grade4Add[3].longWorksheetName,
                grade4Add[3].numbersRangeStart, grade4Add[3].numbersRangeEnd, 8, 6);
        Matrix.bottomWorksheet("4 класс.", 6, grade4Add[3].shortWorksheetName, grade4Add[3].longWorksheetName );
        Matrix.fullWorksheet("4 класс.", 6, grade4Add[3].shortWorksheetName);
        Matrix.allSameWorksheets("4 класс.", 6, grade4Add[3].shortWorksheetName, grade4Add[3].longWorksheetName);
*/

//Adding four numbers in columns. Numbers up to 1_000_000 - OK
        Matrix.topWorksheet("4 класс.", 6, grade4Add[4].shortWorksheetName, grade4Add[4].longWorksheetName );
        Matrix.addA1_B1_C1_D1ColumnA4Worksheet("4 класс.", 6, grade4Add[4].shortWorksheetName, grade4Add[4].longWorksheetName,
                grade4Add[4].numbersRangeStart, grade4Add[4].numbersRangeEnd, 6, 6);
        Matrix.bottomWorksheet("4 класс.", 6, grade4Add[4].shortWorksheetName, grade4Add[4].longWorksheetName );
        Matrix.fullWorksheet("4 класс.", 6, grade4Add[4].shortWorksheetName);
        Matrix.allSameWorksheets("4 класс.", 6, grade4Add[4].shortWorksheetName, grade4Add[4].longWorksheetName);




//Adding two numbers up to 10 with shapes
//        Matrix.topWorksheet("2 класс.", 6, grade2Add[1].shortWorksheetName, grade2Add[1].longWorksheetName );
//        Matrix.addA1_B1A4PicturesWorksheet("2 класс.", 6, grade2Add[1].shortWorksheetName,
//                1, 10, 0, 1, 15);
//        Matrix.bottomWorksheet("2 класс.", 6, grade2Add[1].shortWorksheetName, grade2Add[1].longWorksheetName );
//        Matrix.fullWorksheet("2 класс.", 6, grade2Add[1].shortWorksheetName);
//        Matrix.allSameWorksheets("2 класс.", 6, grade2Add[1].shortWorksheetName);


//Find a1 + b1 equals to given number
//        Matrix.topWorksheet("2 класс.", 6, grade2Add[3].shortWorksheetName, grade2Add[3].longWorksheetName );
//        Matrix.addA1_B1A4EqualsSumWorksheet("2 класс.", 6, grade2Add[3].shortWorksheetName,
//                1, 9, 10, 6);
//        Matrix.bottomWorksheet("2 класс.", 6, grade2Add[3].shortWorksheetName, grade2Add[3].longWorksheetName );
//        Matrix.fullWorksheet("2 класс.", 6, grade2Add[3].shortWorksheetName);
//        Matrix.allSameWorksheets("2 класс.", 6, grade2Add[3].shortWorksheetName);

//Find which problem is correct
//        Matrix.topWorksheet("2 класс.", 6, grade2Add[4].shortWorksheetName, grade2Add[4].longWorksheetName );
//        Matrix.addA1_B1A4WhichIsCorrectPictureWorksheet("2 класс.", 6, grade2Add[4].shortWorksheetName,
//                1, 9, 0, 10, 10);
//        Matrix.bottomWorksheet("2 класс.", 6, grade2Add[3].shortWorksheetName, grade2Add[3].longWorksheetName );
//        Matrix.fullWorksheet("2 класс.", 6, grade2Add[3].shortWorksheetName);
//        Matrix.allSameWorksheets("2 класс.", 6, grade2Add[3].shortWorksheetName);

//        Matrix.addA1_B1A4ColumnMissingNumbersWorksheet("2 класс.", 6, grade2Add[2].shortWorksheetName,
//                1, 100_000, 0, 10, 5);
//        Matrix.addA1_B1_C1A4ColumnWorksheet("4 класс.", 6, grade2Add[5].shortWorksheetName,
//                1, 100_000, 0, 7, 5);
//        Matrix.addA1_B1A4WordProblemsWorksheet("4 класс.", 2, grade2Add[5].shortWorksheetName,
//                1, 100_000,  7);
    }
}
