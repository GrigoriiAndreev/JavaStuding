package MathPackage;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class General {

    //Static important date for project

    static public String mathSiteNameRu = "https://mathematics-tests.com";
    static public String mathSiteNameEn = "https://mathematics-tests.com";
    static public String shopSiteName = "https://magazin-integral.ru";
    static public String mainRoot = "d:/Java_Math";
    static public String workingFolder = "d:/Java_Math/Temp/";
    static public String readyFilesFolder = "d:/Java_Math/ReadyWorksheets/";
    static public String readyFilesFolderPdf = "d:/Java_Math/Pdf/";
    static public String readyFilesFolderHtml = "d:/Java_Math/Html/";
    static public String googleDrive = "https://drive.google.com/drive/folders/1qZ8_2nDdjA7_e9EpdQaJTQIqehY4E5s0?usp=sharing";
    static public String yandexDisk = "https://disk.yandex.ru/d/VYRDjGJEYcxGKA?w=1";
    static public String readyObjectsFolder = "d:/Java_Math/savedObjects/";
    static public String googleAdsHtmlBlock = "googleAdsHtmlBlock.txt";


    public static double stringEvaluate(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

    
    public static void generatingHtmlPdfWorksheetsPart1(String workingFolder, String gradeRus, int totalPageOfWorksheets,
            String shortProblemDescriptionRus, String longProblemDescriptionRus) throws IOException {
        
        Matrix.topWorksheet(General.workingFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
    }

    public static void generatingHtmlPdfWorksheetsPart2(String workingFolder, String gradeRus, int totalPageOfWorksheets,
            String shortProblemDescriptionRus, String longProblemDescriptionRus) throws IOException {

        Matrix.bottomWorksheet(General.workingFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
    }


}
