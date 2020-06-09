public class DishTest {
	
	public static void main(String[] args) {
		// using constructors instead of setters
		Dish dish1 = new Dish(5, "Pot Pie", false);
		
//		dish1.setCostInCents(5);
//		dish1.setNameOfDish("Pot Pie");
//		dish1.setWouldRecommend(true);
		
		DishTools.shoutDishName(dish1);
		DishTools.analyzeDishCost(dish1);
		DishTools.flipRecommendation(dish1);
		
		dish1.printSummary();
	}
}
