package ru.mail.ales2003.deals.services.impl;

import ru.mail.ales2003.deals.dao.impl.db.ICustomerDAO;
import ru.mail.ales2003.deals.dao.impl.db.IManagerDAO;
import ru.mail.ales2003.deals.dao.impl.db.impl.CustomerDAOImpl;
import ru.mail.ales2003.deals.dao.impl.db.impl.ManagerDAOImpl;
import ru.mail.ales2003.deals.datamodel.Customer;
import ru.mail.ales2003.deals.services.ICustomerService;
import ru.mail.ales2003.deals.services.IManagerService;

public class CustomerServiceImpl implements ICustomerService {

	private final ICustomerDAO customerDAO;

	private IManagerDAO managerDao;

	private IManagerService managerService;

	public CustomerServiceImpl() {
		super();
		customerDAO = new CustomerDAOImpl();
		managerDao = new ManagerDAOImpl();
		managerService = ManagerServiceImpl.INSTANCE;
	}

	@Override
	public Customer get(Integer id) {

		return customerDAO.get(id);
	}

	@Override
	public void save(Customer customer) {
		if (customer.getId() == 0) {
			System.out.println("Insert new customer");
			customerDAO.insert(customer);
		} else {
			customerDAO.update(customer);
		}

	}

}