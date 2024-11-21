package me.isra.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.isra.shop.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
