package MathPackage;

import java.util.ArrayList;
import java.util.List;

public class Grade4AllTopics {

    String gradeRus;
    String gradeEng;
    String topicRus;
    String topicEng;
    String h2Rus;
    String h2Eng;
    String numberRus;
    String numberEng;
    String shortProblemDescriptionRus;
    String shortProblemDescriptionEng;
    String longProblemDescriptionRus;
    String longProblemDescriptionEng;
    int numbersRangeStart;
    int numbersRangeEnd;
    int totalPageOfWorksheets;

    public Grade4AllTopics(
            String gradeRus,
            String gradeEng,
            String topicRus,
            String topicEng,
            String h2Rus,
            String h2Eng,
            String numberRus,
            String numberEng,
            String shortProblemDescriptionRus,
            String shortProblemDescriptionEng,
            String longProblemDescriptionRus,
            String longProblemDescriptionEng,
            int numbersRangeStart,
            int numbersRangeEnd,
            int totalPageOfWorksheets) {
        this.gradeRus = gradeRus;
        this.gradeEng = gradeEng;
        this.h2Rus = h2Rus;
        this.h2Eng = h2Eng;
        this.numberRus = numberRus;
        this.numberEng = numberEng;
        this.topicRus = topicRus;
        this.topicEng = topicEng;
        this.shortProblemDescriptionRus = shortProblemDescriptionRus;
        this.shortProblemDescriptionEng = shortProblemDescriptionEng;
        this.longProblemDescriptionRus = longProblemDescriptionRus;
        this.longProblemDescriptionEng = longProblemDescriptionEng;
        this.numbersRangeStart = numbersRangeStart;
        this.numbersRangeEnd = numbersRangeEnd;
        this.totalPageOfWorksheets = totalPageOfWorksheets;}

