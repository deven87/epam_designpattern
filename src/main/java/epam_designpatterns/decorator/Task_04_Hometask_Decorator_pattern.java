package epam_designpatterns.decorator;

public class Task_04_Hometask_Decorator_pattern {

	public static void main(String[] args) {
		Page pageDesktop = new DesktopFormatPage();
		System.out.println(pageDesktop.getRank());

		Page pageMobile = new MobileFormatPage();
		System.out.println(pageMobile.getRank());

		Widget1Decorator decorator = new Widget1Decorator(pageDesktop);
		System.out.println(decorator.getRank());

		Widget2Decorator decorator1 = new Widget2Decorator(pageMobile);
		System.out.println(decorator1.getRank());

		Widget2Decorator decorator2 = new Widget2Decorator(decorator);
		System.out.println(decorator2.getRank());
	}
}
