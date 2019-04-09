package study.shopelk.teamreddit.model;

/**
 * @author Sangwook-Nam, ian.nam@navercorp.com
 */
public class Thing implements Votable, Created {
	private String id;
	private String name;
	private String kind;
	private Object data;

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

	@Override
	public void created(long time) {

	}

	@Override
	public void createdUTC(long time) {

	}
}
