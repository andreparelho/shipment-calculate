package com.freightcalculator.app.validator;

import com.freightcalculator.app.model.Package;
import org.springframework.stereotype.Service;

@Service
public class WeightPackageValidatorImpl implements ShipmentValidator {

    @Override
    public double shipingCalculate(Package pack) {
        double weightMin = 0.01;

        if (pack.getWeight() >= weightMin){
            return pack.getWeight();
        }

        return 0;
    }
}
