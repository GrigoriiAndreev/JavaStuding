package MathPackage;

//import org.apache.pdfbox.pdmodel.PDDocument;

import org.apache.commons.io.FileUtils;

import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.*;

public class Matrix {

    //Main matrix template
    static int problemsPerLine = 5;
    static int problemsPerRows = 20;
    static Integer[][] argument1 = new Integer[problemsPerLine][problemsPerRows];
    static Integer[][] argument2 = new Integer[problemsPerLine][problemsPerRows];
//    static int numbersRangeStart = 10;
//    static int numbersRangeEnd = 90;
    static public String workingFolder = "D:/Java_Math/Temp/";
//    static public String readyFilesFolder = "D:/Java_Math/ReadyWorksheets/";


    static int pageNumber = 1;
    static String grade = "";
    static String shortTaskNamePage = "";
    static String shortTaskNameWorksheet = "";
    static String longTaskNameWorksheet = "";
    static String longTaskNamePage = "Задачи на сложение и вычитание. Однозначные числа, двузначные числа. Текстовые задачи. Скачать в pdf и jpg";
    static String longTaskNameHeader = "";
    static int totalWorksheetsVariants = 0;


    public static void main(String[] args) throws Exception {

        // Initialization
        grade = "1 класс.";

        shortTaskNamePage = "Сложение и вычитание чисел в столбик";
        longTaskNamePage = "Задачи на сложение и вычитание. Однозначные числа, двузначные числа. Текстовые задачи. Скачать в pdf и jpg";


        shortTaskNameWorksheet = "Сложение и вычитание двузначных чисел.";
        pageNumber = 1;
        totalWorksheetsVariants = 6;
        longTaskNameWorksheet = "Сложи и вычити двузначные числа. ";
        longTaskNameHeader = "Задачи с ответами на тему: Сложение двух двузначных чисел.";

         emptyFolder(workingFolder);


//        chooseNumbersForAdditionSentenceA4Worksheet(workingFolder, "4 класс", 6, "Сложение", "Сложение в строчку",
//                1, 1000,  10,6);
//        topWorksheet(workingFolder,"4 класс", 6, "Сложение", "Сложение в строчку" );
//        bottomWorksheet(workingFolder,"4 класс", 6, "Сложение", "Сложение в строчку" );
//        fullWorksheet(workingFolder, "4 класс", readyFilesFolder, pageNumber, "Сложение", "Сложение в строчку");
//        addA1_B1LineWorksheetA4(workingFolder, "4 класс", 6, "Сложение", "Сложение в строчку",
//                1, 1000,  10,6, 6);


    }

// Empty destination folder
    public static void emptyFolder(String folder) throws Exception {

        for (File file: new File(folder).listFiles())
            if (file.isFile()) file.delete();
    }

/*
Header of page: txt, html formats
 */
    public static void pageHeader() throws IOException {

        FileWriter writer = new FileWriter("D:\\mathematics-at-school.com\\JavaTemplates/"
                +  grade + " " + shortTaskNamePage + "headerTxtBlock__" + ".txt");
        FileWriter htmlWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                +  grade + " " + shortTaskNamePage + "headerHtmlBlock__" + ".html"));

        String text, htmlText;

        text = "Математика. " + grade + " " + shortTaskNamePage + "\n\n";
        htmlText = "<h1> Математика. " + grade + " " + shortTaskNamePage + "</h1>\n";
        writer.write(text);
        htmlWriter.write(htmlText);
        text = longTaskNamePage + "\n\n";
        htmlText = "<h2> " + longTaskNamePage + "</h2>\n";
        writer.write(text);
        htmlWriter.write(htmlText);
        writer.close();
        htmlWriter.close();
    }

//    public static void removeTrash(String grade) throws IOException {
//        FileReader reader
//        FileWriter writer = new FileWriter(workingFolder + grade + " " + longTaskNameWorksheet + " Готовая страница с ответами " + ".html");
//        String line =
//        while ()
//    }

/*
Top part of worksheets: txt and html
 */
    public static void topWorksheet(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet,
    String longTaskNameWorksheet) throws IOException {

        for (int i = 1; i < totalPageNumbers ; i++) {
            pageNumber = i;

        FileWriter writer = new FileWriter(workingFolder
                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topTxtBlock__" + ".txt");
        FileWriter writerHtml = new FileWriter(workingFolder
                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topHtmlBlock__" + ".html");
//        FileWriter writerPdf = new FileWriter(workingFolder
//                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topPdfBlock__" + ".html");
        String text,htmlText,pdfText;

        if (grade.contains("&nbsp") || grade.contains("G"))   {
            text = grade + " " + shortTaskNameWorksheet + " Variant № " + pageNumber + ". \n\n";
            htmlText = "\n\n<br /><h3>" + " " + shortTaskNameWorksheet + " Variant № " + pageNumber + ".</h3>";
//            htmlText = "\n\n<br /><h3>" + grade + " " + shortTaskNameWorksheet + " Variant № " + pageNumber + ".</h3>";
//            pdfText = "\n\n<br /><h3>" + grade + " " + shortTaskNameWorksheet + " Variant № " + pageNumber + ".</h3>";
        }
        else{
            text = grade + " " + shortTaskNameWorksheet + " Вариант № " + pageNumber + ". n\n";
//            htmlText = "<img src=\"d://Java_Math/WorksheetsLogo_Rus.jpg\" alt=\"альтернативный текст\">\n";
//            writerHtml.write(htmlText);
            htmlText = "\n\n<br /><h3>" + " " + shortTaskNameWorksheet + " Вариант № " + pageNumber + ".</h3>";

        }
        writer.write(text);
        writerHtml.write(htmlText);

        if (grade.contains("&nbsp") || grade.contains("G")) {
            text = "Дата: ______________ ФИО: ______________________________________ Оценка:__________\n\n";
            htmlText = "Date: ______________ Name: _________________________________ Value:__________\n\n<br /><br />";
        }
        else
            {
            text = "Дата:______________ ФИО:______________________________________ Оценка:__________\n\n";
            htmlText = "Дата:______________ ФИО:_________________________________ Оценка:__________\n\n<br /><br />";
        }
        writer.write(text);
        writerHtml.write(htmlText);
        text = longTaskNameWorksheet + "\n\n";
        htmlText = longTaskNameWorksheet + "\n\n<br /><br />";
        writer.write(text);
        writerHtml.write(htmlText);
        writer.close();
        writerHtml.close();
        }
    }

    public static void topWorksheetHtmlAnswers(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet,
    String longTaskNameWorksheet) throws IOException {

        for (int i = 1; i < totalPageNumbers ; i++) {
        pageNumber = i;

        FileWriter writerHtmlAnswers = new FileWriter(workingFolder
                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topHtmlAnswerBlock__" + ".html");
        String text,htmlText,pdfText;

        if (grade.contains("&nbsp") || grade.contains("G"))
            htmlText = "\n\n<br /><h3>" + " " + shortTaskNameWorksheet + " Variant № " + pageNumber + ". Answers page.</h3>\n";
        else htmlText = "\n\n<br /><h3>" + " " + shortTaskNameWorksheet + " Вариант № " + pageNumber + ". Страница с ответами.</h3>\n";
        writerHtmlAnswers.write(htmlText);
        htmlText = longTaskNameWorksheet + "\n\n<br /><br />";
        writerHtmlAnswers.write(htmlText);
        writerHtmlAnswers.close();
        }
    }

/*
Top part of worksheets: txt and html
 */
    public static void topWorksheetPdf(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet,
    String longTaskNameWorksheet) throws IOException {

        for (int i = 1; i < totalPageNumbers ; i++) {
            pageNumber = i;

        FileWriter writer = new FileWriter(workingFolder
                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topTxtBlock__" + ".txt");
        FileWriter writerHtml = new FileWriter(workingFolder
                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topPdfBlock__" + ".html");
//        FileWriter writerPdf = new FileWriter(workingFolder
//                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topPdfBlock__" + ".html");
        String text,htmlText;

        htmlText = "<style type=\"text/css\" >\n";
        writerHtml.write(htmlText);
        if (grade.contains("&nbsp") || grade.contains("G")) {
            htmlText = ".ld {border-left:1px solid black; border-top: 1px solid black;} \n";
        }
        else {
            htmlText = ".ld {border-left:1px solid black; border-bottom: 1px solid black;} \n";
        }
        writerHtml.write(htmlText);
        htmlText = "</style> \n";
        writerHtml.write(htmlText);


            htmlText = "<style type=\"text/css\" media=\"print\">\n";
        writerHtml.write(htmlText);
        htmlText = "@page {size: auto;  margin: 10; } \n";
        writerHtml.write(htmlText);
        htmlText = "</style> \n";
        writerHtml.write(htmlText);

        if (grade.contains("&nbsp") || grade.contains("G"))   {
            text = grade + " " + shortTaskNameWorksheet + " Variant № " + pageNumber + ". \n\n";
            htmlText = "<img src=\"d://Java_Math/WorksheetsLogo_Eng.jpg\" alt=\"альтернативный текст\">\n";
            writerHtml.write(htmlText);
            htmlText = "\n\n<br /><h3>" + grade + " " + shortTaskNameWorksheet + " Variant № " + pageNumber + ".</h3>";
        }
        else{
            text = grade + " " + shortTaskNameWorksheet + " Вариант № " + pageNumber + ". n\n";
            htmlText = "<img src=\"d://Java_Math/WorksheetsLogo_Rus.jpg\" alt=\"альтернативный текст\">\n";
            writerHtml.write(htmlText);
            htmlText = "\n\n<br /><h3>" + grade + " " + shortTaskNameWorksheet + " Вариант № " + pageNumber + ".</h3>";

        }
        writer.write(text);
        writerHtml.write(htmlText);

        if (grade.contains("&nbsp") || grade.contains("G")) {
            text = "Дата: ______________ ФИО: ______________________________________ Оценка:__________\n\n";
            htmlText = "Date: ______________ Name: _________________________________ Value:__________\n\n<br /><br />";
        }
        else
            {
            text = "Дата: ______________ ФИО: ______________________________________ Оценка:__________\n\n";
            htmlText = "Дата: ______________ ФИО: _________________________________ Оценка:__________\n\n<br /><br />";
        }
        writer.write(text);
        writerHtml.write(htmlText);
        text = longTaskNameWorksheet + "\n\n";
        htmlText = longTaskNameWorksheet + "\n\n<br /><br />";
        writer.write(text);
        writerHtml.write(htmlText);
        writer.close();
        writerHtml.close();
        }
    }

/*
    Fill in the math problems for A4 page

      a11       a12
    + b11     + b12
    _____      _____
    ...         ...

     */
    public static void fullWorksheetPdf(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
            int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                }

            FileWriter fileHtmlWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; + " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; + " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("   + " + argument2[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    fileHtmlWriterAnswer.write("<td> "+ (argument1[i][j] + argument2[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }
    }

/*
    Fill in the math problems for A4 page

      a11       a12
    + b11     + b12
    _____      _____
    ...         ...

     */
    public static void subtractA1_B1ColumnWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
            int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * argument1[i][j]);
                }
            if (longTaskNameWorksheet.contains("Вычити число 0") || longTaskNameWorksheet.contains("Subtract 0")) {
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 0;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 1") || longTaskNameWorksheet.contains("Subtract 1 from")) {
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 1;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 2") || longTaskNameWorksheet.contains("Subtract 2 from")) {
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 3") || longTaskNameWorksheet.contains("Subtract 3 from")) {
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 4") || longTaskNameWorksheet.contains("Subtract 4")) {
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 5") || longTaskNameWorksheet.contains("Subtract 5")) {
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 6") || longTaskNameWorksheet.contains("Subtract 6")) {
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 7") || longTaskNameWorksheet.contains("Subtract 7")) {
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 8") || longTaskNameWorksheet.contains("Subtract 8")) {
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 9") || longTaskNameWorksheet.contains("Subtract 9")) {
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 10") || longTaskNameWorksheet.contains("Subtract 10")) {
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 10;
                    }
            }



            FileWriter fileHtmlWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; - " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; - " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("   - " + argument2[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    fileHtmlWriterAnswer.write("<td> "+ (argument1[i][j] - argument2[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }
    }

    public static void addSubtractA1_B1ColumnWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
            int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * argument1[i][j]);
                }
            if (longTaskNameWorksheet.contains("Сложи или вычити число 0") || longTaskNameWorksheet.contains("Add or subtract 0 from")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 0;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 1") || longTaskNameWorksheet.contains("Add or subtract 1 from")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 1;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 2") || longTaskNameWorksheet.contains("Add or subtract 2 from")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 3") || longTaskNameWorksheet.contains("Add or subtract 3 from")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 4") || longTaskNameWorksheet.contains("Add or subtract 4 from")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 5") || longTaskNameWorksheet.contains("Add or subtract 5 from")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 6") || longTaskNameWorksheet.contains("Add or subtract 6 from")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 7") || longTaskNameWorksheet.contains("Add or subtract 7 from")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 8") || longTaskNameWorksheet.contains("Add or subtract 8 from")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 9") || longTaskNameWorksheet.contains("Add or subtract 9 from")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 10") || longTaskNameWorksheet.contains("Add or subtract 10 from")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 10;
                    }
            }



            FileWriter fileHtmlWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +  "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " + "" + argument1[i][j] + "</td>");
//                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
//                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    if ( j % 2 == 0 ) {
                        fileHtmlWriter.write("<td> &nbsp; - " + argument2[i][j] + "</td>");
                        fileHtmlWriterAnswer.write("<td> &nbsp; - " + argument2[i][j] + "</td>");
//                    fileTxtWriter.write("   - " + argument2[i][j]);
                    }
                    else  {
                        fileHtmlWriter.write("<td> &nbsp; + " + argument2[i][j] + "</td>");
                        fileHtmlWriterAnswer.write("<td> &nbsp; + " + argument2[i][j] + "</td>");

                    }
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    if ( (i + j ) % 2 == 0)
                        fileHtmlWriterAnswer.write("<td> " + (argument1[i][j] - argument2[i][j]) + " </td>");
                    else
                        fileHtmlWriterAnswer.write("<td> " + (argument1[i][j] + argument2[i][j]) + " </td>");
//                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }
    }

/*
    Fill in the math problems for A4 page

      a11       a12
    + b11     + b12
    _____      _____
    ...         ...

     */
    public static void addA1_B1ColumnWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
            int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;



            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * argument1[i][j]);
                }


            if (longTaskNameWorksheet.contains("четные") || longTaskNameWorksheet.contains("even")) {
                System.out.println("Четные числа");
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument1[i][j] = tempNumber;
                        else argument1[i][j] = tempNumber + 1;
                        tempNumber = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument2[i][j] = tempNumber;
                        else argument2[i][j] = tempNumber + 1;

                    }
            }


            if (longTaskNameWorksheet.contains("нечетные") || longTaskNameWorksheet.contains("odd")) {
//                System.out.println("Четные числа");
                int tempNumber = 0;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        if ((tempNumber % 2) != 0) argument1[i][j] = tempNumber;
                        else argument1[i][j] = tempNumber + 1;
                        tempNumber = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                        if ((tempNumber % 2) != 0) argument2[i][j] = tempNumber;
                        else argument2[i][j] = tempNumber + 1;

                    }
            }



            FileWriter fileHtmlWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp;&nbsp; + " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp;&nbsp; + " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("   + " + argument2[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    fileHtmlWriterAnswer.write("<td> "+ (argument1[i][j] + argument2[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }
    }

    public static void multiplyA1_B1FreeLinesColumnWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet,
          String longTaskNameWorksheet, int numberOneRangeStart, int numberOneRangeEnd, int numberTwoRangeStart, int numberTwoRangeEnd, int freeLines,
                                                               int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

//        System.out.println(numberOneRangeStart + " " + numberOneRangeEnd + " " + numberTwoRangeStart + " " + numberTwoRangeEnd);

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;



            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) ((Math.random() * (numberOneRangeEnd - numberOneRangeStart)) + numberOneRangeStart );
//                    ((Math.random() * (max - min)) + min);
                    argument2[i][j] = (int) ((Math.random() * (numberTwoRangeEnd - numberTwoRangeStart)) + numberTwoRangeStart );
//                    System.out.println(argument1[i][j]);
                }

/*
            if (longTaskNameWorksheet.contains("Умножь число 0") || longTaskNameWorksheet.contains("Multiply 0")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 0;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 1") || longTaskNameWorksheet.contains("Multiply 1")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 1;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 2") || longTaskNameWorksheet.contains("Multiply 2")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 3") || longTaskNameWorksheet.contains("Multiply 3")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 4") || longTaskNameWorksheet.contains("Multiply 4")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 5") || longTaskNameWorksheet.contains("Multiply 5")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 6") || longTaskNameWorksheet.contains("Multiply 6")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 7") || longTaskNameWorksheet.contains("Multiply 7")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 8") || longTaskNameWorksheet.contains("Multiply 8")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 9") || longTaskNameWorksheet.contains("Multiply 9")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 10") || longTaskNameWorksheet.contains("Multiply 10")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 10;
                    }
            }
*/

            FileWriter fileHtmlWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp;&nbsp; x " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp;&nbsp; x " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("   * " + argument2[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                for(int l = 0; l < freeLines; l++) {
                    fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                    fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                    fileTxtWriter.write(" \n");

                    for (int j = 0; j < problemsCol; j++) {
                        fileHtmlWriter.write("<td> ... </td>");
//                        fileHtmlWriterAnswer.write("<td> " + (argument1[i][j] * argument2[i][j]) + " </td>");
                        fileHtmlWriterAnswer.write("<td> ... </td>");
                        fileTxtWriter.write(" ... ");
                    }
                }
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriterAnswer.write("<td> " + (argument1[i][j] * argument2[i][j]) + " </td>");
                }

                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }
    }

    public static void multiplyA1_B1ColumnWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
            int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;



            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * argument1[i][j]);
                }


            if (longTaskNameWorksheet.contains("Умножь число 0") || longTaskNameWorksheet.contains("Multiply 0")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 0;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 1") || longTaskNameWorksheet.contains("Multiply 1")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 1;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 2") || longTaskNameWorksheet.contains("Multiply 2")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 3") || longTaskNameWorksheet.contains("Multiply 3")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 4") || longTaskNameWorksheet.contains("Multiply 4")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 5") || longTaskNameWorksheet.contains("Multiply 5")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 6") || longTaskNameWorksheet.contains("Multiply 6")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 7") || longTaskNameWorksheet.contains("Multiply 7")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 8") || longTaskNameWorksheet.contains("Multiply 8")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 9") || longTaskNameWorksheet.contains("Multiply 9")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 10") || longTaskNameWorksheet.contains("Multiply 10")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 10;
                    }
            }


            FileWriter fileHtmlWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp;&nbsp; x " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp;&nbsp; x " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("   * " + argument2[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    fileHtmlWriterAnswer.write("<td> "+ (argument1[i][j] * argument2[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }
    }

/*
    Fill in the math problems for A4 page

      a11       a12
    + b11     + b12
    _____      _____
    ...         ...

     */
    public static void addA1_B1A4WordProblemsWorksheet(String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                                 int numbersRangeStart, int numbersRangeEnd, int problemsLine) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][1];
        Integer[][] argument2 = new Integer[problemsLine][1];
        List<String> list = new ArrayList<>();

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

//            for (int i = 0; i < problemsLine; i++)
////                for (int j = 0; j < problemsCol; j++) {
//                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
//                    argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
////                    System.out.println(i + " " + j + " " + argument1[i][j] + " " + argument1[i][j]);
////                }

            FileWriter fileHtmlWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

//            FileReader fileReader= new FileReader(new File("D:\\mathematics-at-school.com\\JavaTemplatesReady/"
//                    + "grade4AddWordProblemsTemplate.txt"));
//            BufferedReader reader = new BufferedReader(new FileReader(
//                    "D:\\mathematics-at-school.com\\JavaTemplatesReady/grade4AddWordProblemsTemplate.txt"));
//            System.out.println("Вывод 1");
//            File file = new File(
//                    "D:\\mathematics-at-school.com\\JavaTemplatesReady/grade4AddWordProblemsTemplate.txt");
//            //создаем объект FileReader для объекта File
//            FileReader fr = new FileReader(new File(
//                    "D:\\mathematics-at-school.com\\JavaTemplatesReady/grade4AddWordProblemsTemplate.txt");
//            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(new FileReader(new File(
                    "D:\\mathematics-at-school.com\\JavaTemplatesReady/grade4AddWordProblemsTemplate.txt")));
            // считаем сначала первую строку
