package study.shopelk.teamreddit.model;

/**
 * @author Sangwook-Nam, ian.nam@navercorp.com
 */
public class Link implements Votable, Created {
	private String author;
	private String authorFlairCSSClass;
	private String authorFlairText;
	private boolean clicked;
	private String domain;
	private boolean hidden;
	private boolean isSelf;
	private boolean likes;
	private String linkFlairCSSClass;
	private String linkFlairText;
	private boolean locked;
	private Object media;
	private Object mediaEmbed;
	private int numComments;
	private boolean over18;
	private String permalink;
	private boolean saved;
	private int score;
	private String selfText;
	private String selfTextHTML;
	private boolean subReddit;
	private String subredditId;
	private String thumbnail;
	private String title;
	private String url;
	private long edited;
	private String distinguished;
	private boolean stickied;

	@Override
	public void created(long time) {

	}

	@Override
	public void createdUTC(long time) {

	}

	@Override
	public void ups(int num) {

	}

	@Override
	public void downs(int num) {

	}

	@Override
	public boolean likes(int num) {
		return false;
	}
}
