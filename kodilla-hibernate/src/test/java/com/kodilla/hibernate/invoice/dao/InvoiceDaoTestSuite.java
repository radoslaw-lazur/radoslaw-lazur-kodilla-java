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
import java.util.Optional;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item = new Item(new BigDecimal(220.5), 10);
        Invoice invoice = new Invoice("000001");
        Product product = new Product("SSD drive");
        item.setInvoice(invoice);
        item.setProduct(product);
        invoice.getItems().add(item);
        product.getItems().add(item);
        //When
        productDao.save(product);
        invoiceDao.save(invoice);
        itemDao.save(item);
        int productId = product.getId();
        int invoiceId = invoice.getId();
        int itemId = item.getId();
        //Then
        Optional<Invoice> invoiceOptional = invoiceDao.findById(invoiceId);
        Assert.assertTrue(invoiceOptional.isPresent());
        Invoice invoiceFromDb = invoiceOptional.get();
        Optional<Item> itemOptional = itemDao.findById(itemId);
        Assert.assertTrue(itemOptional.isPresent());
        Item itemFromDb = itemOptional.get();
        Optional<Product> productOptional = productDao.findById(productId);
        Assert.assertTrue(productOptional.isPresent());
        Product productFromDb = productOptional.get();
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertNotEquals(0, productId);
        Assert.assertNotEquals(0, itemId);
        Assert.assertEquals("000001", invoiceFromDb.getNumber());
        Assert.assertEquals(1, invoiceFromDb.getItems().size());
        Assert.assertEquals(new BigDecimal(220.5).multiply(new BigDecimal(10)), itemFromDb.getValue());
        Assert.assertEquals("SSD drive", productFromDb.getName());
    }
}
