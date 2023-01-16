public class BonusMilesService {
    public int calculate (int cost) {
        int milesFBon = 20;  // количество рублей за 1 милю
        int miles = cost / milesFBon; // итоговое количество миль за покупку
        return miles;
    }
}
