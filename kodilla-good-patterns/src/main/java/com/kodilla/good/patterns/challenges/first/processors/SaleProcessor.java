package com.kodilla.good.patterns.challenges.first.processors;

import com.kodilla.good.patterns.challenges.first.models.SaleDto;
import com.kodilla.good.patterns.challenges.first.models.SaleRequest;
import com.kodilla.good.patterns.challenges.first.services.InformationService;
import com.kodilla.good.patterns.challenges.first.services.ProductOrderService;
import com.kodilla.good.patterns.challenges.first.services.SaleRapository;

public class SaleProcessor {

    private InformationService informationService;
    private SaleRapository saleRapository;
    private ProductOrderService productOrderService;

    public SaleProcessor(final InformationService informationService, final SaleRapository saleRapository,
                         final ProductOrderService productOrderService) {
        this.informationService = informationService;
        this.saleRapository = saleRapository;
        this.productOrderService = productOrderService;
    }

    public SaleDto process(final SaleRequest saleRequest) {
        boolean isBought = productOrderService.makeOrder(saleRequest.getUser(), saleRequest);
        if (isBought) {
            informationService.inform(saleRequest.getUser());
            saleRapository.save(saleRequest);
            return new SaleDto(true);
        } else {
            return new SaleDto(false);
        }
    }
}
