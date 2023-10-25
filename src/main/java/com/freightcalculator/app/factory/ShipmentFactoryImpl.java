package com.freightcalculator.app.factory;

import com.freightcalculator.app.strategy.ShipmentStrategy;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.Map;

@Component
public class ShipmentFactoryImpl implements ShipmentFactory {
    private final Map<String, ShipmentStrategy> shipmentStrategyMap;

    public ShipmentFactoryImpl(Map<String, ShipmentStrategy> shipmentStrategyMap) {
        this.shipmentStrategyMap = shipmentStrategyMap;
    }

    @Override
    public double getShipmentValidators(String shippingCompanies) {
        String beanName = MessageFormat.format("{0}", shippingCompanies);
        ShipmentStrategy shipmentStrategy = this.shipmentStrategyMap.get(beanName);
        return shipmentStrategy.shipmentCalculate();
    }
}
