package study.shopelk.teamreddit.model;

/**
 * @author Sangwook-Nam, ian.nam@navercorp.com
 */
public class Message implements Created {
	private String author;
	private String body;
	private String bodyHTML;
	private String context;
	private Message firstMessage;
	private String firstMessageName;
	private boolean likes;
	private String linkTitle;
	private String name;
	private boolean isNew;
	private String parentId;
	private String replies;
	private String subject;
	private String subreddit;
	private boolean wasComment;

	@Override
	public void created(long time) {

	}

	@Override
	public void createdUTC(long time) {

	}
}
