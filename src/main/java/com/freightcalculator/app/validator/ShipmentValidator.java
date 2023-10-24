package com.freightcalculator.app.validator;

import com.freightcalculator.app.model.Package;

public interface ShipmentValidator {
    double shipingCalculate(Package pack);
}
