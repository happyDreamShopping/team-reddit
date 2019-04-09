package study.shopelk.teamreddit.model;

/**
 * @author Sangwook-Nam, ian.nam@navercorp.com
 */
public class Account implements Created {
	private int commentKarma;
	private boolean hasMail;
	private boolean hasModMail;
	private boolean hasVerifiedEmail;
	private String id;
	private int inboxCount;
	private boolean isFriend;
	private boolean isGold;
	private boolean isMod;
	private int linkKarma;
	private String modhash;
	private String name;
	private boolean over18;

	@Override
	public void created(long time) {

	}

	@Override
	public void createdUTC(long time) {

	}
}
