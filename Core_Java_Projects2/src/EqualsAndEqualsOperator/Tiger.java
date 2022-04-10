package EqualsAndEqualsOperator;


public class Tiger {
	private String color;
	private String stripePattern;
	private int height;

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			Tiger tiger = (Tiger) object;
			if (this.color == tiger.getColor() && 
				this.stripePattern == tiger.getStripePattern() && 
				this.height==tiger.height) {
				result = true;
			}
		}
		return result;
	}

	// just omitted null checks
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.color.hashCode();
		hash = 7 * hash + this.stripePattern.hashCode();
		return hash;
	}

	public static void main(String args[]) {
		
		Tiger t1 = new Tiger("Yellow", "Dense", 3);
		Tiger t2 = new Tiger("Yellow", "Dense", 8);
		Tiger t3 = new Tiger("White", "Sparse", 4);
		
		System.out.println("bengalTiger1 and bengalTiger2: " + t1.equals(t2));
		System.out.println("bengalTiger1 and siberianTiger: " + t1.equals(t3));

		System.out.println("bengalTiger1 hashCode: " + t1.hashCode());
		System.out.println("bengalTiger2 hashCode: " + t2.hashCode());
		System.out.println("siberianTiger hashCode: " + t3.hashCode());
	}

	public String getColor() {
		return color;
	}

	public String getStripePattern() {
		return stripePattern;
	}

	public Tiger(String color, String stripePattern, int height) {
		this.color = color;
		this.stripePattern = stripePattern;
		this.height = height;
	}
}