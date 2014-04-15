package com.adserver.service;

import com.adserver.web.entity.Manager;

import java.util.List;

/**
 * Created by Gordon on 2014/4/15.
 */
public interface IManagerServie {

    /**
     * 添加用户
     * @param manager
     */
    void addManager(Manager manager);

    /**
     * 查询所有用户
     * @return
     */
    List<Manager> getAllManager();

    /**
     * 更新用户
     * @param manager
     */
    void updateManager(Manager manager);

    Manager getManager(String name);

}
