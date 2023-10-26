package com.freightcalculator.app.service;

import com.freightcalculator.app.model.Package;
import com.freightcalculator.app.strategy.ShipmentStrategy;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ShipmentService {
    private final Map<String, ShipmentStrategy> shipmentStrategies;

    public ShipmentService(Map<String, ShipmentStrategy> shipmentStrategies) {
        this.shipmentStrategies = shipmentStrategies;
    }

    public Map<String, Double> calculateShipping(Package pack){
        Map<String, Double> shippingTable = new HashMap<>();
        this.shipmentStrategies.entrySet().stream()
                .forEach(entry -> {
                    String shippingCompany = entry.getKey();
                    ShipmentStrategy shipmentStrategy = entry.getValue();
                    shippingTable.put(shippingCompany, shipmentStrategy.shipmentCalculate(pack));
                });
        return shippingTable;
    }
}