//            System.out.println("Вывод 2");
//            String line = reader.readLine();
            String line, originalNumberOne, originalNumberTwo;
            String originalNumberThree, originalNumberFour;
            line = reader.readLine();

            int firstNumberStart = 0, firstNumberEnd = 0, secondNumberStart = 0, secondNumberEnd = 0;
            int thirdNumberStart = 0, thirdNumberEnd = 0, fourthNumberStart = 0, fourthNumberEnd = 0;
            int generatedNumberOne, generatedNumberTwo, generatedNumberThree, generatedNumberFour;

            while (line != null || !line.equals("End.")) {

                System.out.println(line);
                if (line.contains("firstns")) {
                    firstNumberStart = (line.indexOf("firstns") + 7);
                    firstNumberEnd = line.indexOf("firstne");
                    secondNumberStart = (line.indexOf("secondns") + 8);
                    secondNumberEnd = line.indexOf("secondne");
                    originalNumberOne = line.substring(firstNumberStart, firstNumberEnd);
                    originalNumberTwo = line.substring(secondNumberStart, secondNumberEnd);
                    System.out.println(originalNumberOne + "---" + originalNumberTwo);
                    String lineOutput1 = line.replaceAll("firstns", "");
                    System.out.println(lineOutput1);
                    generatedNumberOne = (int) (Math.random() * Integer.parseInt(originalNumberTwo) + Integer.parseInt(originalNumberOne));
                    System.out.println(originalNumberOne + "  " + generatedNumberOne + " " + firstNumberStart + " " + firstNumberEnd);
                    String lineOutput2 = lineOutput1.replaceAll(originalNumberOne, Integer.toString(generatedNumberOne));
                    String lineOutput3 = lineOutput2.replaceAll("firstne", "");
                    String lineOutput4 = lineOutput3.replaceAll("secondns", "");
                    String lineOutput5 = lineOutput4.replaceAll(originalNumberTwo, "");
                    String lineOutput6 = lineOutput5.replaceAll("secondne", "");
                    line = lineOutput6;
                    System.out.println("Changed " + lineOutput6);
                }
                if (line.contains("tns")) {
                    thirdNumberStart = line.indexOf("tns");
                    thirdNumberEnd = line.indexOf("tne");
                    fourthNumberStart = line.indexOf("fons");
                    fourthNumberEnd = line.indexOf("fone");
                    System.out.println(thirdNumberStart + " " + thirdNumberEnd + " " + fourthNumberStart + " " + fourthNumberEnd);
                    originalNumberThree = line.substring(thirdNumberStart + 3, thirdNumberEnd);
                    originalNumberFour = line.substring(fourthNumberStart + 4, fourthNumberEnd);
                    System.out.println(originalNumberThree + "---" + originalNumberFour);
                    String lineOutput1 = line.replaceAll("tns", "");
                    System.out.println(lineOutput1);
                    generatedNumberTwo = (int) (Math.random() * Integer.parseInt(originalNumberThree) + Integer.parseInt(originalNumberFour));
//                    System.out.println(originalNumberOne + "  " + generatedNumberOne + " " + firstNumberStart + " " + firstNumberEnd);
                    String lineOutput2 = lineOutput1.replaceAll(originalNumberThree, Integer.toString(generatedNumberTwo));
                    String lineOutput3 = lineOutput2.replaceAll("tne", "");
                    String lineOutput4 = lineOutput3.replaceAll("fons", "");
                    String lineOutput5 = lineOutput4.replaceAll(originalNumberFour, "");
                    String lineOutput6 = lineOutput5.replaceAll("fone", "");
                    System.out.println("Changed " + lineOutput6);
                }




                line = reader.readLine();
            }
            System.out.println("Вывод 3");
/*
            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsLine - 1) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsLine - 1) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; + " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; + " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("   + " + argument2[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    fileHtmlWriterAnswer.write("<td> "+ (argument1[i][j] + argument2[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }


            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");

 */
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
            reader.close();
        }
    }

