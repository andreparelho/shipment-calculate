package com.freightcalculator.app.strategy;

import com.freightcalculator.app.model.Package;

public interface ShipmentStrategy {
    double shipmentCalculate(Package pack);
}
