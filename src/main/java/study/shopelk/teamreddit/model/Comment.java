package study.shopelk.teamreddit.model;

import java.util.List;

/**
 * @author Sangwook-Nam, ian.nam@navercorp.com
 */
public class Comment {
	private String approvedBy;
	private String author;
	private String authorFlairCSSClass;
	private String authorFlairText;
	private String bannedBy;
	private String body;
	private String bodyHTML;
	private boolean edited;
	private int gilded;
	private boolean likes;
	private String linkAuthor;
	private String linkId;
	private String linkTitle;
	private String linkURL;
	private int numReports;
	private String parentId;
	private List<Thing> replies;
	private boolean saved;
	private int score;
	private boolean scoreHidden;
	private boolean subReddit;
	private String subredditId;
	private String distinguished;
}
