package ru.mail.ales2003.deals.dao.impl.db.impl;

import ru.mail.ales2003.deals.dao.impl.db.ICustomerDAO;
import ru.mail.ales2003.deals.datamodel.Customer;

public class CustomerDAOImpl implements ICustomerDAO {

	@Override
	public Customer get(Integer id) {
		// TODO go to DB
		Customer customer = new Customer();
		customer.setId(id);
		return customer;
	}

	@Override
	public void insert(Customer customer) {

	}

	@Override
	public void update(Customer customer) {

	}

}
