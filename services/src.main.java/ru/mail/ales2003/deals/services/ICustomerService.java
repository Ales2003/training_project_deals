package ru.mail.ales2003.deals.services;

import ru.mail.ales2003.deals.datamodel.Customer;

public interface ICustomerService {

	Customer get(Integer id);

	void save(Customer Customer);

}
