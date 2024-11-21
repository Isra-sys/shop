package me.isra.shop.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import me.isra.shop.model.Producto;
import me.isra.shop.repository.ProductoRepository;

@Service
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository productoRepository;

    public void saveProduct(Producto p) {
        productoRepository.save(p);
    }
}
