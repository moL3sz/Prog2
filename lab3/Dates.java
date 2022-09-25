import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        System.out.println(formatter.format(ldt)); 






        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Format: ");
            String format = scanner.nextLine();

            System.out.println("Date: ");
            String date = scanner.nextLine();
            
            LocalDate ldate = LocalDate.parse(date, DateTimeFormatter.ofPattern(format));
            LocalDate p120 = ldate.plusDays(120);
            DayOfWeek dow = DayOfWeek.from(p120);
            System.out.println(dow);
        }

    }
}
