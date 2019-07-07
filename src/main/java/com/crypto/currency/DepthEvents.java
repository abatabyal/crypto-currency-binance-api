/**
 * 
 */
package com.crypto.currency;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.TickerPrice;
import com.crypto.currency.models.BtcPairs;
import com.crypto.currency.models.BtcPairsBulkRepository;
import com.crypto.currency.models.BtcPairsRepositoy;

/**
 * @author tony
 *
 */
@RestController
public class DepthEvents {
	
	@Autowired
	BtcPairsRepositoy btcPairsRepository;
	
	@Autowired
	BtcPairsBulkRepository btcPairsBulkRepository;
	
	BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance("BJDUNS0V5xYobz1wIhDYpPUI9YxvS8EG8PyxWMSYb48e3hfm04hR8Kdm5IhY2ZBM","4I6Ism5kvlDrU748pZgDd5MqiLGLK41uF0ZIZ6VrdjwVhQQ8x8gMdPga1tN1NT4X");
	BinanceApiRestClient client = factory.newRestClient();
	
	@RequestMapping(value = "/depth", method= RequestMethod.GET)
	public void Test() {
		long serverTime = client.getServerTime();
		System.out.println(serverTime);
		System.out.println("Now the output is redirected");
	}
	
	@RequestMapping(value = "/saveAllPairs", method= RequestMethod.POST)
	public <S> void saveAllPairs() {
		List<TickerPrice> allPrices = client.getAllPrices();
		List<BtcPairs> btcPairList = new ArrayList<BtcPairs>();
		for (TickerPrice tickerPrice : allPrices) {
			System.out.println(tickerPrice.getSymbol());
			btcPairList.add(new BtcPairs(tickerPrice.getSymbol()));	
		}
		btcPairsBulkRepository.saveAll(btcPairList);
	}
	

}