/*
    Add 3 numbers in columns A4 page

      a11       a12
    + b11       b12
      c11     + c12
    _____      _____
    ...         ...

     */
    public static void addA1_B1_C1A4ColumnWorksheet(String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                                 int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];
        Integer[][] argument3 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * numbersRangeEnd/100 + numbersRangeStart);
                    argument3[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
//                    System.out.println(i + " " + j + " " + argument1[i][j] + " " + argument1[i][j]);
                }

            FileWriter fileHtmlWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsLine - 1) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsLine - 1) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("   " + argument2[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; + " + argument3[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; + " + argument3[i][j] + "</td>");
                    fileTxtWriter.write("   + " + argument3[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    fileHtmlWriterAnswer.write("<td> "+ (argument1[i][j] + argument2[i][j] + argument2[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"" + problemsCol + "\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"" + problemsCol + "\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }
    }

/*
    Fill in the math problems for A4 page

      a11       a12
    + b11     + b12
    _____      _____
    ...         ...

     */
    public static void addA1_B1A4ColumnMissingNumbersWorksheet(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                                 int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLine, int problemsCol) throws IOException {



        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
//                    System.out.println(i + " " + j + " " + argument1[i][j] + " " + argument1[i][j]);
                }

            FileWriter fileHtmlWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    if(j % 2 == 0) {
                        String numberString = String.valueOf(argument1[0][j]);
                        int emptyPlaceRange = numberString.length() - 1;
                        int emptyPlace = (int) (Math.random() * emptyPlaceRange + 1);
                        StringBuilder newNumber = new StringBuilder(numberString);
                        newNumber.setCharAt(emptyPlace, '_');

                        fileHtmlWriter.write("<td> &nbsp; &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1)) + ") &nbsp; &nbsp; " +
                                "" + newNumber + "</td>");
                        fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1)) + ") &nbsp; &nbsp; " +
                                "" + argument1[0][j] + "</td>");
                        fileTxtWriter.write("   - " + argument1[0][j]);
                    }
                    else {
                        fileHtmlWriter.write("<td> &nbsp; &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1))  + ") &nbsp; &nbsp; " +
                                "" + argument1[0][j] + "</td>");
                        fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1))  + ") &nbsp; &nbsp; " +
                                "" + argument1[0][j] + "</td>");
                        fileTxtWriter.write("    " + argument1[0][j]);
                    }
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    if(j % 2 != 0) {
                        String numberString = String.valueOf(argument2[0][j]);
                        int emptyPlaceRange = numberString.length() - 1;
                        int emptyPlace = (int) (Math.random() * emptyPlaceRange + 1);
                        StringBuilder newNumber = new StringBuilder(numberString);
                        newNumber.setCharAt(emptyPlace, '_');

                        fileHtmlWriter.write("<td> &nbsp; &nbsp; + " + newNumber + "</td>");
                        fileHtmlWriterAnswer.write("<td> &nbsp;  &nbsp; + " + argument2[0][j] + "</td>");
                        fileTxtWriter.write("   + " + argument2[0][j]);

                    }
                    else {
                        fileHtmlWriter.write("<td> &nbsp; &nbsp; + " + argument2[0][j] + "</td>");
                        fileHtmlWriterAnswer.write("<td> &nbsp;  &nbsp; + " + argument2[0][j] + "</td>");
                        fileTxtWriter.write("   + " + argument2[0][j]);
                    }
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> " + (argument1[0][j] + argument2[0][j]) + " </td>");
                    fileHtmlWriterAnswer.write("<td> "+ (argument1[i][j] + argument2[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"" + problemsCol + "\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"" + problemsCol + "\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }

/*
        topWorksheet(workingFolder, grade, 6, shortTaskNameWorksheet, longTaskNameWorksheet );
        bottomWorksheet(workingFolder, "4 класс.", 6, shortTaskNameWorksheet, longTaskNameWorksheet);
        fullWorksheet(workingFolder, "4 класс.", 6, shortTaskNameWorksheet);
*/
    }

    public static void subtractA1_B1A4ColumnMissingNumbersWorksheet(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                                 int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLine, int problemsCol) throws IOException {



        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * argument1[i][j]);
//                    System.out.println(i + " " + j + " " + argument1[i][j] + " " + argument1[i][j]);
                }

            FileWriter fileHtmlWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    if(j % 2 == 0) {
                        String numberString = String.valueOf(argument1[0][j]);
                        int emptyPlaceRange = numberString.length() - 1;
                        int emptyPlace = (int) (Math.random() * emptyPlaceRange + 1);
                        StringBuilder newNumber = new StringBuilder(numberString);
                        newNumber.setCharAt(emptyPlace, '_');

                        fileHtmlWriter.write("<td> &nbsp; &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1)) + ") &nbsp; &nbsp; " +
                                "" + newNumber + "</td>");
                        fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1)) + ") &nbsp; &nbsp; " +
                                "" + argument1[0][j] + "</td>");
                        fileTxtWriter.write("   - " + argument1[0][j]);
                    }
                    else {
                        fileHtmlWriter.write("<td> &nbsp; &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1))  + ") &nbsp; &nbsp; " +
                                "" + argument1[0][j] + "</td>");
                        fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1))  + ") &nbsp; &nbsp; " +
                                "" + argument1[0][j] + "</td>");
                        fileTxtWriter.write("    " + argument1[0][j]);
                    }
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    if(j % 2 != 0) {
                        String numberString = String.valueOf(argument2[0][j]);
                        int emptyPlaceRange = numberString.length() - 1;
                        int emptyPlace = (int) (Math.random() * emptyPlaceRange + 1);
                        StringBuilder newNumber = new StringBuilder(numberString);
                        newNumber.setCharAt(emptyPlace, '_');

                        fileHtmlWriter.write("<td> &nbsp; &nbsp; - " + newNumber + "</td>");
                        fileHtmlWriterAnswer.write("<td> &nbsp;  &nbsp; - " + argument2[0][j] + "</td>");
                        fileTxtWriter.write("   - " + argument2[0][j]);

                    }
                    else {
                        fileHtmlWriter.write("<td> &nbsp; &nbsp; - " + argument2[0][j] + "</td>");
                        fileHtmlWriterAnswer.write("<td> &nbsp;  &nbsp; - " + argument2[0][j] + "</td>");
                        fileTxtWriter.write("   - " + argument2[0][j]);
                    }
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> " + (argument1[0][j] - argument2[0][j]) + " </td>");
                    fileHtmlWriterAnswer.write("<td> "+ (argument1[i][j] - argument2[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"" + problemsCol + "\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"" + problemsCol + "\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }

/*
        topWorksheet(workingFolder, grade, 6, shortTaskNameWorksheet, longTaskNameWorksheet );
        bottomWorksheet(workingFolder, "4 класс.", 6, shortTaskNameWorksheet, longTaskNameWorksheet);
        fullWorksheet(workingFolder, "4 класс.", 6, shortTaskNameWorksheet);
*/
    }

/*
    Fill in the math problems for single line

      a11       a12
    + b11     + b12
    _____      _____
    ...         ...

     */
    public static void addA1_B1ColumnLineBlock(String problemsNumber, String grade, String shortTaskNameWorksheet,
                                               String longTaskNameWorksheet, int numbersRangeStart, int numbersRangeEnd, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[10][problemsCol];
        Integer[][] argument2 = new Integer[10][problemsCol];

        for (int j = 0; j < problemsCol; j++) {
//            System.out.println(problemsCol + "   "+ j);
            argument1[0][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
            argument2[0][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
        }

            FileWriter fileHtmlWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlLineBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlLineBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtLineBlock__" + ".txt"));

            fileHtmlWriter.write( problemsNumber + " " + shortTaskNameWorksheet + " <br /><br /> <table> <tr><td colspan=\"" + (problemsCol - 1) + "\"></td></tr>");
            fileHtmlWriterAnswer.write(problemsNumber + " " + shortTaskNameWorksheet + " <br /><br /> <table> <tr><td colspan=\"" + (problemsCol - 1) + "\"></td></tr>");
//            for (int i = 0; i < problemsCol; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; &nbsp; " + (j + 1) + ") &nbsp; &nbsp; " +
                            "" + argument1[0][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; &nbsp; " + (j + 1) + ") &nbsp; &nbsp; " +
                            "" + argument1[0][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[0][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; + " + argument2[0][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp;  &nbsp; + " + argument2[0][j] + "</td>");
                    fileTxtWriter.write("   + " + argument2[0][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    fileHtmlWriterAnswer.write("<td> " + (argument1[0][j] + argument2[0][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
//            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();

    }

/*
    Add 3 numbers

      a11       a12
    + b11     + b12
      c11       c12
    _____      _____
    ...         ...

     */
    public static void addA1_B1_C1ColumnLineBlock(String problemsNumber, String grade, String shortTaskNameWorksheet,
                                               String longTaskNameWorksheet, int numbersRangeStart, int numbersRangeEnd, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[10][problemsCol];
        Integer[][] argument2 = new Integer[10][problemsCol];
        Integer[][] argument3 = new Integer[10][problemsCol];

        for (int j = 0; j < problemsCol; j++) {
//            System.out.println(problemsCol + "   "+ j);
            argument1[0][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
            argument2[0][j] = (int) (Math.random() * numbersRangeEnd/100 + numbersRangeStart);
            argument3[0][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
        }

        FileWriter fileHtmlWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlLineBlock__" + ".html"));
        FileWriter fileHtmlWriterAnswer = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlLineBlockAnswer__" + ".html"));
        FileWriter fileTxtWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtLineBlock__" + ".txt"));

        fileHtmlWriter.write( problemsNumber + " " + shortTaskNameWorksheet + " <br /><br /> <table> <tr><td colspan=\"" + (problemsCol - 1) + "\"></td></tr>");
        fileHtmlWriterAnswer.write(problemsNumber + " " + shortTaskNameWorksheet + " <br /><br /> <table> <tr><td colspan=\"" + (problemsCol - 1) + "\"></td></tr>");
//            for (int i = 0; i < problemsCol; i++) {
        fileHtmlWriter.write("<tr align=\"right\">");
        fileHtmlWriterAnswer.write("<tr align=\"right\">");
        fileTxtWriter.write("\n ");
        for (int j = 0; j < problemsCol; j++) {
            fileHtmlWriter.write("<td> &nbsp; &nbsp; &nbsp; " + (j + 1) + ") &nbsp; &nbsp; " +
                    "" + argument1[0][j] + "</td>");
            fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; &nbsp; " + (j + 1) + ") &nbsp; &nbsp; " +
                    "" + argument1[0][j] + "</td>");
            fileTxtWriter.write("    " + argument1[0][j]);
        }
        fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
        fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
        fileTxtWriter.write("\n");


        for (int j = 0; j < problemsCol; j++) {
            fileHtmlWriter.write("<td> &nbsp; &nbsp; " + argument2[0][j] + "</td>");
            fileHtmlWriterAnswer.write("<td> &nbsp;  &nbsp; " + argument2[0][j] + "</td>");
            fileTxtWriter.write("   " + argument2[0][j]);
        }
        fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
        fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
        fileTxtWriter.write("\n");


        for (int j = 0; j < problemsCol; j++) {
            fileHtmlWriter.write("<td> &nbsp; &nbsp; + " + argument3[0][j] + "</td>");
            fileHtmlWriterAnswer.write("<td> &nbsp;  &nbsp; + " + argument3[0][j] + "</td>");
            fileTxtWriter.write("   + " + argument3[0][j]);
        }
        fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
        fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
        fileTxtWriter.write("\n");

        for (int j = 0; j < problemsCol; j++) {
            fileHtmlWriter.write("<td> ------ </td>");
            fileHtmlWriterAnswer.write("<td> ------ </td>");
            fileTxtWriter.write(" ----- ");
        }
        fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
        fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
        fileTxtWriter.write(" \n");

        for (int j = 0; j < problemsCol; j++) {
            fileHtmlWriter.write("<td> ... </td>");
            fileHtmlWriterAnswer.write("<td> " + (argument1[0][j] + argument2[0][j] + argument3[0][j]) + " </td>");
            fileTxtWriter.write(" ... ");
        }
        fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
        fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
        fileTxtWriter.write(" \n\n ");
//            }

        fileHtmlWriter.write("</table>");
        fileHtmlWriterAnswer.write("</table>");
        fileTxtWriter.close();
        fileHtmlWriter.close();
        fileHtmlWriterAnswer.close();

    }

/*
    Add 3 numbers - A4 page

      a11       a12
    + b11     + b12
      c11       c12
    _____      _____
    ...         ...

     */
    public static void addA1_B1_C1ColumnA4Worksheet(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                                    int numbersRangeStart, int numbersRangeEnd, int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];
        Integer[][] argument3 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLine; i++)

                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * numbersRangeEnd/100 + numbersRangeStart);
                    argument3[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
//                    System.out.println(i + " " + j + " " + argument1[i][j] + " " + argument1[i][j]);
                }




            FileWriter fileHtmlWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsLine - 1) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsLine - 1) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp;   " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp;   " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("     " + argument2[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; + " + argument3[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; + " + argument3[i][j] + "</td>");
                    fileTxtWriter.write("   + " + argument3[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> -------- </td>");
                    fileHtmlWriterAnswer.write("<td> -------- </td>");
                    fileTxtWriter.write(" ------- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    fileHtmlWriterAnswer.write("<td> "+ (argument1[i][j] + argument2[i][j] + argument3[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

    fileHtmlWriter.write("</table>");
    fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }

    }

/*
    Add 3 numbers - A4 page

      a11       a12
    + b11     + b12
      c11       c12
    _____      _____
    ...         ...

     */
    public static void addA1_B1_C1_D1ColumnA4Worksheet(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                                    int numbersRangeStart, int numbersRangeEnd, int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];
        Integer[][] argument3 = new Integer[problemsLine][problemsCol];
        Integer[][] argument4 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * numbersRangeEnd/100 + numbersRangeStart);
                    argument3[i][j] = (int) (Math.random() * numbersRangeEnd/10 + numbersRangeStart);
                    argument4[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
//                    System.out.println(i + " " + j + " " + argument1[i][j] + " " + argument1[i][j]);
                }

            FileWriter fileHtmlWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileHtmlWriterAnswer = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
            FileWriter fileTxtWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsLine - 1) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsLine - 1) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp;   " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp;   " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("     " + argument2[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp;   " + argument3[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp;   " + argument3[i][j] + "</td>");
                    fileTxtWriter.write("     " + argument3[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; + " + argument4[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; + " + argument4[i][j] + "</td>");
                    fileTxtWriter.write("   + " + argument4[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> -------- </td>");
                    fileHtmlWriterAnswer.write("<td> -------- </td>");
                    fileTxtWriter.write(" ------- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    fileHtmlWriterAnswer.write("<td> "+ (argument1[i][j] + argument2[i][j] + argument3[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }

    }

/*
    Fill in the math problems for single line

      123       24_687
    + 2_4     + 34770
    _____      _____
     4567       34679

     */
    public static void addA1_B1ColumnMissinDigitsLineBlock(String problemsNumber, String grade, String shortTaskNameWorksheet,
                                               String longTaskNameWorksheet, int numbersRangeStart, int numbersRangeEnd, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[10][problemsCol];
        Integer[][] argument2 = new Integer[10][problemsCol];

        for (int j = 0; j < problemsCol; j++) {
//            System.out.println(problemsCol + "   "+ j);
            argument1[0][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
            argument2[0][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
        }

        FileWriter fileHtmlWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlLineBlock__" + ".html"));
        FileWriter fileHtmlWriterAnswer = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlLineBlockAnswer__" + ".html"));
        FileWriter fileTxtWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtLineBlock__" + ".txt"));

        fileHtmlWriter.write( problemsNumber + " " + shortTaskNameWorksheet + " <br /><br /> <table> <tr><td colspan=\"" + (problemsCol - 1) + "\"></td></tr>");
        fileHtmlWriterAnswer.write(problemsNumber + " " + shortTaskNameWorksheet + " <br /><br /> <table> <tr><td colspan=\"" + (problemsCol - 1) + "\"></td></tr>");
//            for (int i = 0; i < problemsCol; i++) {
        fileHtmlWriter.write("<tr align=\"right\">");
        fileHtmlWriterAnswer.write("<tr align=\"right\">");
        fileTxtWriter.write("\n ");
        for (int j = 0; j < problemsCol; j++) {
            if(j % 2 == 0) {
                String numberString = String.valueOf(argument1[0][j]);
                int emptyPlaceRange = numberString.length() - 1;
                int emptyPlace = (int) (Math.random() * emptyPlaceRange + 1);
                StringBuilder newNumber = new StringBuilder(numberString);
                newNumber.setCharAt(emptyPlace, '_');

                fileHtmlWriter.write("<td> &nbsp; &nbsp; &nbsp; " + (j + 1) + ") &nbsp; &nbsp; " +
                        "" + newNumber + "</td>");
                fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; &nbsp; " + (j + 1) + ") &nbsp; &nbsp; " +
                        "" + argument1[0][j] + "</td>");
                fileTxtWriter.write("   - " + argument1[0][j]);
            }
            else {
                fileHtmlWriter.write("<td> &nbsp; &nbsp; &nbsp; " + (j + 1) + ") &nbsp; &nbsp; " +
                        "" + argument1[0][j] + "</td>");
                fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; &nbsp; " + (j + 1) + ") &nbsp; &nbsp; " +
                        "" + argument1[0][j] + "</td>");
                fileTxtWriter.write("    " + argument1[0][j]);
            }
        }
        fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
        fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
        fileTxtWriter.write("\n");

        for (int j = 0; j < problemsCol; j++) {
            if(j % 2 != 0) {
                String numberString = String.valueOf(argument2[0][j]);
                int emptyPlaceRange = numberString.length() - 1;
                int emptyPlace = (int) (Math.random() * emptyPlaceRange + 1);
                StringBuilder newNumber = new StringBuilder(numberString);
                newNumber.setCharAt(emptyPlace, '_');

            fileHtmlWriter.write("<td> &nbsp; &nbsp; + " + newNumber + "</td>");
            fileHtmlWriterAnswer.write("<td> &nbsp;  &nbsp; + " + argument2[0][j] + "</td>");
            fileTxtWriter.write("   + " + argument2[0][j]);

        }
            else {
            fileHtmlWriter.write("<td> &nbsp; &nbsp; + " + argument2[0][j] + "</td>");
            fileHtmlWriterAnswer.write("<td> &nbsp;  &nbsp; + " + argument2[0][j] + "</td>");
            fileTxtWriter.write("   + " + argument2[0][j]);
            }


        }


        fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
        fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
        fileTxtWriter.write("\n");

        for (int j = 0; j < problemsCol; j++) {
            fileHtmlWriter.write("<td> ------ </td>");
            fileHtmlWriterAnswer.write("<td> ------ </td>");
            fileTxtWriter.write(" ----- ");
        }
        fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
        fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
        fileTxtWriter.write(" \n");

        for (int j = 0; j < problemsCol; j++) {
            fileHtmlWriter.write("<td> " + (argument1[0][j] + argument2[0][j]) + " </td>");
            fileHtmlWriterAnswer.write("<td> " + (argument1[0][j] + argument2[0][j]) + " </td>");
            fileTxtWriter.write(" ... ");
        }
        fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
        fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
        fileTxtWriter.write(" \n\n ");
//            }

        fileHtmlWriter.write("</table>");
        fileHtmlWriterAnswer.write("</table>");
        fileTxtWriter.close();
        fileHtmlWriter.close();
        fileHtmlWriterAnswer.close();

    }

/*
    Fill in the math problems for A4 page

    a11 + b11 = _____     a21 + b21 = _____     a31 + b31 = ______    a41 + b41 = _____     a51 + b51 = _____
    a12 + b12 = _____     a22 + b22 = _____     a32 + b32 = ______    a42 + b42 = _____     a52 + b52 = _____
    ...

     */
    public static void addA1_B1LineWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLines, int problemsCols) throws IOException {
        System.out.println("Тема: " + longTaskNameWorksheet);


        int[][] argument1 = new int[problemsLines][problemsCols];
        int[][] argument2 = new int[problemsLines][problemsCols];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;


            for (int i = 0; i < problemsLines; i++)
                for (int j = 0; j < problemsCols; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * numbersRangeEnd/10 + numbersRangeStart);
                }

            if (longTaskNameWorksheet.contains("четные")) {
                System.out.println("Четные числа");
                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument1[i][j] = tempNumber;
                        else argument1[i][j] = tempNumber + 1;
                        tempNumber = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument2[i][j] = tempNumber;
                        else argument2[i][j] = tempNumber + 1;

//                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
//                        argument2[i][j] = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                    }
            }


            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            for (int i = 0; i < problemsLines; i++) {
                for (int j = 0; j < problemsCols; j++) {

                    outputStream.write(String.valueOf(argument1[i][j]).getBytes());
                    fileWriter.write(String.valueOf(argument1[i][j]));
                    fileAnswerWriter.write(String.valueOf(argument1[i][j]));

                    outputStream.write(' ');
                    outputStream.write('+');
                    outputStream.write(' ');

                    fileWriter.write(" + ");
                    fileAnswerWriter.write(" + ");

                    outputStream.write(String.valueOf(argument2[i][j]).getBytes());
                    fileWriter.write(String.valueOf(argument2[i][j]));
                    fileAnswerWriter.write(String.valueOf(argument2[i][j]));

                    outputStream.write(' ');
                    outputStream.write('=');
                    outputStream.write(' ');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write(' ');
                    outputStream.write(' ');
                    outputStream.write(' ');

                    fileWriter.write(" = ____ &nbsp; &nbsp; &nbsp; ");
                    fileAnswerWriter.write(" = " + String.valueOf((argument1[i][j] + argument2[i][j])) + " &nbsp;  &nbsp; ");

//                    System.out.print(" " + argument1[i][j] + " + " + argument2[i][j] + " = _____   ");
                }
                outputStream.write('\n');
                outputStream.write('\n');
                outputStream.write('\n');
                fileWriter.write("<br /><br /><br />\n\n\n");
                fileAnswerWriter.write("<br /><br /><br />\n\n\n");
//                System.out.println();
//                System.out.println();
//                System.out.println();
//                System.out.println("Отработало ");
            }
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

/*
    Add or even numbers for A4 page

    a11 + b11 = _____     a21 + b21 = _____     a31 + b31 = ______    a41 + b41 = _____     a51 + b51 = _____
    ...

     */
    public static void numbersOddEventArithmeticsOperationWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLines, int problemsCols) throws IOException {
        System.out.println("Начало ");


        int totalNumbers = 3; // 3 pairs of numbers per line

        int[][] argument1 = new int[problemsLines][2];
        int[][] argument2 = new int[problemsLines][2];
        int[][] argument3 = new int[problemsLines][2];
        int[][] argument4 = new int[problemsLines][2];
        int[][] compareType = new int[problemsLines][totalNumbers];
        String[][] compareTypeCh = new String[problemsLines][totalNumbers];
        int tempRandomNumber = 0;

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++) {
//                for (int j = 0; j < totalNumbers; j++) {
                argument1[i][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument1[i][1] = (int) (Math.random() * argument1[i][0] + numbersRangeStart);
                argument2[i][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument2[i][1] = (int) (Math.random() * argument2[i][0] + numbersRangeStart);
                argument3[i][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument3[i][1] = (int) (Math.random() * argument3[i][0] + numbersRangeStart);
                argument4[i][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument4[i][1] = (int) (Math.random() * argument4[i][0] + numbersRangeStart);
                compareType[i][0] = (int) (Math.random() * 3);
                compareType[i][1] = (int) (Math.random() * 3);
                compareType[i][2] = (int) (Math.random() * 3);
                for (int tempI = 0; tempI < 3; tempI++ ) {
                    tempRandomNumber = (int) (Math.random() * 3);
                    if (tempRandomNumber == 0) compareTypeCh[i][tempI] = "+";
                    if (tempRandomNumber == 1) compareTypeCh[i][tempI] = "-";
                    if (tempRandomNumber == 2) compareTypeCh[i][tempI] = "*";
                }
            }

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            fileWriter.write("<table>");
            fileAnswerWriter.write("<table>");

            for (int i = 0; i < problemsLines; i++) {

                fileWriter.write("<tr align=\"left\"><td>" + (i * totalNumbers  + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) + " ");
                fileAnswerWriter.write("<tr align=\"left\"><td>" + (i * totalNumbers  + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) + " ");
                fileWriter.write(compareTypeCh[i][0] );
                fileAnswerWriter.write(compareTypeCh[i][0] );
                if ((int) General.stringEvaluate(Integer.toString(argument1[i][0]) + compareTypeCh[i][0] + Integer.toString(argument1[i][1])) %2 == 0)
                    fileAnswerWriter.write(" " + String.valueOf(argument1[i][1]) + " = __ Even &nbsp; &nbsp;</td>");
                else fileAnswerWriter.write(" " + String.valueOf(argument1[i][1]) + " = __ Odd &nbsp; &nbsp;</td>");

                fileWriter.write(" " + String.valueOf(argument1[i][1]) + " = ______  &nbsp; &nbsp; &nbsp; &nbsp;</td>");

                fileWriter.write("<td>" + (i * totalNumbers + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) + " ");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) + " ");
                fileWriter.write(compareTypeCh[i][1] );
                fileAnswerWriter.write(compareTypeCh[i][1] );
                if ((int) General.stringEvaluate(Integer.toString(argument2[i][0]) + compareTypeCh[i][1] + Integer.toString(argument2[i][1])) %2 == 0)
                    fileAnswerWriter.write(" " + String.valueOf(argument2[i][1]) + " = __ Even &nbsp; &nbsp;</td>");
                else fileAnswerWriter.write(" " + String.valueOf(argument2[i][1]) + " = __ Odd &nbsp; &nbsp;</td>");


                fileWriter.write(" " + String.valueOf(argument2[i][1]) + " = ______  &nbsp; &nbsp; &nbsp; &nbsp;</td>");

                fileWriter.write("<td>" + (i * totalNumbers  + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) + " ");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) + " ");
                fileWriter.write(compareTypeCh[i][2] );
                fileAnswerWriter.write(compareTypeCh[i][2] );

                if ((int) General.stringEvaluate(Integer.toString(argument3[i][0]) + compareTypeCh[i][1] + Integer.toString(argument3[i][1])) %2 == 0)
                    fileAnswerWriter.write(" " + String.valueOf(argument3[i][1]) + " = __ Even &nbsp; &nbsp;</td>");
                else fileAnswerWriter.write(" " + String.valueOf(argument3[i][1]) + " = __ Odd &nbsp; &nbsp;</td>");


                fileWriter.write(" " + String.valueOf(argument3[i][1]) + " = ______  &nbsp; &nbsp; &nbsp; &nbsp;</td></tr>");

                outputStream.write('\n');
                outputStream.write('\n');
                outputStream.write('\n');
                fileWriter.write("</tr>   <tr><td colspan=\"totalNumbers\"><br /><br /></td></tr>");
                fileAnswerWriter.write("</tr>   <tr><td colspan=\"totalNumbers\"><br /><br /></td></tr>");

            }
            fileWriter.write("</table>");
            fileAnswerWriter.write("</table>");
            System.out.println("Отработало ");

            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

/*
    Rounding numbers to hundreds for A4 page

    3 948 = _____     4958  = _____     2928 = ______    11938 = _____     2873 = _____
    ...

     */
    public static void numbersRoundingMixingLineWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int roundNumber, int problemsLines, int problemsCols) throws IOException {

        int totalNumbers = 5; // 3 pairs of numbers per line

        int[][] argument1 = new int[problemsLines][2];
        int[][] argument2 = new int[problemsLines][2];
        int[][] argument3 = new int[problemsLines][2];
        int[][] argument4 = new int[problemsLines][2];
        int[][] argument5 = new int[problemsLines][2];
        int[][] compareType = new int[problemsLines][totalNumbers];
        String[][] compareTypeCh = new String[problemsLines][totalNumbers];
        int tempRandomNumber = 0;

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++) {
                argument1[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument2[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument3[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument4[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument5[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
            }

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            fileWriter.write("<table>");
            fileAnswerWriter.write("<table>");

            for (int i = 0; i < problemsLines; i++) {

                fileWriter.write("<tr align=\"left\"><td>" + (i * totalNumbers  + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) + " =  ______ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<tr align=\"left\"><td>" + (i * totalNumbers  + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) +
                        " = " + Math.round((float) argument1[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) + " =  _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) +
                        " = " + Math.round((float) argument2[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers  + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) + " = _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) +
                        " = " + Math.round((float) argument3[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers  + 4) + ")&nbsp; " + String.valueOf(argument4[i][0]) + " = _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 4) + ")&nbsp; " + String.valueOf(argument4[i][0]) +
                        " = " + Math.round((float) argument4[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers  + 5) + ")&nbsp; " + String.valueOf(argument5[i][0]) + " = _____ &nbsp;  &nbsp; </td></tr>\n");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 5) + ")&nbsp; " + String.valueOf(argument5[i][0]) +
                        " = " + Math.round((float) argument5[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td></tr>\n");
                outputStream.write('\n');
                outputStream.write('\n');
                outputStream.write('\n');
                fileWriter.write("<tr><td colspan=\"" + totalNumbers + "\"><br /></td></tr>");
                fileAnswerWriter.write("   <tr><td colspan=\"" + totalNumbers + "\"><br /></td></tr>");

            }
            fileWriter.write("</table>");
            fileAnswerWriter.write("</table>");
            System.out.println("Отработало ");

            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

    public static void numbersRoundingLineWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int roundNumber, int problemsLines, int problemsCols) throws IOException {

        int totalNumbers = 5; // 3 pairs of numbers per line

        int[][] argument1 = new int[problemsLines][2];
        int[][] argument2 = new int[problemsLines][2];
        int[][] argument3 = new int[problemsLines][2];
        int[][] argument4 = new int[problemsLines][2];
        int[][] argument5 = new int[problemsLines][2];
        int[][] compareType = new int[problemsLines][totalNumbers];
        String[][] compareTypeCh = new String[problemsLines][totalNumbers];
        int tempRandomNumber = 0;

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++) {
                argument1[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument2[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument3[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument4[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument5[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
            }

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            fileWriter.write("<table>");
            fileAnswerWriter.write("<table>");

            for (int i = 0; i < problemsLines; i++) {

                fileWriter.write("<tr align=\"left\"><td>" + (i * totalNumbers  + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) + " =  ______ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<tr align=\"left\"><td>" + (i * totalNumbers  + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) +
                        " = " + Math.round((float) argument1[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) + " =  _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) +
                        " = " + Math.round((float) argument2[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers  + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) + " = _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) +
                        " = " + Math.round((float) argument3[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers  + 4) + ")&nbsp; " + String.valueOf(argument4[i][0]) + " = _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 4) + ")&nbsp; " + String.valueOf(argument4[i][0]) +
                        " = " + Math.round((float) argument4[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers  + 5) + ")&nbsp; " + String.valueOf(argument5[i][0]) + " = _____ &nbsp;  &nbsp; </td></tr>\n");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 5) + ")&nbsp; " + String.valueOf(argument5[i][0]) +
                        " = " + Math.round((float) argument5[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td></tr>\n");
                outputStream.write('\n');
                outputStream.write('\n');
                outputStream.write('\n');
                fileWriter.write("<tr><td colspan=\"" + totalNumbers + "\"><br /></td></tr>");
                fileAnswerWriter.write("   <tr><td colspan=\"" + totalNumbers + "\"><br /></td></tr>");

            }
            fileWriter.write("</table>");
            fileAnswerWriter.write("</table>");
            System.out.println("Отработало ");

            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

/*
    Rounding numbers to hundreds for A4 page

    3 948 = _____     4958  = _____     2928 = ______    11938 = _____     2873 = _____
    ...

     */
    public static void numbersOddEventWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int roundNumber, int problemsLines, int problemsCols) throws IOException {

        int totalNumbers = 5; // 3 pairs of numbers per line

        int[][] argument1 = new int[problemsLines][2];
        int[][] argument2 = new int[problemsLines][2];
        int[][] argument3 = new int[problemsLines][2];
        int[][] argument4 = new int[problemsLines][2];
        int[][] argument5 = new int[problemsLines][2];
        int[][] compareType = new int[problemsLines][totalNumbers];
        String[][] compareTypeCh = new String[problemsLines][totalNumbers];
        int tempRandomNumber = 0;

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++) {
                argument1[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument2[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument3[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument4[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument5[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
            }

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            fileWriter.write("<table>");
            fileAnswerWriter.write("<table>");

            for (int i = 0; i < problemsLines; i++) {

                fileWriter.write("<tr align=\"left\"><td>" + (i * totalNumbers  + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) + " =  ______ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<tr align=\"left\"><td>" + (i * totalNumbers  + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) + " = ");
                    if (argument1[i][0] % 2 == 0) fileAnswerWriter.write ("Even" + " &nbsp; &nbsp; </td>");
                    else fileAnswerWriter.write ("Odd" + " &nbsp; &nbsp; </td>");

                fileWriter.write("<td>" + (i * totalNumbers + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) + " =  _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) + " = ");
                    if (argument2[i][0] % 2 == 0) fileAnswerWriter.write ("Even" + " &nbsp; &nbsp; </td>");
                    else fileAnswerWriter.write ("Odd" + " &nbsp; &nbsp; </td>");

//                + Math.round((float) argument2[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers  + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) + " = _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) + " = ");
                    if (argument2[i][0] % 2 == 0) fileAnswerWriter.write ("Even" + " &nbsp; &nbsp; </td>");
                    else fileAnswerWriter.write ("Odd" + " &nbsp; &nbsp; </td>");

                fileWriter.write("<td>" + (i * totalNumbers  + 4) + ")&nbsp; " + String.valueOf(argument4[i][0]) + " = _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 4) + ")&nbsp; " + String.valueOf(argument4[i][0]) + " = ");
                    if (argument2[i][0] % 2 == 0) fileAnswerWriter.write ("Even" + " &nbsp; &nbsp; </td>");
                    else fileAnswerWriter.write ("Odd" + " &nbsp; &nbsp; </td>");

                fileWriter.write("<td>" + (i * totalNumbers  + 5) + ")&nbsp; " + String.valueOf(argument5[i][0]) + " = _____ &nbsp;  &nbsp; </td></tr>\n");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 5) + ")&nbsp; " + String.valueOf(argument5[i][0]) + " = ");
                    if (argument2[i][0] % 2 == 0) fileAnswerWriter.write ("Even" + " &nbsp; &nbsp; </td>");
                    else fileAnswerWriter.write ("Odd" + " &nbsp; &nbsp; </td>");

                outputStream.write('\n');
                outputStream.write('\n');
                outputStream.write('\n');
                fileWriter.write("<tr><td colspan=\"" + totalNumbers + "\"><br /></td></tr>");
                fileAnswerWriter.write("   <tr><td colspan=\"" + totalNumbers + "\"><br /></td></tr>");

            }
            fileWriter.write("</table>");
            fileAnswerWriter.write("</table>");
            System.out.println("Отработало ");

            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

/*
        Not working!!!

        Rounding numbers to underline number accuracy for A4 page

        3 948 = _____     4958  = _____     2928 = ______    11938 = _____     2873 = _____
        ...

         */
    public static void numbersRoundingUnderlineWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int roundNumber, int problemsLines, int problemsCols) throws IOException {

        int totalNumbers = 5; // 5 pairs of numbers per line

        int [][] entryNumbersInt = new int[problemsLines][problemsCols];
        StringBuilder[][] entryNumbersString = new StringBuilder[problemsLines][problemsCols];
        int [][] roundingNumbers = new int[problemsLines][problemsCols];



        int[][] argument1 = new int[problemsLines][3];
        String[] argument1String1 = new String[problemsLines];
//        String[] argument1String2 = new String[problemsLines];

        int[][] argument2 = new int[problemsLines][3];
        String[] argument2String1 = new String[problemsLines];
//        String[] argument2String2 = new String[problemsLines];

        int[][] argument3 = new int[problemsLines][3];
        String[] argumen3String1 = new String[problemsLines];
//        String[] argumen3String2 = new String[problemsLines];

        int[][] argument4 = new int[problemsLines][3];
        String[] argument4String1 = new String[problemsLines];
//        String[] argument4String2 = new String[problemsLines];

        int[][] argument5 = new int[problemsLines][3];
        String[] argument5String1 = new String[problemsLines];
//        String[] argument5String2 = new String[problemsLines];

//        int[] numbersRange = new int[totalNumbers];
//        int[][] compareType = new int[problemsLines][totalNumbers];
//        String[][] compareTypeCh = new String[problemsLines][totalNumbers];
//        int tempRandomNumber = 0;

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++) {
                entryNumbersInt[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                entryNumbersString[i][0] = new StringBuilder(Integer.toString(entryNumbersInt[i][0]));
                roundingNumbers[i][0] =
                entryNumbersInt[i][1] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                entryNumbersString[i][1] = new StringBuilder(Integer.toString(entryNumbersInt[i][1]));
                entryNumbersInt[i][2] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                entryNumbersString[i][2] = new StringBuilder(Integer.toString(entryNumbersInt[i][2]));
                entryNumbersInt[i][3] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                entryNumbersString[i][3] = new StringBuilder(Integer.toString(entryNumbersInt[i][3]));
                entryNumbersInt[i][4] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                entryNumbersString[i][4] = new StringBuilder(Integer.toString(entryNumbersInt[i][4]));


                argument1[i][1] = (int) (Math.random() * ((Integer.toString(argument1[i][0])).length() - 1));
//                if (argument1[i][1] == 0) argument1[i][2] = Math.round(numbersRangeEnd/10);
//                if (argument1[i][1] == 1) argument1[i][2] = Math.round(numbersRangeEnd/100);
//                if (argument1[i][1] == 2) argument1[i][2] = Math.round(numbersRangeEnd/1000);

                argument1String1[i] = Integer.toString(argument1[i][0]);
                StringBuilder myString = new StringBuilder(argument1String1[i]);
                char replaceChar = argument1String1[i].charAt(argument1[i][1]);

//                String replaceString = "<u>" + replaceChar + "</u>";
//                myString.replace(argument1[i][1], argument1[i][1] + 1, replaceString);
//                argument1String2[i] = myString.toString();
//                if (k == 1) System.out.println(" argument1[i][1] " + argument1[i][1] + " " + replaceChar + " argument1[i][0] " + argument1[i][0] +
//                        " replaceString " + replaceString + " " + myString);

                argument2[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument2[i][1] = (int) (Math.random() * ((Integer.toString(argument1[i][0])).length() - 1));
//                if (argument2[i][1] == 0) argument2[i][2] = Math.round(numbersRangeEnd/10);
//                if (argument2[i][1] == 1) argument2[i][2] = Math.round(numbersRangeEnd/100);
//                if (argument2[i][1] == 2) argument2[i][2] = Math.round(numbersRangeEnd/1000);

                argument2String1[i] = Integer.toString(argument2[i][0]);
                StringBuilder myString2 = new StringBuilder(argument2String1[i]);
                char replaceChar2 = argument2String1[i].charAt(argument2[i][1]);

//                String replaceString2 = "<u>" + replaceChar2 + "</u>";
//                myString2.replace(argument2[i][1], argument2[i][1] + 1, replaceString2);
//                argument2String2[i] = myString2.toString();
//
//                argument3[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
//                argument3[i][1] = (int) (Math.random() * ((Integer.toString(argument1[i][0])).length() - 1));
//                if (argument3[i][1] == 0) argument3[i][2] = Math.round(numbersRangeEnd/10);
//                if (argument3[i][1] == 1) argument3[i][2] = Math.round(numbersRangeEnd/100);
//                if (argument3[i][1] == 2) argument3[i][2] = Math.round(numbersRangeEnd/1000);
//
//
//                argument3String1[i] = Integer.toString(argument3[i][0]);
//                myString = new StringBuilder(argument3String1[i]);
//                replaceChar = argument3String1[i].charAt(argument3[i][1]);
//
//                replaceString = "<u>" + replaceChar + "</u>";
//                myString.replace(argument3[i][1], argument2[i][1] + 1, replaceString);
//                argument3String2[i] = myString.toString();

                argument4[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument4[i][1] = (int) (Math.random() * (Integer.toString(argument4[i][0])).length() + 1);
                argument5[i][0] = (int) ((Math.random() * (numbersRangeEnd - numbersRangeStart)) + numbersRangeStart);
                argument5[i][1] = (int) (Math.random() * (Integer.toString(argument5[i][0])).length() + 1);
            }

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            fileWriter.write("<table>");
            fileAnswerWriter.write("<table>");

            for (int i = 0; i < problemsLines; i++) {

                fileWriter.write("<tr align=\"left\"><td>" + (i * totalNumbers  + 1) + ")&nbsp; " + " = " + String.valueOf(argument1[i][0]) + "  &nbsp; </td>");
                fileAnswerWriter.write("<tr align=\"left\"><td>" + (i * totalNumbers  + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) +
                        " = " + Math.round((float) argument1[i][0] / argument1[i][2]) * argument1[i][2]  + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) + " =  _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) +
                        " = " + Math.round((float) argument1[i][0] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers  + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) + " = _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) +
                        " = " + Math.round((float) argument3[i][1] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers  + 4) + ")&nbsp; " + String.valueOf(argument4[i][0]) + " = _____ &nbsp;  &nbsp; </td>");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 4) + ")&nbsp; " + String.valueOf(argument4[i][0]) +
                        " = " + Math.round((float) argument4[i][1] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td>");
                fileWriter.write("<td>" + (i * totalNumbers  + 5) + ")&nbsp; " + String.valueOf(argument5[i][0]) + " = _____ &nbsp;  &nbsp; </td></tr>\n");
                fileAnswerWriter.write("<td>" + (i * totalNumbers  + 5) + ")&nbsp; " + String.valueOf(argument5[i][0]) +
                        " = " + Math.round((float) argument5[i][1] / roundNumber) * roundNumber + " &nbsp; &nbsp; </td></tr>\n");
                outputStream.write('\n');
                outputStream.write('\n');
                outputStream.write('\n');
                fileWriter.write("<tr><td colspan=\"" + totalNumbers + "\"><br /></td></tr>");
                fileAnswerWriter.write("   <tr><td colspan=\"" + totalNumbers + "\"><br /></td></tr>");

            }
            fileWriter.write("</table>");
            fileAnswerWriter.write("</table>");
            System.out.println("Отработало ");

            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

/*
    Compare numbers. Underline all correct sentences

        a11 > b11          a21 = b21            a31 < b31

*/
    public static void numberCompareA1_B1UnderlineCorrectSentencesWorksheetA4(String workingFolder,
                                                                              String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                                                              String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLines, int problemsCols) throws IOException {
//        System.out.println("Начало ");

        int totalNumbers = 4; // 4 pairs of numbers to compare

        int[][] argument1 = new int[problemsLines][2];
        int[][] argument2 = new int[problemsLines][2];
        int[][] argument3 = new int[problemsLines][2];
        int[][] argument4 = new int[problemsLines][2];
        int[][] compareType = new int[problemsLines][totalNumbers];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++) {
//                for (int j = 0; j < totalNumbers; j++) {
                argument1[i][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument1[i][1] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument2[i][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument2[i][1] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument3[i][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument3[i][1] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument4[i][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument4[i][1] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                compareType[i][0] = (int) (Math.random() * 3);
                compareType[i][1] = (int) (Math.random() * 3);
                compareType[i][2] = (int) (Math.random() * 3);
                compareType[i][3] = (int) (Math.random() * 3);
//                }
            }

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            fileWriter.write("<table>");
            fileAnswerWriter.write("<table>");
//            fileWriter.write("<table> <tr><td colspan=\"" + (totalNumbers - 1) + "\"></td></tr>\n");
//            fileAnswerWriter.write("<table> <tr><td colspan=\"" + (totalNumbers - 1) + "\"></td></tr>\n");

            for (int i = 0; i < problemsLines; i++) {

                fileWriter.write("<tr align=\"left\"><td>" + (i * 4 + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) + " ");
                fileAnswerWriter.write("<tr align=\"left\"><td>" + (i * 4 + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) + " ");
                if (compareType[i][0] == 0 ) {
                        fileWriter.write(" = ");
                        fileAnswerWriter.write(" = ");
                }
                if (compareType[i][0] == 1 ) {
                        fileWriter.write(" > ");
                        fileAnswerWriter.write(" > ");
                }
                if (compareType[i][0] == 2 ) {
                        fileWriter.write(" < ");
                        fileAnswerWriter.write(" < ");
                }
                fileWriter.write(" " + String.valueOf(argument1[i][1]) + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>");
                fileAnswerWriter.write(" " + String.valueOf(argument1[i][1]) + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>");

                fileWriter.write("<td>" + (i * 4 + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) + " ");
                fileAnswerWriter.write("<td>" + (i * 4 + 2) + ")&nbsp; " + String.valueOf(argument2[i][0]) + " ");
                if (compareType[i][1] == 0 ) {
                        fileWriter.write(" = ");
                        fileAnswerWriter.write(" = ");
                }
                if (compareType[i][1] == 1 ) {
                        fileWriter.write(" > ");
                        fileAnswerWriter.write(" > ");
                }
                if (compareType[i][1] == 2 ) {
                        fileWriter.write(" < ");
                        fileAnswerWriter.write(" < ");
                }
                fileWriter.write(" " + String.valueOf(argument2[i][1]) + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>");
                fileAnswerWriter.write(" " + String.valueOf(argument2[i][1]) + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>");

                fileWriter.write("<td>" + (i * 4 + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) + " ");
                fileAnswerWriter.write("<td>" + (i * 4 + 3) + ")&nbsp; " + String.valueOf(argument3[i][0]) + " ");
                if (compareType[i][2] == 0 ) {
                    fileWriter.write(" = ");
                    fileAnswerWriter.write(" = ");
                }
                if (compareType[i][2] == 1 ) {
                    fileWriter.write(" > ");
                    fileAnswerWriter.write(" > ");
                }
                if (compareType[i][2] == 2 ) {
                    fileWriter.write(" < ");
                    fileAnswerWriter.write(" < ");
                }
                fileWriter.write(" " + String.valueOf(argument3[i][1]) + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>");
                fileAnswerWriter.write(" " + String.valueOf(argument3[i][1]) + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>");

                fileWriter.write("<td>" + (i * 4 + 4) + ")&nbsp; " + String.valueOf(argument4[i][0]) + " ");
                fileAnswerWriter.write("<td>" + (i * 4 + 4) + ")&nbsp; " + String.valueOf(argument4[i][0]) + " ");
                if (compareType[i][3] == 0 ) {
                    fileWriter.write(" = ");
                    fileAnswerWriter.write(" = ");
                }
                if (compareType[i][3] == 1 ) {
                    fileWriter.write(" > ");
                    fileAnswerWriter.write(" > ");
                }
                if (compareType[i][3] == 2 ) {
                    fileWriter.write(" < ");
                    fileAnswerWriter.write(" < ");
                }
                fileWriter.write(" " + String.valueOf(argument4[i][1]) + "</td></tr>");
                fileAnswerWriter.write(" " + String.valueOf(argument4[i][1]) + "</td></tr>");

//                "</td> &nbsp; &nbsp; &nbsp; <td>");
//                fileAnswerWriter.write("<tr align=\"right\"><td>" + (i * 4 + 1) + ")&nbsp; " + String.valueOf(argument1[i][0]) + "</td> &nbsp; &nbsp; &nbsp; <td>");
////                for (int j = 0; j < totalNumbers; j++) {
//
////                    outputStream.write(String.valueOf(argument1[i][j]).getBytes());
////                    fileWriter.write((i * 4 + 1) + ")&nbsp; ");
////                    fileWriter.write(String.valueOf(argument1[i][0]));
////                    fileWriter.write(String.valueOf(argument1[i][0]));
////                    if (compareType[i][0] == 0 ) {
////                        fileWriter.write(" = ");
////                        fileWriter.write(String.valueOf(argument1[i][1]));
////                    }
////                    else if (compareType[i][0] == 1 ) {
////                        fileWriter.write(" > ");
////                        fileWriter.write(String.valueOf(argument1[i][1]));
////
////                    }
////                    else {
////                        fileWriter.write(" < ");
////                        fileWriter.write(String.valueOf(argument1[i][1]));
////
////                    }
//
////                fileWriter.write("</td> &nbsp; &nbsp; &nbsp; <td>");
//
////                fileAnswerWriter.write((i * 4 + 1) + ")&nbsp; ");
////                    fileAnswerWriter.write(String.valueOf(argument1[i][0]));
////                    fileAnswerWriter.write(" > ");
////                    fileAnswerWriter.write(String.valueOf(argument1[i][1]));
////                    fileAnswerWriter.write(" &nbsp; &nbsp; &nbsp; ");
//
//                    fileWriter.write((i * 4 + 2) + ")&nbsp; ");
//                    fileWriter.write(String.valueOf(argument2[i][0]));
//                    fileWriter.write(" = ");
//                    fileWriter.write(String.valueOf(argument2[i][1]));
//                fileWriter.write("</td> &nbsp; &nbsp; &nbsp; <td>");
//
//                    fileAnswerWriter.write((i * 4 + 2) + ")&nbsp; ");
//                    fileAnswerWriter.write(String.valueOf(argument2[i][0]));
//                    fileAnswerWriter.write(" = ");
//                    fileAnswerWriter.write(String.valueOf(argument2[i][1]));
//                    fileAnswerWriter.write(" &nbsp; &nbsp; &nbsp; ");
//
//                    fileWriter.write((i * 4 + 3) + ")&nbsp; ");
//                    fileWriter.write(String.valueOf(argument3[i][0]));
//                    fileWriter.write(" < ");
//                    fileWriter.write(String.valueOf(argument3[i][1]));
//                fileWriter.write("</td> &nbsp; &nbsp; &nbsp; <td>");
//
//                    fileAnswerWriter.write((i * 4 + 3) + ")&nbsp; ");
//                    fileAnswerWriter.write(String.valueOf(argument3[i][0]));
//                    fileAnswerWriter.write(" < ");
//                    fileAnswerWriter.write(String.valueOf(argument3[i][1]));
//                    fileAnswerWriter.write(" &nbsp; &nbsp; &nbsp; ");
//
//                    fileWriter.write((i * 4 + 4) + ")&nbsp; ");
//                    fileWriter.write(String.valueOf(argument4[i][0]));
//                    fileWriter.write(" < ");
//                    fileWriter.write(String.valueOf(argument4[i][1]));
//
//                    fileAnswerWriter.write((i * 4 + 4) + ")&nbsp; ");
//                    fileAnswerWriter.write(String.valueOf(argument4[i][0]));
//                    fileAnswerWriter.write(" < ");
//                    fileAnswerWriter.write(String.valueOf(argument4[i][1]));




//                    outputStream.write(' ');
//                    outputStream.write('+');
//                    outputStream.write(' ');
//
//                    fileWriter.write(" ___ ");
//                    fileAnswerWriter.write(" ___ ");
//
////                    outputStream.write(String.valueOf(argument2[i][j]).getBytes());
//                    fileWriter.write(String.valueOf(argument2[i][0]));
//                    fileAnswerWriter.write(String.valueOf(argument2[i][0]));
////
//                    outputStream.write(' ');
//                    outputStream.write('=');
//                    outputStream.write(' ');
//                    outputStream.write('_');
//                    outputStream.write('_');
//                    outputStream.write('_');
//                    outputStream.write('_');
//                    outputStream.write(' ');
//                    outputStream.write(' ');
//                    outputStream.write(' ');
//
//                    fileWriter.write(" &nbsp; &nbsp; &nbsp; ");
//                    fileAnswerWriter.write(" = ____ " + String.valueOf((argument1[i][j] + argument2[i][j])));

//                    System.out.print(" " + argument1[i][j] + " + " + argument2[i][j] + " = _____   ");
//                }
                outputStream.write('\n');
                outputStream.write('\n');
                outputStream.write('\n');
                fileWriter.write("</tr>   <tr><td colspan=\"totalNumbers\"><br /><br /></td></tr>");
                fileAnswerWriter.write("</tr>   <tr><td colspan=\"totalNumbers\"><br /><br /></td></tr>");
//                fileWriter.write("<br /><br />\n\n");
//                fileAnswerWriter.write("<br /><br />\n\n");
//                System.out.println();
//                System.out.println();
//                System.out.println();

            }
//            fileWriter.write("</tr> \n  <tr><td colspan=\"totalNumbers\"><br /><br /></td></tr>");
//            fileAnswerWriter.write("</tr> \n  <tr><td colspan=\"totalNumbers\"><br /><br /></td></tr>");
            fileWriter.write("</table>");
            fileAnswerWriter.write("</table>");
            System.out.println("Отработало ");

            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

    public static void subtractA1_B1LineWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLines, int problemsCols) throws IOException {
        System.out.println("Вычитание в строчку " + longTaskNameWorksheet);


        int[][] argument1 = new int[problemsLines][problemsCols];
        int[][] argument2 = new int[problemsLines][problemsCols];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++)
                for (int j = 0; j < problemsCols; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * numbersRangeEnd/10 + numbersRangeStart);
                }

            if (longTaskNameWorksheet.contains("Вычити число 0") || longTaskNameWorksheet.contains("Subtract 0")) {
//                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 0;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 1") || longTaskNameWorksheet.contains("Subtract 1")) {
//                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 1;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 2") || longTaskNameWorksheet.contains("Subtract 2")) {
//                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 3") || longTaskNameWorksheet.contains("Subtract 3")) {
//                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 4") || longTaskNameWorksheet.contains("Subtract 4")) {
//                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 5") || longTaskNameWorksheet.contains("Subtract 5")) {
//                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 6") || longTaskNameWorksheet.contains("Subtract 6")) {
//                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 7") || longTaskNameWorksheet.contains("Subtract 7")) {
//                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 8") || longTaskNameWorksheet.contains("Subtract 8")) {
//                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 9") || longTaskNameWorksheet.contains("Subtract 9")) {
//                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("Вычити число 10") || longTaskNameWorksheet.contains("Subtract 10")) {
//                int tempNumber = 0;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 10;
                    }
            }


            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            for (int i = 0; i < problemsLines; i++) {
                for (int j = 0; j < problemsCols; j++) {

                    outputStream.write(String.valueOf(argument1[i][j]).getBytes());
                    fileWriter.write("&nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j]);
                    fileAnswerWriter.write("&nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j]);

                    outputStream.write(' ');
                    outputStream.write('-');
                    outputStream.write(' ');

                    fileWriter.write(" - ");
                    fileAnswerWriter.write(" - ");

                    outputStream.write(String.valueOf(argument2[i][j]).getBytes());
                    fileWriter.write(String.valueOf(argument2[i][j]));
                    fileAnswerWriter.write(String.valueOf(argument2[i][j]));

                    outputStream.write(' ');
                    outputStream.write('=');
                    outputStream.write(' ');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write(' ');
                    outputStream.write(' ');
                    outputStream.write(' ');

                    fileWriter.write(" = ___&nbsp; &nbsp; &nbsp; ");
                    fileAnswerWriter.write(" = " + (argument1[i][j] - argument2[i][j]) + " &nbsp; ");

//                    System.out.print(" " + argument1[i][j] + " + " + argument2[i][j] + " = _____   ");
                }
                outputStream.write('\n');
                outputStream.write('\n');
                outputStream.write('\n');
                fileWriter.write("<br /><br /><br />\n\n\n");
                fileAnswerWriter.write("<br /><br /><br />\n\n\n");
//                System.out.println();
//                System.out.println();
//                System.out.println();
//                System.out.println("Отработало ");
            }
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

    public static void addSubtractA1_B1LineWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLines, int problemsCols) throws IOException {

        int[][] argument1 = new int[problemsLines][problemsCols];
        int[][] argument2 = new int[problemsLines][problemsCols];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++)
                for (int j = 0; j < problemsCols; j++) {
                    argument1[i][j] = (int) ((Math.random() * numbersRangeEnd) + numbersRangeStart);
                    argument2[i][j] = (int) (((Math.random() * numbersRangeEnd) / 10) + numbersRangeStart);
                }
            if (longTaskNameWorksheet.contains("Сложи или вычити число 0") || longTaskNameWorksheet.contains("Add or subtract 0 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 0;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 1") || longTaskNameWorksheet.contains("Add or subtract 1 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 1;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 2") || longTaskNameWorksheet.contains("Add or subtract 2 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 3") || longTaskNameWorksheet.contains("Add or subtract 3 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 4") || longTaskNameWorksheet.contains("Add or subtract 4 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 5") || longTaskNameWorksheet.contains("Add or subtract 5 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 6") || longTaskNameWorksheet.contains("Add or subtract 6 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 7") || longTaskNameWorksheet.contains("Add or subtract 7 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 8") || longTaskNameWorksheet.contains("Add or subtract 8 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 9") || longTaskNameWorksheet.contains("Add or subtract 9 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("Сложи или вычити число 10") || longTaskNameWorksheet.contains("Add or subtract 10 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 10;
                    }
            }


            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            for (int i = 0; i < problemsLines; i++) {
                for (int j = 0; j < problemsCols; j++) {
                    if(j % 2 == 0) {
                        fileWriter.write(" &nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j] + " + " + argument2[i][j]
                                + " = ___ &nbsp; &nbsp; &nbsp; ");
                        fileAnswerWriter.write(" &nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j] + " + " + argument2[i][j]
                                + " = " + (argument1[i][j] + argument2[i][j]) +" &nbsp; ");
                    }
                    else {
                        fileWriter.write(" &nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j] + " - " + argument2[i][j]
                                + " = ___ &nbsp; &nbsp; &nbsp; ");
                        fileAnswerWriter.write("&nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j] + " - " + argument2[i][j]
                                + " = " + (argument1[i][j] - argument2[i][j]) + " &nbsp; ");
                    }
                }
                outputStream.write('\n');
                fileWriter.write("<br /><br /><br />\n\n");
                fileAnswerWriter.write("<br /><br /><br />\n\n");
            }
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

    public static void multiplyA1_B1LineWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLines, int problemsCols) throws IOException {

        int[][] argument1 = new int[problemsLines][problemsCols];
        int[][] argument2 = new int[problemsLines][problemsCols];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++)
                for (int j = 0; j < problemsCols; j++) {
                    argument1[i][j] = (int) ((Math.random() * numbersRangeEnd) + numbersRangeStart);
                    argument2[i][j] = (int) (((Math.random() * numbersRangeEnd) ) + numbersRangeStart);
                }
            if (longTaskNameWorksheet.contains("Умножь число 0") || longTaskNameWorksheet.contains("Multiply 0 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 0;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 1") || longTaskNameWorksheet.contains("Multiply 1 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 1;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 2") || longTaskNameWorksheet.contains("Multiply 2 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 3") || longTaskNameWorksheet.contains("Multiply 3 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 4") || longTaskNameWorksheet.contains("Multiply 4 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 5") || longTaskNameWorksheet.contains("Multiply 5 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 6") || longTaskNameWorksheet.contains("Multiply 6 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 7") || longTaskNameWorksheet.contains("Multiply 7 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 8") || longTaskNameWorksheet.contains("Multiply 8 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 9") || longTaskNameWorksheet.contains("Multiply 9 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 10") || longTaskNameWorksheet.contains("Multiply 10 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 10;
                    }
            }


            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            for (int i = 0; i < problemsLines; i++) {
                for (int j = 0; j < problemsCols; j++) {
//                    if(j % 2 == 0) {
                        fileWriter.write(" &nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j] + " &#215; " + argument2[i][j]
                                + " = ____ &nbsp; &nbsp; &nbsp; ");
                        fileAnswerWriter.write(" &nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j] + " + " + argument2[i][j]
                                + " = " + (argument1[i][j] * argument2[i][j]) +" &nbsp; ");
//                    }
//                    else {
//                        fileWriter.write(" &nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j] + " - " + argument2[i][j]
//                                + " = ____ &nbsp; &nbsp; &nbsp; ");
//                        fileAnswerWriter.write("&nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j] + " - " + argument2[i][j]
//                                + " = " + (argument1[i][j] - argument2[i][j]) + " &nbsp; ");
//                    }
                }
                outputStream.write('\n');
                fileWriter.write("<br /><br /><br />\n\n");
                fileAnswerWriter.write("<br /><br /><br />\n\n");
            }
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

    public static void divideA1_B1LineWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLines, int problemsCols) throws IOException {

        int[][] argument1 = new int[problemsLines][problemsCols];
        int[][] argument2 = new int[problemsLines][problemsCols];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++)
                for (int j = 0; j < problemsCols; j++) {
                    argument1[i][j] = (int) ((Math.random() * numbersRangeEnd) + numbersRangeStart);
                    argument2[i][j] = (int) (((Math.random() * numbersRangeEnd) ) + numbersRangeStart);
                }

            if (longTaskNameWorksheet.contains("Раздели число на 1") || longTaskNameWorksheet.contains("Divide number by 1")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 1;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 2") || longTaskNameWorksheet.contains("Divide number by 2")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 2))) * 2 + numbersRangeStart;
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 3") || longTaskNameWorksheet.contains("Divide number by 3")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 3))) * 3 + numbersRangeStart;
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 4") || longTaskNameWorksheet.contains("Divide number by 4")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 4))) * 4 + numbersRangeStart;
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 5") || longTaskNameWorksheet.contains("Divide number by 5")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 5))) * 5 + numbersRangeStart;
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 6") || longTaskNameWorksheet.contains("Divide number by 6")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 6))) * 6 + numbersRangeStart;
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 7") || longTaskNameWorksheet.contains("Divide number by 7")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 7))) * 7 + numbersRangeStart;
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 8") || longTaskNameWorksheet.contains("Divide number by 8")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 8))) * 8 + numbersRangeStart;
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 9") || longTaskNameWorksheet.contains("Divide number by 9")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 9))) * 9 + numbersRangeStart;
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 10") || longTaskNameWorksheet.contains("Divide number by 10")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 10))) * 10 + numbersRangeStart;
                        argument2[i][j] = 10;
                    }
            }


            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            System.out.println(grade);

            fileWriter.write("<table>\n");
            fileAnswerWriter.write("<table>\n");
            for (int i = 0; i < problemsLines; i++) {

                fileWriter.write("<tr>");
                fileAnswerWriter.write("<tr>");
                for (int j = 0; j < problemsCols; j++) {
                    if (grade.contains("&nbsp")) {
                        if ((i * problemsCols) + (j + 1) < 10) {
                            fileWriter.write("<td> " + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] + " ÷ " + argument2[i][j] + " = ___ &nbsp; </td>");
                        } else {
                            fileWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] + " ÷ " + argument2[i][j] + " = ___ &nbsp; </td>");
                        }
                        fileAnswerWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] + " ÷ " + argument2[i][j]
                                + " = " + (argument1[i][j] / argument2[i][j]) + " &nbsp;</td>");
                    } else {
                        if ((i * problemsCols) + (j + 1) < 10) {
                            fileWriter.write("<td> " + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] + " : " + argument2[i][j] + " = ___ &nbsp; </td>");
                        } else {
                            fileWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] + " : " + argument2[i][j] + " = ___ &nbsp; </td>");
                        }
                        fileAnswerWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] + " : " + argument2[i][j]
                                + " = " + (argument1[i][j] / argument2[i][j]) + " &nbsp;</td>");

                    }
                }
                fileWriter.write("</tr> \n");
                fileAnswerWriter.write("</tr> \n");
                fileWriter.write("<tr><td colspan=\"" + problemsCols + "\"><br /><br /></td></tr>\n");
                fileAnswerWriter.write("<tr><td colspan=\"" + problemsCols + "\"><br /><br /></td></tr>\n");
            }
            fileWriter.write("</table>");
            fileAnswerWriter.write("</table>");
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

    public static void compareNumbersA1_B1WorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLines, int problemsCols) throws IOException {

        int[][] argument1 = new int[problemsLines][problemsCols];
        int[][] argument2 = new int[problemsLines][problemsCols];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++)
                for (int j = 0; j < problemsCols; j++) {
                    argument1[i][j] = (int) ((Math.random() * numbersRangeEnd) + numbersRangeStart);
                    argument2[i][j] = (int) (((Math.random() * numbersRangeEnd) ) + numbersRangeStart);
                }



            if (longTaskNameWorksheet.contains("до 10") || longTaskNameWorksheet.contains("to 10")) {
                System.out.println("Числа до 10--------------");
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);

                        if (((i * problemsCols) + (j + 1)) % 4 == 2) {
                            argument2[i][j] = argument1[i][j];
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        }
                    }
            }

            if (longTaskNameWorksheet.contains("до 20") || longTaskNameWorksheet.contains("to 20")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);

                        if (((i * problemsCols) + (j + 1)) % 4 == 2) {
                            argument2[i][j] = argument1[i][j];
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        }
                    }
            }
            if (longTaskNameWorksheet.contains("до 50") || longTaskNameWorksheet.contains("to 50")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);

                        if (((i * problemsCols) + (j + 1)) % 4 == 2) {
                            argument2[i][j] = argument1[i][j];
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        }
                    }
            }
            if (longTaskNameWorksheet.contains("до 100") || longTaskNameWorksheet.contains("to 100")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);

                        if (((i * problemsCols) + (j + 1)) % 4 == 2) {
                            argument2[i][j] = argument1[i][j];
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        }
                    }
            }
            if (longTaskNameWorksheet.contains("до 1000") || longTaskNameWorksheet.contains("to 1000")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);

                        if (((i * problemsCols) + (j + 1)) % 4 == 2) {
                            argument2[i][j] = argument1[i][j];
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        }
                    }
            }

            if (longTaskNameWorksheet.contains("число 1") || longTaskNameWorksheet.contains("Number 1")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        if (((i * problemsCols) + (j + 1)) % 3 == 0) {
                            argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument2[i][j] = 1;
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument1[i][j] = 1;

                        }
                    }
            }

            if (longTaskNameWorksheet.contains("число 2") || longTaskNameWorksheet.contains("Number 2")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        if (((i * problemsCols) + (j + 1)) % 3 == 0) {
                            argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument2[i][j] = 2;
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument1[i][j] = 2;

                        }
                    }
            }

            if (longTaskNameWorksheet.contains("число 3") || longTaskNameWorksheet.contains("Number 3")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        if (((i * problemsCols) + (j + 1)) % 3 == 0) {
                            argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument2[i][j] = 3;
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument1[i][j] = 3;

                        }
                    }
            }

            if (longTaskNameWorksheet.contains("число 4") || longTaskNameWorksheet.contains("Number 4")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        if (((i * problemsCols) + (j + 1)) % 3 == 0) {
                            argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument2[i][j] = 4;
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument1[i][j] = 4;

                        }
                    }
            }

            if (longTaskNameWorksheet.contains("число 5") || longTaskNameWorksheet.contains("Number 5")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        if (((i * problemsCols) + (j + 1)) % 3 == 0) {
                            argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument2[i][j] = 5;
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument1[i][j] = 5;

                        }
                    }
            }

            if (longTaskNameWorksheet.contains("число 6") || longTaskNameWorksheet.contains("Number 6")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        if (((i * problemsCols) + (j + 1)) % 3 == 0) {
                            argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument2[i][j] = 6;
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument1[i][j] = 6;

                        }
                    }
            }

            if (longTaskNameWorksheet.contains("число 7") || longTaskNameWorksheet.contains("Number 7")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        if (((i * problemsCols) + (j + 1)) % 3 == 0) {
                            argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument2[i][j] = 7;
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument1[i][j] = 7;

                        }
                    }
            }

            if (longTaskNameWorksheet.contains("число 8") || longTaskNameWorksheet.contains("Number 8")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        if (((i * problemsCols) + (j + 1)) % 3 == 0) {
                            argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument2[i][j] = 8;
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument1[i][j] = 8;

                        }
                    }
            }

            if (longTaskNameWorksheet.contains("число 9") || longTaskNameWorksheet.contains("Number 9")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        if (((i * problemsCols) + (j + 1)) % 3 == 0) {
                            argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument2[i][j] = 9;
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument1[i][j] = 9;

                        }
                    }
            }

            if (longTaskNameWorksheet.contains("число 10") || longTaskNameWorksheet.contains("Number 10")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        if (((i * problemsCols) + (j + 1)) % 3 == 0) {
                            argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument2[i][j] = 10;
                        } else {
                            argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                            argument1[i][j] = 10;

                        }
                    }
            }

