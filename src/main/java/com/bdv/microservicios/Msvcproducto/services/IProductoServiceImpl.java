package com.bdv.microservicios.Msvcproducto.services;


import com.bdv.microservicios.Msvcproducto.model.entities.Producto;
import com.bdv.microservicios.Msvcproducto.model.repo.IProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class IProductoServiceImpl implements IProductoService {



    @Autowired
    IProductoRepo productoRepo;


    @Override
    @Transactional
    public Producto guardarProducto(Producto producto) {

        String prod=producto.getProducto();
        String titular=producto.getTitularId();
        String sucursal=producto.getSucursal();
        Integer tipoCuenta=producto.getTcuenta();
        Integer tipoTitular=producto.getTtitular();
        Integer tipoRegla=producto.getTregla();
        String representante=producto.getRepresentante();
        String observacion=producto.getObservacion();
        String user=producto.getUser();


        productoRepo.sp_ACCOUNT("INSERT",prod,
                titular,sucursal,tipoCuenta,tipoTitular,tipoRegla,representante,
                observacion,user);

        return producto;
    }
}
