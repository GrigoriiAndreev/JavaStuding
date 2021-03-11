package MathPackage;

import java.util.ArrayList;
import java.util.List;

public class Grade3AllTopics {

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

    public Grade3AllTopics(
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
            int numbersRangeEnd) {
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
        this.numbersRangeEnd = numbersRangeEnd;    }

    public static void main(String[] args) throws Exception {

        List<AllTopics> grade3AllTopicsRounding = new ArrayList<>();

        grade3AllTopicsRounding.add( new AllTopics(
                "3 класс.", "Grade 3.",
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

        grade3AllTopicsRounding.add( new AllTopics(
                "3 класс.", "Grade 3.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 1000.",
                "Round numbers to the nearest 10. Numbers up tо 1000.",
                10, 1000, 6));

        grade3AllTopicsRounding.add( new AllTopics(
                "3 класс.", "Grade 3.",
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

        grade3AllTopicsRounding.add( new AllTopics(
                "3 класс.", "Grade 3.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 10000.",
                "Round numbers to the nearest 10. Numbers up tо 10000.",
                10, 10000, 6));

        grade3AllTopicsRounding.add( new AllTopics(
                "3 класс.", "Grade 3.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до сотен. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest hundred. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до сотен.",
                "Round numbers to the nearest hundred.",
                "Округли числа до сотен. Числа до 10000.",
                "Round numbers to the nearest hundred. Numbers up tо 10000.",
                100, 10000, 6));

        grade3AllTopicsRounding.add( new AllTopics(
                "3 класс.", "Grade 3.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до сотен. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest hundred. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до тысяч.",
                "Round numbers to the nearest thousand.",
                "Округли числа до тысяч. Числа до 10000.",
                "Round numbers to the nearest thousand. Numbers up tо 10000.",
                1000, 10000, 6));

        Matrix.emptyFolder(General.workingFolder);
        Matrix.emptyFolder(General.readyFilesFolder);
        Matrix.emptyFolder(General.readyFilesFolderPdf);
        Matrix.emptyFolder(General.readyFilesFolderHtml);

/*
        Matrix.topWorksheet(General.workingFolder, grade3AllTopics.get(0).gradeRus, 6,
                grade3AllTopics.get(0).shortProblemDescriptionRus, grade3AllTopics.get(0).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopics.get(0).gradeRus, 6,
                grade3AllTopics.get(0).shortProblemDescriptionRus, grade3AllTopics.get(0).longProblemDescriptionRus,
                1000, 8999, 10, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopics.get(0).gradeRus, 6,
                grade3AllTopics.get(0).shortProblemDescriptionRus, grade3AllTopics.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopics.get(0).gradeRus, 6,
                grade3AllTopics.get(0).shortProblemDescriptionRus, grade3AllTopics.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopics.get(0).gradeRus, 6,
                grade3AllTopics.get(0).shortProblemDescriptionRus, grade3AllTopics.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopics.get(0).gradeRus, 6, grade3AllTopics.get(0).topicRus,
                grade3AllTopics.get(0).h2Rus, grade3AllTopics.get(0).shortProblemDescriptionRus, grade3AllTopics.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, grade3AllTopics.get(0).gradeEng, 6,
                grade3AllTopics.get(0).shortProblemDescriptionEng, grade3AllTopics.get(0).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopics.get(0).gradeEng, 6,
                grade3AllTopics.get(0).shortProblemDescriptionEng, grade3AllTopics.get(0).longProblemDescriptionEng,
                10, 89, 10, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopics.get(0).gradeEng, 6,
                grade3AllTopics.get(0).shortProblemDescriptionEng, grade3AllTopics.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopics.get(0).gradeEng, 6,
                grade3AllTopics.get(0).shortProblemDescriptionEng, grade3AllTopics.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopics.get(0).gradeEng, 6,
                grade3AllTopics.get(0).shortProblemDescriptionEng, grade3AllTopics.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopics.get(0).gradeEng, 6, grade3AllTopics.get(0).topicEng,
                grade3AllTopics.get(0).h2Eng, grade3AllTopics.get(0).shortProblemDescriptionEng, grade3AllTopics.get(0).longProblemDescriptionEng);
*/

// ------ up to 1000 -- end

        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(0).gradeRus, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionRus, grade3AllTopicsRounding.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(0).gradeRus, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionRus, grade3AllTopicsRounding.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(0).gradeRus, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionRus, grade3AllTopicsRounding.get(0).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(0).gradeRus, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionRus, grade3AllTopicsRounding.get(0).longProblemDescriptionRus,
                grade3AllTopicsRounding.get(0).numbersRangeStart, grade3AllTopicsRounding.get(0).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(0).gradeRus, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionRus, grade3AllTopicsRounding.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(0).gradeRus, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionRus, grade3AllTopicsRounding.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(0).gradeRus, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionRus, grade3AllTopicsRounding.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(0).gradeRus, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionRus, grade3AllTopicsRounding.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(0).gradeRus, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionRus, grade3AllTopicsRounding.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(0).gradeRus, grade3AllTopicsRounding.get(0).totalPageOfWorksheets, grade3AllTopicsRounding.get(0).topicRus,
                grade3AllTopicsRounding.get(0).h2Rus, grade3AllTopicsRounding.get(0).shortProblemDescriptionRus, grade3AllTopicsRounding.get(0).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(1).gradeRus, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionRus, grade3AllTopicsRounding.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(1).gradeRus, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionRus, grade3AllTopicsRounding.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(1).gradeRus, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionRus, grade3AllTopicsRounding.get(1).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(1).gradeRus, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionRus, grade3AllTopicsRounding.get(1).longProblemDescriptionRus,
                grade3AllTopicsRounding.get(1).numbersRangeStart, grade3AllTopicsRounding.get(1).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(1).gradeRus, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionRus, grade3AllTopicsRounding.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(1).gradeRus, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionRus, grade3AllTopicsRounding.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(1).gradeRus, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionRus, grade3AllTopicsRounding.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(1).gradeRus, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionRus, grade3AllTopicsRounding.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(1).gradeRus, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionRus, grade3AllTopicsRounding.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(1).gradeRus, grade3AllTopicsRounding.get(1).totalPageOfWorksheets, grade3AllTopicsRounding.get(1).topicRus,
                grade3AllTopicsRounding.get(1).h2Rus, grade3AllTopicsRounding.get(1).shortProblemDescriptionRus, grade3AllTopicsRounding.get(1).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(2).gradeRus, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionRus, grade3AllTopicsRounding.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(2).gradeRus, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionRus, grade3AllTopicsRounding.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(2).gradeRus, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionRus, grade3AllTopicsRounding.get(2).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(2).gradeRus, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionRus, grade3AllTopicsRounding.get(2).longProblemDescriptionRus,
                grade3AllTopicsRounding.get(2).numbersRangeStart, grade3AllTopicsRounding.get(2).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(2).gradeRus, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionRus, grade3AllTopicsRounding.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(2).gradeRus, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionRus, grade3AllTopicsRounding.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(2).gradeRus, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionRus, grade3AllTopicsRounding.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(2).gradeRus, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionRus, grade3AllTopicsRounding.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(2).gradeRus, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionRus, grade3AllTopicsRounding.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(2).gradeRus, grade3AllTopicsRounding.get(2).totalPageOfWorksheets, grade3AllTopicsRounding.get(2).topicRus,
                grade3AllTopicsRounding.get(2).h2Rus, grade3AllTopicsRounding.get(2).shortProblemDescriptionRus, grade3AllTopicsRounding.get(2).longProblemDescriptionRus);



        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(3).gradeRus, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionRus, grade3AllTopicsRounding.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(3).gradeRus, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionRus, grade3AllTopicsRounding.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(3).gradeRus, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionRus, grade3AllTopicsRounding.get(3).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(3).gradeRus, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionRus, grade3AllTopicsRounding.get(3).longProblemDescriptionRus,
                grade3AllTopicsRounding.get(3).numbersRangeStart, grade3AllTopicsRounding.get(3).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(3).gradeRus, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionRus, grade3AllTopicsRounding.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(3).gradeRus, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionRus, grade3AllTopicsRounding.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(3).gradeRus, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionRus, grade3AllTopicsRounding.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(3).gradeRus, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionRus, grade3AllTopicsRounding.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(3).gradeRus, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionRus, grade3AllTopicsRounding.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(3).gradeRus, grade3AllTopicsRounding.get(3).totalPageOfWorksheets, grade3AllTopicsRounding.get(3).topicRus,
                grade3AllTopicsRounding.get(3).h2Rus, grade3AllTopicsRounding.get(3).shortProblemDescriptionRus, grade3AllTopicsRounding.get(3).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(4).gradeRus, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionRus, grade3AllTopicsRounding.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(4).gradeRus, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionRus, grade3AllTopicsRounding.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(4).gradeRus, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionRus, grade3AllTopicsRounding.get(4).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(4).gradeRus, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionRus, grade3AllTopicsRounding.get(4).longProblemDescriptionRus,
                grade3AllTopicsRounding.get(4).numbersRangeStart, grade3AllTopicsRounding.get(4).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(4).gradeRus, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionRus, grade3AllTopicsRounding.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(4).gradeRus, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionRus, grade3AllTopicsRounding.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(4).gradeRus, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionRus, grade3AllTopicsRounding.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(4).gradeRus, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionRus, grade3AllTopicsRounding.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(4).gradeRus, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionRus, grade3AllTopicsRounding.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(4).gradeRus, grade3AllTopicsRounding.get(4).totalPageOfWorksheets, grade3AllTopicsRounding.get(4).topicRus,
                grade3AllTopicsRounding.get(4).h2Rus, grade3AllTopicsRounding.get(4).shortProblemDescriptionRus, grade3AllTopicsRounding.get(4).longProblemDescriptionRus);



        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(5).gradeRus, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionRus, grade3AllTopicsRounding.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(5).gradeRus, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionRus, grade3AllTopicsRounding.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(5).gradeRus, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionRus, grade3AllTopicsRounding.get(5).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(5).gradeRus, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionRus, grade3AllTopicsRounding.get(5).longProblemDescriptionRus,
                grade3AllTopicsRounding.get(5).numbersRangeStart, grade3AllTopicsRounding.get(5).numbersRangeEnd, 1000, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(5).gradeRus, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionRus, grade3AllTopicsRounding.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(5).gradeRus, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionRus, grade3AllTopicsRounding.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(5).gradeRus, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionRus, grade3AllTopicsRounding.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(5).gradeRus, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionRus, grade3AllTopicsRounding.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(5).gradeRus, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionRus, grade3AllTopicsRounding.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(5).gradeRus, grade3AllTopicsRounding.get(5).totalPageOfWorksheets, grade3AllTopicsRounding.get(5).topicRus,
                grade3AllTopicsRounding.get(5).h2Rus, grade3AllTopicsRounding.get(5).shortProblemDescriptionRus, grade3AllTopicsRounding.get(5).longProblemDescriptionRus);


        // ------ up to 1000 -- end

        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(0).gradeEng, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionEng, grade3AllTopicsRounding.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(0).gradeEng, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionEng, grade3AllTopicsRounding.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(0).gradeEng, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionEng, grade3AllTopicsRounding.get(0).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(0).gradeEng, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionEng, grade3AllTopicsRounding.get(0).longProblemDescriptionEng,
                grade3AllTopicsRounding.get(0).numbersRangeStart, grade3AllTopicsRounding.get(0).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(0).gradeEng, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionEng, grade3AllTopicsRounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(0).gradeEng, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionEng, grade3AllTopicsRounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(0).gradeEng, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionEng, grade3AllTopicsRounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(0).gradeEng, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionEng, grade3AllTopicsRounding.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(0).gradeEng, grade3AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(0).shortProblemDescriptionEng, grade3AllTopicsRounding.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(0).gradeEng, grade3AllTopicsRounding.get(0).totalPageOfWorksheets, grade3AllTopicsRounding.get(0).topicEng,
                grade3AllTopicsRounding.get(0).h2Eng, grade3AllTopicsRounding.get(0).shortProblemDescriptionEng, grade3AllTopicsRounding.get(0).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(1).gradeEng, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionEng, grade3AllTopicsRounding.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(1).gradeEng, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionEng, grade3AllTopicsRounding.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(1).gradeEng, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionEng, grade3AllTopicsRounding.get(1).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(1).gradeEng, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionEng, grade3AllTopicsRounding.get(1).longProblemDescriptionEng,
                grade3AllTopicsRounding.get(1).numbersRangeStart, grade3AllTopicsRounding.get(1).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(1).gradeEng, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionEng, grade3AllTopicsRounding.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(1).gradeEng, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionEng, grade3AllTopicsRounding.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(1).gradeEng, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionEng, grade3AllTopicsRounding.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(1).gradeEng, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionEng, grade3AllTopicsRounding.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(1).gradeEng, grade3AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(1).shortProblemDescriptionEng, grade3AllTopicsRounding.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(1).gradeEng, grade3AllTopicsRounding.get(1).totalPageOfWorksheets, grade3AllTopicsRounding.get(1).topicEng,
                grade3AllTopicsRounding.get(1).h2Eng, grade3AllTopicsRounding.get(1).shortProblemDescriptionEng, grade3AllTopicsRounding.get(1).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(2).gradeEng, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionEng, grade3AllTopicsRounding.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(2).gradeEng, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionEng, grade3AllTopicsRounding.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(2).gradeEng, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionEng, grade3AllTopicsRounding.get(2).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(2).gradeEng, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionEng, grade3AllTopicsRounding.get(2).longProblemDescriptionEng,
                grade3AllTopicsRounding.get(2).numbersRangeStart, grade3AllTopicsRounding.get(2).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(2).gradeEng, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionEng, grade3AllTopicsRounding.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(2).gradeEng, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionEng, grade3AllTopicsRounding.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(2).gradeEng, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionEng, grade3AllTopicsRounding.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(2).gradeEng, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionEng, grade3AllTopicsRounding.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(2).gradeEng, grade3AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(2).shortProblemDescriptionEng, grade3AllTopicsRounding.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(2).gradeEng, grade3AllTopicsRounding.get(2).totalPageOfWorksheets, grade3AllTopicsRounding.get(2).topicEng,
                grade3AllTopicsRounding.get(2).h2Eng, grade3AllTopicsRounding.get(2).shortProblemDescriptionEng, grade3AllTopicsRounding.get(2).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(3).gradeEng, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionEng, grade3AllTopicsRounding.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(3).gradeEng, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionEng, grade3AllTopicsRounding.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(3).gradeEng, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionEng, grade3AllTopicsRounding.get(3).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(3).gradeEng, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionEng, grade3AllTopicsRounding.get(3).longProblemDescriptionEng,
                grade3AllTopicsRounding.get(3).numbersRangeStart, grade3AllTopicsRounding.get(3).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(3).gradeEng, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionEng, grade3AllTopicsRounding.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(3).gradeEng, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionEng, grade3AllTopicsRounding.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(3).gradeEng, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionEng, grade3AllTopicsRounding.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(3).gradeEng, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionEng, grade3AllTopicsRounding.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(3).gradeEng, grade3AllTopicsRounding.get(3).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(3).shortProblemDescriptionEng, grade3AllTopicsRounding.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(3).gradeEng, grade3AllTopicsRounding.get(3).totalPageOfWorksheets, grade3AllTopicsRounding.get(3).topicEng,
                grade3AllTopicsRounding.get(3).h2Eng, grade3AllTopicsRounding.get(3).shortProblemDescriptionEng, grade3AllTopicsRounding.get(3).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(4).gradeEng, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionEng, grade3AllTopicsRounding.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(4).gradeEng, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionEng, grade3AllTopicsRounding.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(4).gradeEng, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionEng, grade3AllTopicsRounding.get(4).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(4).gradeEng, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionEng, grade3AllTopicsRounding.get(4).longProblemDescriptionEng,
                grade3AllTopicsRounding.get(4).numbersRangeStart, grade3AllTopicsRounding.get(4).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(4).gradeEng, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionEng, grade3AllTopicsRounding.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(4).gradeEng, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionEng, grade3AllTopicsRounding.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(4).gradeEng, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionEng, grade3AllTopicsRounding.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(4).gradeEng, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionEng, grade3AllTopicsRounding.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(4).gradeEng, grade3AllTopicsRounding.get(4).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(4).shortProblemDescriptionEng, grade3AllTopicsRounding.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(4).gradeEng, grade3AllTopicsRounding.get(4).totalPageOfWorksheets, grade3AllTopicsRounding.get(4).topicEng,
                grade3AllTopicsRounding.get(4).h2Eng, grade3AllTopicsRounding.get(4).shortProblemDescriptionEng, grade3AllTopicsRounding.get(4).longProblemDescriptionEng);



        Matrix.topWorksheet(General.workingFolder, grade3AllTopicsRounding.get(5).gradeEng, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionEng, grade3AllTopicsRounding.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade3AllTopicsRounding.get(5).gradeEng, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionEng, grade3AllTopicsRounding.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade3AllTopicsRounding.get(5).gradeEng, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionEng, grade3AllTopicsRounding.get(5).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade3AllTopicsRounding.get(5).gradeEng, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionEng, grade3AllTopicsRounding.get(5).longProblemDescriptionEng,
                grade3AllTopicsRounding.get(5).numbersRangeStart, grade3AllTopicsRounding.get(5).numbersRangeEnd, 1000, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade3AllTopicsRounding.get(5).gradeEng, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionEng, grade3AllTopicsRounding.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(5).gradeEng, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionEng, grade3AllTopicsRounding.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade3AllTopicsRounding.get(5).gradeEng, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionEng, grade3AllTopicsRounding.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(5).gradeEng, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionEng, grade3AllTopicsRounding.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(5).gradeEng, grade3AllTopicsRounding.get(5).totalPageOfWorksheets,
                grade3AllTopicsRounding.get(5).shortProblemDescriptionEng, grade3AllTopicsRounding.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade3AllTopicsRounding.get(5).gradeEng, grade3AllTopicsRounding.get(5).totalPageOfWorksheets, grade3AllTopicsRounding.get(5).topicEng,
                grade3AllTopicsRounding.get(5).h2Eng, grade3AllTopicsRounding.get(5).shortProblemDescriptionEng, grade3AllTopicsRounding.get(5).longProblemDescriptionEng);



    }

}
