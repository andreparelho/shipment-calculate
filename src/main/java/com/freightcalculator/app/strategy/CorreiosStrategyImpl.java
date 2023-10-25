package com.freightcalculator.app.strategy;

import com.freightcalculator.app.model.Package;
import com.freightcalculator.app.validator.*;
import org.springframework.stereotype.Service;

@Service("companies")
public class CorreiosStrategyImpl implements ShipmentStrategy {
    private final DistancePackageValidatorImpl distancePackageValidator;
    private final HeightPackageValidatorImpl heightPackageValidator;
    private final LengthPackageValidatorImpl lengthPackageValidator;
    private final WeightPackageValidatorImpl weightPackageValidator;
    private final WidthPackageValidatorImpl widthPackageValidator;

    private final Package aPackage;

    private final double coefficient = 0.1;
    private final double valueRandom = 10;
    private final double internacionalCoefficient = 6000;

    public CorreiosStrategyImpl(DistancePackageValidatorImpl distancePackageValidator, HeightPackageValidatorImpl heightPackageValidator,
                                LengthPackageValidatorImpl lengthPackageValidator, WeightPackageValidatorImpl weightPackageValidator,
                                WidthPackageValidatorImpl widthPackageValidator, Package aPackage) {
        this.distancePackageValidator = distancePackageValidator;
        this.heightPackageValidator = heightPackageValidator;
        this.lengthPackageValidator = lengthPackageValidator;
        this.weightPackageValidator = weightPackageValidator;
        this.widthPackageValidator = widthPackageValidator;
        this.aPackage = aPackage;
    }

    @Override
    public double shipmentCalculate() {
        return this.coefficient + (this.lengthPackageValidator.shipingCalculate(aPackage) * this.widthPackageValidator.shipingCalculate(aPackage)
                * this.heightPackageValidator.shipingCalculate(aPackage) / this.internacionalCoefficient * this.weightPackageValidator.shipingCalculate(aPackage) *
                this.distancePackageValidator.shipingCalculate(aPackage) * this.valueRandom);
    }
}
