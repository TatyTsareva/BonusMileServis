public class BonusMilesService {
    public int calculate(int price) {
        int result;
        int miles = 20;
        if (price > 0) {
            result = (price / miles);


        } else
            result = price / miles;
        System.out.println("Начислено бонусов");

        return result;


    }
}




