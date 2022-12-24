import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[ ] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("0811", "Александр", "Овечкин", "Михайлович", LocalDate.now().minusYears(37)));
        passports.add(new Passport("0801", "Юрий", "Долгорукий", "Владимирович", LocalDate.now().minusYears(100)));
        passports.add(new Passport("1109", "Александр", "Овечкин", "Михайлович", LocalDate.now().minusYears(14)));
        passports.add(new Passport("3315", "Ибрагим", "Магамедов", "Исаевич", LocalDate.now().minusYears(87)));
        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);


    }

}
