import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionTester {
    public static void main(String[] args) {
        CheckedExceptionTester checkedExceptionTester = new CheckedExceptionTester();
        checkedExceptionTester.urlTesterByTryCach("http://wszib.edu.pl");


    }

    public void urlTesterByTryCach(String urlstr) {
        try {
        URL url = new URL(urlstr);
            System.out.println("Tutaj nie wejdziemy ...");
        System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());

    } catch(MalformedURLException murle) {
            System.out.println("Obsługujemy wyjątek...");
           // murle.printStackTrace();
        }

        System.out.println("Program działa nadal...");
        }


        public void urlTesterByThrows(String urlStr) throws MalformedURLException {

        URL url = new URL(urlStr);

        }



}
