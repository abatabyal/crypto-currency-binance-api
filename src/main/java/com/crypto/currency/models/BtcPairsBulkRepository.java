package com.crypto.currency.models;

import org.springframework.data.repository.CrudRepository;

/**
 * To save XYZBTC pairs in bulk
 */

public interface BtcPairsBulkRepository extends CrudRepository<BtcPairs, String> {
	
}