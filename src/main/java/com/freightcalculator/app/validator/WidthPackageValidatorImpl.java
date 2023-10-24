package com.freightcalculator.app.validator;

import com.freightcalculator.app.model.Package;
import org.springframework.stereotype.Service;

@Service
public class WidthPackageValidatorImpl implements ShipmentValidator {

    @Override
    public double shipingCalculate(Package pack) {
        double widthMin = 0.01;

        if ( pack.getPackageVolume().getWidht() >= widthMin){
            return pack.getPackageVolume().getWidht();
        }

        return 0;
    }
}
