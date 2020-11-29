package MathPackage;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Matrix {

//    int gradeNUmber;
//    String taskShortName;
//    String taskLongName;
//    int     numberRangeStart;
//    int     numberRangeEnd;

    //Main matrix template
    static int problemsPerLine = 5;
    static int problemsPerRows = 20;
    static Integer[][] argument1 = new Integer[problemsPerLine][problemsPerRows];
    static Integer[][] argument2 = new Integer[problemsPerLine][problemsPerRows];
    static int numbersRangeStart = 10;
    static int numbersRangeEnd = 90;

    static int pageNumber = 1;
    static String grade = "";
    static String shortTaskNamePage = "";
    static String shortTaskNameWorksheet = "";
    static String longTaskNameWorksheet = "";
    static String longTaskNamePage = "Задачи на сложение и вычитание. Однозначные числа, двузначные числа. Текстовые задачи. Скачать в pdf и jpg";
//    static String siteNameLeftBottom= "";
//    static String siteNameRightBottom = "";
    static String longTaskNameHeader = "";
    static int totalWorksheetsVariants = 0;


    public static void main(String[] args) throws IOException {

//        grade = "1 класс.";
        // Initialization
        grade = "1 класс.";

        shortTaskNamePage = "Сложение и вычитание чисел в столбик";
        longTaskNamePage = "Задачи на сложение и вычитание. Однозначные числа, двузначные числа. Текстовые задачи. Скачать в pdf и jpg";


        shortTaskNameWorksheet = "Сложение и вычитание двузначных чисел.";
        pageNumber = 1;
        totalWorksheetsVariants = 6;
        longTaskNameWorksheet = "Сложи и вычити двузначные числа. ";
        longTaskNameHeader = "Задачи с ответами на тему: Сложение двух двузначных чисел.";
//        siteNameLeftBottom = "https://mathematics-tests.com";
//        siteNameRightBottom = "https://magazin-integral.ru";

         emptyFolder("D:\\mathematics-at-school.com\\JavaTemplates/");
//         addA1_B1A4LineBlock(numbersRangeStart, numbersRangeEnd);
//         pageHeader();


//        for (int i = 1; i != totalWorksheetsVariants; i++) {
            pageNumber = 3;
            addA1_B1A4ColumnWorksheet(grade, pageNumber, shortTaskNameWorksheet,
                    numbersRangeStart, numbersRangeEnd, 0, 5, 20);
/*
            topWorksheet( grade, pageNumber, shortTaskNameWorksheet, longTaskNameWorksheet );
            addA1_B1A4LineWorksheet(grade, pageNumber, shortTaskNameWorksheet,
                    numbersRangeStart, numbersRangeEnd, 0, 5, 20);
            bottomWorksheet(grade, pageNumber, shortTaskNameWorksheet, longTaskNameWorksheet);
            fullWorksheet(grade, pageNumber, shortTaskNameWorksheet);
//        }
            allSameWorksheets(grade, pageNumber, shortTaskNameWorksheet);
*/

/*
        for (int i = 1; i < 7; i++) {

            pageNumber = i;
            Matrix.topTxtBlock();
            Matrix.a1_plus_b1_A4TxtBlock(numbersRangeStart,numbersRangeEnd);
            Matrix.bottomTxtBlock();
            Matrix.fullTxtBlock();
        }
*/
    }


// Empty destination folder
    public static void emptyFolder(String folder) {

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

/*
Top part of worksheets: txt and html
 */
    public static void topWorksheet(String grade, int totalPageNumbers, String shortTaskNameWorksheet,
    String longTaskNameWorksheet) throws IOException {

        for (int i = 1; i < totalPageNumbers ; i++) {
            pageNumber = i;

        FileWriter writer = new FileWriter("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "topTxtBlock__" + ".txt");
        FileWriter writerHtml = new FileWriter("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "topHtmlBlock__" + ".html");
        String text,htmlText;

        text = grade + " " + shortTaskNameWorksheet + " Вариант № " + pageNumber + "\n\n";
        htmlText = "\n\n<br /><br />" + grade + " " + shortTaskNameWorksheet + " Вариант № " + pageNumber + "\n\n<br /><br />";
        System.out.println(text);
        writer.write(text);
        writerHtml.write(htmlText);
            text = "Дата: ______________ ФИО: ______________________________________ Оценка:__________\n\n";
        htmlText = "Дата: ______________ ФИО: _________________________________ Оценка:__________\n\n<br /><br />";
        System.out.println(text);
        writer.write(text);
        writerHtml.write(htmlText);
        text = longTaskNameWorksheet + "\n\n";
        htmlText = longTaskNameWorksheet + "\n\n<br /><br />";
        System.out.println(text);
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

    public static void addA1_B1A4ColumnWorksheet(String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                               int numbersRangeStart, int numbersRangeEnd, int sum,
                                               int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;


            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    System.out.println(i + " " + j + " " + argument1[i][j] + " " + argument1[i][j]);
                }

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    ("D:\\mathematics-at-school.com\\JavaTemplates/" + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__"
                            + ".txt"));
            FileWriter fileWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));

            String text;

            fileWriter.write(
                    "<table> <tr><td colspan=\"7\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {

                fileWriter.write("<tr align=\"right\">");
                for (int j = 0; j < problemsCol; j++) {
                    fileWriter.write("<td> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " + argument1[i][j] + "</td>");
                }
                fileWriter.write("</tr> \n");

                fileWriter.write("<tr align=\"right\">");
                for (int j = 0; j < problemsCol; j++) {
                    fileWriter.write("<td> &nbsp; + " + argument2[i][j] + "</td>");
                }
                fileWriter.write("</tr> \n");

                fileWriter.write("<tr align=\"right\">");
                for (int j = 0; j < problemsCol; j++) {
                    fileWriter.write("<td> ----- </td>");
                }
                fileWriter.write("</tr> \n");

                fileWriter.write("<tr align=\"right\">");
                for (int j = 0; j < problemsCol; j++) {
                    fileWriter.write("<td> ... </td>");

                }
                fileWriter.write("</tr> \n");

                fileWriter.write(
                        " <tr><td colspan=\"7\"><br /></td></tr>"
                 );
            }

//                    System.out.print(" " + argument1[j][i] + " + " + argument2[j][i] + " = _____   ");
//                }
//                outputStream.write('\n');
//                outputStream.write('\n');
//                outputStream.write('\n');

                fileWriter.write(
                        "</table>"
                );



            outputStream.close();
            fileWriter.close();

        }
    }

    /*
    Fill in the math problems for A4 page

    a11 + b11 = _____     a21 + b21 = _____     a31 + b31 = ______    a41 + b41 = _____     a51 + b51 = _____
    a12 + b12 = _____     a22 + b22 = _____     a32 + b32 = ______    a42 + b42 = _____     a52 + b52 = _____
    ...

     */

    public static void addA1_B1A4LineWorksheet(String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                           int numbersRangeStart, int numbersRangeEnd, int sum,
                                           int problemsPerLine, int problemsPerRows) throws IOException {

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;


            for (int i = 0; i < problemsPerRows; i++)
                for (int j = 0; j < problemsPerLine; j++) {
                    argument1[j][i] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[j][i] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                }

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    ("D:\\mathematics-at-school.com\\JavaTemplates/" + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__"
                            + ".txt"));
            FileWriter fileWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));

            String text;

            for (int i = 0; i < problemsPerRows; i++) {
                for (int j = 0; j < problemsPerLine; j++) {

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
                }
                outputStream.write('\n');
                outputStream.write('\n');
                outputStream.write('\n');
                fileWriter.write("<br />\n");
                fileWriter.write("<br />\n");
                fileWriter.write("<br />\n");

                System.out.println();
                System.out.println();
                System.out.println();
            }
            outputStream.close();
            fileWriter.close();

        }
    }


    /*
    Find a1 + b1 equals to given number
    Which sum is equals to 4

    5 + 3 =     2 + 1 =     4 + 2 =
     */

    public static void addA1_B1A4EqualsSumWorksheet(String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                               int numbersRangeStart, int numbersRangeEnd, int sum,
                                               int problemsLine, int problemsCol) throws IOException {

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

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    ("D:\\mathematics-at-school.com\\JavaTemplates/" + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__"
                            + ".txt"));
            FileWriter fileWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));

