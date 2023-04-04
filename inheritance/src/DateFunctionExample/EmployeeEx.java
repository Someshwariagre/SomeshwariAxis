package DateFunctionExample;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeEx {
    public static void main(String[] args) {
        LocalDate ct = LocalDate.now();
        System.out.println("Today date:- "+ct);
        LocalDate jd = LocalDate.of(2015,9,21);
        System.out.println("Joining date:- "+ jd);
        Period exp = Period.between(jd,ct);
        System.out.println( "experience is:- "+exp.getYears()+ " years " +exp.getMonths()+" month "+ exp.getDays()+ " days ");
    }
}
