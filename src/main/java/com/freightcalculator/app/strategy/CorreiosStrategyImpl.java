package com.freightcalculator.app.strategy;

import com.freightcalculator.app.validator.*;

import java.util.List;

public class CorreiosStrategyImpl implements ShipmentStrategy {
    private final DistancePackageValidatorImpl distancePackageValidator;
    private final HeightPackageValidatorImpl heightPackageValidator;
    private final LengthPackageValidatorImpl lengthPackageValidator;
    private final WeightPackageValidatorImpl weightPackageValidator;
    private final WidthPackageValidatorImpl widthPackageValidator;

    public CorreiosStrategyImpl(DistancePackageValidatorImpl distancePackageValidator, HeightPackageValidatorImpl heightPackageValidator, LengthPackageValidatorImpl lengthPackageValidator, WeightPackageValidatorImpl weightPackageValidator, WidthPackageValidatorImpl widthPackageValidator) {
        this.distancePackageValidator = distancePackageValidator;
        this.heightPackageValidator = heightPackageValidator;
        this.lengthPackageValidator = lengthPackageValidator;
        this.weightPackageValidator = weightPackageValidator;
        this.widthPackageValidator = widthPackageValidator;
    }

    @Override
    public double shipmentCalculate(List<ShipmentValidator> shipmentValidators) {
        
    }
}
