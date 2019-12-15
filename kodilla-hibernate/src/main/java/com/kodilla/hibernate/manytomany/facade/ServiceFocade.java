package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceFocade {
    private static final Logger LOGGER = LoggerFactory.getLogger(FocadeProccesingException.class);
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> lookForCompanyByCharString(String randomCharString) throws FocadeProccesingException {
        LOGGER.info("Company processing in progress...");
        List<Company> companies = companyDao.retrieveCompanyByRandomCharString(randomCharString);
        if (companies.size() < 1) {
            LOGGER.error(FocadeProccesingException.ERR_COMPANY_NOT_FOUND);
            throw new FocadeProccesingException(FocadeProccesingException.ERR_COMPANY_NOT_FOUND);
        }
        return companies;
    }

    public List<Employee> lookForEmployeeByCharString(String randomCharString) throws FocadeProccesingException {
        LOGGER.info("Employee processing in progress...");
        List<Employee> employees = employeeDao.retrieveEmployeeByRandomCharString(randomCharString);
        if (employees.size() < 1) {
            LOGGER.error(FocadeProccesingException.ERR_EMPLOYEE_NOT_FOUND);
            throw new FocadeProccesingException(FocadeProccesingException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employees;
    }
}
