package MathPackage;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Solution {

    public static double eval(final String str) {
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

    public static void grade4AddWordProblems(String grade, String shortTaskNameWorksheet, int totalPageNumber,
                                             String longTaskNameWorksheet, int problemsLine) throws IOException {

        //            File file = new File("D:\\mathematics-at-school.com\\JavaTemplates/grade4.bin");

        BufferedReader reader = new BufferedReader(new FileReader(new File(
                "D:\\mathematics-at-school.com\\JavaTemplatesReady/grade4AddWordProblemsTemplate1" +
                        ".txt")));

/*
        FileWriter fileHtmlWriter = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html"));
        FileWriter fileHtmlWriterAnswer = new FileWriter(new File("D:\\mathematics-at-school.com\\JavaTemplates/"
                + grade + " " + shortTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html"));
*/

//            // считаем сначала первую строку
////            System.out.println("Вывод 2");
////            String line = reader.readLine();
//            String line, originalNumberOne, originalNumberTwo;
//            String originalNumberThree, originalNumberFour;
        String originalNumber1 = "", originalNumber2 = "", originalNumber3 = "", originalNumber4 = "", originalNumber5 = "";
        String line10 = "", line11 = "", line12 = "", line13 = "", line14 = "", line15 = "", finalLine = "";
        int intNumber1 = 0, intNumber2 = 0, intNumber3 = 0, intNumber4 = 0, intNumber5 = 0;
        int generatedNumber1 = 0, generatedNumber2 = 0, generatedNumber3 = 0, generatedNumber4 = 0, generatedNumber5 = 0;
        int numbersCount;


        String line;
        while((line = reader.readLine())!= null) {
            if (!line.contains("Answer:")) {

//            String text = "f7df, qqq, www, 74sv, zzz, пет3я";
                Pattern p = Pattern.compile("\\b\\w*\\d+\\w*,?\\b");
                Matcher m = p.matcher(line);
                numbersCount = 1;
                while (m.find()) {
                    if (numbersCount == 1) {
                        originalNumber1 = line.substring(m.start(), m.end());
                        intNumber1 = Integer.parseInt(line.substring(m.start(), m.end()));
                    }
                    if (numbersCount == 2) {
                        originalNumber2 = line.substring(m.start(), m.end());
                        intNumber2 = Integer.parseInt(line.substring(m.start(), m.end()));
                    }
                    if (numbersCount == 3) {
                        originalNumber3 = line.substring(m.start(), m.end());
                        intNumber3 = Integer.parseInt(line.substring(m.start(), m.end()));
                    }
                    if (numbersCount == 4) {
                        originalNumber4 = line.substring(m.start(), m.end());
                        intNumber4 = Integer.parseInt(line.substring(m.start(), m.end()));
                    }
                    if (numbersCount == 5) {
                        originalNumber5 = line.substring(m.start(), m.end());
                        intNumber5 = Integer.parseInt(line.substring(m.start(), m.end()));
                    }
                    numbersCount++;
                }
                System.out.println(intNumber1 + " " + intNumber2 + " " + intNumber3 + " " + intNumber4 + " " + intNumber5);

                generatedNumber1 = (int) ((Math.random() * intNumber1 / 20) + intNumber1);
                generatedNumber2 = (int) ((Math.random() * intNumber2 / 20) + intNumber2);
                generatedNumber3 = (int) ((Math.random() * intNumber3 / 20) + intNumber3);
                generatedNumber4 = (int) ((Math.random() * intNumber4 / 20) + intNumber4);
                System.out.println(generatedNumber1 + " " + generatedNumber2 + " " + generatedNumber3 + " " + intNumber4 + " " + intNumber5);
                System.out.println(Integer.toString(generatedNumber1) + " " + intNumber2 + " " + intNumber3 + " " + intNumber4 + " " + intNumber5);
                String line1 = line.replace(originalNumber1, Integer.toString(generatedNumber1));
                String line2 = line1.replace(originalNumber2, Integer.toString(generatedNumber2));
                String line3 = line2.replace(originalNumber3, Integer.toString(generatedNumber3));
                String line4 = line3.replace(originalNumber4, Integer.toString(generatedNumber4));
//            String line5 = line4.replace(originalNumber5, Integer.toString(generatedNumber5));
                System.out.println("Final = " + line4);
                System.out.println(line);
            }
            if (line.contains("Answer:")) {
                System.out.println(line);
                if (generatedNumber1 != 0) {
                    line10 = line.replace("d1", Integer.toString(generatedNumber1));
                    finalLine = line10;
                }
                if (generatedNumber2 != 0) {
                    line11 = line10.replace("d2", Integer.toString(generatedNumber2));
                    finalLine = line11;
                }
                if (generatedNumber3 != 0) {
                    line12 = line11.replace("d3", Integer.toString(generatedNumber3));
                    finalLine = line12;
                }
                if (generatedNumber4 != 0) {
                    line13 = line12.replace("d4", Integer.toString(generatedNumber4));
                    finalLine = line13;
                }
//                    if (finalLine.contains("d5")) {
//                        line14 = line13.replace("d5", Integer.toString(generatedNumber5));
//                        finalLine = line14;
//                    }
//                    finalLine= line14.replace("Answer:", "");

//                    System.out.println("Тут ответы: " + line10 + " " + line11 + " " + line12 + " " + line13 + " " + line14 );
//                    System.out.println("Окончательно = :" + finalLine);
//                    String expression = "(20+7)/3-7*10";
                System.out.println("Ответ: " + line13.replace("Answer:", "") + " = " + (int) eval(line13.replace("Answer:", "")));

            }
//                line = reader.readLine();
        }



    }



        public static void main(String args[]) throws IOException {
           }
    }
