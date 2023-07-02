public class BonusMilesService {

    public int calculate(int price) {
        int bonusPrice=20;
        int miles = price / bonusPrice;
        return miles;
    }

}
