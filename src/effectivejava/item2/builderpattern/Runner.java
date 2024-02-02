package effectivejava.item2.builderpattern;

public class Runner {
    public static void main(String[] args) {
        NutritionFacts coke = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();
    }
}
