package epam_designpatterns.strategy;

public class ShareStrategyContext {
	private ShareStreategyInterf shareStrategy;

	ShareStrategyContext(ShareStreategyInterf shareStrategy) {
		this.shareStrategy = shareStrategy;
	}

	public void sharePhoto() {
		shareStrategy.share();
	}

}
