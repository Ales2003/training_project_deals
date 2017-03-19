package ru.mail.ales2003.deals.datamodel;

import java.util.Date;

public class Contract {

	// id of contract (PK in DM)
	private Integer id;
	// id of customer (FK in DM)
	private Integer custemerId;
	// date of contract
	private Date date;
	/*
	 * Contains such attributes of the transaction as the order is accepted,
	 * sent to production, executed, shipped
	 */
	private String dealStatus;
	
	private String payForm;
	
	private String payStatus;

}
