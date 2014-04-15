package com.adserver.dao;

import com.adserver.web.entity.Manager;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Gordon on 2014/4/15.
 */
public class ManagerDao implements IManagerDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addManager(Manager manager) {
        
    }

    @Override
    public List<Manager> getAllManager() {
        return null;
    }

    @Override
    public void updateManager(Manager manager) {

    }

    @Override
    public Manager getManager(String name) {
        return null;
    }
}
