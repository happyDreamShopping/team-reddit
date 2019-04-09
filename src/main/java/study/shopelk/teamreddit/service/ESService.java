package study.shopelk.teamreddit.service;

/**
 * @author Sangwook-Nam, ian.nam@navercorp.com
 */
public interface ESService {
	void insertById(String index, String type, String id, String json);
	void updateById(String index, String type, String id, String json);
	void deleteById(String index, String type, String id);
}
