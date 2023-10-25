package com.freightcalculator.app.factory;

import com.freightcalculator.app.strategy.ShipmentStrategy;
import com.freightcalculator.app.validator.ShipmentValidator;

import java.util.List;

public interface ShipmentFactory {
        double getShipmentValidators(String shippingCompanies);
}
