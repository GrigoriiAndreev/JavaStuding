package MathPackage;

import java.io.*;
//import java.io.FileWriter;


public class HtmlPage {
    public static void main(String[] args) throws IOException {

        headerTxtBlock();
    }

    public static void headerTxtBlock() throws IOException {

/*
        FileInputStream inputStream = new FileInputStream("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "headerTxtBlock__" + Matrix.gradeTop + " " + Matrix.shortTaskNameTop + ".txt");
                + "test.txt");
        OutputStream outputStream = new FileOutputStream(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "outtext.txt"), true);
        byte[] buffer = {60, 104, 49, 62};
        outputStream.write(buffer,0,4);
*/
//        File file = new File("D:\\mathematics-at-school.com\\JavaTemplates/"
//                + "test.txt");
//        //создаем объект FileReader для объекта File
//        FileReader fr = new FileReader(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
//                + "test.txt"));
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(new FileReader(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "headerTxtBlock__" + Matrix.gradeTop + " " + Matrix.shortTaskNameTop + ".txt")));

//        File newFile = new File("D:\\mathematics-at-school.com\\JavaTemplates/"
//                + "outtest.txt");
        FileWriter fileWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + "headerHtmlBlock__" + Matrix.gradeTop + " " + Matrix.shortTaskNameTop + ".txt"));

        // считаем сначала первую строку
        String newLine1 = "";
        String line1 = reader.readLine();
        if (line1 != null) newLine1 = "<h1>" + line1 + "</h1> \n";
        System.out.println(newLine1);
        fileWriter.write(newLine1);
        String newLine2 = "";
        String line2 = reader.readLine();
        if (line2 != null) newLine2 = "<h2>" + line2 + "</h2>\n";
        System.out.println(newLine2);
        fileWriter.write(newLine2);


        fileWriter.close();
        reader.close();
/*
        text = "Математика. " + gradeTop + " " + shortTaskNameTop + "\n\n";
        System.out.println(text);
        writer.write(text);
        text = longTaskNameHeader + "\n\n";
        System.out.println(text);
        writer.write(text);
        text = longTaskNameTop + "\n\n";
        System.out.println(text);
        writer.write(text);
        writer.close();
*/

    }
}
