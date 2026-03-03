package com.example.hellborn_backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.hellborn_backend.DTO.MerchandisingDTO;
import com.example.hellborn_backend.service.MerchandisingService;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/merchandising/")
public class MerchandisingController {

    private MerchandisingService service;

    public MerchandisingController(MerchandisingService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<MerchandisingDTO>> getMerch() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{tipo}")
    public ResponseEntity<List<MerchandisingDTO>> getMerchTipo(@PathVariable String tipo) {
        return ResponseEntity.ok(service.findByTipo(tipo));
    }
}
