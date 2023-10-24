package com.freightcalculator.app.validator;

import com.freightcalculator.app.model.Package;
import org.springframework.stereotype.Service;

@Service
public class HeightPackageValidatorImpl implements ShipmentValidator {

    @Override
    public double shipingCalculate(Package pack) {
        double heightMin = 0.01;

        if (pack.getPackageVolume().getHeight() >= heightMin){
            return pack.getPackageVolume().getHeight();
        }

        return 0;
    }
}
