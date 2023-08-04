package com.carrefour.fr.pinp.storepickup;

import io.micronaut.http.annotation.*;

@Controller("/storePickup")
public class StorePickupController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}