import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistrationTest {
    static Registration[] registrations = new Registration[25];

    public static void main(String[] args) {
        setup();
        // 1(44)
        // Maxcountonsingleday();
        // 2(10)
        // Eventsforeachathlete1();
        // 3(29)
        // Statswithvowel();
        // 4(24)
        // Eventnames();
        //5(35)
        //mostRegistrationOctober();
        // 6(13)
        Eventsinoct();

    }

    public static void setup() {

        registrations[0] = new Registration(1, "Marathon", "John Doe", LocalDate.of(2023, 10, 1));
        registrations[1] = new Registration(2, "Swimming Competition", "Alice Smith", LocalDate.of(2023, 9, 25));
        registrations[2] = new Registration(3, "Soccer Tournament", "David Johnson", LocalDate.of(2023, 9, 1));
        registrations[3] = new Registration(4, "Tennis Open", "Emily Davis", LocalDate.of(2023, 10, 5));
        registrations[4] = new Registration(5, "Basketball Championship", "Sophia Brown", LocalDate.of(2023, 9, 15));
        registrations[5] = new Registration(6, "Cycling Race", "John Doe", LocalDate.of(2023, 10, 2));
        registrations[6] = new Registration(7, "Gymnastics Show", "Olivia Lee", LocalDate.of(2023, 9, 15));
        registrations[7] = new Registration(8, "Volleyball Tournament", "Ethan Anderson", LocalDate.of(2023, 10, 8));
        registrations[8] = new Registration(9, "Table Tennis Championship", "Alice Smith", LocalDate.of(2023, 9, 22));
        registrations[9] = new Registration(10, "Weightlifting Competition", "Liam Perez", LocalDate.of(2023, 9, 13));
        registrations[10] = new Registration(11, "Running Race", "Chloe Taylor", LocalDate.of(2023, 10, 1));
        registrations[11] = new Registration(12, "High Jump Championship", "Noah Hernandez", LocalDate.of(2023, 9, 30));
        registrations[12] = new Registration(13, "Badminton Tournament", "Grace Scott", LocalDate.of(2023, 10, 10));
        registrations[13] = new Registration(14, "Diving Competition", "Alice Smith", LocalDate.of(2023, 9, 26));
        registrations[14] = new Registration(15, "Archery Contest", "Aria Adams", LocalDate.of(2023, 10, 7));
        registrations[15] = new Registration(16, "Wrestling Championship", "Mia Turner", LocalDate.of(2023, 9, 19));
        registrations[16] = new Registration(17, "Marathon", "Logan Hall", LocalDate.of(2023, 9, 19));
        registrations[17] = new Registration(18, "Karate Tournament", "Aiden White", LocalDate.of(2023, 9, 6));
        registrations[18] = new Registration(19, "Fencing Championship", "Alice Smith", LocalDate.of(2023, 10, 6));
        registrations[19] = new Registration(20, "Shot Put Competition", "Mason King", LocalDate.of(2023, 9, 23));
        registrations[20] = new Registration(21, "Boxing Match", "Layla Turner", LocalDate.of(2023, 10, 9));
        registrations[21] = new Registration(22, "Marathon", "Jackson Green", LocalDate.of(2023, 9, 27));
        registrations[22] = new Registration(23, "Taekwondo Championship", "Harper Allen", LocalDate.of(2023, 10, 8));
        registrations[23] = new Registration(24, "Pole Vault Competition", "Lucas Adams", LocalDate.of(2023, 9, 21));
        registrations[24] = new Registration(25, "Marathon", "Luna Brown", LocalDate.of(2023, 10, 11));
    }

    public static void Maxcountonsingleday() {

        LocalDate[] date = new LocalDate[registrations.length];
        int count[] = new int[registrations.length];

        for (int i = 0; i < registrations.length; i++) {
            date[i] = registrations[i].getRegistration_date();
            count[i] = 0;
        }

        for (int i = 0; i < registrations.length; i++) {
            for (int j = 0; j < registrations.length; j++) {
                if (i != j && date[i].equals(date[j]))
                    ;
                count[i]++;
            }

        }
        int maxc = -1;
        LocalDate maxDate = null;

        for (int i = 0; i < registrations.length; i++) {
            if (count[i] > maxc) {
                maxc = count[i];
                maxDate = date[i];

            }
        }
        for (int i = 0; i < registrations.length; i++) {
            if (date[i].equals(maxDate)) {
                System.out.println(registrations[i].getEvent_name() + " " + registrations[i].getRegistration_date());
            }

        }

    }

    // public static void Eventsforeachathlete() {

    //     int count;

    //     for (int i = 0; i < registrations.length; i++) {
    //         count = 1;
    //         for (int j = 0; j < registrations.length; j++) {
    //             if (i != j && registrations[i].getAthlete_name().equals(registrations[j].getAthlete_name())) {
    //                 count++;
    //             }
    //         }
    //         System.out.println(registrations[i].getAthlete_name() + " " + count);

    //     }
    // }

    public static void Eventsforeachathlete1() {
        String[] athleteNames = new String[registrations.length];
        int[] eventsPerAthlete = new int[registrations.length];

        int uniqueAthleteCount = 0;

        for (int j = 0; j < registrations.length; j++) {
            String athleteName = registrations[j].getAthlete_name();
            int athleteIndex = -1;

            for (int i = 0; i < uniqueAthleteCount; i++) {
                if (athleteNames[i].equals(athleteName)) {
                    athleteIndex = i;
                    break;
                }
            }

            if (athleteIndex == -1) {
                athleteNames[uniqueAthleteCount] = athleteName;
                athleteIndex = uniqueAthleteCount;
                uniqueAthleteCount++;
            }

            eventsPerAthlete[athleteIndex]++;
        }

        for (int i = 0; i < uniqueAthleteCount; i++) {
            System.out.println(athleteNames[i] + " " + eventsPerAthlete[i]);
            System.out.println();
        }
    }

    public static void Statswithvowel() {

        for (int i = 0; i < registrations.length; i++) {
            if (registrations[i].getEvent_name().matches("^[AEIOUaeiou].*")) {
                System.out.println(registrations[i].getEvent_name());
            }
        }
    }

    public static void Eventnames() {
        ArrayList<Registration> e = new ArrayList<>();

        for (int i = 0; i < registrations.length; i++) {
            String eventName = registrations[i].getEvent_name();

            if (eventName.split(" ").length > 1) {
                e.add(registrations[i]);
            }
        }

        for (Registration event : e) {
            System.out.println(event.getEvent_name());
        }
    }

    public static void mostRegistrationOctober()
    {
        Map<String, Integer> athletecount = new HashMap<>();
        
        for (Registration registration : registrations) {
            if (registration.getRegistration_date().getMonth() == Month.OCTOBER) {
                String athletename = registration.getAthlete_name();
                athletecount.put(athletename, athletecount.getOrDefault(athletename, 0) + 1);
            }
        }
        
        int maxRegistrations = Collections.max(athletecount.values());
        List<String> mostRegisteredAthletes = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : athletecount.entrySet()) {
            if (entry.getValue() == maxRegistrations) {
                mostRegisteredAthletes.add(entry.getKey());
            }
        }
        for (String athletename : mostRegisteredAthletes) {
            System.out.println(athletename+ " - " + maxRegistrations + " registrations");
        }
    }
    
    public static void Eventsinoct() {
        for (Registration registration : registrations) {
            if (registration.getRegistration_date().getMonthValue() == 10) {
                System.out.println(registration.getEvent_name());
            }
        }
    }
}