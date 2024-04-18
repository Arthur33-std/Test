import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class DateSorter {
    public static Collection<LocalDate> sortDates(List<LocalDate> dates) {

        return dates.stream()
                .sorted(Comparator.comparing((LocalDate date) -> !date.getMonth().name().contains("R"))
                        .thenComparing((localDate1, localDate2) -> localDate1.getMonth().name().contains("R") ?
                                localDate1.compareTo(localDate2) : localDate2.compareTo(localDate1)))
                .toList();
    }
}
