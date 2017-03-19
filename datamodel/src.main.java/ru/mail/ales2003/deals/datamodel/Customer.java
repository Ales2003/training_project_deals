package ru.mail.ales2003.deals.datamodel;

public class Customer {

	// id of customer (PK in DM)
	private Integer id;
	// id of group of the customer (FK in DM)
	private Integer customerGroupId;
	// id of manager of the customer (FK in DM)
	private Integer managerId;
	private String firstName;
	private String patronymic;
	private String lastName;
	private String companyName;
	private String phoneNumber;
	private String address;

}
