package MathPackage;

import java.io.*;

public class Grade4 implements Serializable{

    static public String workingFolder = "D:\\mathematics-at-school.com\\JavaTemplates/";


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

        Grade4 [] grade4 = new Grade4[10];
//        Grade4 [] grade4read;

        grade4[0] = new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение чисел.",
                "Numbers addition.",
                "", "",
                "Сложение чисел до 100 000.",
                "Add two numbers up to five digits.",
                "Сложи числа.",
                "Add numbers.",
                1, 100_000);
        grade4[1] = new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение чисел.",
                "Numbers addition.",
                "", "",
                "Сложение чисел до 100 000. Вставь попущенные цифры.",
                "Add two numbers up to five digits. Fill in missing numbers.",
                "Сложи числа. Вставь попущенные цифры.",
                "Add numbers. Fill in missing numbers.",
                1, 100_000);

//        Matrix.emptyFolder(workingFolder);

        System.out.println(grade4[1].gradeEng + " " + grade4[1].numberEng + " " + grade4[1].shortProblemDescriptionEng);

        File file = new File("D:\\mathematics-at-school.com\\JavaTemplates/grade4.bin");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(grade4[1]);


        fos.close();
        oos.close();


        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object object = ois.readObject();
        Grade4 grade4read = (Grade4) object;

        fis.close();
        fos.close();

        System.out.println(grade4read.gradeEng + " " + grade4read.numberEng + " " + grade4read.shortProblemDescriptionEng);

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
