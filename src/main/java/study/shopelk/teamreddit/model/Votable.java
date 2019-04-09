package study.shopelk.teamreddit.model;

/**
 * @author Sangwook-Nam, ian.nam@navercorp.com
 */
public interface Votable {
	void ups(int num);
	void downs(int num);
	boolean likes(int num);
}
