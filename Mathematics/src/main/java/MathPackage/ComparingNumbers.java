package MathPackage;

import java.util.ArrayList;
import java.util.List;

public class ComparingNumbers {

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

    public ComparingNumbers(
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
        this.totalPageOfWorksheets = totalPageOfWorksheets;
    }


    public static void main(String[] args) throws Exception {

        Matrix.emptyFolder(General.workingFolder);
        Matrix.emptyFolder(General.readyFilesFolder);
        Matrix.emptyFolder(General.readyFilesFolderPdf);
        Matrix.emptyFolder(General.readyFilesFolderHtml);

//Сравнение чисел

        List<ComparingNumbers> comparingNumbers = new ArrayList<>();

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение чисел до 10.", "Compare numbers up to 10.",
                "Задачи по математике на тему:<br />Сравнение чисел до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение чисел до 10.",
                "Numbers comparing. Compare numbers up to 10.",
                "Сравни числа до 10 и поставь правильно знак.",
                "Compare numbers up to 10. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(0).gradeRus, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionRus, comparingNumbers.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(0).gradeRus, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionRus, comparingNumbers.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(0).gradeRus, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionRus, comparingNumbers.get(0).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(0).gradeRus, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionRus, comparingNumbers.get(0).longProblemDescriptionRus,
                comparingNumbers.get(0).numbersRangeStart, comparingNumbers.get(0).numbersRangeEnd, 10, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(0).gradeRus, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionRus, comparingNumbers.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(0).gradeRus, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionRus, comparingNumbers.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(0).gradeRus, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionRus, comparingNumbers.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(0).gradeRus, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionRus, comparingNumbers.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(0).gradeRus, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionRus, comparingNumbers.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(0).gradeRus, comparingNumbers.get(0).totalPageOfWorksheets, comparingNumbers.get(0).topicRus,
                comparingNumbers.get(0).h2Rus, comparingNumbers.get(0).shortProblemDescriptionRus, comparingNumbers.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(0).gradeEng, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionEng, comparingNumbers.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(0).gradeEng, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionEng, comparingNumbers.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(0).gradeEng, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionEng, comparingNumbers.get(0).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(0).gradeEng, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionEng, comparingNumbers.get(0).longProblemDescriptionEng,
                comparingNumbers.get(0).numbersRangeStart, comparingNumbers.get(0).numbersRangeEnd, 10, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(0).gradeEng, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionEng, comparingNumbers.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(0).gradeEng, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionEng, comparingNumbers.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(0).gradeEng, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionEng, comparingNumbers.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(0).gradeEng, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionEng, comparingNumbers.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(0).gradeEng, comparingNumbers.get(0).totalPageOfWorksheets,
                comparingNumbers.get(0).shortProblemDescriptionEng, comparingNumbers.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(0).gradeEng, comparingNumbers.get(0).totalPageOfWorksheets, comparingNumbers.get(0).topicEng,
                comparingNumbers.get(0).h2Eng, comparingNumbers.get(0).shortProblemDescriptionEng, comparingNumbers.get(0).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение чисел до 20.", "Compare numbers up to 20.",
                "Задачи по математике на тему:<br />Сравнение чисел до 20. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 20. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение чисел до 20.",
                "Numbers comparing. Compare numbers up to 20.",
                "Сравни числа до 20 и поставь правильно знак.",
                "Compare numbers up to 20. Fill in the correct sign.",
                1, 20, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(1).gradeRus, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionRus, comparingNumbers.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(1).gradeRus, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionRus, comparingNumbers.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(1).gradeRus, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionRus, comparingNumbers.get(1).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(1).gradeRus, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionRus, comparingNumbers.get(1).longProblemDescriptionRus,
                comparingNumbers.get(1).numbersRangeStart, comparingNumbers.get(1).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(1).gradeRus, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionRus, comparingNumbers.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(1).gradeRus, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionRus, comparingNumbers.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(1).gradeRus, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionRus, comparingNumbers.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(1).gradeRus, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionRus, comparingNumbers.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(1).gradeRus, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionRus, comparingNumbers.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(1).gradeRus, comparingNumbers.get(1).totalPageOfWorksheets, comparingNumbers.get(1).topicRus,
                comparingNumbers.get(1).h2Rus, comparingNumbers.get(1).shortProblemDescriptionRus, comparingNumbers.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(1).gradeEng, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionEng, comparingNumbers.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(1).gradeEng, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionEng, comparingNumbers.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(1).gradeEng, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionEng, comparingNumbers.get(1).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(1).gradeEng, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionEng, comparingNumbers.get(1).longProblemDescriptionEng,
                comparingNumbers.get(1).numbersRangeStart, comparingNumbers.get(1).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(1).gradeEng, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionEng, comparingNumbers.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(1).gradeEng, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionEng, comparingNumbers.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(1).gradeEng, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionEng, comparingNumbers.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(1).gradeEng, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionEng, comparingNumbers.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(1).gradeEng, comparingNumbers.get(1).totalPageOfWorksheets,
                comparingNumbers.get(1).shortProblemDescriptionEng, comparingNumbers.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(1).gradeEng, comparingNumbers.get(1).totalPageOfWorksheets, comparingNumbers.get(1).topicEng,
                comparingNumbers.get(1).h2Eng, comparingNumbers.get(1).shortProblemDescriptionEng, comparingNumbers.get(1).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение чисел до 50.", "Compare numbers up to 50.",
                "Задачи по математике на тему:<br />Сравнение чисел до 50. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 50. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение чисел до 50.",
                "Numbers comparing. Compare numbers up to 50.",
                "Сравни числа до 50 и поставь правильно знак.",
                "Compare numbers up to 50. Fill in the correct sign.",
                1, 50, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(2).gradeRus, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionRus, comparingNumbers.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(2).gradeRus, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionRus, comparingNumbers.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(2).gradeRus, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionRus, comparingNumbers.get(2).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(2).gradeRus, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionRus, comparingNumbers.get(2).longProblemDescriptionRus,
                comparingNumbers.get(2).numbersRangeStart, comparingNumbers.get(2).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(2).gradeRus, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionRus, comparingNumbers.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(2).gradeRus, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionRus, comparingNumbers.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(2).gradeRus, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionRus, comparingNumbers.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(2).gradeRus, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionRus, comparingNumbers.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(2).gradeRus, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionRus, comparingNumbers.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(2).gradeRus, comparingNumbers.get(2).totalPageOfWorksheets, comparingNumbers.get(2).topicRus,
                comparingNumbers.get(2).h2Rus, comparingNumbers.get(2).shortProblemDescriptionRus, comparingNumbers.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(2).gradeEng, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionEng, comparingNumbers.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(2).gradeEng, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionEng, comparingNumbers.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(2).gradeEng, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionEng, comparingNumbers.get(2).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(2).gradeEng, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionEng, comparingNumbers.get(2).longProblemDescriptionEng,
                comparingNumbers.get(2).numbersRangeStart, comparingNumbers.get(2).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(2).gradeEng, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionEng, comparingNumbers.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(2).gradeEng, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionEng, comparingNumbers.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(2).gradeEng, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionEng, comparingNumbers.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(2).gradeEng, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionEng, comparingNumbers.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(2).gradeEng, comparingNumbers.get(2).totalPageOfWorksheets,
                comparingNumbers.get(2).shortProblemDescriptionEng, comparingNumbers.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(2).gradeEng, comparingNumbers.get(2).totalPageOfWorksheets, comparingNumbers.get(2).topicEng,
                comparingNumbers.get(2).h2Eng, comparingNumbers.get(2).shortProblemDescriptionEng, comparingNumbers.get(2).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение чисел до 100.", "Compare numbers up to 100.",
                "Задачи по математике на тему:<br />Сравнение чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение чисел до 100.",
                "Numbers comparing. Compare numbers up to 100.",
                "Сравни числа до 100 и поставь правильно знак.",
                "Compare numbers up to 100. Fill in the correct sign.",
                1, 100, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(3).gradeRus, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionRus, comparingNumbers.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(3).gradeRus, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionRus, comparingNumbers.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(3).gradeRus, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionRus, comparingNumbers.get(3).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(3).gradeRus, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionRus, comparingNumbers.get(3).longProblemDescriptionRus,
                comparingNumbers.get(3).numbersRangeStart, comparingNumbers.get(3).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(3).gradeRus, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionRus, comparingNumbers.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(3).gradeRus, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionRus, comparingNumbers.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(3).gradeRus, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionRus, comparingNumbers.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(3).gradeRus, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionRus, comparingNumbers.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(3).gradeRus, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionRus, comparingNumbers.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(3).gradeRus, comparingNumbers.get(3).totalPageOfWorksheets, comparingNumbers.get(3).topicRus,
                comparingNumbers.get(3).h2Rus, comparingNumbers.get(3).shortProblemDescriptionRus, comparingNumbers.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(3).gradeEng, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionEng, comparingNumbers.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(3).gradeEng, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionEng, comparingNumbers.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(3).gradeEng, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionEng, comparingNumbers.get(3).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(3).gradeEng, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionEng, comparingNumbers.get(3).longProblemDescriptionEng,
                comparingNumbers.get(3).numbersRangeStart, comparingNumbers.get(3).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(3).gradeEng, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionEng, comparingNumbers.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(3).gradeEng, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionEng, comparingNumbers.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(3).gradeEng, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionEng, comparingNumbers.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(3).gradeEng, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionEng, comparingNumbers.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(3).gradeEng, comparingNumbers.get(3).totalPageOfWorksheets,
                comparingNumbers.get(3).shortProblemDescriptionEng, comparingNumbers.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(3).gradeEng, comparingNumbers.get(3).totalPageOfWorksheets, comparingNumbers.get(3).topicEng,
                comparingNumbers.get(3).h2Eng, comparingNumbers.get(3).shortProblemDescriptionEng, comparingNumbers.get(3).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение чисел до 1000.", "Compare numbers up to 1000.",
                "Задачи по математике на тему:<br />Сравнение чисел до 1000. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 1000. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение чисел до 1000.",
                "Numbers comparing. Compare numbers up to 1000.",
                "Сравни числа до 1000 и поставь правильно знак.",
                "Compare numbers up to 1000. Fill in the correct sign.",
                1, 1000, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(4).gradeRus, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionRus, comparingNumbers.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(4).gradeRus, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionRus, comparingNumbers.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(4).gradeRus, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionRus, comparingNumbers.get(4).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(4).gradeRus, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionRus, comparingNumbers.get(4).longProblemDescriptionRus,
                comparingNumbers.get(4).numbersRangeStart, comparingNumbers.get(4).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(4).gradeRus, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionRus, comparingNumbers.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(4).gradeRus, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionRus, comparingNumbers.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(4).gradeRus, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionRus, comparingNumbers.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(4).gradeRus, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionRus, comparingNumbers.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(4).gradeRus, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionRus, comparingNumbers.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(4).gradeRus, comparingNumbers.get(4).totalPageOfWorksheets, comparingNumbers.get(4).topicRus,
                comparingNumbers.get(4).h2Rus, comparingNumbers.get(4).shortProblemDescriptionRus, comparingNumbers.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(4).gradeEng, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionEng, comparingNumbers.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(4).gradeEng, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionEng, comparingNumbers.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(4).gradeEng, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionEng, comparingNumbers.get(4).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(4).gradeEng, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionEng, comparingNumbers.get(4).longProblemDescriptionEng,
                comparingNumbers.get(4).numbersRangeStart, comparingNumbers.get(4).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(4).gradeEng, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionEng, comparingNumbers.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(4).gradeEng, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionEng, comparingNumbers.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(4).gradeEng, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionEng, comparingNumbers.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(4).gradeEng, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionEng, comparingNumbers.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(4).gradeEng, comparingNumbers.get(4).totalPageOfWorksheets,
                comparingNumbers.get(4).shortProblemDescriptionEng, comparingNumbers.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(4).gradeEng, comparingNumbers.get(4).totalPageOfWorksheets, comparingNumbers.get(4).topicEng,
                comparingNumbers.get(4).h2Eng, comparingNumbers.get(4).shortProblemDescriptionEng, comparingNumbers.get(4).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение числа 1.", "Compare numbers up to 10. Number 1.",
                "Задачи по математике на тему:<br />Сравнение числа 1. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Number 1. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение числа 1.",
                "Numbers comparing. Compare numbers up to 10. Number 1.",
                "Сравни число 1 с другими числами и поставь правильно знак сравнения.",
                "Compare numbers up to 10. Number 1. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(5).gradeRus, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionRus, comparingNumbers.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(5).gradeRus, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionRus, comparingNumbers.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(5).gradeRus, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionRus, comparingNumbers.get(5).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(5).gradeRus, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionRus, comparingNumbers.get(5).longProblemDescriptionRus,
                comparingNumbers.get(5).numbersRangeStart, comparingNumbers.get(5).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(5).gradeRus, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionRus, comparingNumbers.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(5).gradeRus, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionRus, comparingNumbers.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(5).gradeRus, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionRus, comparingNumbers.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(5).gradeRus, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionRus, comparingNumbers.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(5).gradeRus, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionRus, comparingNumbers.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(5).gradeRus, comparingNumbers.get(5).totalPageOfWorksheets, comparingNumbers.get(5).topicRus,
                comparingNumbers.get(5).h2Rus, comparingNumbers.get(5).shortProblemDescriptionRus, comparingNumbers.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(5).gradeEng, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionEng, comparingNumbers.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(5).gradeEng, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionEng, comparingNumbers.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(5).gradeEng, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionEng, comparingNumbers.get(5).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(5).gradeEng, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionEng, comparingNumbers.get(5).longProblemDescriptionEng,
                comparingNumbers.get(5).numbersRangeStart, comparingNumbers.get(5).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(5).gradeEng, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionEng, comparingNumbers.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(5).gradeEng, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionEng, comparingNumbers.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(5).gradeEng, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionEng, comparingNumbers.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(5).gradeEng, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionEng, comparingNumbers.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(5).gradeEng, comparingNumbers.get(5).totalPageOfWorksheets,
                comparingNumbers.get(5).shortProblemDescriptionEng, comparingNumbers.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(5).gradeEng, comparingNumbers.get(5).totalPageOfWorksheets, comparingNumbers.get(5).topicEng,
                comparingNumbers.get(5).h2Eng, comparingNumbers.get(5).shortProblemDescriptionEng, comparingNumbers.get(5).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение числа 2.", "Compare numbers up to 10. Number 2.",
                "Задачи по математике на тему:<br />Сравнение числа 2. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Number 2. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение числа 2.",
                "Numbers comparing. Compare numbers up to 10. Number 2.",
                "Сравни число 2 с другими числами и поставь правильно знак сравнения.",
                "Compare numbers up to 10. Number 2. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(6).gradeRus, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionRus, comparingNumbers.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(6).gradeRus, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionRus, comparingNumbers.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(6).gradeRus, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionRus, comparingNumbers.get(6).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(6).gradeRus, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionRus, comparingNumbers.get(6).longProblemDescriptionRus,
                comparingNumbers.get(6).numbersRangeStart, comparingNumbers.get(6).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(6).gradeRus, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionRus, comparingNumbers.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(6).gradeRus, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionRus, comparingNumbers.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(6).gradeRus, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionRus, comparingNumbers.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(6).gradeRus, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionRus, comparingNumbers.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(6).gradeRus, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionRus, comparingNumbers.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(6).gradeRus, comparingNumbers.get(6).totalPageOfWorksheets, comparingNumbers.get(6).topicRus,
                comparingNumbers.get(6).h2Rus, comparingNumbers.get(6).shortProblemDescriptionRus, comparingNumbers.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(6).gradeEng, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionEng, comparingNumbers.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(6).gradeEng, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionEng, comparingNumbers.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(6).gradeEng, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionEng, comparingNumbers.get(6).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(6).gradeEng, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionEng, comparingNumbers.get(6).longProblemDescriptionEng,
                comparingNumbers.get(6).numbersRangeStart, comparingNumbers.get(6).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(6).gradeEng, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionEng, comparingNumbers.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(6).gradeEng, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionEng, comparingNumbers.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(6).gradeEng, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionEng, comparingNumbers.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(6).gradeEng, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionEng, comparingNumbers.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(6).gradeEng, comparingNumbers.get(6).totalPageOfWorksheets,
                comparingNumbers.get(6).shortProblemDescriptionEng, comparingNumbers.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(6).gradeEng, comparingNumbers.get(6).totalPageOfWorksheets, comparingNumbers.get(6).topicEng,
                comparingNumbers.get(6).h2Eng, comparingNumbers.get(6).shortProblemDescriptionEng, comparingNumbers.get(6).longProblemDescriptionEng);
        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение числа 3.", "Compare numbers up to 10. Number 3.",
                "Задачи по математике на тему:<br />Сравнение числа 3. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Number 3. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение числа 3.",
                "Numbers comparing. Compare numbers up to 10. Number 3.",
                "Сравни число 3 с другими числами и поставь правильно знак сравнения.",
                "Compare numbers up to 10. Number 3. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(7).gradeRus, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionRus, comparingNumbers.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(7).gradeRus, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionRus, comparingNumbers.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(7).gradeRus, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionRus, comparingNumbers.get(7).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(7).gradeRus, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionRus, comparingNumbers.get(7).longProblemDescriptionRus,
                comparingNumbers.get(7).numbersRangeStart, comparingNumbers.get(7).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(7).gradeRus, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionRus, comparingNumbers.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(7).gradeRus, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionRus, comparingNumbers.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(7).gradeRus, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionRus, comparingNumbers.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(7).gradeRus, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionRus, comparingNumbers.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(7).gradeRus, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionRus, comparingNumbers.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(7).gradeRus, comparingNumbers.get(7).totalPageOfWorksheets, comparingNumbers.get(7).topicRus,
                comparingNumbers.get(7).h2Rus, comparingNumbers.get(7).shortProblemDescriptionRus, comparingNumbers.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(7).gradeEng, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionEng, comparingNumbers.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(7).gradeEng, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionEng, comparingNumbers.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(7).gradeEng, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionEng, comparingNumbers.get(7).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(7).gradeEng, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionEng, comparingNumbers.get(7).longProblemDescriptionEng,
                comparingNumbers.get(7).numbersRangeStart, comparingNumbers.get(7).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(7).gradeEng, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionEng, comparingNumbers.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(7).gradeEng, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionEng, comparingNumbers.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(7).gradeEng, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionEng, comparingNumbers.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(7).gradeEng, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionEng, comparingNumbers.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(7).gradeEng, comparingNumbers.get(7).totalPageOfWorksheets,
                comparingNumbers.get(7).shortProblemDescriptionEng, comparingNumbers.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(7).gradeEng, comparingNumbers.get(7).totalPageOfWorksheets, comparingNumbers.get(7).topicEng,
                comparingNumbers.get(7).h2Eng, comparingNumbers.get(7).shortProblemDescriptionEng, comparingNumbers.get(7).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение числа 4.", "Compare numbers up to 10. Number 4.",
                "Задачи по математике на тему:<br />Сравнение числа 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Number 4. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение числа 4.",
                "Numbers comparing. Compare numbers up to 10. Number 4.",
                "Сравни число 4 с другими числами и поставь правильно знак сравнения.",
                "Compare numbers up to 10. Number 4. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(8).gradeRus, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionRus, comparingNumbers.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(8).gradeRus, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionRus, comparingNumbers.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(8).gradeRus, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionRus, comparingNumbers.get(8).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(8).gradeRus, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionRus, comparingNumbers.get(8).longProblemDescriptionRus,
                comparingNumbers.get(8).numbersRangeStart, comparingNumbers.get(8).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(8).gradeRus, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionRus, comparingNumbers.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(8).gradeRus, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionRus, comparingNumbers.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(8).gradeRus, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionRus, comparingNumbers.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(8).gradeRus, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionRus, comparingNumbers.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(8).gradeRus, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionRus, comparingNumbers.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(8).gradeRus, comparingNumbers.get(8).totalPageOfWorksheets, comparingNumbers.get(8).topicRus,
                comparingNumbers.get(8).h2Rus, comparingNumbers.get(8).shortProblemDescriptionRus, comparingNumbers.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(8).gradeEng, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionEng, comparingNumbers.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(8).gradeEng, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionEng, comparingNumbers.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(8).gradeEng, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionEng, comparingNumbers.get(8).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(8).gradeEng, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionEng, comparingNumbers.get(8).longProblemDescriptionEng,
                comparingNumbers.get(8).numbersRangeStart, comparingNumbers.get(8).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(8).gradeEng, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionEng, comparingNumbers.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(8).gradeEng, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionEng, comparingNumbers.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(8).gradeEng, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionEng, comparingNumbers.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(8).gradeEng, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionEng, comparingNumbers.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(8).gradeEng, comparingNumbers.get(8).totalPageOfWorksheets,
                comparingNumbers.get(8).shortProblemDescriptionEng, comparingNumbers.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(8).gradeEng, comparingNumbers.get(8).totalPageOfWorksheets, comparingNumbers.get(8).topicEng,
                comparingNumbers.get(8).h2Eng, comparingNumbers.get(8).shortProblemDescriptionEng, comparingNumbers.get(8).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение числа 5.", "Compare numbers up to 10. Number 5.",
                "Задачи по математике на тему:<br />Сравнение числа 5. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Number 5. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение числа 5.",
                "Numbers comparing. Compare numbers up to 10. Number 5.",
                "Сравни число 5 с другими числами и поставь правильно знак сравнения.",
                "Compare numbers up to 10. Number 5. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(9).gradeRus, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionRus, comparingNumbers.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(9).gradeRus, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionRus, comparingNumbers.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(9).gradeRus, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionRus, comparingNumbers.get(9).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(9).gradeRus, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionRus, comparingNumbers.get(9).longProblemDescriptionRus,
                comparingNumbers.get(9).numbersRangeStart, comparingNumbers.get(9).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(9).gradeRus, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionRus, comparingNumbers.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(9).gradeRus, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionRus, comparingNumbers.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(9).gradeRus, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionRus, comparingNumbers.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(9).gradeRus, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionRus, comparingNumbers.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(9).gradeRus, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionRus, comparingNumbers.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(9).gradeRus, comparingNumbers.get(9).totalPageOfWorksheets, comparingNumbers.get(9).topicRus,
                comparingNumbers.get(9).h2Rus, comparingNumbers.get(9).shortProblemDescriptionRus, comparingNumbers.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(9).gradeEng, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionEng, comparingNumbers.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(9).gradeEng, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionEng, comparingNumbers.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(9).gradeEng, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionEng, comparingNumbers.get(9).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(9).gradeEng, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionEng, comparingNumbers.get(9).longProblemDescriptionEng,
                comparingNumbers.get(9).numbersRangeStart, comparingNumbers.get(9).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(9).gradeEng, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionEng, comparingNumbers.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(9).gradeEng, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionEng, comparingNumbers.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(9).gradeEng, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionEng, comparingNumbers.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(9).gradeEng, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionEng, comparingNumbers.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(9).gradeEng, comparingNumbers.get(9).totalPageOfWorksheets,
                comparingNumbers.get(9).shortProblemDescriptionEng, comparingNumbers.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(9).gradeEng, comparingNumbers.get(9).totalPageOfWorksheets, comparingNumbers.get(9).topicEng,
                comparingNumbers.get(9).h2Eng, comparingNumbers.get(9).shortProblemDescriptionEng, comparingNumbers.get(9).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение числа 6.", "Compare numbers up to 10. Number 6.",
                "Задачи по математике на тему:<br />Сравнение числа 6. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Number 6. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение числа 6.",
                "Numbers comparing. Compare numbers up to 10. Number 6.",
                "Сравни число 6 с другими числами и поставь правильно знак сравнения.",
                "Compare numbers up to 10. Number 6. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(10).gradeRus, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionRus, comparingNumbers.get(10).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(10).gradeRus, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionRus, comparingNumbers.get(10).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(10).gradeRus, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionRus, comparingNumbers.get(10).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(10).gradeRus, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionRus, comparingNumbers.get(10).longProblemDescriptionRus,
                comparingNumbers.get(10).numbersRangeStart, comparingNumbers.get(10).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(10).gradeRus, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionRus, comparingNumbers.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(10).gradeRus, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionRus, comparingNumbers.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(10).gradeRus, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionRus, comparingNumbers.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(10).gradeRus, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionRus, comparingNumbers.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(10).gradeRus, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionRus, comparingNumbers.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(10).gradeRus, comparingNumbers.get(10).totalPageOfWorksheets, comparingNumbers.get(10).topicRus,
                comparingNumbers.get(10).h2Rus, comparingNumbers.get(10).shortProblemDescriptionRus, comparingNumbers.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(10).gradeEng, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionEng, comparingNumbers.get(10).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(10).gradeEng, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionEng, comparingNumbers.get(10).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(10).gradeEng, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionEng, comparingNumbers.get(10).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(10).gradeEng, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionEng, comparingNumbers.get(10).longProblemDescriptionEng,
                comparingNumbers.get(10).numbersRangeStart, comparingNumbers.get(10).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(10).gradeEng, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionEng, comparingNumbers.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(10).gradeEng, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionEng, comparingNumbers.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(10).gradeEng, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionEng, comparingNumbers.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(10).gradeEng, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionEng, comparingNumbers.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(10).gradeEng, comparingNumbers.get(10).totalPageOfWorksheets,
                comparingNumbers.get(10).shortProblemDescriptionEng, comparingNumbers.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(10).gradeEng, comparingNumbers.get(10).totalPageOfWorksheets, comparingNumbers.get(10).topicEng,
                comparingNumbers.get(10).h2Eng, comparingNumbers.get(10).shortProblemDescriptionEng, comparingNumbers.get(10).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение числа 7.", "Compare numbers up to 10. Number 7.",
                "Задачи по математике на тему:<br />Сравнение числа 7. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Number 7. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение числа 7.",
                "Numbers comparing. Compare numbers up to 10. Number 7.",
                "Сравни число 7 с другими числами и поставь правильно знак сравнения.",
                "Compare numbers up to 10. Number 7. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(11).gradeRus, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionRus, comparingNumbers.get(11).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(11).gradeRus, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionRus, comparingNumbers.get(11).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(11).gradeRus, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionRus, comparingNumbers.get(11).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(11).gradeRus, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionRus, comparingNumbers.get(11).longProblemDescriptionRus,
                comparingNumbers.get(11).numbersRangeStart, comparingNumbers.get(11).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(11).gradeRus, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionRus, comparingNumbers.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(11).gradeRus, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionRus, comparingNumbers.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(11).gradeRus, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionRus, comparingNumbers.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(11).gradeRus, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionRus, comparingNumbers.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(11).gradeRus, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionRus, comparingNumbers.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(11).gradeRus, comparingNumbers.get(11).totalPageOfWorksheets, comparingNumbers.get(11).topicRus,
                comparingNumbers.get(11).h2Rus, comparingNumbers.get(11).shortProblemDescriptionRus, comparingNumbers.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(11).gradeEng, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionEng, comparingNumbers.get(11).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(11).gradeEng, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionEng, comparingNumbers.get(11).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(11).gradeEng, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionEng, comparingNumbers.get(11).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(11).gradeEng, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionEng, comparingNumbers.get(11).longProblemDescriptionEng,
                comparingNumbers.get(11).numbersRangeStart, comparingNumbers.get(11).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(11).gradeEng, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionEng, comparingNumbers.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(11).gradeEng, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionEng, comparingNumbers.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(11).gradeEng, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionEng, comparingNumbers.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(11).gradeEng, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionEng, comparingNumbers.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(11).gradeEng, comparingNumbers.get(11).totalPageOfWorksheets,
                comparingNumbers.get(11).shortProblemDescriptionEng, comparingNumbers.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(11).gradeEng, comparingNumbers.get(11).totalPageOfWorksheets, comparingNumbers.get(11).topicEng,
                comparingNumbers.get(11).h2Eng, comparingNumbers.get(11).shortProblemDescriptionEng, comparingNumbers.get(11).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение числа 8.", "Compare numbers up to 10. Number 8.",
                "Задачи по математике на тему:<br />Сравнение числа 8. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Number 8. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение числа 8.",
                "Numbers comparing. Compare numbers up to 10. Number 8.",
                "Сравни число 8 с другими числами и поставь правильно знак сравнения.",
                "Compare numbers up to 10. Number 8. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(12).gradeRus, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionRus, comparingNumbers.get(12).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(12).gradeRus, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionRus, comparingNumbers.get(12).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(12).gradeRus, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionRus, comparingNumbers.get(12).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(12).gradeRus, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionRus, comparingNumbers.get(12).longProblemDescriptionRus,
                comparingNumbers.get(12).numbersRangeStart, comparingNumbers.get(12).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(12).gradeRus, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionRus, comparingNumbers.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(12).gradeRus, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionRus, comparingNumbers.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(12).gradeRus, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionRus, comparingNumbers.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(12).gradeRus, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionRus, comparingNumbers.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(12).gradeRus, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionRus, comparingNumbers.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(12).gradeRus, comparingNumbers.get(12).totalPageOfWorksheets, comparingNumbers.get(12).topicRus,
                comparingNumbers.get(12).h2Rus, comparingNumbers.get(12).shortProblemDescriptionRus, comparingNumbers.get(12).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(12).gradeEng, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionEng, comparingNumbers.get(12).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(12).gradeEng, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionEng, comparingNumbers.get(12).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(12).gradeEng, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionEng, comparingNumbers.get(12).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(12).gradeEng, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionEng, comparingNumbers.get(12).longProblemDescriptionEng,
                comparingNumbers.get(12).numbersRangeStart, comparingNumbers.get(12).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(12).gradeEng, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionEng, comparingNumbers.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(12).gradeEng, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionEng, comparingNumbers.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(12).gradeEng, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionEng, comparingNumbers.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(12).gradeEng, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionEng, comparingNumbers.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(12).gradeEng, comparingNumbers.get(12).totalPageOfWorksheets,
                comparingNumbers.get(12).shortProblemDescriptionEng, comparingNumbers.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(12).gradeEng, comparingNumbers.get(12).totalPageOfWorksheets, comparingNumbers.get(12).topicEng,
                comparingNumbers.get(12).h2Eng, comparingNumbers.get(12).shortProblemDescriptionEng, comparingNumbers.get(12).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение числа 9.", "Compare numbers up to 10. Number 9.",
                "Задачи по математике на тему:<br />Сравнение числа 9. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Number 9. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение числа 9.",
                "Numbers comparing. Compare numbers up to 10. Number 9.",
                "Сравни число 9 с другими числами и поставь правильно знак сравнения.",
                "Compare numbers up to 10. Number 9. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(13).gradeRus, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionRus, comparingNumbers.get(13).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(13).gradeRus, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionRus, comparingNumbers.get(13).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(13).gradeRus, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionRus, comparingNumbers.get(13).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(13).gradeRus, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionRus, comparingNumbers.get(13).longProblemDescriptionRus,
                comparingNumbers.get(13).numbersRangeStart, comparingNumbers.get(13).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(13).gradeRus, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionRus, comparingNumbers.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(13).gradeRus, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionRus, comparingNumbers.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(13).gradeRus, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionRus, comparingNumbers.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(13).gradeRus, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionRus, comparingNumbers.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(13).gradeRus, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionRus, comparingNumbers.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(13).gradeRus, comparingNumbers.get(13).totalPageOfWorksheets, comparingNumbers.get(13).topicRus,
                comparingNumbers.get(13).h2Rus, comparingNumbers.get(13).shortProblemDescriptionRus, comparingNumbers.get(13).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(13).gradeEng, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionEng, comparingNumbers.get(13).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(13).gradeEng, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionEng, comparingNumbers.get(13).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(13).gradeEng, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionEng, comparingNumbers.get(13).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(13).gradeEng, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionEng, comparingNumbers.get(13).longProblemDescriptionEng,
                comparingNumbers.get(13).numbersRangeStart, comparingNumbers.get(13).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(13).gradeEng, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionEng, comparingNumbers.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(13).gradeEng, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionEng, comparingNumbers.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(13).gradeEng, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionEng, comparingNumbers.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(13).gradeEng, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionEng, comparingNumbers.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(13).gradeEng, comparingNumbers.get(13).totalPageOfWorksheets,
                comparingNumbers.get(13).shortProblemDescriptionEng, comparingNumbers.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(13).gradeEng, comparingNumbers.get(13).totalPageOfWorksheets, comparingNumbers.get(13).topicEng,
                comparingNumbers.get(13).h2Eng, comparingNumbers.get(13).shortProblemDescriptionEng, comparingNumbers.get(13).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение числа 10.", "Compare numbers up to 10. Number 10.",
                "Задачи по математике на тему:<br />Сравнение числа 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Number 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение числа 10.",
                "Numbers comparing. Compare numbers up to 10. Number 10.",
                "Сравни число 10 с другими числами и поставь правильно знак сравнения.",
                "Compare numbers up to 10. Number 10. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(14).gradeRus, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionRus, comparingNumbers.get(14).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(14).gradeRus, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionRus, comparingNumbers.get(14).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(14).gradeRus, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionRus, comparingNumbers.get(14).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(14).gradeRus, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionRus, comparingNumbers.get(14).longProblemDescriptionRus,
                comparingNumbers.get(14).numbersRangeStart, comparingNumbers.get(14).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(14).gradeRus, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionRus, comparingNumbers.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(14).gradeRus, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionRus, comparingNumbers.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(14).gradeRus, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionRus, comparingNumbers.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(14).gradeRus, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionRus, comparingNumbers.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(14).gradeRus, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionRus, comparingNumbers.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(14).gradeRus, comparingNumbers.get(14).totalPageOfWorksheets, comparingNumbers.get(14).topicRus,
                comparingNumbers.get(14).h2Rus, comparingNumbers.get(14).shortProblemDescriptionRus, comparingNumbers.get(14).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(14).gradeEng, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionEng, comparingNumbers.get(14).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(14).gradeEng, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionEng, comparingNumbers.get(14).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(14).gradeEng, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionEng, comparingNumbers.get(14).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(14).gradeEng, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionEng, comparingNumbers.get(14).longProblemDescriptionEng,
                comparingNumbers.get(14).numbersRangeStart, comparingNumbers.get(14).numbersRangeEnd, 20, 12, 7);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(14).gradeEng, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionEng, comparingNumbers.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(14).gradeEng, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionEng, comparingNumbers.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(14).gradeEng, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionEng, comparingNumbers.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(14).gradeEng, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionEng, comparingNumbers.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(14).gradeEng, comparingNumbers.get(14).totalPageOfWorksheets,
                comparingNumbers.get(14).shortProblemDescriptionEng, comparingNumbers.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(14).gradeEng, comparingNumbers.get(14).totalPageOfWorksheets, comparingNumbers.get(14).topicEng,
                comparingNumbers.get(14).h2Eng, comparingNumbers.get(14).shortProblemDescriptionEng, comparingNumbers.get(14).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение целых чисел.", "Compare integers.",
                "Задачи по математике на тему:<br />Сравнение целых чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare integers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение целых чисел.",
                "Numbers comparing. Compare integers.",
                "Сравни целые числа с другими числами и поставь правильно знак сравнения.",
                "Compare integers. Fill in the correct sign.",
                1, 100, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(15).gradeRus, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionRus, comparingNumbers.get(15).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(15).gradeRus, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionRus, comparingNumbers.get(15).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(15).gradeRus, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionRus, comparingNumbers.get(15).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(15).gradeRus, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionRus, comparingNumbers.get(15).longProblemDescriptionRus,
                comparingNumbers.get(15).numbersRangeStart, comparingNumbers.get(15).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(15).gradeRus, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionRus, comparingNumbers.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(15).gradeRus, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionRus, comparingNumbers.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(15).gradeRus, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionRus, comparingNumbers.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(15).gradeRus, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionRus, comparingNumbers.get(15).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(15).gradeRus, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionRus, comparingNumbers.get(15).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(15).gradeRus, comparingNumbers.get(15).totalPageOfWorksheets, comparingNumbers.get(15).topicRus,
                comparingNumbers.get(15).h2Rus, comparingNumbers.get(15).shortProblemDescriptionRus, comparingNumbers.get(15).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(15).gradeEng, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionEng, comparingNumbers.get(15).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(15).gradeEng, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionEng, comparingNumbers.get(15).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(15).gradeEng, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionEng, comparingNumbers.get(15).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(15).gradeEng, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionEng, comparingNumbers.get(15).longProblemDescriptionEng,
                comparingNumbers.get(15).numbersRangeStart, comparingNumbers.get(15).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(15).gradeEng, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionEng, comparingNumbers.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(15).gradeEng, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionEng, comparingNumbers.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(15).gradeEng, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionEng, comparingNumbers.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(15).gradeEng, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionEng, comparingNumbers.get(15).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(15).gradeEng, comparingNumbers.get(15).totalPageOfWorksheets,
                comparingNumbers.get(15).shortProblemDescriptionEng, comparingNumbers.get(15).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(15).gradeEng, comparingNumbers.get(15).totalPageOfWorksheets, comparingNumbers.get(15).topicEng,
                comparingNumbers.get(15).h2Eng, comparingNumbers.get(15).shortProblemDescriptionEng, comparingNumbers.get(15).longProblemDescriptionEng);

        comparingNumbers.add(new ComparingNumbers(
                "&ensp;", "&nbsp;",
                "Сравнение отрицательных чисел.", "Compare negative numbers.",
                "Задачи по математике на тему:<br />Сравнение отрицательных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare negative numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение отрицательных чисел.",
                "Numbers comparing. Compare negative numbers.",
                "Сравни отрицательные числа и поставь правильно знак сравнения.",
                "Compare negative numbers. Fill in the correct sign.",
                1, 100, 6));

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(16).gradeRus, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionRus, comparingNumbers.get(16).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(16).gradeRus, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionRus, comparingNumbers.get(16).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(16).gradeRus, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionRus, comparingNumbers.get(16).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(16).gradeRus, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionRus, comparingNumbers.get(16).longProblemDescriptionRus,
                comparingNumbers.get(16).numbersRangeStart, comparingNumbers.get(16).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(16).gradeRus, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionRus, comparingNumbers.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(16).gradeRus, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionRus, comparingNumbers.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(16).gradeRus, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionRus, comparingNumbers.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(16).gradeRus, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionRus, comparingNumbers.get(16).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(16).gradeRus, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionRus, comparingNumbers.get(16).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(16).gradeRus, comparingNumbers.get(16).totalPageOfWorksheets, comparingNumbers.get(16).topicRus,
                comparingNumbers.get(16).h2Rus, comparingNumbers.get(16).shortProblemDescriptionRus, comparingNumbers.get(16).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, comparingNumbers.get(16).gradeEng, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionEng, comparingNumbers.get(16).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, comparingNumbers.get(16).gradeEng, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionEng, comparingNumbers.get(16).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, comparingNumbers.get(16).gradeEng, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionEng, comparingNumbers.get(16).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, comparingNumbers.get(16).gradeEng, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionEng, comparingNumbers.get(16).longProblemDescriptionEng,
                comparingNumbers.get(16).numbersRangeStart, comparingNumbers.get(16).numbersRangeEnd, 20, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, comparingNumbers.get(16).gradeEng, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionEng, comparingNumbers.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(16).gradeEng, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionEng, comparingNumbers.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, comparingNumbers.get(16).gradeEng, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionEng, comparingNumbers.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(16).gradeEng, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionEng, comparingNumbers.get(16).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(16).gradeEng, comparingNumbers.get(16).totalPageOfWorksheets,
                comparingNumbers.get(16).shortProblemDescriptionEng, comparingNumbers.get(16).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, comparingNumbers.get(16).gradeEng, comparingNumbers.get(16).totalPageOfWorksheets, comparingNumbers.get(16).topicEng,
                comparingNumbers.get(16).h2Eng, comparingNumbers.get(16).shortProblemDescriptionEng, comparingNumbers.get(16).longProblemDescriptionEng);

    }

}