    public static void main(String[] args) throws Exception {

        List<AllTopics> grade4Rounding = new ArrayList<>();

/*
        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest tens. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.","Round numbers to the nearest tens.",
                "Округли числа до ближайшего десятка. Числа до 100.",
                "Round numbers to the nearest 10.",
                10, 100, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до сотен. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest hundreds. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до сотен.","Round numbers to the nearest hundreds.",
                "Округли числа до ближайшего десятка. Числа до 1000.",
                "Round numbers to the nearest 100.",
                10, 1000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest thousands. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до тысяч.","Round numbers to the nearest thousands.",
                "Округли числа до ближайшей сотни. Числа до 1000.",
                "Round numbers to the nearest thousands.",
                100, 1000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десяти тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten thousands. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десяти тысяч.","Round numbers to the nearest ten thousands.",
                "Округли числа до ближайшего десятка. Числа до 10000.",
                "Round numbers to the nearest tens thousands.",
                10, 10000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десяти тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten thousands. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десяти тысяч.","Round numbers to the nearest ten thousands.",
                "Округли числа до ближайшей сотни. Числа до 10000.",
                "Round numbers to the nearest tens thousands.",
                100, 10000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десяти тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten thousands. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десяти тысяч.","Round numbers to the nearest ten thousands.",
                "Округли числа до ближайшей тысячи. Числа до 10000.",
                "Round numbers to the nearest tens thousands.",
                1000, 10000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десяти тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten thousands. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десяти тысяч.","Round numbers to the nearest ten thousands.",
                "Округли числа до ближайшей сотни. Числа до 100000.",
                "Round numbers to the nearest tens thousands.",
                100, 100000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десяти тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten thousands. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десяти тысяч.","Round numbers to the nearest ten thousands.",
                "Округли числа до ближайшей тысячи. Числа до 100000.",
                "Round numbers to the nearest tens thousands.",
                1000, 100000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десяти тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten thousands. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десяти тысяч.","Round numbers to the nearest ten thousands.",
                "Округли числа до ближайшей тысячи. Числа до 1000000.",
                "Round numbers to the nearest tens thousands.",
                1000, 1000000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десяти тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten thousands. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десяти тысяч.","Round numbers to the nearest ten thousands.",
                "Округли числа до ближайшей десяти тысяч.",
                "Round numbers to the nearest tens thousands. Числа до 1000000.",
                10000, 1000000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десяти тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten thousands. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десяти тысяч.","Round numbers to the nearest ten thousands.",
                "Округли числа до ближайшего десяти тысяч. Числа до 1000000.",
                "Round numbers to the nearest tens thousands.",
                100000, 1000000, 6));
*/

        grade4Rounding.add( new AllTopics(
                "4 класс", "Grade 4",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 100.",
                "Round numbers to the nearest 10. Numbers up tо 100.",
                10, 100, 6));

// ------ up to 100 -- end

        grade4Rounding.add( new AllTopics(
                "4 класс", "Grade 4",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 1000.",
                "Round numbers to the nearest 10. Numbers up tо 1000.",
                10, 1000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс", "Grade 4",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до сотен. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest hundred. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до сотен.",
                "Round numbers to the nearest hundred.",
                "Округли числа до сотен. Числа до 1000.",
                "Round numbers to the nearest hundred. Numbers up tо 1000.",
                100, 1000, 6));

// ------ up to 1000 -- end

        grade4Rounding.add( new AllTopics(
                "4 класс", "Grade 4",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 10000.",
                "Round numbers to the nearest 10. Numbers up tо 10000.",
                10, 10000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс", "Grade 4",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до сотен. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest hundred. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до сотен.",
                "Round numbers to the nearest hundred.",
                "Округли числа до сотен. Числа до 10000.",
                "Round numbers to the nearest hundred. Numbers up tо 10000.",
                100, 10000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс", "Grade 4",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest thousand. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до тысяч.",
                "Round numbers to the nearest thousand.",
                "Округли числа до тысяч. Числа до 10000.",
                "Round numbers to the nearest thousand. Numbers up tо 10000.",
                1000, 10000, 6));

// ------ up to 10_000 -- end


        grade4Rounding.add( new AllTopics(
                "4 класс", "Grade 4",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 100000.",
                "Round numbers to the nearest 10. Numbers up tо 100000.",
                10, 100000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс", "Grade 4",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до сотен. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest hundred. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до сотен.",
                "Round numbers to the nearest hundred.",
                "Округли числа до сотен. Числа до 100000.",
                "Round numbers to the nearest hundred. Numbers up tо 100000.",
                100, 100000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс", "Grade 4",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest thousand. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до тысяч.",
                "Round numbers to the nearest thousand.",
                "Округли числа до тысяч. Числа до 100000.",
                "Round numbers to the nearest thousand. Numbers up tо 10000.",
                1000, 100000, 6));

        grade4Rounding.add( new AllTopics(
                "4 класс", "Grade 4",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest thousand. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до тысяч.",
                "Round numbers to the nearest thousand.",
                "Округли числа до тысяч. Числа до 1000000.",
                "Round numbers to the nearest thousand. Numbers up tо 1000000.",
                10_000, 1000000, 6));



/*
        grade4Rounding.add( new AllTopics(
                "4 класс.", "Grade 4.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление с точностью до подчеркнутой цифры. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round to the accuracy of underline digit. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до указанной точности.","Round numbers to pointed accuracy.",
                "Округли числа с точностью до подчеркнутой цифры.",
                "Round to the accuracy of underline digit.",
                10, 1000, 6));



        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Числа. Разряды чисел.",
                "Numbers. Number sense.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение чисел.",
                "Numbers addition.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Вычитание чисел.",
                "Numbers subtraction.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение и вычитание чисел.",
                "Numbers addition and subtraction.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Умножение чисел.",
                "Numbers multiplication.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));
        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Деление чисел.",
                "Numbers division.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Умножение и деление чисел.",
                "Numbers multiplication and subtraction.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Задачи на сложение, вычитание, умножение и деление чисел.",
                "Numbers addition, subtraction, multiplication and subtraction problems.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Переменные.",
                "Variables.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Координатная плоскость.",
                "Variables.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Задачи на логику.",
                "Logical problems.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Единицы измерения.",
                "Units of measurement.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Дроби.",
                "Fractions.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение и вычитание дробей с одинаковыми знаменателями.",
                "Add and subtract fractions with like denominators.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение и вычитание дробей с разными знаменателями.",
                "Add and subtract fractions with unlike denominators.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Умножение дробей.",
                "Multiply fractions.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Десятичные дроби.",
                "Decimals.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Сложение и вычитание десятичных дробей.",
                "Add and subtract decimals.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Плоские фигуры.",
                "Two-dimensional figures.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Треугольники и четырехугольники.",
                "Triangles and quadrilaterals.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Тема углы.",
                "Angles.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
                "4 класс.", "Grade 4.",
                "Объемные фигуры.",
                "Three-dimensional figures.",
                "", "",
                "",
                "",
                "",
                "",
                1, 100_000));

        grade4Rounding.add( new Grade4(
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


//        Save and print all objects - OK


        File file = new File(General.readyObjectsFolder + "AllTopics.bin");

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int topicsCounter = 1;
        for(Grade4 grade4 : AllTopics) {
            oos.writeObject(grade4);
            System.out.println("Тема N: "+ topicsCounter + " " + grade4.topicRus + " " + grade4.topicEng);
            topicsCounter++;
        }

        fos.close();
        oos.close();
        System.out.println("Topics are written!");
*/

        Matrix.emptyFolder(General.workingFolder);
        Matrix.emptyFolder(General.readyFilesFolder);
        Matrix.emptyFolder(General.readyFilesFolderPdf);
        Matrix.emptyFolder(General.readyFilesFolderHtml);


// Округление чисел - работает!
        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(0).gradeRus, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionRus, grade4Rounding.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(0).gradeRus, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionRus, grade4Rounding.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(0).gradeRus, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionRus, grade4Rounding.get(0).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(0).gradeRus, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionRus, grade4Rounding.get(0).longProblemDescriptionRus,
                grade4Rounding.get(0).numbersRangeStart, grade4Rounding.get(0).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(0).gradeRus, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionRus, grade4Rounding.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeRus, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionRus, grade4Rounding.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(0).gradeRus, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionRus, grade4Rounding.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeRus, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionRus, grade4Rounding.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeRus, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionRus, grade4Rounding.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeRus, grade4Rounding.get(0).totalPageOfWorksheets, grade4Rounding.get(0).topicRus,
                grade4Rounding.get(0).h2Rus, grade4Rounding.get(0).shortProblemDescriptionRus, grade4Rounding.get(0).longProblemDescriptionRus);

//Работает !!!
        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(1).gradeRus, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionRus, grade4Rounding.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(1).gradeRus, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionRus, grade4Rounding.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(1).gradeRus, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionRus, grade4Rounding.get(1).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(1).gradeRus, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionRus, grade4Rounding.get(1).longProblemDescriptionRus,
                grade4Rounding.get(1).numbersRangeStart, grade4Rounding.get(1).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(1).gradeRus, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionRus, grade4Rounding.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(1).gradeRus, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionRus, grade4Rounding.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(1).gradeRus, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionRus, grade4Rounding.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(1).gradeRus, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionRus, grade4Rounding.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(1).gradeRus, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionRus, grade4Rounding.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(1).gradeRus, grade4Rounding.get(1).totalPageOfWorksheets, grade4Rounding.get(1).topicRus,
                grade4Rounding.get(1).h2Rus, grade4Rounding.get(1).shortProblemDescriptionRus, grade4Rounding.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(2).gradeRus, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionRus, grade4Rounding.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(2).gradeRus, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionRus, grade4Rounding.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(2).gradeRus, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionRus, grade4Rounding.get(2).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(2).gradeRus, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionRus, grade4Rounding.get(2).longProblemDescriptionRus,
                grade4Rounding.get(2).numbersRangeStart, grade4Rounding.get(2).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(2).gradeRus, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionRus, grade4Rounding.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(2).gradeRus, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionRus, grade4Rounding.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(2).gradeRus, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionRus, grade4Rounding.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(2).gradeRus, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionRus, grade4Rounding.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(2).gradeRus, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionRus, grade4Rounding.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(2).gradeRus, grade4Rounding.get(2).totalPageOfWorksheets, grade4Rounding.get(2).topicRus,
                grade4Rounding.get(2).h2Rus, grade4Rounding.get(2).shortProblemDescriptionRus, grade4Rounding.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(3).gradeRus, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionRus, grade4Rounding.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(3).gradeRus, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionRus, grade4Rounding.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(3).gradeRus, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionRus, grade4Rounding.get(3).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(3).gradeRus, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionRus, grade4Rounding.get(3).longProblemDescriptionRus,
                grade4Rounding.get(3).numbersRangeStart, grade4Rounding.get(3).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(3).gradeRus, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionRus, grade4Rounding.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(3).gradeRus, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionRus, grade4Rounding.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(3).gradeRus, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionRus, grade4Rounding.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(3).gradeRus, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionRus, grade4Rounding.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(3).gradeRus, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionRus, grade4Rounding.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(3).gradeRus, grade4Rounding.get(3).totalPageOfWorksheets, grade4Rounding.get(3).topicRus,
                grade4Rounding.get(3).h2Rus, grade4Rounding.get(3).shortProblemDescriptionRus, grade4Rounding.get(3).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(4).gradeRus, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionRus, grade4Rounding.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(4).gradeRus, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionRus, grade4Rounding.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(4).gradeRus, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionRus, grade4Rounding.get(4).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(4).gradeRus, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionRus, grade4Rounding.get(4).longProblemDescriptionRus,
                grade4Rounding.get(4).numbersRangeStart, grade4Rounding.get(4).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(4).gradeRus, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionRus, grade4Rounding.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(4).gradeRus, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionRus, grade4Rounding.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(4).gradeRus, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionRus, grade4Rounding.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(4).gradeRus, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionRus, grade4Rounding.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(4).gradeRus, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionRus, grade4Rounding.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(4).gradeRus, grade4Rounding.get(4).totalPageOfWorksheets, grade4Rounding.get(4).topicRus,
                grade4Rounding.get(4).h2Rus, grade4Rounding.get(4).shortProblemDescriptionRus, grade4Rounding.get(4).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(5).gradeRus, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionRus, grade4Rounding.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(5).gradeRus, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionRus, grade4Rounding.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(5).gradeRus, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionRus, grade4Rounding.get(5).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(5).gradeRus, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionRus, grade4Rounding.get(5).longProblemDescriptionRus,
                grade4Rounding.get(5).numbersRangeStart, grade4Rounding.get(5).numbersRangeEnd, 1000, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(5).gradeRus, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionRus, grade4Rounding.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(5).gradeRus, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionRus, grade4Rounding.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(5).gradeRus, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionRus, grade4Rounding.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(5).gradeRus, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionRus, grade4Rounding.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(5).gradeRus, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionRus, grade4Rounding.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(5).gradeRus, grade4Rounding.get(5).totalPageOfWorksheets, grade4Rounding.get(5).topicRus,
                grade4Rounding.get(5).h2Rus, grade4Rounding.get(5).shortProblemDescriptionRus, grade4Rounding.get(5).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(6).gradeRus, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionRus, grade4Rounding.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(6).gradeRus, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionRus, grade4Rounding.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(6).gradeRus, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionRus, grade4Rounding.get(6).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(6).gradeRus, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionRus, grade4Rounding.get(6).longProblemDescriptionRus,
                grade4Rounding.get(6).numbersRangeStart, grade4Rounding.get(6).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(6).gradeRus, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionRus, grade4Rounding.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(6).gradeRus, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionRus, grade4Rounding.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(6).gradeRus, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionRus, grade4Rounding.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(6).gradeRus, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionRus, grade4Rounding.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(6).gradeRus, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionRus, grade4Rounding.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(6).gradeRus, grade4Rounding.get(6).totalPageOfWorksheets, grade4Rounding.get(6).topicRus,
                grade4Rounding.get(6).h2Rus, grade4Rounding.get(6).shortProblemDescriptionRus, grade4Rounding.get(6).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(7).gradeRus, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionRus, grade4Rounding.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(7).gradeRus, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionRus, grade4Rounding.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(7).gradeRus, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionRus, grade4Rounding.get(7).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(7).gradeRus, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionRus, grade4Rounding.get(7).longProblemDescriptionRus,
                grade4Rounding.get(7).numbersRangeStart, grade4Rounding.get(7).numbersRangeEnd, 1000, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(7).gradeRus, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionRus, grade4Rounding.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(7).gradeRus, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionRus, grade4Rounding.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(7).gradeRus, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionRus, grade4Rounding.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(7).gradeRus, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionRus, grade4Rounding.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(7).gradeRus, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionRus, grade4Rounding.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(7).gradeRus, grade4Rounding.get(7).totalPageOfWorksheets, grade4Rounding.get(7).topicRus,
                grade4Rounding.get(7).h2Rus, grade4Rounding.get(7).shortProblemDescriptionRus, grade4Rounding.get(7).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(8).gradeRus, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionRus, grade4Rounding.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(8).gradeRus, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionRus, grade4Rounding.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(8).gradeRus, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionRus, grade4Rounding.get(8).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(8).gradeRus, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionRus, grade4Rounding.get(8).longProblemDescriptionRus,
                grade4Rounding.get(8).numbersRangeStart, grade4Rounding.get(8).numbersRangeEnd, 1000, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(8).gradeRus, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionRus, grade4Rounding.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(8).gradeRus, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionRus, grade4Rounding.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(8).gradeRus, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionRus, grade4Rounding.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(8).gradeRus, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionRus, grade4Rounding.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(8).gradeRus, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionRus, grade4Rounding.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(8).gradeRus, grade4Rounding.get(8).totalPageOfWorksheets, grade4Rounding.get(8).topicRus,
                grade4Rounding.get(8).h2Rus, grade4Rounding.get(8).shortProblemDescriptionRus, grade4Rounding.get(8).longProblemDescriptionRus);



        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(9).gradeRus, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionRus, grade4Rounding.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(9).gradeRus, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionRus, grade4Rounding.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(9).gradeRus, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionRus, grade4Rounding.get(9).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(9).gradeRus, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionRus, grade4Rounding.get(9).longProblemDescriptionRus,
                grade4Rounding.get(9).numbersRangeStart, grade4Rounding.get(9).numbersRangeEnd, 10000, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(9).gradeRus, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionRus, grade4Rounding.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(9).gradeRus, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionRus, grade4Rounding.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(9).gradeRus, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionRus, grade4Rounding.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(9).gradeRus, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionRus, grade4Rounding.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(9).gradeRus, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionRus, grade4Rounding.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(9).gradeRus, grade4Rounding.get(9).totalPageOfWorksheets, grade4Rounding.get(9).topicRus,
                grade4Rounding.get(9).h2Rus, grade4Rounding.get(9).shortProblemDescriptionRus, grade4Rounding.get(9).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng,
                grade4Rounding.get(0).numbersRangeStart, grade4Rounding.get(0).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets, grade4Rounding.get(0).topicEng,
                grade4Rounding.get(0).h2Eng, grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);

