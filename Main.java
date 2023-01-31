import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //JavaBirthday 23.05.1996
        public static String getPeriodFromJavaBirthday() {
            LocalDate today = LocalDate.now();
            LocalDate birthday = LocalDate.of(1995, 05, 23);
            System.out.println(today.until(birthday, ChronoUnit.ERAS));
        }
    }
}