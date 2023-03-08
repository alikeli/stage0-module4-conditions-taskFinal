package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber > 0 && (monthNumber <= 2 || monthNumber == 12) ){
            System.out.println("Winter");
        } else if (monthNumber > 2 && monthNumber < 6 && monthNumber > 0 ) {
            System.out.println("Spring");
        } else if (monthNumber > 5 || monthNumber < 9 && monthNumber > 0) {
            System.out.println("Summer");
        } else if (monthNumber > 9 || monthNumber < 12 && monthNumber > 0 ) {
            System.out.println("Autumn");
        } else {
            System.out.println("wrong number!");
        }
    }
}