//Работает !!!
        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(1).gradeEng, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionEng, grade4Rounding.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(1).gradeEng, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionEng, grade4Rounding.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(1).gradeEng, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionEng, grade4Rounding.get(1).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(1).gradeEng, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionEng, grade4Rounding.get(1).longProblemDescriptionEng,
                grade4Rounding.get(1).numbersRangeStart, grade4Rounding.get(1).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(1).gradeEng, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionEng, grade4Rounding.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(1).gradeEng, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionEng, grade4Rounding.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(1).gradeEng, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionEng, grade4Rounding.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(1).gradeEng, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionEng, grade4Rounding.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(1).gradeEng, grade4Rounding.get(1).totalPageOfWorksheets,
                grade4Rounding.get(1).shortProblemDescriptionEng, grade4Rounding.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(1).gradeEng, grade4Rounding.get(1).totalPageOfWorksheets, grade4Rounding.get(1).topicEng,
                grade4Rounding.get(1).h2Eng, grade4Rounding.get(1).shortProblemDescriptionEng, grade4Rounding.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(2).gradeEng, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionEng, grade4Rounding.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(2).gradeEng, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionEng, grade4Rounding.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(2).gradeEng, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionEng, grade4Rounding.get(2).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(2).gradeEng, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionEng, grade4Rounding.get(2).longProblemDescriptionEng,
                grade4Rounding.get(2).numbersRangeStart, grade4Rounding.get(2).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(2).gradeEng, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionEng, grade4Rounding.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(2).gradeEng, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionEng, grade4Rounding.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(2).gradeEng, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionEng, grade4Rounding.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(2).gradeEng, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionEng, grade4Rounding.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(2).gradeEng, grade4Rounding.get(2).totalPageOfWorksheets,
                grade4Rounding.get(2).shortProblemDescriptionEng, grade4Rounding.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(2).gradeEng, grade4Rounding.get(2).totalPageOfWorksheets, grade4Rounding.get(2).topicEng,
                grade4Rounding.get(2).h2Eng, grade4Rounding.get(2).shortProblemDescriptionEng, grade4Rounding.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(3).gradeEng, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionEng, grade4Rounding.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(3).gradeEng, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionEng, grade4Rounding.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(3).gradeEng, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionEng, grade4Rounding.get(3).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(3).gradeEng, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionEng, grade4Rounding.get(3).longProblemDescriptionEng,
                grade4Rounding.get(3).numbersRangeStart, grade4Rounding.get(3).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(3).gradeEng, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionEng, grade4Rounding.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(3).gradeEng, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionEng, grade4Rounding.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(3).gradeEng, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionEng, grade4Rounding.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(3).gradeEng, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionEng, grade4Rounding.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(3).gradeEng, grade4Rounding.get(3).totalPageOfWorksheets,
                grade4Rounding.get(3).shortProblemDescriptionEng, grade4Rounding.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(3).gradeEng, grade4Rounding.get(3).totalPageOfWorksheets, grade4Rounding.get(3).topicEng,
                grade4Rounding.get(3).h2Eng, grade4Rounding.get(3).shortProblemDescriptionEng, grade4Rounding.get(3).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(4).gradeEng, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionEng, grade4Rounding.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(4).gradeEng, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionEng, grade4Rounding.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(4).gradeEng, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionEng, grade4Rounding.get(4).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(4).gradeEng, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionEng, grade4Rounding.get(4).longProblemDescriptionEng,
                grade4Rounding.get(4).numbersRangeStart, grade4Rounding.get(4).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(4).gradeEng, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionEng, grade4Rounding.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(4).gradeEng, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionEng, grade4Rounding.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(4).gradeEng, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionEng, grade4Rounding.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(4).gradeEng, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionEng, grade4Rounding.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(4).gradeEng, grade4Rounding.get(4).totalPageOfWorksheets,
                grade4Rounding.get(4).shortProblemDescriptionEng, grade4Rounding.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(4).gradeEng, grade4Rounding.get(4).totalPageOfWorksheets, grade4Rounding.get(4).topicEng,
                grade4Rounding.get(4).h2Eng, grade4Rounding.get(4).shortProblemDescriptionEng, grade4Rounding.get(4).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(5).gradeEng, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionEng, grade4Rounding.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(5).gradeEng, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionEng, grade4Rounding.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(5).gradeEng, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionEng, grade4Rounding.get(5).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(5).gradeEng, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionEng, grade4Rounding.get(5).longProblemDescriptionEng,
                grade4Rounding.get(5).numbersRangeStart, grade4Rounding.get(5).numbersRangeEnd, 1000, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(5).gradeEng, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionEng, grade4Rounding.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(5).gradeEng, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionEng, grade4Rounding.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(5).gradeEng, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionEng, grade4Rounding.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(5).gradeEng, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionEng, grade4Rounding.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(5).gradeEng, grade4Rounding.get(5).totalPageOfWorksheets,
                grade4Rounding.get(5).shortProblemDescriptionEng, grade4Rounding.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(5).gradeEng, grade4Rounding.get(5).totalPageOfWorksheets, grade4Rounding.get(5).topicEng,
                grade4Rounding.get(5).h2Eng, grade4Rounding.get(5).shortProblemDescriptionEng, grade4Rounding.get(5).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(6).gradeEng, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionEng, grade4Rounding.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(6).gradeEng, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionEng, grade4Rounding.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(6).gradeEng, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionEng, grade4Rounding.get(6).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(6).gradeEng, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionEng, grade4Rounding.get(6).longProblemDescriptionEng,
                grade4Rounding.get(6).numbersRangeStart, grade4Rounding.get(6).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(6).gradeEng, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionEng, grade4Rounding.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(6).gradeEng, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionEng, grade4Rounding.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(6).gradeEng, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionEng, grade4Rounding.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(6).gradeEng, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionEng, grade4Rounding.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(6).gradeEng, grade4Rounding.get(6).totalPageOfWorksheets,
                grade4Rounding.get(6).shortProblemDescriptionEng, grade4Rounding.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(6).gradeEng, grade4Rounding.get(6).totalPageOfWorksheets, grade4Rounding.get(6).topicEng,
                grade4Rounding.get(6).h2Eng, grade4Rounding.get(6).shortProblemDescriptionEng, grade4Rounding.get(6).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(7).gradeEng, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionEng, grade4Rounding.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(7).gradeEng, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionEng, grade4Rounding.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(7).gradeEng, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionEng, grade4Rounding.get(7).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(7).gradeEng, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionEng, grade4Rounding.get(7).longProblemDescriptionEng,
                grade4Rounding.get(7).numbersRangeStart, grade4Rounding.get(7).numbersRangeEnd, 1000, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(7).gradeEng, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionEng, grade4Rounding.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(7).gradeEng, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionEng, grade4Rounding.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(7).gradeEng, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionEng, grade4Rounding.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(7).gradeEng, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionEng, grade4Rounding.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(7).gradeEng, grade4Rounding.get(7).totalPageOfWorksheets,
                grade4Rounding.get(7).shortProblemDescriptionEng, grade4Rounding.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(7).gradeEng, grade4Rounding.get(7).totalPageOfWorksheets, grade4Rounding.get(7).topicEng,
                grade4Rounding.get(7).h2Eng, grade4Rounding.get(7).shortProblemDescriptionEng, grade4Rounding.get(7).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(8).gradeEng, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionEng, grade4Rounding.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(8).gradeEng, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionEng, grade4Rounding.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(8).gradeEng, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionEng, grade4Rounding.get(8).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(8).gradeEng, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionEng, grade4Rounding.get(8).longProblemDescriptionEng,
                grade4Rounding.get(8).numbersRangeStart, grade4Rounding.get(8).numbersRangeEnd, 1000, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(8).gradeEng, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionEng, grade4Rounding.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(8).gradeEng, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionEng, grade4Rounding.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(8).gradeEng, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionEng, grade4Rounding.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(8).gradeEng, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionEng, grade4Rounding.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(8).gradeEng, grade4Rounding.get(8).totalPageOfWorksheets,
                grade4Rounding.get(8).shortProblemDescriptionEng, grade4Rounding.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(8).gradeEng, grade4Rounding.get(8).totalPageOfWorksheets, grade4Rounding.get(8).topicEng,
                grade4Rounding.get(8).h2Eng, grade4Rounding.get(8).shortProblemDescriptionEng, grade4Rounding.get(8).longProblemDescriptionEng);



        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(9).gradeEng, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionEng, grade4Rounding.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(9).gradeEng, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionEng, grade4Rounding.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(9).gradeEng, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionEng, grade4Rounding.get(9).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(9).gradeEng, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionEng, grade4Rounding.get(9).longProblemDescriptionEng,
                grade4Rounding.get(9).numbersRangeStart, grade4Rounding.get(9).numbersRangeEnd, 10000, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(9).gradeEng, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionEng, grade4Rounding.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(9).gradeEng, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionEng, grade4Rounding.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(9).gradeEng, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionEng, grade4Rounding.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(9).gradeEng, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionEng, grade4Rounding.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(9).gradeEng, grade4Rounding.get(9).totalPageOfWorksheets,
                grade4Rounding.get(9).shortProblemDescriptionEng, grade4Rounding.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(9).gradeEng, grade4Rounding.get(9).totalPageOfWorksheets, grade4Rounding.get(9).topicEng,
                grade4Rounding.get(9).h2Eng, grade4Rounding.get(9).shortProblemDescriptionEng, grade4Rounding.get(9).longProblemDescriptionEng);