/*
            if (longTaskNameWorksheet.contains("Раздели число на 2") || longTaskNameWorksheet.contains("Divide number by 2")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 2))) * 2 + numbersRangeStart;
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 3") || longTaskNameWorksheet.contains("Divide number by 3")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 3))) * 3 + numbersRangeStart;
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 4") || longTaskNameWorksheet.contains("Divide number by 4")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 4))) * 4 + numbersRangeStart;
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 5") || longTaskNameWorksheet.contains("Divide number by 5")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 5))) * 5 + numbersRangeStart;
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 6") || longTaskNameWorksheet.contains("Divide number by 6")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 6))) * 6 + numbersRangeStart;
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 7") || longTaskNameWorksheet.contains("Divide number by 7")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 7))) * 7 + numbersRangeStart;
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 8") || longTaskNameWorksheet.contains("Divide number by 8")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 8))) * 8 + numbersRangeStart;
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 9") || longTaskNameWorksheet.contains("Divide number by 9")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 9))) * 9 + numbersRangeStart;
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("Раздели число на 10") || longTaskNameWorksheet.contains("Divide number by 10")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = ((int) (Math.random() * (numbersRangeEnd / 10))) * 10 + numbersRangeStart;
                        argument2[i][j] = 10;
                    }
            }

*/

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            System.out.println(grade);

            fileWriter.write("<table>\n");
            fileAnswerWriter.write("<table>\n");
            for (int i = 0; i < problemsLines; i++) {

                fileWriter.write("<tr>");
                fileAnswerWriter.write("<tr>");
                for (int j = 0; j < problemsCols; j++) {
//                    if (grade.contains("&nbsp")) {
//                        if ((i * problemsCols) + (j + 1) < 10) {
//                            fileWriter.write("<td> " + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] + " __ " + argument2[i][j] + "</td>");
//                        } else {
                            fileWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] + " __ " + argument2[i][j] + "&ensp;</td>");
