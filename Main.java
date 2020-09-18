public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice;
        int bonusEquivalent;

        int bonusMiles = service.calculate (ticketPrice = 10_000, bonusEquivalent = 20);
        System.out.println(bonusMiles);
        
    }
}