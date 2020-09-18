public class BonusMilesService {

<<<<<<< HEAD
    public int calculate(int ticketPrice, int bonusEquivalent) {

=======
    public int calculate(int bonus) {
        int ticketPrice = 10_000;
        int bonusEquivalent = 20;
>>>>>>> 54940d047441a8364792502f1294c91c1b69329f
        int bonusMiles = ticketPrice / bonusEquivalent;
        return bonusMiles;
    }
}
