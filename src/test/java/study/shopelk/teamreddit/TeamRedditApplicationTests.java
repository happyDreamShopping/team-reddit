package study.shopelk.teamreddit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TeamRedditApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void ESRequestTest() {
		Client client = Client.create();
		WebResource webResource =   client
				.resource("http://data-logs.ppr2.io.navercorp.com:10200")
				.path("/mall_info/_search");

		ClientResponse response = webResource
				.header("Content-Type", "application/json;charset=UTF-8")
				.type("application/json")
				.accept("application/json")
				.get(ClientResponse.class);
		String json = response.getEntity(String.class);
		System.out.println(json);
	}

}
