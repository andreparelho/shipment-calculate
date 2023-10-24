package com.freightcalculator.app.validator;

import com.freightcalculator.app.model.Package;
import org.springframework.stereotype.Service;

@Service
public class DistancePackageValidatorImpl implements ShipmentValidator {

    @Override
    public double shipingCalculate(Package pack) {
        double distanceMin = 0.01;

        if (pack.getPackageVolume().getWidht() >= distanceMin){
            return pack.getPackageVolume().getWidht();
        }

        return 0;
    }
}
