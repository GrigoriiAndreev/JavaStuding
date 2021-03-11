package MathPackage;

//import com.sun.org.apache.bcel.internal.generic.Select;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Page {
    public static String gradeRU = "4 класс";
    public static String gradeEN = "Grade 4";
    public static int pageNumber = 6;

    String parentsUrl;
    String url;
    String h1;
    String h2;
    String googleAdsHtmlBlock;
    String downloadPdfJpgZipFiles;
    String shortWorksheetName;
    String longWorksheetName;
    int numbersRangeStart;
    int numbersRangeEnd;

    public Page(
            String parentsUrl,
            String pageUrl,
            String h1,
            String h2,
            String shortWorksheetName,
            String longWorksheetName,
            int     numbersRangeStart,
            int     numbersRangeEnd)
    {
        this.parentsUrl = parentsUrl;
        this.url = pageUrl;
        this.h1 = h1;
        this.h2 = h2;
        this.shortWorksheetName = shortWorksheetName;
        this.longWorksheetName = longWorksheetName;
        this.numbersRangeStart = numbersRangeStart;
        this.numbersRangeEnd = numbersRangeEnd;
    }

    public static void main(String[] args) throws Exception {

        List<Page> page4GradeNumber = new ArrayList<>();
        List<Page> page4GradeNumberEn = new ArrayList<>();

        page4GradeNumber.add(new Page(
                "/zadachi-primery-4-klass-po-temam",
                "/razryady-chisel-slozhenie-desyatkov-edenits-basic-level",
                "Округление чисел.",
                "Задачи по математике на тему: Округление чисел. Скачать pdf или jpg.",
                "Округление чисел.","Округлите заданные числа с точностью до сотен.", 1_000, 10_000
        ));

        page4GradeNumberEn.add(new Page(
                "/zadachi-primery-4-klass-po-temam",
                "/razryady-chisel-slozhenie-desyatkov-edenits-basic-level",
                "Rounding numbers.",
                "Rounding whole numbers worksheets. Download pdf or jpg.",
                "Rounding numbers.","Round numbers to hundreds.", 1_000, 10_000
        ));




/*
        page4GradeNumber.add(new Page(
                "/zadachi-primery-4-klass-po-temam",
                "/razryady-chisel-slozhenie-desyatkov-edenits-basic-level",
                "Четные и нечетные числа.",
                "Задачи по математике на тему: Определние четных и нечетных чисел. Скачать pdf или jpg.",
                "Четные и нечетные числа.","Четно или нечетное число образуется в результате арифметических действий.", 1_000, 10_000
                ));

        page4GradeNumberEn.add(new Page(
                "/zadachi-primery-4-klass-po-temam",
                "/razryady-chisel-slozhenie-desyatkov-edenits-basic-level",
                "Even or odd numbers.",
                "Comparison worksheets. Download pdf or jpg.",
                "Numbers comparison.","Are the results even or odd number. Write even or odd.", 1_000, 10_000
                ));


        page4GradeNumber.add(new Page(
                "/zadachi-primery-1-klass-po-temam",
                "/razryady-chisel-slozhenie-desyatkov-edenits-basic-level",
                "Сравнение чисел.",
                "Задачи по математике на тему: Подчеркни правильные выражения на сравнения с ответами. Скачать pdf или jpg.",
                "Сравнение чисел.","Подчеркни правильные выражения.", 1_000, 10_000
                ));

        page4GradeNumberEn.add(new Page(
                "/zadachi-primery-1-klass-po-temam",
                "/razryady-chisel-slozhenie-desyatkov-edenits-basic-level",
                "Numbers comparison.",
                "Comparison worksheets. Download pdf or jpg.",
                "Numbers comparison.","Underline all of the true statments.", 1_000, 10_000
                ));

*/
//        page4GradeNumber.add(new Page(
//                "/zadachi-primery-1-klass-po-temam",
//                "/razryady-chisel-slozhenie-desyatkov-edenits-basic-level",
//                "Сравнение чисел.",
//                "Задачи по математике на тему: Какой знак сделает выражение не сравнение правильным. Задачи с ответами. Скачать pdf или jpg.",
//                "Сравнение чисел.","Какой знак сделает выражение на сравнение правильным.", 1_000, 10_000
//                ));

//        Matrix.emptyFolder(General.workingFolder);
//        Matrix.emptyFolder(General.readyFilesFolder);

/*
        //Number comparing. Select all of the true statements - Ru
        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, page4GradeNumber.get(0).shortWorksheetName, page4GradeNumber.get(0).longWorksheetName );
        Matrix.numberCompareA1_B1UnderlineCorrectSentencesWorksheetA4(General.workingFolder, gradeRU, pageNumber, page4GradeNumber.get(0).shortWorksheetName, page4GradeNumber.get(0).longWorksheetName,
                page4GradeNumber.get(0).numbersRangeStart, page4GradeNumber.get(0).numbersRangeEnd, 0, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, page4GradeNumber.get(0).shortWorksheetName, page4GradeNumber.get(0).longWorksheetName);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, page4GradeNumber.get(0).shortWorksheetName, page4GradeNumber.get(0).longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, page4GradeNumber.get(0).shortWorksheetName, page4GradeNumber.get(0).longWorksheetName);

        //Number comparing. Select all of the true statements - En
        Matrix.topWorksheet(General.workingFolder, gradeEN, pageNumber, page4GradeNumberEn.get(0).shortWorksheetName, page4GradeNumberEn.get(0).longWorksheetName );
        Matrix.numberCompareA1_B1UnderlineCorrectSentencesWorksheetA4(General.workingFolder, gradeEN, pageNumber, page4GradeNumberEn.get(0).shortWorksheetName, page4GradeNumberEn.get(0).longWorksheetName,
                page4GradeNumberEn.get(0).numbersRangeStart, page4GradeNumberEn.get(0).numbersRangeEnd, 0, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, gradeEN, pageNumber, page4GradeNumberEn.get(0).shortWorksheetName, page4GradeNumberEn.get(0).longWorksheetName);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeEN, pageNumber, page4GradeNumberEn.get(0).shortWorksheetName, page4GradeNumberEn.get(0).longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeEN, pageNumber, page4GradeNumberEn.get(0).shortWorksheetName, page4GradeNumberEn.get(0).longWorksheetName);


        //Odd or even numbers - Ru
        Matrix.topWorksheet(General.workingFolder, gradeEN, pageNumber, page4GradeNumberEn.get(0).shortWorksheetName, page4GradeNumberEn.get(0).longWorksheetName );
        Matrix.numbersOddEvenLineWorksheetA4(General.workingFolder, gradeEN, pageNumber, page4GradeNumberEn.get(0).shortWorksheetName, page4GradeNumberEn.get(0).longWorksheetName,
                page4GradeNumberEn.get(0).numbersRangeStart, page4GradeNumberEn.get(0).numbersRangeEnd, 0, 12, 4);
        Matrix.bottomWorksheet(General.workingFolder, gradeEN, pageNumber, page4GradeNumberEn.get(0).shortWorksheetName, page4GradeNumberEn.get(0).longWorksheetName);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeEN, pageNumber, page4GradeNumberEn.get(0).shortWorksheetName, page4GradeNumberEn.get(0).longWorksheetName);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeEN, pageNumber, page4GradeNumberEn.get(0).shortWorksheetName, page4GradeNumberEn.get(0).longWorksheetName);
*/
        //Rounding numbers - Ru
//        Matrix.topWorksheet(General.workingFolder, gradeRU, pageNumber, page4GradeNumber.get(0).shortWorksheetName, page4GradeNumber.get(0).longWorksheetName );
//        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, gradeRU, pageNumber, page4GradeNumber.get(0).shortWorksheetName, page4GradeNumber.get(0).longWorksheetName,
//                page4GradeNumber.get(0).numbersRangeStart, page4GradeNumber.get(0).numbersRangeEnd, 100, 12, 4);
//        Matrix.bottomWorksheet(General.workingFolder, gradeRU, pageNumber, page4GradeNumber.get(0).shortWorksheetName, page4GradeNumber.get(0).longWorksheetName);
//        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, page4GradeNumber.get(0).shortWorksheetName, page4GradeNumber.get(0).longWorksheetName);
//        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRU, pageNumber, page4GradeNumber.get(0).shortWorksheetName, page4GradeNumber.get(0).longWorksheetName);

        Converters.generatePDFFromHTML("d:/Java_Math/ReadyWorksheets/1.html");



/*
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
*/


        File folder = new File("D:\\mathematics-at-school.com\\JavaTemplatesRead");

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




/*
        //Preparing all seperate html worksheet
        for (int i = 0; i < 2; i++) {
            Matrix.topWorksheet(workingFolder, gradeRU, 6, grade4Add[i].shortWorksheetName, grade4Add[i].longWorksheetName );
            Matrix.bottomWorksheet(workingFolder, gradeRU, 6, grade4Add[i].shortWorksheetName, grade4Add[i].longWorksheetName);
            Matrix.fullWorksheet(workingFolder, readyFilesFolder, gradeRU, 6, grade4Add[i].shortWorksheetName, grade4Add[i].longWorksheetName);
            Matrix.allSameWorksheets(workingFolder, readyFilesFolder, gradeRU, 6, grade4Add[i].shortWorksheetName, grade4Add[i].longWorksheetName);


        }
*/


    }
}