//                        }
                        fileAnswerWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j]);
                        if (argument1[i][j] == argument2[i][j]) {
                            fileAnswerWriter.write(" = ");
                        } else if (argument1[i][j] > argument2[i][j]) {
                            fileAnswerWriter.write(" &gt; ");
                        }
                        else {
                            fileAnswerWriter.write(" &lt; ");
                        }
                        fileAnswerWriter.write(+ argument2[i][j] + "&ensp;</td>");

/*                        if ((i * problemsCols) + (j + 1) > 10) {
                            fileWriter.write("<td> " + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] + " __ " + argument2[i][j] + "</td>");
                        } else {
                            fileWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] + " __ " + argument2[i][j] + "</td>");
                        }
                        fileAnswerWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j]);
                        if (argument1[i][j] == argument2[i][j]) {
                            fileAnswerWriter.write(" = ");
                        } else if (argument1[i][j] > argument2[i][j]) {
                            fileAnswerWriter.write(" > ");
                        }
                        else {
                            fileAnswerWriter.write(" < ");
                        }
                        fileAnswerWriter.write("</td>");*/

//                    }
                }
                fileWriter.write("</tr> \n");
                fileAnswerWriter.write("</tr> \n");
                fileWriter.write("<tr><td colspan=\"" + problemsCols + "\"><br /><br /></td></tr>\n");
                fileAnswerWriter.write("<tr><td colspan=\"" + problemsCols + "\"><br /><br /></td></tr>\n");
            }
            fileWriter.write("</table>");
            fileAnswerWriter.write("</table>");
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

    public static void longDivision2d_1d1WorksheetA4(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLines, int problemsCols) throws IOException {

        int[][] argument1 = new int[problemsLines][problemsCols];
        int[][] argument2 = new int[problemsLines][problemsCols];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;
            int tempNumber;

            for (int i = 0; i < problemsLines; i++)
                for (int j = 0; j < problemsCols; j++) {
                    argument1[i][j] = (int) ((Math.random() * numbersRangeEnd) + numbersRangeStart);
                    argument2[i][j] = (int) (((Math.random() * numbersRangeEnd) ) + numbersRangeStart);
                }

            if (longTaskNameWorksheet.contains("на 1") || longTaskNameWorksheet.contains("by 1")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 1;
                    }
            }

            if (longTaskNameWorksheet.contains("на 2") || longTaskNameWorksheet.contains("by 2")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument1[i][j] = tempNumber - (tempNumber % 2);
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("на 3") || longTaskNameWorksheet.contains("by 3")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument1[i][j] = tempNumber - (tempNumber % 3);
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("на 4") || longTaskNameWorksheet.contains("by 4")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument1[i][j] = tempNumber - (tempNumber % 4);
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("на 5") || longTaskNameWorksheet.contains("by 5")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument1[i][j] = tempNumber - (tempNumber % 5);
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("6") || longTaskNameWorksheet.contains("by 6")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument1[i][j] = tempNumber - (tempNumber % 7);
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("на 7") || longTaskNameWorksheet.contains(" by 7")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument1[i][j] = tempNumber - (tempNumber % 7);
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("на 8") || longTaskNameWorksheet.contains("by 8")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument1[i][j] = tempNumber - (tempNumber % 8);
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("на 9") || longTaskNameWorksheet.contains("by 9")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument1[i][j] = tempNumber - (tempNumber % 9);
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("на 10") || longTaskNameWorksheet.contains("by 10")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument1[i][j] = tempNumber - (tempNumber % 10);
                        argument2[i][j] = 10;
                    }
            }


            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

            System.out.println(grade);

            fileWriter.write("<table>\n");
            fileAnswerWriter.write("<table>\n");
            for (int i = 0; i < problemsLines; i++) {

                //Answers for English version
                if (grade.contains("&nbsp") || grade.contains("G")) {
                    fileAnswerWriter.write("<tr>");
                    for (int j = 0; j < problemsCols; j++) {
                        fileAnswerWriter.write("<td></td><td>&nbsp;" + argument1[i][j] / argument2[i][j] + "</td><td></td>");
                    }
                    fileAnswerWriter.write("</tr> \n");
                }

                fileWriter.write("<tr>");
                fileAnswerWriter.write("<tr>");

                for (int j = 0; j < problemsCols; j++) {
                    if (grade.contains("&nbsp") || grade.contains("G")) {
                            fileWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument2[i][j] +
                                    " </td><td class = \"ld\">&nbsp;" + argument1[i][j] + "&nbsp;" + "</td><td>&emsp;</td>");
                        fileAnswerWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument2[i][j] +
                                " </td><td class = \"ld\">&nbsp;" + argument1[i][j] + "&nbsp;" + "</td><td>&emsp;</td>");
                    } else {
                            fileWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] +
                                    " </td><td class = \"ld\">&nbsp;" + argument2[i][j] + "&nbsp;" + "</td><td>&emsp;</td>");
                        fileAnswerWriter.write("<td>" + ((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] +
                                " </td><td class = \"ld\">&nbsp;" + argument2[i][j] + "&nbsp;" + "</td><td>&emsp;</td>");
                    }
                }

                fileWriter.write("</tr> \n");
                fileAnswerWriter.write("</tr> \n");

                if (grade.contains("&ensp;") || grade.contains("класс")) {
                    fileAnswerWriter.write("<tr>");
                    for (int j = 0; j < problemsCols; j++) {
                        fileAnswerWriter.write("<td></td><td>&nbsp;" + argument1[i][j] / argument2[i][j] + "</td><td></td>");
                    }
                    fileAnswerWriter.write("</tr> \n");
                }

                fileWriter.write("<tr><td colspan=\"" + problemsCols * 3 + "\"><br /><br /><br /><br /></td></tr>\n");
                fileAnswerWriter.write("<tr><td colspan=\"" + problemsCols * 3 + "\"><br /><br /><br /></td></tr>\n");
            }
            fileWriter.write("</table>");
            fileAnswerWriter.write("</table>");
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

