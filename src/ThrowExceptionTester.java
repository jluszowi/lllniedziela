public class ThrowExceptionTester {
    public static void main(String[] args) {

        ThrowExceptionTester throwExceptionTester = new ThrowExceptionTester();


        int hours = -3;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = throwExceptionTester.getNumberOfSeconds(hours);
        } catch (IllegalArgumentException iae) {
            numberOfSeconds = throwExceptionTester.getNumberOfSeconds(hours * -1);
        }

        System.out.println("Liczba sekund to: " + numberOfSeconds);

    }

    public  int getNumberOfSeconds(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Liczba godzin musi być >= 0" + hours);
        }

        return hours * 60 * 60;

    }
}
