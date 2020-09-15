public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10_000;
        int bonusEquivalent = 20;
        int bonusMiles = service.calculate(ticketPrice);
        System.out.println(bonusMiles);
    }
}
