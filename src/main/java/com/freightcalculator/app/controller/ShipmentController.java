package com.freightcalculator.app.controller;

import com.freightcalculator.app.model.Package;
import com.freightcalculator.app.service.ShipmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {
    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<String> calculateShip(@RequestBody Package pack){
        if (this.shipmentService.calculateShipping(pack) == 0){
            return ResponseEntity.badRequest().body("Erro ao calcular o frete");
        }
        return ResponseEntity.ok("Valor do frete: " + this.shipmentService.calculateShipping(pack));
    }
}
