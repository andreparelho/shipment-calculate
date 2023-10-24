package com.freightcalculator.app.service;

import com.freightcalculator.app.factory.ShipmentFactory;
import com.freightcalculator.app.model.Package;
import com.freightcalculator.app.validator.ShipmentValidator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ShipmentService {
    private final ShipmentFactory shipmentFactory;

    public ShipmentService(ShipmentFactory shipmentFactory) {
        this.shipmentFactory = shipmentFactory;
        int a = 1;
    }

    public double calculateShipping(Package pack){
        List<ShipmentValidator> shipmentValidators = this.shipmentFactory.getShipmentValidators(pack.getShippingCompany());

        for (ShipmentValidator shipmentValidator : shipmentValidators){
            if (shipmentValidator.shipingCalculate(pack) == 0){
                return 0;
            }
        }

        return 0;
    }
}
