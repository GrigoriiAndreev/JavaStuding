package MathPackage;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Worksheet implements Serializable{
// Global variables
//    static public String siteNameLeftBottom = "https://mathematics-tests.com";
//    static public String siteNameRightBottom = "https://magazin-integral.ru";
//    static public String General.workingFolder = "D:/Java_Math/Temp/";
//    static public String General.readyFilesFolder = "D:/Java_Math/ReadyWorksheets/";
    static public String saveFileName = "Grade4Worksheets.bin";
    static public String gradeRU = "4 класс.";
    static public String gradeEn = "Grade 4.";
    static public int pageNumber = 6;

    String grade;
    String shortWorksheetName;
    String longWorksheetName;
    int numbersRangeStart;
    int numbersRangeEnd;
    String url;

    public Worksheet(String shortWorksheetName,
                     String longWorksheetName,
                     int numbersRangeStart,
                     int numbersRangeEnd) {
        this.shortWorksheetName = shortWorksheetName;
        this.longWorksheetName = longWorksheetName;
        this.numbersRangeStart = numbersRangeStart;
        this.numbersRangeEnd = numbersRangeEnd;
    }

    public void setShortWorksheetName(String shortWorksheetName) {
        this.shortWorksheetName = shortWorksheetName;
    }

    public void setLongWorksheetName(String longWorksheetName) {
        this.longWorksheetName = longWorksheetName;
    }

    public String getShortWorksheetName() {
        return shortWorksheetName;
    }

    public String getLongWorksheetName() {
        return longWorksheetName;
    }

    public static void main(String[] args) throws Exception {

        Matrix.emptyFolder(General.workingFolder);
        Matrix.emptyFolder(General.readyFilesFolder);

//        Worksheet[] grade2Add = new Worksheet[10];
        Worksheet[] grade4Add = new Worksheet[10];
        List<Worksheet> grade4Sub = new ArrayList<Worksheet>();
        List<Worksheet> grade4AddSub = new ArrayList<Worksheet>();
        List<Worksheet> grade4Mult = new ArrayList<Worksheet>();

        grade4Sub.add( new Worksheet("Вычитание чисел.", "Вычитание двух чисел столбиком. Числа до 100_000.",
                1, 100_000));
        grade4Sub.add( new Worksheet("Вычитание чисел.", "Вычитание двух чисел столбиком. Числа до 10_00_000.",
                1, 10_000_000));
        grade4Sub.add( new Worksheet("Вычитание чисел.", "Вычитание двух чисел. Заполните пропущенные цифры.",
                1, 10_000_000));
        grade4Sub.add( new Worksheet("Вычитание чисел устно.", "Вычитание устно. Выбери два числа, чтобы примеры стали правильными.", 1, 1_000));
        grade4Sub.add( new Worksheet("Вычитание чисел устно.", "Вычитание двух чисел устно. Числа до 1000.",
                1, 1_000));
        grade4Sub.add( new Worksheet("", "",
                1, 1_000));

        grade4Mult.add( new Worksheet("Умножение чисел.", "Умножение однозначных чисел.",
                1, 100_000));
        grade4Mult.add( new Worksheet("Умножение чисел.", "Умножение однозначных чисел на десятки.",
                1, 100_000));
        grade4Mult.add( new Worksheet("Умножение чисел.", "Умножение однозначных чисел на сотни.",
                1, 100_000));


/*
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

*/

        //Creating worksheet for Grade 4 - Russian
        grade4Add[0] = new Worksheet(
                "Сложение чисел.", "Сложение двух чисел столбиком. Числа до 100_000.",
                1, 100_000);

        grade4Add[1] = new Worksheet(
                "Сложение чисел.", "Сложение двух чисел столбиком. Числа до 10_000_000.",
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

        grade4Add[5] = new Worksheet(
                "Сложение чисел устно.", "Сложение чисел. Выбери два числа, чтобы пример" +
                " стал правильным.",1, 1_000);

        grade4Add[6] = new Worksheet(
                "Сложение чисел устно.", "Сложение двух чисел устно. Числа до 1000.",
                1, 1000);

        grade4Add[7] = new Worksheet(
                "Сложение чисел.", "Выбери два числа из заданных. Выражение должно быть правильным.",
                1, 1000);



        FileOutputStream fileOutputStream = new FileOutputStream(General.readyFilesFolder + saveFileName);
        FileInputStream fileInputStream = new FileInputStream(General.readyFilesFolder + saveFileName);


        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        objectOutputStream.writeObject(grade4Sub);
        Object object = objectInputStream.readObject();


        grade4AddSub = (List<Worksheet>) object;

        fileInputStream.close();
        fileOutputStream.close();
        objectInputStream.close();
        objectOutputStream.close();
//        pr.close();

        System.out.println(" Load ");
        for (Worksheet worksheet : grade4AddSub)
            System.out.println(worksheet.shortWorksheetName + " " + worksheet.longWorksheetName + " "
                    + worksheet.numbersRangeStart + " " + worksheet.numbersRangeEnd);

        System.out.println("Finisged");

//        ArrayList<Worksheet> grade4Sub = new ArrayList<>();

//        OutputStream outputStream = new FileOutputStream(General.readyFilesFolder + saveFileName);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//        InputStream inputStream = new FileInputStream(General.readyFilesFolder + saveFileName);
//        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

//        PrintWriter pr = new PrintWriter(outputStream);
//        for (Worksheet worksheet : grade4Sub) {
//            objectInputStream.readObject(worksheet);
//            System.out.println(worksheet.shortWorksheetName + " " + worksheet.longWorksheetName);
//        }
//        objectOutputStream.close(); // без этого не пропустит

/*

// Все работает 12.12.2020
//Adding two numbers in columns. Numbers up to 100_000 - OK
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[0].shortWorksheetName, grade4Add[0].longWorksheetName );
        Matrix.addA1_B1A4ColumnWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[0].shortWorksheetName, grade4Add[0].longWorksheetName,
                grade4Add[0].numbersRangeStart, grade4Add[0].numbersRangeEnd, 0, 9, 7);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[0].shortWorksheetName, grade4Add[0].longWorksheetName );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[0].shortWorksheetName, grade4Add[0].longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[0].shortWorksheetName, grade4Add[0].longWorksheetName);

//Adding two numbers in columns. Numbers up to 10_000_000 - OK
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[1].shortWorksheetName, grade4Add[1].longWorksheetName );
        Matrix.addA1_B1A4ColumnWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[1].shortWorksheetName, grade4Add[1].longWorksheetName,
                grade4Add[1].numbersRangeStart, grade4Add[1].numbersRangeEnd, 0, 9, 7);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[1].shortWorksheetName, grade4Add[1].longWorksheetName);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[1].shortWorksheetName, grade4Add[1].longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[1].shortWorksheetName, grade4Add[1].longWorksheetName);

//Adding two numbers in columns. Numbers up to 1_000_000. Fill in Missing numbers -
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[2].shortWorksheetName, grade4Add[2].longWorksheetName );
        Matrix.addA1_B1A4ColumnMissingNumbersWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[2].shortWorksheetName, grade4Add[2].longWorksheetName,
                grade4Add[2].numbersRangeStart, grade4Add[2].numbersRangeEnd, 0, 9, 6);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[2].shortWorksheetName, grade4Add[2].longWorksheetName);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[2].shortWorksheetName, grade4Add[2].longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[2].shortWorksheetName, grade4Add[2].longWorksheetName);

//Adding three numbers in columns. Numbers up to 1_000_000 -
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[3].shortWorksheetName, grade4Add[3].longWorksheetName );
        Matrix.addA1_B1_C1ColumnA4Worksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[3].shortWorksheetName, grade4Add[3].longWorksheetName,
                grade4Add[3].numbersRangeStart, grade4Add[3].numbersRangeEnd, 8, 6);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[3].shortWorksheetName, grade4Add[3].longWorksheetName);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[3].shortWorksheetName, grade4Add[3].longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[3].shortWorksheetName, grade4Add[3].longWorksheetName);

//Adding four numbers in columns. Numbers up to 1_000_000 -
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[4].shortWorksheetName, grade4Add[4].longWorksheetName );
        Matrix.addA1_B1_C1_D1ColumnA4Worksheet(General.workingFolder,gradeRU, pageNumber, grade4Add[4].shortWorksheetName, grade4Add[4].longWorksheetName,
                grade4Add[4].numbersRangeStart, grade4Add[4].numbersRangeEnd, 6, 6);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[4].shortWorksheetName, grade4Add[4].longWorksheetName );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[4].shortWorksheetName, grade4Add[4].longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[4].shortWorksheetName, grade4Add[4].longWorksheetName);

//Mental addition of two numbers up to 1000
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[6].shortWorksheetName, grade4Add[6].longWorksheetName );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, gradeRU, pageNumber, grade4Add[6].shortWorksheetName, grade4Add[6].longWorksheetName,
                grade4Add[6].numbersRangeStart, grade4Add[6].numbersRangeEnd, 0, 20, 6);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[6].shortWorksheetName, grade4Add[6].longWorksheetName );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[6].shortWorksheetName, grade4Add[6].longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[6].shortWorksheetName, grade4Add[6].longWorksheetName);

//Choose two numbers to complete the addition sentence
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[7].shortWorksheetName, grade4Add[7].longWorksheetName );
        Matrix.chooseNumbersForAdditionSentenceA4Worksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[7].shortWorksheetName, grade4Add[7].longWorksheetName,
                grade4Add[7].numbersRangeStart, grade4Add[7].numbersRangeEnd, 6, 8);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Add[7].shortWorksheetName, grade4Add[7].longWorksheetName );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[7].shortWorksheetName, grade4Add[7].longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Add[7].shortWorksheetName, grade4Add[7].longWorksheetName);

//Subtraction worksheets
//Subtraction of two numbers in columns. Numbers up to 100_000 - OK
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(0).shortWorksheetName, grade4Sub.get(0).longWorksheetName );
        Matrix.subtractA1_B1A4ColumnWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(0).shortWorksheetName, grade4Sub.get(0).longWorksheetName,
                grade4Sub.get(0).numbersRangeStart, grade4Sub.get(0).numbersRangeEnd, 0, 9, 7);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(0).shortWorksheetName, grade4Sub.get(0).longWorksheetName );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(0).shortWorksheetName, grade4Sub.get(0).longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(0).shortWorksheetName, grade4Sub.get(0).longWorksheetName);

//Subtraction of two numbers in columns. Numbers up to 10_000_000 - OK
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(1).shortWorksheetName, grade4Sub.get(1).longWorksheetName );
        Matrix.subtractA1_B1A4ColumnWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(1).shortWorksheetName, grade4Sub.get(1).longWorksheetName,
                grade4Sub.get(1).numbersRangeStart, grade4Sub.get(1).numbersRangeEnd, 0, 9, 7);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(1).shortWorksheetName, grade4Sub.get(1).longWorksheetName );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(1).shortWorksheetName, grade4Sub.get(1).longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(1).shortWorksheetName, grade4Sub.get(1).longWorksheetName);

//Subtraction of two numbers in columns. Numbers up to 10_000_000. Fill in missing numbers - OK
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(2).shortWorksheetName, grade4Sub.get(2).longWorksheetName );
        Matrix.subtractA1_B1A4ColumnMissingNumbersWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(2).shortWorksheetName, grade4Sub.get(2).longWorksheetName,
                grade4Sub.get(2).numbersRangeStart, grade4Sub.get(2).numbersRangeEnd, 0, 9, 6);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(2).shortWorksheetName, grade4Sub.get(2).longWorksheetName );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(2).shortWorksheetName, grade4Sub.get(2).longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(2).shortWorksheetName, grade4Sub.get(2).longWorksheetName);

//Subtraction of two numbers in columns. Numbers up to 10_000_000. Select two numbers to complete subtrction sentence - OK
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(2).shortWorksheetName, grade4Sub.get(2).longWorksheetName );
        Matrix.subtractA1_B1A4ColumnMissingNumbersWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(2).shortWorksheetName, grade4Sub.get(2).longWorksheetName,
                grade4Sub.get(2).numbersRangeStart, grade4Sub.get(2).numbersRangeEnd, 0, 9, 6);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(2).shortWorksheetName, grade4Sub.get(2).longWorksheetName );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(2).shortWorksheetName, grade4Sub.get(2).longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(2).shortWorksheetName, grade4Sub.get(2).longWorksheetName);

//Mental subtraction of two numbers in columns. Numbers up to 1000 - OK
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(4).shortWorksheetName, grade4Sub.get(4).longWorksheetName );
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(4).shortWorksheetName, grade4Sub.get(4).longWorksheetName,
                grade4Sub.get(4).numbersRangeStart, grade4Sub.get(4).numbersRangeEnd, 0, 20, 6);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(4).shortWorksheetName, grade4Sub.get(4).longWorksheetName );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(4).shortWorksheetName, grade4Sub.get(4).longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(4).shortWorksheetName, grade4Sub.get(4).longWorksheetName);

//Subtraction of numbers. Choose two correct numbers - OK
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(3).shortWorksheetName, grade4Sub.get(3).longWorksheetName );
        Matrix.chooseNumbersForSubtractionSentenceA4Worksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(3).shortWorksheetName, grade4Sub.get(3).longWorksheetName,
                grade4Sub.get(3).numbersRangeStart, grade4Sub.get(3).numbersRangeEnd, 6, 8);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, grade4Sub.get(3).shortWorksheetName, grade4Sub.get(3).longWorksheetName );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(3).shortWorksheetName, grade4Sub.get(3).longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, grade4Sub.get(3).shortWorksheetName, grade4Sub.get(3).longWorksheetName);
*/

    }
}



