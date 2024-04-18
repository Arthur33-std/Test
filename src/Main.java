import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2004, Month.JULY, 1));
        unsortedDates.add(LocalDate.of(2005, Month.JANUARY, 2));
        unsortedDates.add(LocalDate.of(2007, Month.JANUARY, 1));
        unsortedDates.add(LocalDate.of(2032, Month.MAY, 3));

        DateSorter dateSorter = new DateSorter();

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        for (LocalDate date : sortedDates){
            System.out.println(date);
        }
    }
}

