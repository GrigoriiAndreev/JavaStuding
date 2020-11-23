package MathPackage;

import java.io.*;
//import com.spire.doc.*;

//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.pdf.PdfWriter;

public class Matrix {

    //Main matrix template
    static int problemsPerLine = 5;
    static int problemsPerRows = 20;
    static Integer[][] argument1 = new Integer[problemsPerLine][problemsPerRows];
    static Integer[][] argument2 = new Integer[problemsPerLine][problemsPerRows];
    static int numbersRangeStart = 10;
    static int numbersRangeEnd = 90;

    static int pageNumberTop = 1;
    static String gradeTop = "";
    static String shortTaskNameTop = "";
//    static String fileName = "";
    static String longTaskNameTop = "";
    static String siteNameLeftBottom= "";
    static String siteNameRightBottom = "";
    static String longTaskNameHeader = "";


    public static void main(String[] args) throws IOException {

        gradeTop = "1 класс.";
        shortTaskNameTop = "Сложение и вычитание двузначных чисел.";
        pageNumberTop = 1;
        longTaskNameTop = "Сложи и вычити двузначные числа. ";
        longTaskNameHeader = "Задачи с ответами на тему: Сложение двух двузначных чисел.";
        siteNameLeftBottom = "https://mathematics-tests.com";
        siteNameRightBottom = "https://magazin-integral.ru";

        headerTxtBlock();
        headerHtmlBlock();
        topTxtBlock();
        bottomTxtBlock();

/*
        for (int i = 1; i < 5; i++) {

            pageNumberTop = i;
            Matrix.topTxtBlock();
            Matrix.a1_plus_b1_A4TxtBlock(numbersRangeStart,numbersRangeEnd);
            Matrix.bottomTxtBlock();
            Matrix.fullTxtBlock();
        }
*/
    }

