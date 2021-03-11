package MathPackage;

//import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Grade2AllTopics {

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

    public Grade2AllTopics(
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

        List<AllTopics> grade2AllTopicsRounding = new ArrayList<>();

// ------ Round up to 10 Numbers up to 100 end
        grade2AllTopicsRounding.add( new AllTopics(
                "2 класс.", "Grade 2.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 100.",
                "Round numbers to the nearest 10. Numbers up tо 100.",
                10, 100, 6));

        grade2AllTopicsRounding.add( new AllTopics(
                "2 класс.", "Grade 2.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 1000.",
                "Round numbers to the nearest 10. Numbers up tо 1000.",
                10, 1000, 6));

        grade2AllTopicsRounding.add( new AllTopics(
                "2 класс.", "Grade 2.",
                "Числа. Округление чисел.","Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до сотен. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest hundred. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до сотен.",
                "Round numbers to the nearest hundred.",
                "Округли числа до сотен. Числа до 1000.",
                "Round numbers to the nearest hundred. Numbers up tо 1000.",
                100, 1000, 6));

        Matrix.emptyFolder(General.workingFolder);
        Matrix.emptyFolder(General.readyFilesFolder);
        Matrix.emptyFolder(General.readyFilesFolderPdf);
        Matrix.emptyFolder(General.readyFilesFolderHtml);


// ------ up to 1000 -- end

        Matrix.topWorksheet(General.workingFolder, grade2AllTopicsRounding.get(0).gradeRus, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionRus, grade2AllTopicsRounding.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade2AllTopicsRounding.get(0).gradeRus, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionRus, grade2AllTopicsRounding.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade2AllTopicsRounding.get(0).gradeRus, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionRus, grade2AllTopicsRounding.get(0).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade2AllTopicsRounding.get(0).gradeRus, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionRus, grade2AllTopicsRounding.get(0).longProblemDescriptionRus,
                grade2AllTopicsRounding.get(0).numbersRangeStart, grade2AllTopicsRounding.get(0).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade2AllTopicsRounding.get(0).gradeRus, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionRus, grade2AllTopicsRounding.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(0).gradeRus, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionRus, grade2AllTopicsRounding.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade2AllTopicsRounding.get(0).gradeRus, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionRus, grade2AllTopicsRounding.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(0).gradeRus, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionRus, grade2AllTopicsRounding.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(0).gradeRus, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionRus, grade2AllTopicsRounding.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(0).gradeRus, grade2AllTopicsRounding.get(0).totalPageOfWorksheets, grade2AllTopicsRounding.get(0).topicRus,
                grade2AllTopicsRounding.get(0).h2Rus, grade2AllTopicsRounding.get(0).shortProblemDescriptionRus, grade2AllTopicsRounding.get(0).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, grade2AllTopicsRounding.get(1).gradeRus, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionRus, grade2AllTopicsRounding.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade2AllTopicsRounding.get(1).gradeRus, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionRus, grade2AllTopicsRounding.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade2AllTopicsRounding.get(1).gradeRus, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionRus, grade2AllTopicsRounding.get(1).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade2AllTopicsRounding.get(1).gradeRus, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionRus, grade2AllTopicsRounding.get(1).longProblemDescriptionRus,
                grade2AllTopicsRounding.get(1).numbersRangeStart, grade2AllTopicsRounding.get(1).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade2AllTopicsRounding.get(1).gradeRus, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionRus, grade2AllTopicsRounding.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(1).gradeRus, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionRus, grade2AllTopicsRounding.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade2AllTopicsRounding.get(1).gradeRus, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionRus, grade2AllTopicsRounding.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(1).gradeRus, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionRus, grade2AllTopicsRounding.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(1).gradeRus, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionRus, grade2AllTopicsRounding.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(1).gradeRus, grade2AllTopicsRounding.get(1).totalPageOfWorksheets, grade2AllTopicsRounding.get(1).topicRus,
                grade2AllTopicsRounding.get(1).h2Rus, grade2AllTopicsRounding.get(1).shortProblemDescriptionRus, grade2AllTopicsRounding.get(1).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, grade2AllTopicsRounding.get(2).gradeRus, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionRus, grade2AllTopicsRounding.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, grade2AllTopicsRounding.get(2).gradeRus, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionRus, grade2AllTopicsRounding.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade2AllTopicsRounding.get(2).gradeRus, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionRus, grade2AllTopicsRounding.get(2).longProblemDescriptionRus );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade2AllTopicsRounding.get(2).gradeRus, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionRus, grade2AllTopicsRounding.get(2).longProblemDescriptionRus,
                grade2AllTopicsRounding.get(2).numbersRangeStart, grade2AllTopicsRounding.get(2).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade2AllTopicsRounding.get(2).gradeRus, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionRus, grade2AllTopicsRounding.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(2).gradeRus, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionRus, grade2AllTopicsRounding.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade2AllTopicsRounding.get(2).gradeRus, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionRus, grade2AllTopicsRounding.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(2).gradeRus, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionRus, grade2AllTopicsRounding.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(2).gradeRus, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionRus, grade2AllTopicsRounding.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(2).gradeRus, grade2AllTopicsRounding.get(2).totalPageOfWorksheets, grade2AllTopicsRounding.get(2).topicRus,
                grade2AllTopicsRounding.get(2).h2Rus, grade2AllTopicsRounding.get(2).shortProblemDescriptionRus, grade2AllTopicsRounding.get(2).longProblemDescriptionRus);

