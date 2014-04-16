package com.adserver.service;

import com.adserver.dao.IManagerDao;
import com.adserver.web.entity.Manager;

import java.util.List;

/**
 * Created by Gordon on 2014/4/15.
 *
 */
public class ManagerService implements IManagerService {

    private IManagerDao managerDao;

    public void setManagerDao(IManagerDao managerDao) {
        this.managerDao = managerDao;
    }

    @Override
    public void addManager(Manager manager) {
        managerDao.addManager(manager);
    }

    @Override
    public List<Manager> getAllManager() {
        List<Manager> allManager = managerDao.getAllManager();
        System.out.println("all manager:" + allManager);
        return allManager;
    }

    @Override
    public void updateManager(Manager manager) {
        managerDao.updateManager(manager);
    }

    @Override
    public Manager getManager(String name) {
        return managerDao.getManager(name);
    }
}