    /*
Header of page (txt) format
 */
    public static void headerTxtBlock() throws IOException {

        FileWriter writer = new FileWriter("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "headerTxtBlock__" + gradeTop + " " + shortTaskNameTop + ".txt");

        String text;

        text = "Математика. " + gradeTop + " " + shortTaskNameTop + "\n\n";
//        System.out.println(text);
        writer.write(text);
        text = longTaskNameHeader + "\n\n";
//        System.out.println(text);
        writer.write(text);
//        text = longTaskNameTop + "\n\n";
//        System.out.println(text);
//        writer.write(text);
        writer.close();

    }

/*
Записываем текст заголовка
 */
    public static void topTxtBlock() throws IOException {

        FileWriter writer = new FileWriter("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "topTxtBlock__" + gradeTop + " " + shortTaskNameTop + " Стр. " + pageNumberTop + ".txt");
        FileWriter writerHtml = new FileWriter("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "topHtmlBlock__" + gradeTop + " " + shortTaskNameTop + " Стр. " + pageNumberTop + ".html");
        String text,htmlText;
        text = gradeTop + " " + shortTaskNameTop + " Стр. № " + pageNumberTop + "\n\n";
        htmlText = gradeTop + " " + shortTaskNameTop + " Стр. № " + pageNumberTop + "\n\n<br /><br />";
        System.out.println(text);
        writer.write(text);
        writerHtml.write(htmlText);
        text = "Дата: ______________ ФИО: ______________________________________________ Оценка:__________\n\n";
        htmlText = "Дата: ______________ ФИО: ______________________________________________ Оценка:__________\n\n<br /><br />";
        System.out.println(text);
        writer.write(text);
        writerHtml.write(htmlText);
        text = longTaskNameTop + "\n\n";
        htmlText = longTaskNameTop + "\n\n<br /><br />";
        System.out.println(text);
        writer.write(text);
        writerHtml.write(htmlText);
        writer.close();
        writerHtml.close();

    }

    /*
    Fill in the math problems for A4 page

    a11 + b11 = _____     a21 + b21 = _____     a31 + b31 = ______    a41 + b41 = _____     a51 + b51 = _____
    a12 + b12 = _____     a22 + b22 = _____     a32 + b32 = ______    a42 + b42 = _____     a52 + b52 = _____
    ...

     */
    public static void a1_plus_b1_A4TxtBlock(int numbersRangeStart, int numbersRangeEnd) throws IOException {

        for (int i = 0; i < problemsPerRows; i++)
            for (int j = 0; j < problemsPerLine; j++) {
                argument1[j][i] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument2[j][i] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
            }

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                ("D:\\mathematics-at-school.com\\JavaTemplates/" + "bodyTxtBlock__"
                        + gradeTop + " " + shortTaskNameTop + " Стр. " + pageNumberTop + ".txt"));
        for (int i = 0; i < problemsPerRows; i++) {
            for (int j = 0; j < problemsPerLine; j++) {
                outputStream.write(' ');
                outputStream.write(String.valueOf(argument1[j][i]).getBytes());
                outputStream.write(' ');
                outputStream.write('+');
                outputStream.write(' ');
                outputStream.write(String.valueOf(argument2[j][i]).getBytes());
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
                System.out.print(" " + argument1[j][i] + " + " + argument2[j][i] + " = _____   ");
            }
            outputStream.write('\n');
            outputStream.write('\n');
            outputStream.write('\n');
            System.out.println();
            System.out.println();
            System.out.println();
        }
        outputStream.close();
    }

    public static void bottomTxtBlock() throws IOException {

        FileWriter writer = new FileWriter("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "bottomTxtBloc__" + gradeTop + " " + shortTaskNameTop + " Стр. " + pageNumberTop + ".txt", true);

        FileWriter writerHtml = new FileWriter("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "bottomHtmlBlock__" + gradeTop + " " + shortTaskNameTop + " Стр. " + pageNumberTop + ".html", true);

        BufferedWriter bufferWriter = new BufferedWriter(writer);
        BufferedWriter bufferHtml = new BufferedWriter(writerHtml);
        String text, htmlText;
        text ="_____________________________________________________________________________________________________\n\n";
        htmlText ="_____________________________________________________________________________________________________<br /><br />\n\n";
        bufferWriter.write(text);
        bufferHtml.write(htmlText);
        System.out.println(text);
        text = siteNameLeftBottom + "                                  " + siteNameRightBottom  + "\n\n";
        htmlText = siteNameLeftBottom + "&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; " + siteNameRightBottom  + "<br /><br />\n\n";
        bufferWriter.write(text);
        bufferHtml.write(htmlText);
        System.out.println(text);
        bufferWriter.close();
        bufferHtml.close();
    }

    public static void fullTxtBlock() throws IOException {

        InputStream in = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "topTxtBlock__" + gradeTop + " " + shortTaskNameTop + " Стр. " + pageNumberTop + ".txt");
        byte[] buffer = new byte[1 << 20];  // loads 1 MB of the file
        OutputStream os = new FileOutputStream(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "fullTxtBlock__" + gradeTop + " " + shortTaskNameTop + " Стр. " + pageNumberTop + ".txt"), true);
        int count;
        while ((count = in.read(buffer)) != -1) {
            os.write(buffer, 0, count);
            os.flush();
        }
        in.close();
        in = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/" + "bodyTxtBlock__"
                + gradeTop + " " + shortTaskNameTop + " Стр. " + pageNumberTop + ".txt");
        while ((count = in.read(buffer)) != -1) {
            os.write(buffer, 0, count);
            os.flush();
        }

        in = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "bottomTxtBloc__" + gradeTop + " " + shortTaskNameTop +
                " Стр. " + pageNumberTop + ".txt");
        while ((count = in.read(buffer)) != -1) {
            os.write(buffer, 0, count);
            os.flush();
        }

        in.close();
        os.close();
    }

    /*
    Fill in the small block

    a1 + b1 = _____     a2 + b2 = _____     a3 + b3 = ______    a4 + b4 = _____     a5 + b5 = _____

     */
    public static void a1_plus_a2_lineTxtBlock(int numbersRangeStart, int numbersRangeEnd) throws IOException {

        int problemsPerLine = 5; // Number of problems per line

        for (int j = 0; j < problemsPerLine; j++) {
                argument1[j][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                argument2[j][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
         }

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                ("D:\\mathematics-at-school.com\\JavaTemplates/" + "lineTxtBloc__"
                        + gradeTop + " " + shortTaskNameTop + " Стр. " + pageNumberTop + ".txt"));
        for (int j = 0; j < problemsPerLine; j++) {
            outputStream.write(' ');
            outputStream.write(String.valueOf(argument1[j][0]).getBytes());
            outputStream.write(' ');
            outputStream.write('+');
            outputStream.write(' ');
            outputStream.write(String.valueOf(argument2[j][0]).getBytes());
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
            System.out.print(" " + argument1[j][0] + " + " + argument2[j][0] + " = _____   ");
        }

    }

    public static void headerHtmlBlock() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "headerTxtBlock__" + Matrix.gradeTop + " " + Matrix.shortTaskNameTop + ".txt")));
        FileWriter fileWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "headerHtmlBlock__" + Matrix.gradeTop + " " + Matrix.shortTaskNameTop + ".html"));

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

}

