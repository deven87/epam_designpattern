package epam_designpatterns.decorator;

public class Widget2Decorator extends PageDecorator {
	public Widget2Decorator(Page page) {
		super(page);
		this.rank = 200;
	}

}
