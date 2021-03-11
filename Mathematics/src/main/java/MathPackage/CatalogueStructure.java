package MathPackage;

/*
There are the methods for creating folders and files structure and archiving all kind of important files
 */

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Stack;

import static MathPackage.General.mainRoot;

public class CatalogueStructure extends General {

    //    public static String mainRoot = "d:/Java_Math";
//    public static File mainRoot = new File(General.mainRoot);
//    public static File workingFolder = new File(General.workingFolder);
//    public static File savedObjects = new File("d:/Java_Math/savedObjects");
//    public static File readyWorksheets = new File("d:/Java_Math/savedObjects");
    public static List<String> allGradesFoldersRu = new ArrayList<>();
    public static List<String> allGradesFoldersEn = new ArrayList<>();
    public static List<String> allTypesOfFiles = new ArrayList<>();
    public static List<String> topics4GradeRus = new ArrayList<>();
    public static List<String> topics4GradeEng = new ArrayList<>();

    static int countFiles = 0;
    static int countDir = 0;

    static {

        // Creating grades Rus
        allGradesFoldersRu.add(mainRoot + "/Детский сад");
        allGradesFoldersRu.add(mainRoot + "/1 класс");
        allGradesFoldersRu.add(mainRoot + "/2 класс");
        allGradesFoldersRu.add(mainRoot + "/3 класс");
        allGradesFoldersRu.add(mainRoot + "/4 класс");
        allGradesFoldersRu.add(mainRoot + "/5 класс");
        allGradesFoldersRu.add(mainRoot + "/6 класс");
        allGradesFoldersRu.add(mainRoot + "/7 класс");
        allGradesFoldersRu.add(mainRoot + "/8 класс");
        allGradesFoldersRu.add(mainRoot + "/9 класс");
        allGradesFoldersRu.add(mainRoot + "/10 класс");
        allGradesFoldersRu.add(mainRoot + "/11 класс");

        //Creating grades - Eng
        allGradesFoldersEn.add(mainRoot + "/Kindergarten");
        allGradesFoldersEn.add(mainRoot + "/Grade-1");
        allGradesFoldersEn.add(mainRoot + "/Grade-2");
        allGradesFoldersEn.add(mainRoot + "/Grade-3");
        allGradesFoldersEn.add(mainRoot + "/Grade-4");
        allGradesFoldersEn.add(mainRoot + "/Grade-5");
        allGradesFoldersEn.add(mainRoot + "/Grade-6");

        //There are the topics (inside of grades)
        topics4GradeRus.add(allGradesFoldersRu.get(4) + "/Числа и счет");
        topics4GradeEng.add(allGradesFoldersEn.get(4) + "/Numbers and count");

        //Types of topics (inside of topics)
        allTypesOfFiles.add("/Pdf");
        allTypesOfFiles.add("/Html");
        allTypesOfFiles.add("/Jpg");
        allTypesOfFiles.add("/Zip");
        allTypesOfFiles.add("/Archived");
        allTypesOfFiles.add("/Temporary");
        allTypesOfFiles.add("/SocialNetworks");

    }

    public static void main(String[] args) throws IOException {


        //    Creating all folders structure for project.
        //Main root
        if (new File(mainRoot).exists())
            System.out.println("Main root exists");
        else new File(mainRoot).mkdir();
        System.out.println("Main root created");

        //Grades
        for (String gradeFolders : allGradesFoldersRu)
            if (!new File(gradeFolders).exists())
                new File(gradeFolders).mkdir();

        for (String gradeFolders : allGradesFoldersEn)
            if (!new File(gradeFolders).exists())
                new File(gradeFolders).mkdir();

        //Topics inside of grades
        for (String topics : topics4GradeRus) {
            if (!new File(topics).exists()) {
                new File(topics).mkdir();
                for (String types : allTypesOfFiles)
                    new File(topics + types).mkdir();
            }
        }

        List<String> allFiles = new ArrayList<>();
        allFiles = getFileTree(mainRoot);


        System.out.println("Have done! ");
        Path filePath;

        for(String file : allFiles)
            System.out.println(file);

        System.out.println(" Dirs = " + countDir + "Files  = " +countFiles );
        System.out.println("----------------------------------------");

        //r- read, файл открыт только для чтения
        RandomAccessFile raf = new RandomAccessFile("d:/Java_Math/Pdf/4 класс. Округли числа до ближайшего десятка. Вариант 1 .Pdf.html", "r");
// «курсор» стоит на 0-м символе.
        String text1 = raf.readLine();
        System.out.println(text1);

//перемещаем «курсор» на 100-й символ.
        raf.seek(100);
        String text2 = raf.readLine();
        System.out.println(text2);
//перемещаем «курсор» на 0-й символ.
        raf.seek(0);
        String text3 = raf.readLine();
        System.out.println(text3);

//закрываем файл
        raf.close();

    }

    public static List<String> getFileTree(String root) throws IOException {
        List<String> result = new ArrayList<>();

        EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        Files.walkFileTree(Paths.get(root), options, 20, new GetFiles(result));

        return result;
    }



    public static class GetFiles extends SimpleFileVisitor<Path> {
        private List<String> result;

        public GetFiles(List<String> result) {
            this.result = result;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            countDir++;
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            String s = path.toAbsolutePath().toString();
            result.add(s);
            countFiles++;
            return FileVisitResult.CONTINUE;
        }
    }
}

