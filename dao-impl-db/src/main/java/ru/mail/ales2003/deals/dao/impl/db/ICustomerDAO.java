package ru.mail.ales2003.deals.dao.impl.db;

import ru.mail.ales2003.deals.datamodel.Customer;

public interface ICustomerDAO {

	Customer get(Integer id);

	void insert(Customer customer);

	void update(Customer customer);

}
