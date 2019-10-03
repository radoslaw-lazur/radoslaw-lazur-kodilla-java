package com.kodilla.good.patterns.challenges.first;

import com.kodilla.good.patterns.challenges.first.models.SaleDto;
import com.kodilla.good.patterns.challenges.first.models.SaleRequest;
import com.kodilla.good.patterns.challenges.first.processors.SaleProcessor;
import com.kodilla.good.patterns.challenges.first.services.*;

public class Application {
    public static void main(String[] args) {

        InformationService informationService = new SmsService();
        SaleRapository saleRapository = new SaleRapositoryImpl();
        ProductOrderService productOrderService = new ProductOrderService();
        SaleProcessor saleProcessor = new SaleProcessor(informationService, saleRapository, productOrderService);
        Products products = new Products();
        Users users = new Users();
        SaleRequest saleRequest = new SaleRequest(users.getUser(), products.getProduct());

        SaleDto saleDto = saleProcessor.process(saleRequest);
    }
}
