package MathPackage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Grade4 implements Serializable{

//    static public String workingFolder = "D:\\mathematics-at-school.com\\JavaTemplates/";
//    static public String workingFolder = General.workingFolder;


    String gradeRus;
    String gradeEng;
    String topicRus;
    String topicEng;
    String numberRus;
    String numberEng;
    String shortProblemDescriptionRus;
    String shortProblemDescriptionEng;
    String longProblemDescriptionRus;
    String longProblemDescriptionEng;
    int numbersRangeStart;
    int numbersRangeEnd;

    public Grade4(
            String gradeRus,
            String gradeEng,
            String topicRus,
            String topicEng,
            String numberRus,
            String numberEng,
            String shortProblemDescriptionRus,
            String shortProblemDescriptionEng,
            String longProblemDescriptionRus,
            String longProblemDescriptionEng,
            int numbersRangeStart,
            int numbersRangeEnd) {
        this.gradeRus = gradeRus;
        this.gradeEng = gradeEng;
        this.numberRus = numberRus;
        this.numberEng = numberEng;
        this.topicRus = topicRus;
        this.topicEng = topicEng;
        this.shortProblemDescriptionRus = shortProblemDescriptionRus;
        this.shortProblemDescriptionEng = shortProblemDescriptionEng;
        this.longProblemDescriptionRus = longProblemDescriptionRus;
        this.longProblemDescriptionEng = longProblemDescriptionEng;
        this.numbersRangeStart = numbersRangeStart;
        this.numbersRangeEnd = numbersRangeEnd;    }

    public static void main(String[] args) throws Exception {

//        Grade4 [] grade4 = new Grade4[10];
        List<Grade4> grade4Topics = new ArrayList<>();
        List<Grade4> grade4AllTopics = new ArrayList<>();
//        Grade4 [] grade4read;

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Числа. Разряды чисел.",
                "Numbers. Number sense.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение чисел.",
                "Numbers addition.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Вычитание чисел.",
                "Numbers subtraction.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение и вычитание чисел.",
                "Numbers addition and subtraction.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Умножение чисел.",
                "Numbers multiplication.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));
        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Деление чисел.",
                "Numbers division.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Умножение и деление чисел.",
                "Numbers multiplication and subtraction.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Задачи на сложение, вычитание, умножение и деление чисел.",
                "Numbers addition, subtraction, multiplication and subtraction problems.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Переменные.",
                "Variables.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Координатная плоскость.",
                "Variables.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Задачи на логику.",
                "Logical problems.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Единицы измерения.",
                "Units of measurement.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Дроби.",
                "Fractions.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение и вычитание дробей с одинаковыми знаменателями.",
                "Add and subtract fractions with like denominators.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение и вычитание дробей с разными знаменателями.",
                "Add and subtract fractions with unlike denominators.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Умножение дробей.",
                "Multiply fractions.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Десятичные дроби.",
                "Decimals.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение и вычитание десятичных дробей.",
                "Add and subtract decimals.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Плоские фигуры.",
                "Two-dimensional figures.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Треугольники и четырехугольники.",
                "Triangles and quadrilaterals.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Тема углы.",
                "Angles.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Объемные фигуры.",
                "Three-dimensional figures.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4AllTopics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Периметр и площадь.",
                "Perimeter and area.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

// -------------------------------------------------------
        grade4Topics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение чисел.",
                "Numbers addition.",
                "", "",
                "Сложение чисел до 100 000.",
                "Add two numbers up to five digits.",
                "Сложи числа.",
                "Add numbers.",
                1, 100_000));
        grade4Topics.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение чисел.",
                "Numbers addition.",
                "", "",
                "Сложение чисел до 100 000. Вставь попущенные цифры.",
                "Add two numbers up to five digits. Fill in missing numbers.",
                "Сложи числа. Вставь попущенные цифры.",
                "Add numbers. Fill in missing numbers.",
                1, 100_000));

//        Save and print all objects

