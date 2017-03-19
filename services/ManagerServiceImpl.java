package ru.mail.ales2003.deals.services.impl;

import ru.mail.ales2003.deals.services.IManagerService;

public class ManagerServiceImpl implements IManagerService {
	
	public static final IManagerService INSTANCE = new ManagerServiceImpl();

    private ManagerServiceImpl() {
    }
	
}

