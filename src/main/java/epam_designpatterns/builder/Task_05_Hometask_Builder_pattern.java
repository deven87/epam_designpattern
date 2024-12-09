package epam_designpatterns.builder;

public class Task_05_Hometask_Builder_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicycle bicycle = new Bicycle.BicycleBuilder().setCareer(true).setDoubleSeat(true).build();

		Bicycle bicycle2 = new Bicycle.BicycleBuilder().setCareer(true).setDoubleSeat(true).setDoubleStand(true)
				.build();
		bicycle.getBicycleInfo();

		bicycle2.getBicycleInfo();
	}
}
