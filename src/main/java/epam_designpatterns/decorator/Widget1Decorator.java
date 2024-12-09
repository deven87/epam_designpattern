package epam_designpatterns.decorator;

public class Widget1Decorator extends PageDecorator {
	public Widget1Decorator(Page page) {
		super(page);
		this.rank = 100;
	}

}
