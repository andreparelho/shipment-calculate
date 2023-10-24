package com.freightcalculator.app.factory;

import com.freightcalculator.app.strategy.ShipmentStrategy;
import com.freightcalculator.app.validator.ShipmentValidator;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

@Component
public class ShipmentFactoryImpl implements ShipmentFactory {
    private final Map<String, ShipmentStrategy> shipmentStrategyMap;

    public ShipmentFactoryImpl(Map<String, ShipmentStrategy> shipmentStrategyMap) {
        this.shipmentStrategyMap = shipmentStrategyMap;
    }

    @Override
    public List<ShipmentValidator> getShipmentValidators(String shippingCompany) {
        String beanName = MessageFormat.format("{0}-{1}", shippingCompany.toLowerCase(), "strategy");
        ShipmentStrategy shipmentStrategy = shipmentStrategyMap.get(beanName);
        return shipmentStrategy.getShipmentValidators();
    }
}
