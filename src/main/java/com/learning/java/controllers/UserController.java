package com.learning.java.controllers;

import com.learning.java.models.Employee;
import com.learning.java.models.Profile;
import com.learning.java.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
public class UserController {

    @RequestMapping(value = "employee")
    public Employee getEmployee() {

        Profile profile = new Profile();
        profile.setOffice("Canada");
        profile.setPosition("Cloud Developer");
        profile.setSalary("3.500.000");
        profile.setProfileId(200);

        User user = new User();
        user.setAge(BigDecimal.valueOf(30));
        user.setEmail("brandon10@gmail.com");
        user.setNumberPhone("983237547");
        user.setName("Brandon");
        user.setLastName("Scott");

        Employee employee = new Employee();
        employee.setEmployeeId(100);
        employee.setStartDate(new Date());
        employee.setProfile(profile);
        employee.setUser(user);
        return employee;
    }

}
