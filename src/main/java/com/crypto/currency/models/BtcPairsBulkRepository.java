package com.crypto.currency.models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BtcPairsBulkRepository extends CrudRepository<BtcPairs, String> {
	
}