package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
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
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    private int softwareMachineId;
    private int dataMaestersId;
    private int greyMatterId;

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
        softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        greyMatterId = greyMatter.getId();
    }

    @After
    public void cleanUp() {
        try {
            employeeDao.deleteAll();
            companyDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testSaveManyToMany() {
        //Given
        //When
        Optional<Company> companyOptional1 = companyDao.findById(softwareMachineId);
        Optional<Company> companyOptional2 = companyDao.findById(dataMaestersId);
        Optional<Company> companyOptional3 = companyDao.findById(greyMatterId);
        //Then
        Assert.assertTrue(companyOptional1.isPresent());
        Company companyFromDb1 = companyOptional1.get();
        Assert.assertTrue(companyOptional2.isPresent());
        Company companyFromDb2 = companyOptional2.get();
        Assert.assertTrue(companyOptional3.isPresent());
        Company companyFromDb3 = companyOptional3.get();
        Assert.assertNotEquals(0, companyFromDb1.getId());
        Assert.assertNotEquals(0, companyFromDb2.getId());
        Assert.assertNotEquals(0, companyFromDb3.getId());
    }

    @Test
    public void testRetrieveEmployeeByLastName() {
        //Given
        //When
        Optional<List<Employee>> optionalEmployeeList = Optional.ofNullable(employeeDao.retrieveEmployeeByLastName("Kovalsky"));
        //Then
        Assert.assertTrue(optionalEmployeeList.isPresent());
        List<Employee> employeeListFromDb = optionalEmployeeList.get();
        Assert.assertEquals(1, employeeListFromDb.size());
        Assert.assertEquals("Kovalsky", employeeListFromDb.get(0).getLastname());
    }

    @Test
    public void testRetrieveCompanyByFirstThreeChar() {
        //Given
        //When
        Optional<List<Company>> optionalCompanyList = Optional.ofNullable(companyDao.retrieveCompanyByFirstThreeChar("Dat"));
        //Then
        Assert.assertTrue(optionalCompanyList.isPresent());
        List<Company> companyListFromDb = optionalCompanyList.get();
        Assert.assertEquals(1, companyListFromDb.size());
        Assert.assertEquals("Data Maesters", companyListFromDb.get(0).getName());
    }
}