//        File file = new File(General.readyObjectsFolder + "Grade4AllTopics.bin");
//
//        FileOutputStream fos = new FileOutputStream(file);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        int topicsCounter = 1;
//        for(Grade4 grade4 : grade4AllTopics) {
//            oos.writeObject(grade4);
//            System.out.println("Тема N: "+ topicsCounter + " " + grade4.topicRus + " " + grade4.topicEng);
//            topicsCounter++;
//        }
//
//        fos.close();
//        oos.close();
//        System.out.println("Topics are written!");
//

/*
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object object = ois.readObject();
        Grade4 grade4read = (Grade4) object;

        fis.close();
        fos.close();

        System.out.println(grade4read.gradeEng + " " + grade4read.numberEng + " " + grade4read.shortProblemDescriptionEng);
*/

/*
        Matrix.topWorksheet(grade4[0].gradeRus, 6, grade4[0].shortProblemDescriptionRus,
                grade4[0].longProblemDescriptionRus);
        Matrix.addA1_B1A4ColumnWorksheet(grade4[0].gradeRus, 6, grade4[0].shortProblemDescriptionRus,
                grade4[0].numbersRangeStart, grade4[0].numbersRangeEnd, 0, 8, 6);
        Matrix.bottomWorksheet(grade4[0].gradeRus, 6, grade4[0].shortProblemDescriptionRus,
                grade4[0].longProblemDescriptionRus );
        Matrix.fullWorksheet(grade4[0].gradeRus, 6, grade4[0].shortProblemDescriptionRus);
        Matrix.allSameWorksheets(grade4[0].gradeRus, 6, grade4[0].shortProblemDescriptionRus);

        Matrix.topWorksheet(grade4[0].gradeEng, 6, grade4[0].shortProblemDescriptionEng,
                grade4[0].longProblemDescriptionEng);
        Matrix.addA1_B1A4ColumnWorksheet(grade4[0].gradeEng, 6, grade4[0].shortProblemDescriptionEng,
                grade4[0].numbersRangeStart, grade4[0].numbersRangeEnd, 0, 8, 6);
        Matrix.bottomWorksheet(grade4[0].gradeEng, 6, grade4[0].shortProblemDescriptionEng,
                grade4[0].longProblemDescriptionEng );
        Matrix.fullWorksheet(grade4[0].gradeEng, 6, grade4[0].shortProblemDescriptionEng);
        Matrix.allSameWorksheets(grade4[0].gradeEng, 6, grade4[0].shortProblemDescriptionEng);

*/

//        Matrix.addA1_B1ColumnLineBlock("1.1", grade4[0].gradeEng, grade4[0].longProblemDescriptionEng,
//                grade4[0].shortProblemDescriptionEng, grade4[0].numbersRangeStart, grade4[0].numbersRangeEnd, 7);
//        Matrix.addA1_B1ColumnLineBlock("1.1", grade4[0].gradeRus, grade4[0].longProblemDescriptionRus,
//                grade4[0].shortProblemDescriptionRus, grade4[0].numbersRangeStart, grade4[0].numbersRangeEnd, 7);
//        Matrix.addA1_B1ColumnMissinDigitsLineBlock("1.2", grade4[1].gradeRus, grade4[1].longProblemDescriptionRus,
//                grade4[1].shortProblemDescriptionRus, grade4[1].numbersRangeStart, grade4[1].numbersRangeEnd, 7);
//        Matrix.addA1_B1A4ColumnMissingNumbersWorksheet(grade4[1].gradeEng, 6, grade4[1].shortProblemDescriptionEng,
//                grade4[1].numbersRangeStart, grade4[1].numbersRangeEnd, 0, 10, 7);
//        Matrix.addA1_B1_C1ColumnLineBlock("1.1", grade4[0].gradeRus, grade4[0].longProblemDescriptionRus,
//                grade4[0].shortProblemDescriptionRus, grade4[0].numbersRangeStart, grade4[0].numbersRangeEnd, 7);
//

    }
}
