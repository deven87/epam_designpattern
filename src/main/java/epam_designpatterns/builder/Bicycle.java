package epam_designpatterns.builder;

public class Bicycle {

	// creating final fields as we dont want these to change once initialized
	private final boolean hasDoubleStand;
	private final boolean hasDoubleSeat;
	private final boolean hasCareer;

	// create private constructor as we are only allowing builder to create object
	private Bicycle(BicycleBuilder builder) {
		this.hasDoubleStand = builder.hasDoubleStand;
		this.hasDoubleSeat = builder.hasDoubleSeat;
		this.hasCareer = builder.hasCareer;
	}

	public void getBicycleInfo() {
		System.out.println(
				"Bicycle: Stand - " + this.hasDoubleStand + " Seat - " + this.hasDoubleSeat + " Career - "
						+ this.hasCareer);
	}

	public static class BicycleBuilder {
		boolean hasDoubleStand;
		boolean hasDoubleSeat;
		boolean hasCareer;

		public BicycleBuilder setDoubleStand(boolean hasDoubleStand) {
			this.hasDoubleStand = hasDoubleStand;
			return this;
		}

		public BicycleBuilder setDoubleSeat(boolean hasDoubleSeat) {
			this.hasDoubleSeat = hasDoubleSeat;
			return this;
		}

		public BicycleBuilder setCareer(boolean hasCareer) {
			this.hasCareer = hasCareer;
			return this;
		}

		public Bicycle build() {
			return new Bicycle(this);
		}

	}
}
