package com.freightcalculator.app.factory;

import com.freightcalculator.app.validator.ShipmentValidator;

import java.util.List;

public interface ShipmentFactory {
    List<ShipmentValidator> getShipmentValidators(String shippingCompany);
}
