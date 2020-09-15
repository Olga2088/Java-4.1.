public class BonusMilesService {

    public int calculate(int price) {
        int ticketPrice = 10_000;
        int bonusEquivalent = 20;
        int bonusMiles = ticketPrice / bonusEquivalent;
        return bonusMiles;
    }
}
