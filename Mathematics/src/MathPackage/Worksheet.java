package MathPackage;

import java.io.IOException;

public class Worksheet {

//    static public String siteNameLeftBottom = "https://mathematics-tests.com";
//    static public String siteNameRightBottom = "https://magazin-integral.ru";
    static public String workingFolder = "D:\\mathematics-at-school.com\\JavaTemplates/";

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

    public static void main(String[] args) throws IOException {

        Worksheet[] grade2Add = new Worksheet[10];

        grade2Add[0] = new Worksheet(
                "Сложение чисел.", "Сложение чисел однозначных чисел. Сумма до 10.",
                1, 9);
        grade2Add[1] = new Worksheet(
                "Сложение чисел в картинках.", "Выбери примеры, чтобы сумма сошлась с зданной.",
                1, 9);
        grade2Add[2] = new Worksheet(
                "Сложение чисел  в столбик.", "Сложение чисел в столбик. Двузначных чисел.",
                1, 9);
        grade2Add[3] = new Worksheet(
                "Сложение чисел.", "Подчеркни все примеры, где сумма чисел равна заданному.",
                1, 9);

        //Creating worksheet

        Matrix.emptyFolder(workingFolder);
// Adding two 2d numbers in line
//        Matrix.topWorksheet("2 класс.", 6, grade2Add[0].shortWorksheetName, grade2Add[0].longWorksheetName );
//        Matrix.addA1_B1A4LineWorksheet("2 класс.", 6, grade2Add[0].shortWorksheetName,
//                1, 10, 0, 5, 20);
//        Matrix.bottomWorksheet("2 класс.", 6, grade2Add[0].shortWorksheetName, grade2Add[0].longWorksheetName );
//        Matrix.fullWorksheet("2 класс.", 6, grade2Add[0].shortWorksheetName);
//        Matrix.allSameWorksheets("2 класс.", 6, grade2Add[0].shortWorksheetName);


//Adding numbers up to 10 with shapes
//        Matrix.topWorksheet("2 класс.", 6, grade2Add[1].shortWorksheetName, grade2Add[1].longWorksheetName );
//        Matrix.addA1_B1A4PicturesWorksheet("2 класс.", 6, grade2Add[1].shortWorksheetName,
//                1, 10, 0, 1, 15);
//        Matrix.bottomWorksheet("2 класс.", 6, grade2Add[1].shortWorksheetName, grade2Add[1].longWorksheetName );
//        Matrix.fullWorksheet("2 класс.", 6, grade2Add[1].shortWorksheetName);
//        Matrix.allSameWorksheets("2 класс.", 6, grade2Add[1].shortWorksheetName);

//Adding two 1d numbers in columns
//        Matrix.topWorksheet("2 класс.", 6, grade2Add[2].shortWorksheetName, grade2Add[2].longWorksheetName );
//        Matrix.addA1_B1A4ColumnWorksheet("2 класс.", 6, grade2Add[2].shortWorksheetName,
//                1, 9, 0, 10, 10);
//        Matrix.bottomWorksheet("2 класс.", 6, grade2Add[2].shortWorksheetName, grade2Add[2].longWorksheetName );
//        Matrix.fullWorksheet("2 класс.", 6, grade2Add[2].shortWorksheetName);
//Find a1 + b1 equals to given number
        Matrix.topWorksheet("2 класс.", 6, grade2Add[3].shortWorksheetName, grade2Add[3].longWorksheetName );
        Matrix.addA1_B1A4EqualsSumWorksheet("2 класс.", 6, grade2Add[3].shortWorksheetName,
                1, 9, 0, 10, 6);
//        Matrix.bottomWorksheet("2 класс.", 6, grade2Add[3].shortWorksheetName, grade2Add[2].longWorksheetName );
//        Matrix.fullWorksheet("2 класс.", 6, grade2Add[3].shortWorksheetName);

    }
}
