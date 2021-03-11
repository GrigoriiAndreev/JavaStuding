package MathPackage;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class readAllLinks {

    public static Set<String> uniqueURL = new HashSet<String>();
    public static String my_site= "https://magazin-integral.ru/";
    public static int urlsCounter = 0;


    public static void main(String[] args) {

        readAllLinks obj = new readAllLinks();
//        my_site = "derevenski-pogrebok.ru";
        obj.get_links("https://magazin-integral.ru/5-klass/biologiya-5-klass");

        System.out.println("All urls = ");
        for(String urls : uniqueURL )
            System.out.println(urls);

        //write links to Excel

    }

    void get_links(String url) {
        try {
            Document doc = Jsoup.connect(url).userAgent("Mozilla").get();
            Elements links = doc.select("a");

            if (links.isEmpty()) {
                return;
            }

            links.stream().map((link) -> link.attr("abs:href")).forEachOrdered((this_url) -> {
                boolean add = uniqueURL.add(this_url);
                if (add && this_url.contains(my_site)) {
                    System.out.println(this_url);
                    uniqueURL.add(this_url);
                    urlsCounter++;
                    System.out.println(urlsCounter);
                    get_links(this_url);
                }
            });

        } catch (IOException ex) {

        }

    }
}