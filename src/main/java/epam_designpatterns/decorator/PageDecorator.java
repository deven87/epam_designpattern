package epam_designpatterns.decorator;

public class PageDecorator extends Page {
	protected Page page;

	public PageDecorator(Page page) {
		this.page = page;
	}

	@Override
	public int getRank() {
		return this.page.rank + this.rank;
	}
}
