package com.freightcalculator.app.strategy;

import com.freightcalculator.app.model.Package;
import com.freightcalculator.app.validator.ShipmentValidator;

import java.util.List;

public interface ShipmentStrategy {
    double shipmentCalculate();
}