/*
    Choose 2 numbers to fit the addition sentence A4 page

    23   45   10   45
    ___  + ___ = 90

     */
    public static void chooseNumbersForAdditionSentenceA4Worksheet(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                                                   String longTaskNameWorksheet, int numbersRangeStart, int numbersRangeEnd,
                                                                   int sum, int problemsLine) throws IOException {

        int numbersOfAddend = 5;  // the total numbers to choose from

        int[][] arguments1 = new int[problemsLine][numbersOfAddend];
        int[][] arguments2 = new int[problemsLine][numbersOfAddend];
        int[][] choosedNumbersOfAddend1 = new int[problemsLine][2];
        int[][] choosedNumbersOfAddend2 = new int[problemsLine][2];


        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;
//            pageNumber = 1;

            //Generating addends and choosedNumbers
//            for (int i = 0; i < chooseFromNumbers; i++) {
//                int[][] arguments1 = new int[problemsLine][chooseFromNumbers];
//                int[][] arguments2 = new int[problemsLine][chooseFromNumbers];
//                int[][] choosedNumbers = new int[problemsLine][4];
            for (int j = 0; j < problemsLine; j++) {
                choosedNumbersOfAddend1[j][0] = (int) (Math.random() * (numbersOfAddend - 1));
                choosedNumbersOfAddend2[j][0] = (int) (Math.random() * (numbersOfAddend - 1));

                if (choosedNumbersOfAddend1[j][0] == choosedNumbersOfAddend1[j][1]) {
                    if (choosedNumbersOfAddend1[j][0] == numbersOfAddend) choosedNumbersOfAddend1[j][0]--;
                    else choosedNumbersOfAddend1[j][0]++;
                }
                choosedNumbersOfAddend2[j][1] = (int) (Math.random() * (numbersOfAddend - 1));
                choosedNumbersOfAddend2[j][1] = (int) (Math.random() * (numbersOfAddend - 1));

                if (choosedNumbersOfAddend2[j][0] == choosedNumbersOfAddend2[j][1]) {
                    if (choosedNumbersOfAddend2[j][0] == (numbersOfAddend)) choosedNumbersOfAddend2[j][0]--;
                    else choosedNumbersOfAddend2[j][0]++;
                }
                for (int i = 0; i < numbersOfAddend; i++) {
                    arguments1[j][i] = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                    arguments2[j][i] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                }
            }
//                    choosedNumbersOfAddend [j][2] = (int) (Math.random() * (numbersOfAddend));
//                    choosedNumbers [j][3] = (int) (Math.random() * (numbersOfAddend));
//                    if (choosedNumbers[j][2] == choosedNumbers[j][3]) {
//                        if (choosedNumbers[j][2] == (numbersOfAddend)) choosedNumbers[j][2]--;
//                        else choosedNumbers[j][2]++;
//                    }
//                    for (int i = 0; i < numbersOfAddend; i++) {
//                        arguments1[j][i] = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
//                        arguments2[j][i] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
//                    }
//                }
//            }

                    DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                            (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

//                    FileWriter fileTxtWriter = new FileWriter(new File(workingFolder
//                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));



                    FileWriter fileWriter = new FileWriter(new File(workingFolder
                            + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
                    FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                            + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

//            for (int i = 0; i < problemsPerRows; i++) {
                    for (int j = 0; j < problemsLine; j++) {
                        fileWriter.write(
                                String.valueOf(arguments1[j][0]) + " &nbsp; " + String.valueOf(arguments1[j][1]) + " &nbsp; " +
                                        String.valueOf(arguments1[j][2]) + " &nbsp; " + String.valueOf(arguments1[j][3]) + " &nbsp; " +
                                        String.valueOf(arguments1[j][4]));
                        fileAnswerWriter.write(
                                String.valueOf(arguments1[j][0]) + " &nbsp; " + String.valueOf(arguments1[j][1]) + " &nbsp; " +
                                        String.valueOf(arguments1[j][2]) + " &nbsp; " + String.valueOf(arguments1[j][3]) + " &nbsp; " +
                                        String.valueOf(arguments1[j][4]));
                        fileWriter.write(
                                "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +
                                        "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +
                                        String.valueOf(arguments2[j][0]) + " &nbsp; " + String.valueOf(arguments2[j][1]) + " &nbsp; " +
                                        String.valueOf(arguments2[j][2]) + " &nbsp; " + String.valueOf(arguments2[j][3]) + " &nbsp; " +
                                        String.valueOf(arguments2[j][4]) + "<br /><br />");
                        fileAnswerWriter.write(
                                "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +
                                        "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +
                                        String.valueOf(arguments2[j][0]) + " &nbsp; " + String.valueOf(arguments2[j][1]) + " &nbsp; " +
                                        String.valueOf(arguments2[j][2]) + " &nbsp; " + String.valueOf(arguments2[j][3]) + " &nbsp; " +
                                        String.valueOf(arguments2[j][4]) + "<br /><br />");

                    fileWriter.write("____ &nbsp; + &nbsp; ____ &nbsp; = &nbsp; " +
                                    (String.valueOf(arguments1[j][choosedNumbersOfAddend1[j][0]] + arguments1[j][choosedNumbersOfAddend1[j][1]])) +
                            "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +
                            " _____ &nbsp; + &nbsp; _____ &nbsp; =  " +
                            (String.valueOf(arguments2[j][choosedNumbersOfAddend2[j][0]] + arguments2[j][choosedNumbersOfAddend2[j][1]])) +
                            "<br /><br /><br /><br />");

                        fileAnswerWriter.write(String.valueOf(arguments1[j][choosedNumbersOfAddend1[j][0]]) +
                                " &nbsp; +  &nbsp; " + String.valueOf(arguments1[j][choosedNumbersOfAddend1[j][1]])
                                + " &nbsp; = &nbsp; " +
                                    (String.valueOf(arguments1[j][choosedNumbersOfAddend1[j][0]] + arguments1[j][choosedNumbersOfAddend1[j][1]])) +
                            "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " +
                                "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +

                                        String.valueOf(arguments2[j][choosedNumbersOfAddend2[j][0]]) +
                                        " &nbsp; +  &nbsp; " + String.valueOf(arguments2[j][choosedNumbersOfAddend2[j][1]])
                                        + " &nbsp; = &nbsp; " +
                                        (String.valueOf(arguments2[j][choosedNumbersOfAddend2[j][0]] + arguments2[j][choosedNumbersOfAddend2[j][1]])) +
                            "<br /><br /><br /><br />");

//                    fileWriter.write(String.valueOf(choosedNumbersOfAddend1[j][0] + 1) + " " + String.valueOf(choosedNumbersOfAddend1[j][1] + 1) +
//                            " &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
//                            + String.valueOf(choosedNumbersOfAddend2[j][0] + 1) + " " + String.valueOf(choosedNumbersOfAddend2[j][1] + 1) + "<br /><br />");

/*
                    outputStream.write(String.valueOf(argument1[j][i]).getBytes());
                    fileWriter.write(String.valueOf(argument1[j][i]));

                    outputStream.write(' ');
                    outputStream.write('+');
                    outputStream.write(' ');

                    fileWriter.write(" + ");

                    outputStream.write(String.valueOf(argument2[j][i]).getBytes());
                    fileWriter.write(String.valueOf(argument2[j][i]));

                    outputStream.write(' ');
                    outputStream.write('=');
                    outputStream.write(' ');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write(' ');
                    outputStream.write(' ');
                    outputStream.write(' ');

                    fileWriter.write(" = ____ &nbsp; &nbsp; &nbsp; ");

                    System.out.print(" " + argument1[j][i] + " + " + argument2[j][i] + " = _____   ");
*/
                    }
                    outputStream.write('\n');
                    outputStream.write('\n');
                    outputStream.write('\n');
                    fileWriter.write("<br /><br /><br />\n\n\n");
                    fileAnswerWriter.write("<br /><br /><br />\n\n\n");
//                    fileWriter.write("<br />\n");
//                    fileWriter.write("<br />\n");

//                    System.out.println();
//                    System.out.println();
//                    System.out.println();
//            }
                    outputStream.close();
                    fileWriter.close();
                    fileAnswerWriter.close();

        }

    }

    public static void chooseNumbersForSubtractionSentenceA4Worksheet(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                                                   String longTaskNameWorksheet, int numbersRangeStart, int numbersRangeEnd,
                                                                   int sum, int problemsLine) throws IOException {

        int numbersOfAddend = 5;  // the total numbers to choose from

        int[][] arguments1 = new int[problemsLine][numbersOfAddend];
        int[][] arguments2 = new int[problemsLine][numbersOfAddend];
        int[][] choosedNumbersOfAddend1 = new int[problemsLine][2];
        int[][] choosedNumbersOfAddend2 = new int[problemsLine][2];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;
                for (int j = 0; j < problemsLine; j++) {
                    choosedNumbersOfAddend1[j][0] = (int) (Math.random() * (numbersOfAddend - 1));
                    choosedNumbersOfAddend2[j][0] = (int) (Math.random() * (numbersOfAddend - 1));

                    if (choosedNumbersOfAddend1[j][0] == choosedNumbersOfAddend1[j][1]) {
                        if (choosedNumbersOfAddend1[j][0] == numbersOfAddend) choosedNumbersOfAddend1[j][0]--;
                        else choosedNumbersOfAddend1[j][0]++;
                    }
                    choosedNumbersOfAddend2[j][1] = (int) (Math.random() * (numbersOfAddend - 1));
                    choosedNumbersOfAddend2[j][1] = (int) (Math.random() * (numbersOfAddend - 1));

                    if (choosedNumbersOfAddend2[j][0] == choosedNumbersOfAddend2[j][1]) {
                        if (choosedNumbersOfAddend2[j][0] == (numbersOfAddend)) choosedNumbersOfAddend2[j][0]--;
                        else choosedNumbersOfAddend2[j][0]++;
                    }
                    for (int i = 0; i < numbersOfAddend; i++) {
                        arguments1[j][i] = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                        arguments2[j][i] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    }
                }

                    DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                            (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));

                    FileWriter fileWriter = new FileWriter(new File(workingFolder
                            + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
                    FileWriter fileAnswerWriter = new FileWriter(new File(workingFolder
                            + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));

                    for (int j = 0; j < problemsLine; j++) {
                        fileWriter.write(
                                String.valueOf(arguments1[j][0]) + " &nbsp; " + String.valueOf(arguments1[j][1]) + " &nbsp; " +
                                        String.valueOf(arguments1[j][2]) + " &nbsp; " + String.valueOf(arguments1[j][3]) + " &nbsp; " +
                                        String.valueOf(arguments1[j][4]));
                        fileAnswerWriter.write(
                                String.valueOf(arguments1[j][0]) + " &nbsp; " + String.valueOf(arguments1[j][1]) + " &nbsp; " +
                                        String.valueOf(arguments1[j][2]) + " &nbsp; " + String.valueOf(arguments1[j][3]) + " &nbsp; " +
                                        String.valueOf(arguments1[j][4]));
                        fileWriter.write(
                                "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +
                                        "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +
                                        String.valueOf(arguments2[j][0]) + " &nbsp; " + String.valueOf(arguments2[j][1]) + " &nbsp; " +
                                        String.valueOf(arguments2[j][2]) + " &nbsp; " + String.valueOf(arguments2[j][3]) + " &nbsp; " +
                                        String.valueOf(arguments2[j][4]) + "<br /><br />");
                        fileAnswerWriter.write(
                                "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +
                                        "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +
                                        String.valueOf(arguments2[j][0]) + " &nbsp; " + String.valueOf(arguments2[j][1]) + " &nbsp; " +
                                        String.valueOf(arguments2[j][2]) + " &nbsp; " + String.valueOf(arguments2[j][3]) + " &nbsp; " +
                                        String.valueOf(arguments2[j][4]) + "<br /><br />");

                    fileWriter.write("____ &nbsp; - &nbsp; ____ &nbsp; = &nbsp; " +
                                    (String.valueOf(Math.abs(arguments1[j][choosedNumbersOfAddend1[j][0]] - arguments1[j][choosedNumbersOfAddend1[j][1]]))) +
                            "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +
                            " _____ &nbsp; - &nbsp; _____ &nbsp; =  " +
                            (String.valueOf(Math.abs(arguments2[j][choosedNumbersOfAddend2[j][0]] - arguments2[j][choosedNumbersOfAddend2[j][1]]))) +
                            "<br /><br /><br /><br />");

                        fileAnswerWriter.write(String.valueOf(arguments1[j][choosedNumbersOfAddend1[j][0]]) +
                                " &nbsp; +  &nbsp; " + String.valueOf(arguments1[j][choosedNumbersOfAddend1[j][1]])
                                + " &nbsp; = &nbsp; " +
                                    (String.valueOf(arguments1[j][choosedNumbersOfAddend1[j][0]] - arguments1[j][choosedNumbersOfAddend1[j][1]])) +
                            "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" +

                                        String.valueOf(arguments2[j][choosedNumbersOfAddend2[j][0]]) +
                                        " &nbsp; +  &nbsp; " + String.valueOf(arguments2[j][choosedNumbersOfAddend2[j][1]])
                                        + " &nbsp; = &nbsp; " +
                                        (String.valueOf(arguments2[j][choosedNumbersOfAddend2[j][0]] - arguments2[j][choosedNumbersOfAddend2[j][1]])) +
                            "<br /><br /><br /><br />");

//                    fileWriter.write(String.valueOf(choosedNumbersOfAddend1[j][0] + 1) + " " + String.valueOf(choosedNumbersOfAddend1[j][1] + 1) +
//                            " &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
//                            + String.valueOf(choosedNumbersOfAddend2[j][0] + 1) + " " + String.valueOf(choosedNumbersOfAddend2[j][1] + 1) + "<br /><br />");

                    }
                    outputStream.write('\n');
                    outputStream.write('\n');
                    outputStream.write('\n');
                    fileWriter.write("<br /><br /><br />\n\n\n");
                    fileAnswerWriter.write("<br /><br /><br />\n\n\n");
                    outputStream.close();
                    fileWriter.close();
                    fileAnswerWriter.close();

        }
    }

/*
    Find a1 + b1 equals to given number
    Which sum is equals to 4

    5 + 3 =     2 + 1 =     4 + 2 =
     */
    public static void addA1_B1A4EqualsSumWorksheet(String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                               int numbersRangeStart, int numbersRangeEnd,  int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        int[] givenNumbers = new int[problemsLine];
        int[] correctAnswer = new int[problemsLine];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;


            for (int i = 0; i < problemsCol; i++)
                for (int j = 0; j < problemsLine; j++) {
                    argument1[j][i] = (int) (Math.random() * numbersRangeEnd/2 + numbersRangeStart);
                    argument2[j][i] = (int) (Math.random() * numbersRangeEnd/2 + numbersRangeStart);
                }

            for (int j = 0; j < problemsLine; j++) {
                givenNumbers[j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                correctAnswer[j] = (int) (Math.random() * problemsCol);
            }

            FileWriter fileWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
            FileWriter textWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));


            for (int i = 0; i < problemsLine; i++) {
                fileWriter.write("В каком примере или примерах сумма чисел равна = " + givenNumbers[i]  + "<br /><br /> " );
                textWriter.write("В каком примере или примерах сумма чисел равна = " + givenNumbers[i]  + "\n\n" );
                for (int j = 0; j < problemsCol; j++) {

                    if (correctAnswer[i] != j) {
                        fileWriter.write(String.valueOf(argument1[i][j]));
                        fileWriter.write(" + ");
                        fileWriter.write(String.valueOf(argument2[i][j]));
                        fileWriter.write(" =  &nbsp; &nbsp; &nbsp; ");
                        textWriter.write(String.valueOf(argument1[i][j]));
                        textWriter.write(" + ");
                        textWriter.write(String.valueOf(argument2[i][j]));
                        textWriter.write(" =     ");
                    }
                    else {

                        int tempArgument1 = (int) (Math.random() * givenNumbers[i]);
                        int tempArgument2 = givenNumbers[i] - tempArgument1;
                        fileWriter.write(tempArgument1 + " + " + tempArgument2);
                        fileWriter.write(" =  &nbsp; &nbsp; &nbsp; ");
                        textWriter.write(tempArgument1 + " + " + tempArgument2);
                        textWriter.write(" =     ");
                    }
                }
                fileWriter.write("<br /> <br /><br />\n\n\n");
                textWriter.write("\n\n\n");

            }
            textWriter.close();
            fileWriter.close();

        }
    }

