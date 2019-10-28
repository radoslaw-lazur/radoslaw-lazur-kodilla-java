package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceControllerDao invoiceControllerDao;
    @Autowired
    ItemControllerDao itemControllerDao;
    @Autowired
    ProductControllerDao productControllerDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item = new Item(new BigDecimal(220.5), 10);
        Invoice invoice = new Invoice("First");
        Product product = new Product("SSD drive");
        item.setInvoice(invoice);
        item.setProduct(product);
        invoice.getItems().add(item);
        product.getItems().add(item);
        //When
        productControllerDao.save(product);
        invoiceControllerDao.save(invoice);
        itemControllerDao.save(item);
        int productId = product.getId();
        int invoiceId = invoice.getId();
        int itemId = item.getId();


        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertNotEquals(0, productId);
        Assert.assertNotEquals(0, itemId);
        //CleanUp
        //itemControllerDao.deleteById(itemId);
        //productControllerDao.deleteById(productId);
        //invoiceControllerDao.deleteById(invoiceId);
    }
}
