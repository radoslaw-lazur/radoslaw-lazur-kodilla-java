package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FocadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    ServiceFocade serviceFocade;

    @Before
    public void before() {
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
    }

    @After
    public void cleanUp() {
            employeeDao.deleteAll();
            companyDao.deleteAll();
    }

    @Test
    public void testRandomCharStringCompany() {
        //When
        Optional<List<Company>> optionalCompanyList = Optional.ofNullable(companyDao.retrieveCompanyByRandomCharString("Mach"));
        //Then
        Assert.assertTrue(optionalCompanyList.isPresent());
        List<Company> companyListFromDb = optionalCompanyList.get();
        Assert.assertEquals(1, companyListFromDb.size());
        Assert.assertEquals("Software Machine", companyListFromDb.get(0).getName());
    }

    @Test
    public void testRandomCharStringEmployee() {
        //When
        Optional<List<Employee>> optionalEmployeeList = Optional.ofNullable(employeeDao.retrieveEmployeeByRandomCharString("Kov"));
        //Then
        Assert.assertTrue(optionalEmployeeList.isPresent());
        List<Employee> employeeListFromDb = optionalEmployeeList.get();
        Assert.assertEquals(1, employeeListFromDb.size());
        Assert.assertEquals("Kovalsky", employeeListFromDb.get(0).getLastname());
    }
}
