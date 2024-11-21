package me.isra.shop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import me.isra.shop.model.Producto;
import me.isra.shop.service.ProductoService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductoController {
    
    private final ProductoService productoService;

    @PostMapping("/save")
    public ResponseEntity<Producto> save(@RequestBody Producto p) {
        productoService.saveProduct(p);
        return ResponseEntity.ok(p);
    }
}