//            String text;

            for (int i = 0; i < problemsLine; i++) {
                fileWriter.write("В каком примере сумма чисел равна = " + givenNumbers[i] + "  " + correctAnswer[i] + "<br /><br /> " );
                for (int j = 0; j < problemsCol; j++) {

                    if (correctAnswer[i] != j) {
                        fileWriter.write(String.valueOf(argument1[i][j]));
                        fileWriter.write(" + ");
                        fileWriter.write(String.valueOf(argument2[i][j]));
                        fileWriter.write(" =  &nbsp; &nbsp; &nbsp; ");
                    }
                    else {
                        fileWriter.write(" ПР ");
                    }
                }
//                outputStream.write('\n');
//                outputStream.write('\n');
//                outputStream.write('\n');
                fileWriter.write("<br /> <br /><br />\n\n\n");

            }
            outputStream.close();
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



        int argument1[] = new int[totalLines];
        int argument2[] = new int[totalLines];
        int shapeName[] = new int[totalLines];
        int shapeColorName[] = new int[totalLines];


        for (int k = 1; k < totalPageNumbers+1 ; k++) {
            pageNumber = k;

//        numbersRangeEnd-=numbersRangeStart;

            for (int i = 0; i != totalLines; i++) {

                argument1[i] = (int) (Math.random() * numbersRangeEnd) + numbersRangeStart;
                argument2[i] = (int) (Math.random() * numbersRangeEnd) + numbersRangeStart;
                System.out.println(argument1[i] + "  " + argument2[i] + "  " + numbersRangeEnd + "   " + numbersRangeStart);


                shapeName[i] = (int) (Math.random() * 5);
                shapeColorName[i] = (int) (Math.random() * 6);
            }

//            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
//                    ("D:\\mathematics-at-school.com\\JavaTemplates/" + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__"
//                            + ".txt"));
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
Bottomo block^ txt and html format
 */
    public static void bottomWorksheet(String grade, int totalPageNumbers, String shortTaskNameWorksheet,
                                       String longTaskNameWorksheet) throws IOException {

        for (int i = 1; i < totalPageNumbers ; i++) {
            pageNumber = i;

            FileWriter writer = new FileWriter("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bottomTxtBlock__" + ".txt", true);

            FileWriter writerHtml = new FileWriter("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bottomHtmlBlock__" + ".html", true);

            BufferedWriter bufferWriter = new BufferedWriter(writer);
            BufferedWriter bufferHtml = new BufferedWriter(writerHtml);
            String text, htmlText;
            text = "__________________________________________________________________________________\n\n";
            htmlText = "___________________________________________________________________________<br /><br />\n\n";
            bufferWriter.write(text);
            bufferHtml.write(htmlText);
            System.out.println(text);
//            text = siteNameLeftBottom + "                          " + siteNameRightBottom + "\n\n";
//            htmlText = siteNameLeftBottom + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " + siteNameRightBottom + "<br /><br />\n\n";
            text = "https://mathematics-tests.com" + "                          " + "https://magazin-integral.ru" + "\n\n";
            htmlText = "https://mathematics-tests.com" + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " +
                    "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " + "https://magazin-integral.ru" + "<br /><br />\n\n";
            bufferWriter.write(text);
            bufferHtml.write(htmlText);
            System.out.println(text);
            bufferWriter.close();
            bufferHtml.close();
        }
    }

    public static void fullWorksheet(String grade, int totalPageNumbers,
                                     String shortTaskNameWorksheet) throws IOException {

        for (int i = 1; i < totalPageNumbers ; i++) {
            pageNumber = i;

            OutputStream os = new FileOutputStream(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + " fullWorksheet_" + ".txt"), true);
            OutputStream os1 = new FileOutputStream(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + " fullWorksheet_" + ".html"), true);

            InputStream in = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "topTxtBlock__" + ".txt");
            InputStream in1 = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "topHtmlBlock__" + ".html");

            byte[] buffer = new byte[1 << 20];  // loads 1 MB of the file
            int count;
            while ((count = in.read(buffer)) != -1) {
                os.write(buffer, 0, count);
                os.flush();
            }

            int count1;
            while ((count1 = in1.read(buffer)) != -1) {
                os1.write(buffer, 0, count1);
                os1.flush();
            }
            in.close();
            in1.close();

            in = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/" + grade + " "
                    + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt");
            in1 = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/" + grade + " "
                    + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html");
            while ((count = in.read(buffer)) != -1) {
                os.write(buffer, 0, count);
                os.flush();
            }
            while ((count1 = in1.read(buffer)) != -1) {
                os1.write(buffer, 0, count1);
                os1.flush();
            }

            in = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bottomTxtBlock__" + ".txt");
            in1 = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/"
                    + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bottomHtmlBlock__" + ".html");

            while ((count = in.read(buffer)) != -1) {
                os.write(buffer, 0, count);
                os.flush();
            }
            while ((count1 = in1.read(buffer)) != -1) {
                os1.write(buffer, 0, count1);
                os1.flush();
            }

            in.close();
            in1.close();
            os.close();
            os1.close();
        }
    }

