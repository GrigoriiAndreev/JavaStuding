package MathPackage;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
//import com.sun.tools.javac.util.Convert;

import java.io.*;
//import gui.ava.html.image.generator.HtmlImageGenerator;
import java.io.File;


public class Converters {

    public static void generatePDFFromHTML(String filename) throws IOException, DocumentException {
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document,
                new FileOutputStream("d:/Java_Math/ReadyWorksheets/1.pdf"));
        document.open();
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream(filename));
        document.close();
    }

}
