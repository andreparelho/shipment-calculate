package com.freightcalculator.app.controller;

import com.freightcalculator.app.model.Package;
import com.freightcalculator.app.service.ShipmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {
    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<Map<String, Double>> calculateShip(@RequestBody Package pack) {
        Map<String, Double> shippingTable = this.shipmentService.calculateShipping(pack);
        return ResponseEntity.ok(shippingTable);
    }
}
