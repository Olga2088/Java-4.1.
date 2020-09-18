public class BonusMilesService {

    public int calculate(int ticketPrice, int bonusEquivalent) {

        int bonusMiles = ticketPrice / bonusEquivalent;
        return bonusMiles;
    }
}
