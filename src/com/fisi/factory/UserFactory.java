/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fisi.factory;

import com.fisi.models.User;
import com.fisi.proxy.AdministratorProxy;
import com.fisi.proxy.EmployeeProxy;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cristian
 */
public class UserFactory {

    List<User> users = new ArrayList<>();

    public User createUser(String type) {
        users.add(new AdministratorProxy());
        users.add(new EmployeeProxy());
        for (User user : users) {
            return user.returner(type);
        }
        return null;
    }
}
