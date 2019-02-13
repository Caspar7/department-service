package com.dyc.department.client;

import com.dyc.department.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeClientHystrix implements EmployeeClient{

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeClientHystrix.class);

    @Override
    public List<Employee> findByDepartment(Long departmentId) {
        LOGGER.error("call employee-service api failed.");
        return null;
    }
}
