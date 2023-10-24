package com.freightcalculator.app.validator;

import com.freightcalculator.app.model.Package;
import org.springframework.stereotype.Service;

@Service
public class LengthPackageValidatorImpl implements ShipmentValidator {

    @Override
    public double shipingCalculate(Package pack) {
        double lengthMin = 0.01;

        if (pack.getPackageVolume().getLength() >= lengthMin){
            return pack.getPackageVolume().getLength();
        }

        return 0;
    }
}
