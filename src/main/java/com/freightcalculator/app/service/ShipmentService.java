package com.freightcalculator.app.service;

import com.freightcalculator.app.factory.ShipmentFactory;
import com.freightcalculator.app.model.Package;
import com.freightcalculator.app.strategy.ShipmentStrategy;
import com.freightcalculator.app.validator.ShipmentValidator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentService {
    private final ShipmentFactory shipmentFactory;
    private final ShipmentStrategy shipmentStrategy;
    private final String shippingCompanies = "companies";
    public ShipmentService(ShipmentFactory shipmentFactory,ShipmentStrategy shipmentStrategy) {
        this.shipmentFactory = shipmentFactory;
        this.shipmentStrategy = shipmentStrategy;
    }

    public double calculateShipping(Package pack){

        double shipmentValidators = this.shipmentFactory.getShipmentValidators(this.shippingCompanies);
        if (shipmentStrategy.shipmentCalculate() > 0){
            return shipmentStrategy.shipmentCalculate();
        }
        return 0;
    }
}
