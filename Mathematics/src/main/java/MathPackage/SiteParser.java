package MathPackage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//import javax.lang.model.util.Elements;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SiteParser {
/*
    String siteRoot = "https://derevenski-pogrebok.ru";
    Set<String> urls;
*/

    public static void main(String[] args) throws IOException {

        Set<String> links = new HashSet();
        String siteRoot = "https://derevenski-pogrebok.ru";

        System.out.println("All urls");


        Document doc = Jsoup.connect(siteRoot).get();
        Elements elements = doc.select("a");
        for (Element element : elements) {
            System.out.println(element.absUrl("href"));
            links.add(element.absUrl("href")); //<-------HERE*****
        }

/*
    for(int i = 0; i < links .size(); i++)
        doc = Jsoup.connect(links.get(i)).get();
        //do whatever you want

*/

    }
}
