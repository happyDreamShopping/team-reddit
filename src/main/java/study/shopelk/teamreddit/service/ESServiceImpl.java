package study.shopelk.teamreddit.service;

import javax.annotation.Resource;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentType;

/**
 * @author Sangwook-Nam, ian.nam@navercorp.com
 */
public class ESServiceImpl implements ESService {

	@Resource
	private TransportClient transportClient;

	@Override
	public void insertById(String index, String type, String id, String json) {
		transportClient.prepareIndex(index, type, id).setSource(json, XContentType.JSON).get();
	}

	@Override
	public void updateById(String index, String type, String id, String json) {
		transportClient.prepareUpdate(index, type, id).setDoc(json, XContentType.JSON).get();
	}

	@Override
	public void deleteById(String index, String type, String id) {
		transportClient.prepareDelete(index, type, id).get();
	}
}
