package com.freightcalculator.app.strategy;

import com.freightcalculator.app.model.Package;
import org.springframework.stereotype.Service;

@Service("correios")
public class CorreiosStrategyImpl implements ShipmentStrategy {

    private final double coefficient = 0.1;
    private final double valueRandom = 10;
    private final double internacionalCoefficient = 6000;

    @Override
    public double shipmentCalculate(Package pack) {
        return this.coefficient + (pack.getVolume() / this.internacionalCoefficient * pack.getWeight()) *
                pack.getDistance() * this.valueRandom;
    }
}
