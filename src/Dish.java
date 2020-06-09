public class Dish {
	
	private int costInCents;
	private String nameOfDish;
	private boolean wouldRecommend;
	
	// constructor
	public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
		this.costInCents = costInCents;
		this.nameOfDish = nameOfDish;
		this.wouldRecommend = wouldRecommend;
	}
	
	// getters and setters
	public int getCostInCents() {
		return costInCents;
	}
	
	public void setCostInCents(int costInCents) {
		this.costInCents = costInCents;
	}
	
	public String getNameOfDish() {
		return nameOfDish;
	}
	
	public void setNameOfDish(String nameOfDish) {
		this.nameOfDish = nameOfDish;
	}
	
	public boolean isWouldRecommend() {
		return wouldRecommend;
	}
	
	public void setWouldRecommend(boolean wouldRecommend) {
		this.wouldRecommend = wouldRecommend;
	}
	
	// method
	public void printSummary() {
		System.out.printf("Cost: $%d%nName: %s%nRecommended: %b", getCostInCents(), getNameOfDish(), isWouldRecommend());
	}
}
