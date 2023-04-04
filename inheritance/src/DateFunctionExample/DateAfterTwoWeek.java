package DateFunctionExample;

import java.time.LocalDate;

public class DateAfterTwoWeek {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("today date is:- "+ today);

        LocalDate afterTwoWeeks = today.plusWeeks(2);
        System.out.println("Date after two weeks:- "+ afterTwoWeeks );
    }

}