/*
        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(10).gradeRus, grade4Rounding.get(10).totalPageOfWorksheets,
                grade4Rounding.get(10).shortProblemDescriptionRus, grade4Rounding.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(10).gradeRus, grade4Rounding.get(10).totalPageOfWorksheets,
                grade4Rounding.get(10).shortProblemDescriptionRus, grade4Rounding.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(10).gradeRus, grade4Rounding.get(10).totalPageOfWorksheets,
                grade4Rounding.get(10).shortProblemDescriptionRus, grade4Rounding.get(10).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade4Rounding.get(10).gradeRus, grade4Rounding.get(10).totalPageOfWorksheets,
                grade4Rounding.get(10).shortProblemDescriptionRus, grade4Rounding.get(10).longProblemDescriptionRus,
                grade4Rounding.get(10).numbersRangeStart, grade4Rounding.get(10).numbersRangeEnd, 100000, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(10).gradeRus, grade4Rounding.get(10).totalPageOfWorksheets,
                grade4Rounding.get(10).shortProblemDescriptionRus, grade4Rounding.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(10).gradeRus, grade4Rounding.get(10).totalPageOfWorksheets,
                grade4Rounding.get(10).shortProblemDescriptionRus, grade4Rounding.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade4Rounding.get(10).gradeRus, grade4Rounding.get(10).totalPageOfWorksheets,
                grade4Rounding.get(10).shortProblemDescriptionRus, grade4Rounding.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(10).gradeRus, grade4Rounding.get(10).totalPageOfWorksheets,
                grade4Rounding.get(10).shortProblemDescriptionRus, grade4Rounding.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(10).gradeRus, grade4Rounding.get(10).totalPageOfWorksheets,
                grade4Rounding.get(10).shortProblemDescriptionRus, grade4Rounding.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(10).gradeRus, grade4Rounding.get(10).totalPageOfWorksheets, grade4Rounding.get(10).topicRus,
                grade4Rounding.get(10).h2Rus, grade4Rounding.get(10).shortProblemDescriptionRus, grade4Rounding.get(10).longProblemDescriptionRus);

*/


//Rounding numbers - working!
/*
        Matrix.topWorksheet(General.workingFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng );
        Matrix.numbersRoundingUnderlineWorksheetA4(General.workingFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng,
                grade4Rounding.get(0).numbersRangeStart, grade4Rounding.get(0).numbersRangeEnd, grade4Rounding.get(0).totalPageOfWorksheets, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets,
                grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade4Rounding.get(0).gradeEng, grade4Rounding.get(0).totalPageOfWorksheets, grade4Rounding.get(0).topicEng,
                grade4Rounding.get(0).h2Eng, grade4Rounding.get(0).shortProblemDescriptionEng, grade4Rounding.get(0).longProblemDescriptionEng);
*/
    }



}