/*
All same Worksheets together
 */
public static void allSameWorksheets(String grade, int totalPageNumbers,
                                     String shortTaskNameWorksheet) throws IOException {

    OutputStream os = new FileOutputStream(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
            + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber +  " allSameWorksheets_" + ".txt"), true);
    OutputStream os1 = new FileOutputStream(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
            + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber +  " allSameWorksheets_" + ".html"), true);

    for (int pageNumber = 1; pageNumber < totalPageNumbers; pageNumber++) {


        InputStream in = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + " fullWorksheet_" + ".txt");

        InputStream in1 = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + " fullWorksheet_" + ".html");

        byte[] buffer = new byte[1 << 20];  // loads 1 MB of the file
        int count;
        while ((count = in.read(buffer)) != -1) {
            os.write(buffer, 0, count);
            os.flush();
        }

        int count1;
        while ((count1 = in1.read(buffer)) != -1) {
            os1.write(buffer, 0, count1);
            os1.flush();
        }
    }

//    in.close();
//    in1.close();
    os.close();
    os1.close();
}


    /*
    Fill in the small block

    a1 + b1 = _____     a2 + b2 = _____     a3 + b3 = ______    a4 + b4 = _____     a5 + b5 = _____

     */
    public static void addA1_B1A4LineBlock(int numbersRangeStart, int numbersRangeEnd) throws IOException {

        int problemsPerLine = 5; // Number of problems per line

        for (int j = 0; j < problemsPerLine; j++) {
                argument1[j][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument2[j][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
         }

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                ("D:\\mathematics-at-school.com\\JavaTemplates/" + grade + " " + shortTaskNameWorksheet +
                        " Стр. " + pageNumber + "lineBloc__" + ".txt"));
        FileWriter os1 = new FileWriter(new File
                ("D:\\mathematics-at-school.com\\JavaTemplates/" + grade + " " + shortTaskNameWorksheet +
                        " Стр. " + pageNumber +  "lineBloc__" + ".html"), true);

        problemsPerLine = 5;
        os1.write("<br />\n");
        outputStream.write('\n');
        for (int j = 0; j < problemsPerLine; j++) {


            outputStream.write(String.valueOf(argument1[j][0]).getBytes());
            os1.write(String.valueOf(argument1[j][0]));
            outputStream.write(' ');
            outputStream.write('+');
            outputStream.write(' ');
            os1.write(" + ");
            outputStream.write(String.valueOf(argument2[j][0]).getBytes());
            os1.write(String.valueOf(argument2[j][0]));
            outputStream.write(' ');
            outputStream.write('=');
            outputStream.write(' ');
            outputStream.write('_');
            outputStream.write('_');
            outputStream.write('_');
            outputStream.write('_');
            outputStream.write('_');
            outputStream.write(' ');
            outputStream.write(' ');
            outputStream.write(' ');
            outputStream.write(' ');
            os1.write(" = _____ &nbsp; &nbsp; &nbsp; ");


            System.out.print(" " + argument1[j][0] + " + " + argument2[j][0] + " = _____   ");
        }
        outputStream.write('\n');
        outputStream.write('\n');

        os1.write("<br />\n");
        os1.write("<br />\n");

        outputStream.close();
        os1.close();

    }

/*
    public static void headerHtmlBlock() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "headerTxtBlock__" + Matrix.grade + " " + Matrix.shortTaskNameWorksheet + ".txt")));
        FileWriter fileWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "headerHtmlBlock__" + Matrix.grade + " " + Matrix.shortTaskNameWorksheet + ".html"));

        // считаем сначала первую строку
        String newLine1 = "";
        String line1 = reader.readLine();
        if (line1 != null) newLine1 = "<h1>" + line1 + "</h1> \n";
        System.out.println(newLine1);
        fileWriter.write(newLine1);
        String newLine2 = "";
        String line3 = reader.readLine();
        String line2 = reader.readLine();
        if (line2 != null) newLine2 = "<h2>" + line2 + "</h2>\n";
        System.out.println(newLine2);
        fileWriter.write(newLine2);


        fileWriter.close();
        reader.close();

    }
*/

}

