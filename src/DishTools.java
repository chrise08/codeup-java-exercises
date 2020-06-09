public class DishTools {
	
	public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;
	
	public static void shoutDishName(Dish d1) {
		System.out.println(d1.getNameOfDish().toUpperCase());
	}
	
	public static void analyzeDishCost(Dish d1) {
		if (d1.getCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS) {
			System.out.println("More expensive than average");
		} else {
			System.out.println("Less expensive than average");
		}
	}
	
	public static void flipRecommendation(Dish d1) {
		if (d1.isWouldRecommend()) {
			d1.setWouldRecommend(false);
		} else {
			d1.setWouldRecommend(true);
		}
	}
}
