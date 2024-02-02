package effectivejava.item2.javabeanspattern;

public class Runner {
    public static void main(String[] args) {
        NutritionFacts coke = new NutritionFacts();
        coke.setServingSize(240);
        coke.setServings(8);
        coke.setCalories(180);
        coke.setSodium(35);
        coke.setCarbohydrate(27);
    }
}