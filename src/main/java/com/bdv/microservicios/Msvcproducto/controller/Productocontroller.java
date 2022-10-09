package com.bdv.microservicios.Msvcproducto.controller;


import com.bdv.microservicios.Msvcproducto.model.entities.Producto;
import com.bdv.microservicios.Msvcproducto.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("app")
public class Productocontroller {


    @Autowired
    IProductoService productoService;


   

   



    @PostMapping("/crearproducto")
    public ResponseEntity<?> crearProducto(@RequestBody Producto producto){
        Producto productoguardado=productoService.guardarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoguardado);
    }










}
