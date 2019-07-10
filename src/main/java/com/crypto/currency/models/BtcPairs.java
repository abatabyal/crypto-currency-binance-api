package com.crypto.currency.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "btc_pairs")
public class BtcPairs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="btc_pair")
	private String btcPair;
	
	public BtcPairs() {
		super();
	}

	public BtcPairs(String btcPair) {
		super();
		this.setBtcPair(btcPair);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getBtcPair() {
		return btcPair;
	}

	public void setBtcPair(String btcPair) {
		this.btcPair = btcPair;
	}

}
