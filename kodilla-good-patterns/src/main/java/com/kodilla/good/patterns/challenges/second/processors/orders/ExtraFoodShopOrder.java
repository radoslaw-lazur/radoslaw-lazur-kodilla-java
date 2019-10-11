package com.kodilla.good.patterns.challenges.second.processors.orders;

import com.kodilla.good.patterns.challenges.second.models.Request;
import com.kodilla.good.patterns.challenges.second.processors.shops.ExtraFoodShopProcessor;
import com.kodilla.good.patterns.challenges.second.services.informations.EmailService;
import com.kodilla.good.patterns.challenges.second.services.informations.InformationService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.GiftService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.OrderService;
import com.kodilla.good.patterns.challenges.second.services.products.ExtraFoodShopProducts;
import com.kodilla.good.patterns.challenges.second.services.rapositories.Rapository;
import com.kodilla.good.patterns.challenges.second.services.shops.Shops;
import com.kodilla.good.patterns.challenges.second.services.users.Users;

public class ExtraFoodShopOrder implements ShopOrder {


    private ForwardClassOrder forward = new ForwardClassOrder();

    @Override
    public void order() {
        Request requestExtraShop = new Request(forward.getShops().getExtraFoodShop(), forward.getUsers().getUser(),
                forward.getExtraFoodShopProducts().getExtraFoodShopProductsSet());
        forward.getExtraFoodShopProcessor().process(requestExtraShop);
    }
}
