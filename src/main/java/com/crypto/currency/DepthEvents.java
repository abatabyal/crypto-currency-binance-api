/**
 * 
 */
package com.crypto.currency;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;

/**
 * @author tony
 *
 */
@RestController
public class DepthEvents {
	
	BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance("BJDUNS0V5xYobz1wIhDYpPUI9YxvS8EG8PyxWMSYb48e3hfm04hR8Kdm5IhY2ZBM","4I6Ism5kvlDrU748pZgDd5MqiLGLK41uF0ZIZ6VrdjwVhQQ8x8gMdPga1tN1NT4X");
	BinanceApiRestClient client = factory.newRestClient();
	
	@RequestMapping(value = "/depth", method= RequestMethod.GET)
	public void Test() {
		long serverTime = client.getServerTime();
		System.out.println(serverTime);
		System.out.println("Now the output is redirected");
	}
	

}