// English
        Matrix.topWorksheet(General.workingFolder, grade2AllTopicsRounding.get(0).gradeEng, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionEng, grade2AllTopicsRounding.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade2AllTopicsRounding.get(0).gradeEng, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionEng, grade2AllTopicsRounding.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade2AllTopicsRounding.get(0).gradeEng, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionEng, grade2AllTopicsRounding.get(0).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade2AllTopicsRounding.get(0).gradeEng, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionEng, grade2AllTopicsRounding.get(0).longProblemDescriptionEng,
                grade2AllTopicsRounding.get(0).numbersRangeStart, grade2AllTopicsRounding.get(0).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade2AllTopicsRounding.get(0).gradeEng, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionEng, grade2AllTopicsRounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(0).gradeEng, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionEng, grade2AllTopicsRounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade2AllTopicsRounding.get(0).gradeEng, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionEng, grade2AllTopicsRounding.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(0).gradeEng, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionEng, grade2AllTopicsRounding.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(0).gradeEng, grade2AllTopicsRounding.get(0).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(0).shortProblemDescriptionEng, grade2AllTopicsRounding.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(0).gradeEng, grade2AllTopicsRounding.get(0).totalPageOfWorksheets, grade2AllTopicsRounding.get(0).topicEng,
                grade2AllTopicsRounding.get(0).h2Eng, grade2AllTopicsRounding.get(0).shortProblemDescriptionEng, grade2AllTopicsRounding.get(0).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, grade2AllTopicsRounding.get(1).gradeEng, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionEng, grade2AllTopicsRounding.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade2AllTopicsRounding.get(1).gradeEng, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionEng, grade2AllTopicsRounding.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade2AllTopicsRounding.get(1).gradeEng, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionEng, grade2AllTopicsRounding.get(1).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade2AllTopicsRounding.get(1).gradeEng, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionEng, grade2AllTopicsRounding.get(1).longProblemDescriptionEng,
                grade2AllTopicsRounding.get(1).numbersRangeStart, grade2AllTopicsRounding.get(1).numbersRangeEnd, 10, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade2AllTopicsRounding.get(1).gradeEng, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionEng, grade2AllTopicsRounding.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(1).gradeEng, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionEng, grade2AllTopicsRounding.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade2AllTopicsRounding.get(1).gradeEng, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionEng, grade2AllTopicsRounding.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(1).gradeEng, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionEng, grade2AllTopicsRounding.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(1).gradeEng, grade2AllTopicsRounding.get(1).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(1).shortProblemDescriptionEng, grade2AllTopicsRounding.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(1).gradeEng, grade2AllTopicsRounding.get(1).totalPageOfWorksheets, grade2AllTopicsRounding.get(1).topicEng,
                grade2AllTopicsRounding.get(1).h2Eng, grade2AllTopicsRounding.get(1).shortProblemDescriptionEng, grade2AllTopicsRounding.get(1).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, grade2AllTopicsRounding.get(2).gradeEng, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionEng, grade2AllTopicsRounding.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, grade2AllTopicsRounding.get(2).gradeEng, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionEng, grade2AllTopicsRounding.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, grade2AllTopicsRounding.get(2).gradeEng, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionEng, grade2AllTopicsRounding.get(2).longProblemDescriptionEng );
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, grade2AllTopicsRounding.get(2).gradeEng, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionEng, grade2AllTopicsRounding.get(2).longProblemDescriptionEng,
                grade2AllTopicsRounding.get(2).numbersRangeStart, grade2AllTopicsRounding.get(2).numbersRangeEnd, 100, 17, 4);
        Matrix.bottomWorksheet(General.workingFolder, grade2AllTopicsRounding.get(2).gradeEng, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionEng, grade2AllTopicsRounding.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(2).gradeEng, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionEng, grade2AllTopicsRounding.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, grade2AllTopicsRounding.get(2).gradeEng, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionEng, grade2AllTopicsRounding.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(2).gradeEng, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionEng, grade2AllTopicsRounding.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(2).gradeEng, grade2AllTopicsRounding.get(2).totalPageOfWorksheets,
                grade2AllTopicsRounding.get(2).shortProblemDescriptionEng, grade2AllTopicsRounding.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, grade2AllTopicsRounding.get(2).gradeEng, grade2AllTopicsRounding.get(2).totalPageOfWorksheets, grade2AllTopicsRounding.get(2).topicEng,
                grade2AllTopicsRounding.get(2).h2Eng, grade2AllTopicsRounding.get(2).shortProblemDescriptionEng, grade2AllTopicsRounding.get(2).longProblemDescriptionEng);



    }

}