/*
    Which is correct to 4 + 3 =

    [Pic1]  [Pic1]  [Pic1]  + [Pic1]  [Pic1]    [Pic1]  [Pic1]
    [Pic1]  [Pic1]  +  [Pic1]  [Pic1]  [Pic1]
    [Pic1]  [Pic1]  [Pic1]   [Pic1]  [Pic1]    [Pic1]  + [Pic1]
     */
    public static void addA1_B1A4WhichIsCorrectPictureWorksheet(String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                                   int numbersRangeStart, int numbersRangeEnd, int sum,
                                                   int problemsPerUnit, int totalLines) throws IOException {

        String[] shapes =  new String[6];
        shapes[0] = "triangle";
        shapes[1] = "square";
        shapes[2] = "rectangle";
        shapes[3] = "circle";
        shapes[4] = "diamond";
        shapes[5] = "oval";

        String[] shapesRus =  new String[6];
        shapesRus[0] = "Треугольник ";
        shapesRus[1] = "Квадрат ";
        shapesRus[2] = "Прямоугольник ";
        shapesRus[3] = "Круг ";
        shapesRus[4] = "Ромб ";
        shapesRus[5] = "Овал ";

        String[] colors =  new String[7];
        colors[0] = "yellow";
        colors[1] = "red";
        colors[2] = "green";
        colors[3] = "blue";
        colors[4] = "gray";
        colors[5] = "black";
        colors[6] = "orange";

        String[] colorsRus =  new String[7];
        colorsRus[0] = "желтый";
        colorsRus[1] = "красный";
        colorsRus[2] = "зеленый";
        colorsRus[3] = "синий";
        colorsRus[4] = "серый";
        colorsRus[5] = "черный";
        colorsRus[6] = "оранжевый";

        int[] argument1 = new int[totalLines];
        int[] argument2 = new int[totalLines];
        int[] shapeName = new int[totalLines];
        int[] shapeColorName = new int[totalLines];


        for (int k = 1; k < totalPageNumbers+1 ; k++) {
            pageNumber = k;
            for (int i = 0; i != totalLines; i++) {

                argument1[i] = (int) (Math.random() * numbersRangeEnd) + numbersRangeStart;
                argument2[i] = (int) (Math.random() * numbersRangeEnd) + numbersRangeStart;
                System.out.println(argument1[i] + "  " + argument2[i] + "  " + numbersRangeEnd + "   " + numbersRangeStart);

                shapeName[i] = (int) (Math.random() * 5);
                shapeColorName[i] = (int) (Math.random() * 6);
            }
            FileWriter textWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));

            for (int j = 0; j < totalLines; j++) {
                fileWriter.write("Задан пример: " +  argument1[j] + " + " + argument2[j] + " <br /><br />");

                for (int i = 0; i != argument1[j]; i++) {
                    fileWriter.write("<img src=\"C:\\Users\\Grigorii\\Documents\\Математика\\Shapes\\Single shapes - jpg\\");
                    fileWriter.write(shapes[shapeName[j]] + "_" + colors[shapeColorName[j]] + "_");
                    fileWriter.write("filled_noname_150_150.jpg\"  title = \"" + shortTaskNameWorksheet + "\" width=\"40\" height=\"40\">");
                }

                fileWriter.write(" <img src=\"C:\\Users\\Grigorii\\Documents\\Математика\\Shapes\\Single shapes - jpg\\plus_black_filled_noname_150_150" +
                        ".jpg\" width=\"40\" height=\"40\"> ");

                for (int i = 0; i != argument2[j]; i++) {
                    fileWriter.write("<img src=\"C:\\Users\\Grigorii\\Documents\\Математика\\Shapes\\Single shapes - jpg\\");
                    fileWriter.write(shapes[shapeName[j]] + "_" + colors[shapeColorName[j]] + "_");
                    fileWriter.write("filled_noname_150_150.jpg\" title = \"" + shortTaskNameWorksheet + "\" width=\"40\" height=\"40\">");
                }

                fileWriter.write(" <img src=\"C:\\Users\\Grigorii\\Documents\\Математика\\Shapes\\Single shapes - jpg\\equal_black_filled_noname_150_150" +
                        ".jpg\" width=\"40\" height=\"40\"> ");
                fileWriter.write("<br />\n");
                fileWriter.write("<br />\n");
            }

            textWriter.write('\n');
            textWriter.write('\n');
            textWriter.write('\n');
            fileWriter.write("<br />\n");
            fileWriter.write("<br />\n");
            fileWriter.write("<br />\n");

            System.out.println();
            System.out.println();
            System.out.println();

            textWriter.close();
            fileWriter.close();

        }
    }

/*
[Pic1]  [Pic1]  [Pic1]  + [Pic1]  [Pic1]    [Pic1]  [Pic1]  = ______
 */
    public static void addA1_B1A4PicturesWorksheet(String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                               int numbersRangeStart, int numbersRangeEnd, int sum,
                                               int problemsPerLine, int totalLines) throws IOException {

        String[] shapes =  new String[6];
        shapes[0] = "triangle";
        shapes[1] = "square";
        shapes[2] = "rectangle";
        shapes[3] = "circle";
        shapes[4] = "diamond";
        shapes[5] = "oval";

        String[] shapesRus =  new String[6];
        shapesRus[0] = "Треугольник ";
        shapesRus[1] = "Квадрат ";
        shapesRus[2] = "Прямоугольник ";
        shapesRus[3] = "Круг ";
        shapesRus[4] = "Ромб ";
        shapesRus[5] = "Овал ";

        String[] colors =  new String[7];
        colors[0] = "yellow";
        colors[1] = "red";
        colors[2] = "green";
        colors[3] = "blue";
        colors[4] = "gray";
        colors[5] = "black";
        colors[6] = "orange";

        String[] colorsRus =  new String[7];
        colorsRus[0] = "желтый";
        colorsRus[1] = "красный";
        colorsRus[2] = "зеленый";
        colorsRus[3] = "синий";
        colorsRus[4] = "серый";
        colorsRus[5] = "черный";
        colorsRus[6] = "оранжевый";

        int[] argument1 = new int[totalLines];
        int[] argument2 = new int[totalLines];
        int[] shapeName = new int[totalLines];
        int[] shapeColorName = new int[totalLines];

        for (int k = 1; k < totalPageNumbers+1 ; k++) {
            pageNumber = k;
            for (int i = 0; i != totalLines; i++) {
                argument1[i] = (int) (Math.random() * numbersRangeEnd) + numbersRangeStart;
                argument2[i] = (int) (Math.random() * numbersRangeEnd) + numbersRangeStart;
                System.out.println(argument1[i] + "  " + argument2[i] + "  " + numbersRangeEnd + "   " + numbersRangeStart);
                shapeName[i] = (int) (Math.random() * 5);
                shapeColorName[i] = (int) (Math.random() * 6);
            }
            FileWriter textWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));

            String text;

            for (int j = 0; j < totalLines; j++) {
                for (int i = 0; i != argument1[j]; i++) {
                    fileWriter.write("<img src=\"C:\\Users\\Grigorii\\Documents\\Математика\\Shapes\\Single shapes - jpg\\");
                    fileWriter.write(shapes[shapeName[j]] + "_" + colors[shapeColorName[j]] + "_");
//                    fileWriter.write("filled_noname_150_150.jpg\"  alt=\"" + shapesRus[j] + colorsRus[j] + "\" title = \"" + shortTaskNameWorksheet + "\" width=\"40\" height=\"40\">");
                    fileWriter.write("filled_noname_150_150.jpg\"  title = \"" + shortTaskNameWorksheet + "\" width=\"40\" height=\"40\">");
                }
                fileWriter.write(" <img src=\"C:\\Users\\Grigorii\\Documents\\Математика\\Shapes\\Single shapes - jpg\\plus_black_filled_noname_150_150" +
                        ".jpg\" width=\"40\" height=\"40\"> ");
                for (int i = 0; i != argument2[j]; i++) {
                    fileWriter.write("<img src=\"C:\\Users\\Grigorii\\Documents\\Математика\\Shapes\\Single shapes - jpg\\");
                    fileWriter.write(shapes[shapeName[j]] + "_" + colors[shapeColorName[j]] + "_");
//                    fileWriter.write("filled_noname_150_150.jpg\"  alt=\"" + shapesRus[j] + colorsRus[j] + "\" title = \"" + shortTaskNameWorksheet + "\" width=\"40\" height=\"40\">");
                    fileWriter.write("filled_noname_150_150.jpg\" title = \"" + shortTaskNameWorksheet + "\" width=\"40\" height=\"40\">");
                }
                fileWriter.write(" <img src=\"C:\\Users\\Grigorii\\Documents\\Математика\\Shapes\\Single shapes - jpg\\equal_black_filled_noname_150_150" +
                        ".jpg\" width=\"40\" height=\"40\"> ");
                fileWriter.write("<br />\n");
                fileWriter.write("<br />\n");
            }

            textWriter.write('\n');
            textWriter.write('\n');
            textWriter.write('\n');
            fileWriter.write("<br />\n");
            fileWriter.write("<br />\n");
            fileWriter.write("<br />\n");

            System.out.println();
            System.out.println();
            System.out.println();

            textWriter.close();
            fileWriter.close();

        }
    }

/*
Bottom block txt and html format
 */
    public static void bottomWorksheet(String workingFolder, String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                       String longTaskNameWorksheet) throws IOException {

        for (int i = 1; i < totalPageNumbers ; i++) {
            pageNumber = i;

            FileWriter writer = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bottomTxtBlock__" + ".txt", true);

            FileWriter writerHtml = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bottomHtmlBlock__" + ".html", true);

            BufferedWriter bufferWriter = new BufferedWriter(writer);
            BufferedWriter bufferHtml = new BufferedWriter(writerHtml);
            String text, htmlText;
            text = "__________________________________________________________________________________\n\n";
//            htmlText = "___________________________________________________________________________<br /><br />\n\n";
            htmlText = "___________________________________________________________________________<br />\n\n";
            bufferWriter.write(text);
            bufferHtml.write(htmlText);
//            System.out.println(text);
//            text = siteNameLeftBottom + "                          " + siteNameRightBottom + "\n\n";
//            htmlText = siteNameLeftBottom + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " + siteNameRightBottom + "<br /><br />\n\n";
/*
            if (grade.contains("&nbsp") || grade.contains("G")) {
                text = "https://mathematics-at-school.com" + "                          " + "e-mail: admin@mathematics-at-school.com" + "\n\n";
                htmlText = "https://mathematics-at-school.com" + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " +
                        "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" + "e-mail: admin@mathematics-at-school.com" +
                        "<br /><br /> \n\n\n";
            }
            else  {
                text = "https://mathematics-tests.com" + "                          " + "https://magazin-integral.ru" + "\n\n";
                htmlText = "https://mathematics-tests.com" + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " +
                        "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " + "https://magazin-integral.ru" +
                        "<br /><br /> \n \n\n";
            }
            bufferWriter.write(text);
            bufferHtml.write(htmlText);
//            System.out.println(text);
*/
            bufferWriter.close();
            bufferHtml.close();
        }
    }

    public static void fullWorksheet(String workinFolder, String readyFilesFolder, String grade, int totalPageNumbers,
                                     String shortTaskNameWorksheet, String longTaskNameWorksheet) throws IOException {

        for (int i = 1; i < totalPageNumbers ; i++) {
            pageNumber = i;

            String outputHtmlFile1 = " ", outputHtmlAnswerFile1 = " ";
            if (grade.contains("&nbsp") || grade.contains("G")) {
                outputHtmlFile1 = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + " .html";
                outputHtmlAnswerFile1= readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + ". Answers .html";

            } else {
                outputHtmlFile1 = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + " .html";
                outputHtmlAnswerFile1= readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + ". Ответы .html";
            }

            OutputStream outputHtmlFile = new FileOutputStream(new File(outputHtmlFile1), true);
            OutputStream outputHtmlAnswerFile = new FileOutputStream(new File(outputHtmlAnswerFile1), true);

            byte[] buffer = new byte[1 << 20];  // loads 1 MB of the file
            int count;
            String pageBreak = "<br style=\"page-break-after: always\">";

// Html Answer part
            InputStream inputHtmlAnswerFile = new FileInputStream(workinFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topHtmlBlock__" + ".html");

            while ((count = inputHtmlAnswerFile.read(buffer)) != -1) {
                outputHtmlAnswerFile.write(buffer, 0, count);
                outputHtmlAnswerFile.flush();
            }

            inputHtmlAnswerFile = new FileInputStream(workinFolder + grade + " "
                    + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html");
            while ((count = inputHtmlAnswerFile.read(buffer)) != -1) {
                outputHtmlAnswerFile.write(buffer, 0, count);
                outputHtmlAnswerFile.flush();
            }
            inputHtmlAnswerFile = new FileInputStream(workinFolder + grade + " "
                    + longTaskNameWorksheet + " Стр. " + pageNumber + "bottomHtmlBlock__" + ".html");

            while ((count = inputHtmlAnswerFile.read(buffer)) != -1) {
                outputHtmlAnswerFile.write(buffer, 0, count);
                outputHtmlAnswerFile.flush();
            }
            inputHtmlAnswerFile.close();
            outputHtmlAnswerFile.close();

// Html part
            InputStream inputHtmlFile = new FileInputStream(workinFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topHtmlBlock__" + ".html");

            while ((count = inputHtmlFile.read(buffer)) != -1) {
                outputHtmlFile.write(buffer, 0, count);
                outputHtmlFile.flush();
            }

            inputHtmlFile = new FileInputStream(workinFolder + grade + " "
                    + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html");
            while ((count = inputHtmlFile .read(buffer)) != -1) {
                outputHtmlFile.write(buffer, 0, count);
                outputHtmlFile.flush();
            }
            inputHtmlFile = new FileInputStream(workinFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bottomHtmlBlock__" + ".html");

            while ((count = inputHtmlFile.read(buffer)) != -1) {
                outputHtmlFile.write(buffer, 0, count);
                outputHtmlFile.flush();
            }
            inputHtmlFile.close();
            outputHtmlFile.close();


            //Copying files for pdf and jpg conversation
//            if (grade.contains("&nbsp") || grade.contains("G")) {
//                Path source = Paths.get(readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + " .html");
//                Path destination = Paths.get(readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + " for PDF .html");
//                Files.copy(source, destination);
//
//
//            } else {
//                Path source = Paths.get(readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + " .html");
//                Path destination = Paths.get(readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + " for PDF .html");
//                Files.copy(source, destination);
//
//            }

        }
    }

    public static void fullWorksheetHtmlAnswer(String workinFolder, String readyFilesFolder, String grade, int totalPageNumbers,
                                     String shortTaskNameWorksheet, String longTaskNameWorksheet) throws IOException {

        for (int i = 1; i < totalPageNumbers ; i++) {
            pageNumber = i;

            String outputHtmlFile1 = " ", outputHtmlAnswerFile1 = " ";
            if (grade.contains("&nbsp") || grade.contains("G")) {
//                outputHtmlFile1 = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + " .html";
                outputHtmlAnswerFile1= readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + ". AnswersOnly .html";

            } else {
//                outputHtmlFile1 = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + " .html";
                outputHtmlAnswerFile1= readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + ". ТолькоОтветы .html";
            }

//            OutputStream outputHtmlFile = new FileOutputStream(new File(outputHtmlFile1), true);
            OutputStream outputHtmlAnswerFile = new FileOutputStream(new File(outputHtmlAnswerFile1), true);

            byte[] buffer = new byte[1 << 20];  // loads 1 MB of the file
            int count;
//            String pageBreak = "<br style=\"page-break-after: always\">";

// Html Answer part
            InputStream inputHtmlAnswerFile = new FileInputStream(workinFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topHtmlAnswerBlock__" + ".html");

            while ((count = inputHtmlAnswerFile.read(buffer)) != -1) {
                outputHtmlAnswerFile.write(buffer, 0, count);
                outputHtmlAnswerFile.flush();
            }

            inputHtmlAnswerFile = new FileInputStream(workinFolder + grade + " "
                    + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html");
            while ((count = inputHtmlAnswerFile.read(buffer)) != -1) {
                outputHtmlAnswerFile.write(buffer, 0, count);
                outputHtmlAnswerFile.flush();
            }
            inputHtmlAnswerFile = new FileInputStream(workinFolder + grade + " "
                    + longTaskNameWorksheet + " Стр. " + pageNumber + "bottomHtmlBlock__" + ".html");

            while ((count = inputHtmlAnswerFile.read(buffer)) != -1) {
                outputHtmlAnswerFile.write(buffer, 0, count);
                outputHtmlAnswerFile.flush();
            }
            inputHtmlAnswerFile.close();
            outputHtmlAnswerFile.close();

// Html part
//            InputStream inputHtmlFile = new FileInputStream(workinFolder
//                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topHtmlBlock__" + ".html");
//
//            while ((count = inputHtmlFile.read(buffer)) != -1) {
//                outputHtmlFile.write(buffer, 0, count);
//                outputHtmlFile.flush();
//            }
//
//            inputHtmlFile = new FileInputStream(workinFolder + grade + " "
//                    + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html");
//            while ((count = inputHtmlFile .read(buffer)) != -1) {
//                outputHtmlFile.write(buffer, 0, count);
//                outputHtmlFile.flush();
//            }
//            inputHtmlFile = new FileInputStream(workinFolder
//                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bottomHtmlBlock__" + ".html");
//
//            while ((count = inputHtmlFile.read(buffer)) != -1) {
//                outputHtmlFile.write(buffer, 0, count);
//                outputHtmlFile.flush();
//            }
//            inputHtmlFile.close();
//            outputHtmlFile.close();


            //Copying files for pdf and jpg conversation
//            if (grade.contains("&nbsp") || grade.contains("G")) {
//                Path source = Paths.get(readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + " .html");
//                Path destination = Paths.get(readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + " for PDF .html");
//                Files.copy(source, destination);
//
//
//            } else {
//                Path source = Paths.get(readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + " .html");
//                Path destination = Paths.get(readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + " for PDF .html");
//                Files.copy(source, destination);
//
//            }

        }
    }


    public static void fullWorksheetPdf(String workinFolder, String readyFilesFolder, String grade, int totalPageNumbers,
                                     String shortTaskNameWorksheet, String longTaskNameWorksheet) throws IOException {

//        readyFilesFolder = "d:/Java_Math/Pdf/";



        for (int i = 1; i < totalPageNumbers ; i++) {
            pageNumber = i;

            String outputHtmlFile1 = " ", outputHtmlAnswerFile1 = " ";
            if (grade.contains("&nbsp") || grade.contains("G")) {
//                outputHtmlFile1 = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + " .Pdf.html";
//                outputHtmlAnswerFile1= readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + ". Answers .Pdf.html";
                outputHtmlFile1 = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + ".html";
                outputHtmlAnswerFile1= readyFilesFolder + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + ". Answers.html";

            } else {
//                outputHtmlFile1 = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + " .html";
//                outputHtmlAnswerFile1= readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + ". Ответы .html";
                outputHtmlFile1 = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + ".html";
                outputHtmlAnswerFile1= readyFilesFolder + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + ". Ответы.html";
            }

            OutputStream outputHtmlFile = new FileOutputStream(new File(outputHtmlFile1), true);
            OutputStream outputHtmlAnswerFile = new FileOutputStream(new File(outputHtmlAnswerFile1), true);

            byte[] buffer = new byte[1 << 20];  // loads 1 MB of the file
            int count;
//            String pageBreak = "<br style=\"page-break-after: always\">";

// Html Answer part

            InputStream inputHtmlAnswerFile = new FileInputStream(workinFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topPdfBlock__" + ".html");

            while ((count = inputHtmlAnswerFile.read(buffer)) != -1) {

                outputHtmlAnswerFile.write(buffer, 0, count);
                outputHtmlAnswerFile.flush();
            }

            inputHtmlAnswerFile = new FileInputStream(workinFolder + grade + " "
                    + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html");
            while ((count = inputHtmlAnswerFile.read(buffer)) != -1) {
                outputHtmlAnswerFile.write(buffer, 0, count);
                outputHtmlAnswerFile.flush();
            }
            inputHtmlAnswerFile = new FileInputStream(workinFolder + grade + " "
                    + longTaskNameWorksheet + " Стр. " + pageNumber + "bottomHtmlBlock__" + ".html");

            while ((count = inputHtmlAnswerFile.read(buffer)) != -1) {
                outputHtmlAnswerFile.write(buffer, 0, count);
                outputHtmlAnswerFile.flush();
            }
            inputHtmlAnswerFile.close();
            outputHtmlAnswerFile.close();

// Html part
            InputStream inputHtmlFile = new FileInputStream(workinFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "topPdfBlock__" + ".html");

            while ((count = inputHtmlFile.read(buffer)) != -1) {
                outputHtmlFile.write(buffer, 0, count);
                outputHtmlFile.flush();
            }

            inputHtmlFile = new FileInputStream(workinFolder + grade + " "
                    + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html");
            while ((count = inputHtmlFile .read(buffer)) != -1) {
                outputHtmlFile.write(buffer, 0, count);
                outputHtmlFile.flush();
            }
            inputHtmlFile = new FileInputStream(workinFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bottomHtmlBlock__" + ".html");

            while ((count = inputHtmlFile.read(buffer)) != -1) {
                outputHtmlFile.write(buffer, 0, count);
                outputHtmlFile.flush();
            }
            inputHtmlFile.close();
            outputHtmlFile.close();

            //Copy bat file for creating pdf
            File sourceFile = new File("D:\\Java_Math\\UsefullScripts\\htmlToPdfBatScript.bat");
            File destinationFile = new File("D:\\Java_Math\\Pdf\\htmlToPdfBatScript.bat");
            FileUtils.copyFile(sourceFile, destinationFile);

            //Clear the filenames


//            PDDocument doc111 = PDDocument.load(new File(outputHtmlFile1));
//            doc111.print();

        }
    }

/*
All same Worksheets together
 */
    public static void allSameWorksheets(String workingFolder, String readyFilesFolder, String grade, int totalPageNumbers,
                                         String shortTaskNameWorksheet, String longTaskNameWorksheet) throws IOException {

//        OutputStream os = new FileOutputStream(new File(readyFilesFolder
//                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber +  " allSameWorksheets__" + ".txt"), true);
        String realPath = "", realPathAnswers = "";
        realPath = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Сборник из " + (totalPageNumbers - 1) + " вариантов .html";
        realPathAnswers = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Сборник из " + (totalPageNumbers - 1) + " вариантов. Ответы .html";

        if (grade.contains("&nbsp") || grade.contains("G")) {
            realPath = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Pack of " + (totalPageNumbers - 1) + " versions .html";
            realPathAnswers = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Pack of " + (totalPageNumbers - 1) + " versions. Answers .html";


        }

        OutputStream os1 = new FileOutputStream(new File(realPath), true);
        OutputStream os2 = new FileOutputStream(new File(realPathAnswers), true);

        System.out.println("-----------" + grade);
        for (int pageNumber = 1; pageNumber < totalPageNumbers; pageNumber++) {


//            InputStream in = new FileInputStream(readyFilesFolder
//                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + " fullWorksheet__" + ".txt");

            if (grade.contains("&nbsp") || grade.contains("G")) {
                InputStream in1 = new FileInputStream(readyFilesFolder
                        + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + " .html");

                InputStream in2 = new FileInputStream(readyFilesFolder
                        + grade + " " + longTaskNameWorksheet + " Version " + pageNumber + ". Answers .html");

                byte[] buffer = new byte[1 << 20];  // loads 1 MB of the file
                int count1;
                while ((count1 = in1.read(buffer)) != -1) {
                    os1.write(buffer, 0, count1);
                    os1.flush();
                }
                int count2;
                while ((count2 = in2.read(buffer)) != -1) {
                    os2.write(buffer, 0, count2);
                    os2.flush();
                }



            } else {
                InputStream in1 = new FileInputStream(readyFilesFolder
                        + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + " .html");
                InputStream in2 = new FileInputStream(readyFilesFolder
                        + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + ". ТолькоОтветы .html");

                byte[] buffer = new byte[1 << 20];  // loads 1 MB of the file
                int count1;
                while ((count1 = in1.read(buffer)) != -1) {
                    os1.write(buffer, 0, count1);
                    os1.flush();
                }
                int count2;
                while ((count2 = in2.read(buffer)) != -1) {
                    os2.write(buffer, 0, count2);
                    os2.flush();
                }


            }


//            if (grade.contains("&nbsp") || grade.contains("G")) {
//                InputStream in2 = new FileInputStream(readyFilesFolder
//                        + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + ". Ответы .html");
//            } else {
//                InputStream in2 = new FileInputStream(readyFilesFolder
//                        + grade + " " + longTaskNameWorksheet + " Вариант " + pageNumber + ". Ответы .html");
//
//            }

//            byte[] buffer = new byte[1 << 20];  // loads 1 MB of the file
//            int count1;
//            while ((count1 = in1.read(buffer)) != -1) {
//                os1.write(buffer, 0, count1);
//                os1.flush();
//            }
//            int count2;
//            while ((count2 = in2.read(buffer)) != -1) {
//                os2.write(buffer, 0, count2);
//                os2.flush();
//            }
            System.out.println(" Завершена тема: " + longTaskNameWorksheet + " Стр. " + pageNumber);
        }
//        os.close();
        os1.close();
        os2.close();

    }

/*
Final html page
 */
    public static void finalHtmlPageSingleTopic(String workingFolder, String readyFilesFolder, String grade, int totalPageNumbers, String topic,
                                         String h2, String shortTaskNameWorksheet, String longTaskNameWorksheet) throws IOException {

//        OutputStream os = new FileOutputStream(new File(readyFilesFolder
//                + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber +  " allSameWorksheets__" + ".txt"), true);
        String realPath = "", realPathPdf = "";
        realPath = General.readyFilesFolderHtml + grade + " " + longTaskNameWorksheet + " Готовая страница с ответами .html";
        realPathPdf = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Готовая страница с ответами для Pdf.html";
//        realPathAnswers = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Сборник из " + (totalPageNumbers - 1) + " вариантов. Ответы .html";

        if (grade.contains("&nbsp") || grade.contains("G")) {
            realPath = General.readyFilesFolderHtml + grade + " " + longTaskNameWorksheet + " Ready page with answers .html";
            realPathPdf = readyFilesFolder + grade + " " + longTaskNameWorksheet + " Ready page with answers for Pdf.html";

        }

        OutputStream os1 = new FileOutputStream(new File(realPath), true);
        OutputStream os1Pdf = new FileOutputStream(new File(realPathPdf), true);

        System.out.println("-----------" + grade);
//        for (int pageNumber = 1; pageNumber < totalPageNumbers; pageNumber++) {


//            InputStream in = new FileInputStream(readyFilesFolder
//                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + " fullWorksheet__" + ".txt");

            if (grade.contains("&nbsp") || grade.contains("G")) {
                InputStream in1 = new FileInputStream(readyFilesFolder
                        + grade + " " + longTaskNameWorksheet + " Pack of " + (totalPageNumbers - 1) + " versions .html");

                InputStream in2 = new FileInputStream(readyFilesFolder
                        + grade + " " + longTaskNameWorksheet + " Pack of " + (totalPageNumbers - 1) + " versions. Answers .html");
                String h1Tag = "<h1>Mathematics. " + grade + " " + topic + "</h1>\n";
                String h2Tag = "<h2>" + h2 + "</h2>\n";
                String otherLines = "";

                BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(realPath));
                bufferedWriter.write(h1Tag);
                bufferedWriter.write(h2Tag);
                otherLines = "<br /><h4>Additional resources for free download<br /> (Google Drive)</h4> \n";
                bufferedWriter.write(otherLines);
                otherLines = "<hr> <br /> <strong>Download:</strong> <a href=\"" + General.googleDrive + "\" title =\"" + grade + " " + topic + " " +
                        longTaskNameWorksheet + "\">" + longTaskNameWorksheet + "</a> (PDF or JPG) <br /><br /> <hr> \n";

                bufferedWriter.write(otherLines);
                otherLines = " <br /><br /> Google Ads block <br /> \n";
                bufferedWriter.write(otherLines);
                bufferedWriter.close();


                byte[] buffer = new byte[1 << 20];  // loads 1 MB of the file
                int count1;
                while ((count1 = in1.read(buffer)) != -1) {
                    os1.write(buffer, 0, count1);
                    os1Pdf.write(buffer, 0, count1);
                    os1.flush();
                    os1Pdf.flush();
                }

                int count2;
                while ((count2 = in2.read(buffer)) != -1) {
                    os1.write(buffer, 0, count2);
                    os1Pdf.write(buffer, 0, count2);
                    os1.flush();
                    os1Pdf.flush();
                }

            } else {
                InputStream in1 = new FileInputStream(readyFilesFolder
                        + grade + " " + longTaskNameWorksheet + " Сборник из " + (totalPageNumbers - 1) + " вариантов .html");
//                readyFilesFolder + grade + " " + longTaskNameWorksheet + " Сборник из " + (totalPageNumbers - 1) + " вариантов .html";
//
                InputStream in2 = new FileInputStream(readyFilesFolder
                        + grade + " " + longTaskNameWorksheet + " Сборник из " + (totalPageNumbers - 1) + " вариантов. Ответы .html");

                String h1Tag = "<h1>Математика. " + grade + " " + topic + "</h1> \n";
                String h2Tag = "<h2>" + h2 + "</h2>\n";
                String otherLines = "";

                BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(realPath));
                bufferedWriter.write(h1Tag);
                bufferedWriter.write(h2Tag);
                otherLines = "<br /><h4>Дополнительные материалы для свободного скачивания<br /> (Google Drive или Яндекс Диск)</h4> \n";
                bufferedWriter.write(otherLines);
                otherLines = "<hr> <br /> <strong>Скачать:</strong> <a href=\"" + General.yandexDisk +"\" title =\"" + grade + " " + topic + " " +
                        longTaskNameWorksheet + "\">" + longTaskNameWorksheet + "</a> (Формат PDF или JPG) <br /><br /> <hr>\n";
                bufferedWriter.write(otherLines);

                otherLines = " <br /><br /> Google Ads block <br /> \n";
                bufferedWriter.write(otherLines);

                bufferedWriter.close();

                byte[] buffer = new byte[1 << 20];  // loads 1 MB of the file
                int count1;
                while ((count1 = in1.read(buffer)) != -1) {
                    os1.write(buffer, 0, count1);
                    os1Pdf.write(buffer, 0, count1);
                    os1.flush();
                    os1Pdf.flush();
                }
                int count2;
                while ((count2 = in2.read(buffer)) != -1) {
                    os1.write(buffer, 0, count2);
                    os1Pdf.write(buffer, 0, count2);
                    os1.flush();
                    os1Pdf.flush();
                }
            }

            System.out.println(" Завершена тема: " + longTaskNameWorksheet + " Стр. " + pageNumber);
        os1.close();
        os1Pdf.close();
    }

/*
    Fill in the small block

    a1 + b1 = _____     a2 + b2 = _____     a3 + b3 = ______    a4 + b4 = _____     a5 + b5 = _____

     */
    public static void addA1_B1LineSmallBlock(String grade, String shortTaskNameWorksheet,
           int numbersRangeStart, int numbersRangeEnd, int sum, int problemsPerLine) throws IOException {

        for (int j = 0; j < problemsPerLine; j++) {
                argument1[j][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument2[j][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
         }

        FileWriter outputTxtFile = new FileWriter(new File
                ("D:\\mathematics-at-school.com\\JavaTemplates/" + grade + " " + shortTaskNameWorksheet +
                        " Стр. " + pageNumber + "lineSmallBloc__" + ".txt"), true);

        FileWriter outputHtmlFile = new FileWriter(new File
                ("D:\\mathematics-at-school.com\\JavaTemplates/" + grade + " " + shortTaskNameWorksheet +
                        " Стр. " + pageNumber +  "lineSmallBloc__" + ".html"), true);

        outputHtmlFile.write(shortTaskNameWorksheet + "<br /><br />\n\n");
        outputTxtFile.write(shortTaskNameWorksheet + "\n\n");
        for (int j = 0; j < problemsPerLine; j++) {
            outputTxtFile.write(argument1[j][0] + " + " + argument2[j][0] + " = _____    ");
            outputHtmlFile.write(argument1[j][0] + " + " + argument2[j][0] + " = _____ &nbsp; &nbsp; &nbsp; ");
        }
        outputTxtFile.write("\n\n\n\n");
        outputHtmlFile.write("<br /><br /><br />\n");
        outputTxtFile.close();
        outputHtmlFile.close();

    }

    public static Set<Integer> realRandom(Integer start, Integer end, Integer totalRandomNumbers) {

        Set<Integer> randomInteger = new HashSet<>();

        while (randomInteger.size() != totalRandomNumbers)
            randomInteger.add((int) (Math.random() * (end - start)) + start);
        return randomInteger;
    }

    public static TreeSet<Integer> orderedRealRandom(Integer start, Integer end, Integer totalRandomNumbers) {

        TreeSet<Integer> randomInteger = new TreeSet<>();

        while (randomInteger.size() != totalRandomNumbers)
            randomInteger.add((int) (Math.random() * (end - start)) + start);
        return randomInteger;
    }


}

